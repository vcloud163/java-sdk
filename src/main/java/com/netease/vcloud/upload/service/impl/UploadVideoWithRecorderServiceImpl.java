package com.netease.vcloud.upload.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.GetUploadHostParam;
import com.netease.vcloud.upload.param.InitUploadVideoParam;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;
import com.netease.vcloud.upload.param.UploadVideoFragmentParam;
import com.netease.vcloud.upload.recorder.Recorder;
import com.netease.vcloud.upload.service.GetUploadHostService;
import com.netease.vcloud.upload.service.InitUploadVideoService;
import com.netease.vcloud.upload.service.QueryVideoIDorWatermarkIDService;
import com.netease.vcloud.upload.service.UploadVideoFragmentService;
import com.netease.vcloud.upload.service.UploadVideoWithRecorderService;
import com.netease.vcloud.util.FileUtil;

/**
* <p>Title: UploadVideoWithRecorderServiceImpl</p>
* <p>Description: 支持断点续传的视频上传的实现类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-27
*/

public class UploadVideoWithRecorderServiceImpl implements UploadVideoWithRecorderService {

	/** 日志实例*/
	public static final Logger logger = Logger.getLogger(UploadVideoWithRecorderServiceImpl.class);	
	

	/**
	 * 
	* <p>Title: checkInitParamMap</p>
	* <p>Description: 判断视频初始化参数集合中必填参数是否缺失</p>
	* @param initParamMap  视频初始化参数集合
	* @return 如果必填参数缺失，则返回false, 否则返回true
	 */
	private  boolean checkInitParamMap(Map<String, Object> initParamMap){
		String originFileName =  (String) initParamMap.get("originFileName");
		if(null == originFileName || "".equals(originFileName.trim())){
			return false;
		}
		return true;
	}	
	
	/* 
	* <p>Title: uploadVideoWithRecorder</p>
	* <p>Description: </p>
	* @param filePath
	* @param initParamMap
	* @param recorder
	* @return
	* @throws IOException
	* @throws VcloudException
	* @see com.netease.vcloud.upload.util.service.impl.UploadVideoWithRecorderService#uploadVideoWithRecorder(java.lang.String, java.util.Map, com.netease.vcloud.upload.recorder.Recorder)
	*/
	public QueryVideoIDorWatermarkIDParam uploadVideoWithRecorder(
			String filePath, Map<String, Object> initParamMap, Recorder recorder) throws VcloudException, IOException {
		
		/*  第一次上传 */
		if(!recorder.getUploadAgain()){
			
			if(FileUtil.doesFileExist(filePath)){
				
				if(!checkInitParamMap(initParamMap))					
					throw new VcloudException("[UploadVideoService] the init param originFileName is lost.");
				/*视频上传初始化*/
				InitUploadVideoService initUploadVideoService = new InitUploadVideoServiceImpl();
				/*视频上传初始化返回结果的封装类*/
				InitUploadVideoParam initUploadVideoParam = initUploadVideoService.initUploadVideo(initParamMap);

				if(initUploadVideoParam.getCode() != 200){
					throw new VcloudException("[UploadVideoService] fail to init upload params. " + "return code " + initUploadVideoParam.getCode() + " return message " + initUploadVideoParam.getMsg());
				}
				/*获取上传加速节点地址*/
				GetUploadHostService getUploadHostService = new GetUploadHostServiceImpl();
				/*获取上传加速节点地址返回结果的封装类*/
				GetUploadHostParam getUploadHostParam = getUploadHostService.getUploadHost(initUploadVideoParam.getRet().getBucket());

				if(null == getUploadHostParam || null == getUploadHostParam.getUpload() || getUploadHostParam.getUpload().size() == 0){
					 throw new VcloudException("[UploadVideoService] fail to get uploadHost."+ "return code " + getUploadHostParam.getCode() + " return message " + getUploadHostParam.getMsg());
				}
				/*分片上传视频*/
				UploadVideoFragmentService uploadVideoService = new UploadVideoFragmentServiceImpl();

				/*当前分片在整个对象中的起始偏移量    此参数必填*/
				Long offset = new Long(0);
				/*上传上下文         此参数必填*/
				String context = null;
				/*上传文件的输出流        此参数必填*/
				InputStream in = null;				
			
				Map<String, Object> uploadRecorderMap = new HashMap<String, Object>();
				
				//int count = 0;
				try {			 
					in = FileUtil.getFileInputStream(filePath); 
					/*上传文件剩余大小*/
					Long remainderSize = FileUtil.getFileLength(filePath);
					/*分片上传视频*/
					while(remainderSize > 0){

						UploadVideoFragmentParam uploadVideoParam = uploadVideoService.uploadVideo(initUploadVideoParam, getUploadHostParam, offset, context, in, remainderSize);

						if(null == uploadVideoParam.getErrMsg() || "".equals(uploadVideoParam.getErrMsg().trim())){
							context = uploadVideoParam.getContext();
							offset = uploadVideoParam.getOffset();					
							remainderSize  = FileUtil.getFileLength(filePath) - offset;		

							uploadRecorderMap.put("bucket", initUploadVideoParam.getRet().getBucket());
							uploadRecorderMap.put("uploadHost", getUploadHostParam.getUpload().get(0));
							uploadRecorderMap.put("object", initUploadVideoParam.getRet().getObject());
							uploadRecorderMap.put("offset", offset);
							uploadRecorderMap.put("context", context);
							//uploadRecorderMap.put("filePath", filePath);
							uploadRecorderMap.put("remainderSize", remainderSize);
							uploadRecorderMap.put("xNosToken", initUploadVideoParam.getRet().getxNosToken());

							recorder.saveRecorderInfo(uploadRecorderMap);

//							count++;
//							if(count == 1){
//								logger.info("******************************第一次强制中断************");
//								break;
//							}
						}else{
							throw new VcloudException("upload videoFragment fail. errMsg: " + uploadVideoParam.getErrMsg() + " requestID: " + uploadVideoParam.getRequestId());
						 }
						
					}
					if(remainderSize ==0){							
						recorder.deleteRecorder();						
						/* 查询上传视屏的vid*/
						 List<String> objectNamesList = new ArrayList<String>();
						 objectNamesList.add(initUploadVideoParam.getRet().getObject());			
						 QueryVideoIDorWatermarkIDService queryVideoIDService = new QueryVideoIDorWatermarkIDServiceImpl();
						 /*查询上传视屏返回结果的封装类*/
						 QueryVideoIDorWatermarkIDParam queryVideoIDParam = queryVideoIDService.queryVideoID(objectNamesList);
						return queryVideoIDParam;						
					}				

				} catch (Exception e) {
					if(null != in){
						try {
							in.close();
						} catch (IOException e1) {
							 throw new VcloudException(e1);
						}
					}
					throw new VcloudException(e);
				}				
						
			}
		}
		/* 断点续传 */
		else{
			Map<String, Object> uploadRecorderMap = recorder.getRecorderInfo();
			String bucket = (String) uploadRecorderMap.get("bucket");
			String uploadHost = (String) uploadRecorderMap.get("uploadHost");
			String object = (String) uploadRecorderMap.get("object");
			Long offset = (Long) uploadRecorderMap.get("offset");
			String context = (String) uploadRecorderMap.get("context");
			//String filePath = (String) uploadRecorderMap.get("filePath");
			Long remainderSize = (Long) uploadRecorderMap.get("remainderSize");
			String xNosToken = (String) uploadRecorderMap.get("xNosToken");
			
			/*分片上传视频*/
			UploadVideoFragmentService uploadVideoService = new UploadVideoFragmentServiceImpl();
			
			InputStream in = null;	
			
			try {			 
				in = FileUtil.getFileInputStream(filePath);
				in.skip(offset);
				/*上传文件剩余大小*/
				//Long remainderSize = FileUtil.getFileLength(filePath);
				/*分片上传视频*/
				while(remainderSize > 0){				

					UploadVideoFragmentParam uploadVideoParam = uploadVideoService.uploadVideo(bucket, uploadHost, object, offset, context, in, remainderSize, xNosToken);				
					
					if(null == uploadVideoParam.getErrMsg() || "".equals(uploadVideoParam.getErrMsg().trim())){
						context = uploadVideoParam.getContext();
						offset = uploadVideoParam.getOffset();					
						remainderSize  = FileUtil.getFileLength(filePath) - offset;		
						
						uploadRecorderMap.put("bucket", bucket);
						uploadRecorderMap.put("uploadHost", uploadHost);
						uploadRecorderMap.put("object", object);
						uploadRecorderMap.put("offset", offset);
						uploadRecorderMap.put("context", context);
						//uploadRecorderMap.put("filePath", filePath);
						uploadRecorderMap.put("remainderSize", remainderSize);
						uploadRecorderMap.put("xNosToken", xNosToken);
						
						recorder.saveRecorderInfo(uploadRecorderMap);	
					}else{
						throw new VcloudException("upload videoFragment fail. errMsg: " + uploadVideoParam.getErrMsg() + " requestID: " + uploadVideoParam.getRequestId());
					 }
									

				}
				if(remainderSize ==0){							
					recorder.deleteRecorder();						
					/* 查询上传视屏的vid*/
					 List<String> objectNamesList = new ArrayList<String>();
					 objectNamesList.add(object);			
					 QueryVideoIDorWatermarkIDService queryVideoIDService = new QueryVideoIDorWatermarkIDServiceImpl();
					 /*查询上传视屏返回结果的封装类*/
					 QueryVideoIDorWatermarkIDParam queryVideoIDParam = queryVideoIDService.queryVideoID(objectNamesList);
					return queryVideoIDParam;					
				}				

			} catch (Exception e) {
				if(null != in){
					try {
						in.close();
					} catch (IOException e1) {
						 throw new VcloudException(e1);
					}
				}
				throw new VcloudException(e);
			}
			
		}	
		
		return null;
	}
	
	
}
