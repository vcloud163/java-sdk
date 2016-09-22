package com.netease.vcloud.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.netease.vcloud.ClientConfiguration;
import com.netease.vcloud.VcloudException;
import com.netease.vcloud.auth.Credentials;
import com.netease.vcloud.config.Config;
import com.netease.vcloud.upload.param.GetUploadHostParam;
import com.netease.vcloud.upload.param.InitUploadVideoParam;
import com.netease.vcloud.upload.param.QueryOffsetParam;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;
import com.netease.vcloud.upload.param.SetCallbackParam;
import com.netease.vcloud.upload.param.UploadVideoFragmentParam;
import com.netease.vcloud.upload.recorder.Recorder;
import com.netease.vcloud.upload.service.GetUploadHostService;
import com.netease.vcloud.upload.service.InitUploadVideoService;
import com.netease.vcloud.upload.service.QueryOffsetService;
import com.netease.vcloud.upload.service.QueryVideoIDorWatermarkIDService;
import com.netease.vcloud.upload.service.SetCallbackService;
import com.netease.vcloud.upload.service.UploadVideoFragmentService;
import com.netease.vcloud.upload.service.UploadVideoService;
import com.netease.vcloud.upload.service.UploadVideoWithRecorderService;
import com.netease.vcloud.upload.service.impl.GetUploadHostServiceImpl;
import com.netease.vcloud.upload.service.impl.InitUploadVideoServiceImpl;
import com.netease.vcloud.upload.service.impl.QueryOffsetServiceImpl;
import com.netease.vcloud.upload.service.impl.QueryVideoIDorWatermarkIDServiceImpl;
import com.netease.vcloud.upload.service.impl.SetCallbackServiceImpl;
import com.netease.vcloud.upload.service.impl.UploadVideoFragmentServiceImpl;
import com.netease.vcloud.upload.service.impl.UploadVideoServiceImpl;
import com.netease.vcloud.upload.service.impl.UploadVideoWithRecorderServiceImpl;

/**
* <p>Title: VcloudClient</p>
* <p>Description: 提供给用户进行点播相关操作的视频云客户端</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-7-1
*/
public class VcloudClient {

	/** 日志实例*/
	public static final Logger logger = Logger.getLogger(VcloudClient.class);
	
	/** 访问服务的凭据类*/
	private Credentials credentials;
	
	/** 客户端配置类*/
	private ClientConfiguration clientConfiguration;

	/**
	 * 
	* <p>Description: 传入访问服务的凭据类和客户端配置类构造视频云客户端</p>
	* @param credentials            传入访问服务的凭据类
	* @param clientConfiguration    客户端配置类
	 */
	public VcloudClient(Credentials credentials,
			ClientConfiguration clientConfiguration) {	
		this.credentials = credentials;
		this.clientConfiguration = clientConfiguration;
		init();
	}
	
	/**
	 * 
	* <p>Description:  传入访问服务的凭据类构造视频云客户端，客户端配置会采用默认配置</p>
	* @param credentials 传入访问服务的凭据类
	 */
	public VcloudClient(Credentials credentials) {		
		this.credentials = credentials;
		this.clientConfiguration = new ClientConfiguration();
		init();
	}
	
	/**
	 * 
	* <p>Title: init</p>
	* <p>Description: 利用访问服务的凭据类和客户端配置类初始化配置信息</p>
	 */
	public void init(){
		Config.setConnectionTimeout(clientConfiguration.getConnectionTimeout());
		Config.setSocketTimeout(clientConfiguration.getSocketTimeout());
		Config.setAppKey(credentials.getAppKey());
		Config.setAppSecret(credentials.getAppSecret());
	}
		
	
	/**
	 * 
	 * <p>Title: initUploadVideo</p>
	 * <p>Description: 视频上传初始化</p>
	 * @param initParamMap 上传文件的相关信息集合
	 * @return initUploadVideoParam 视频上传初始化返回结果的封装类
	 * @throws VcloudException 
	 * @throws IOException 
	 */
	public InitUploadVideoParam initUploadVideo(Map<String, Object> initParamMap) throws IOException, VcloudException{
		InitUploadVideoService initUploadVideoService = new InitUploadVideoServiceImpl();
		return initUploadVideoService.initUploadVideo(initParamMap);
	}
	
	
	/**
	 * 
	 * <p>Title: initUploadVideo</p>
	 * <p>Description: 视频上传初始化</p>
	 * @param originFileName        上传文件的原始名称
	 * @param userFileName          用户命名的上传文件名称
	 * @param typeId                视频所属的类别ID
	 * @param presetId              视频所需转码模板ID
	 * @param callbackUrl           转码成功后回调客户端的URL地址
	 * @param description           上传视频的描述信息
	 * @param watermarkId           上传视频的视频水印Id
	 * @param uploadCallbackUrl     上传成功后回调客户端的URL地址（需标准http格式）
	 * @param userDefInfo           用户自定义信息，会在上传成功或转码成功后通过回调返回给用户
	 * @return initUploadVideoParam 视频上传初始化返回结果的封装类
	 * @throws IOException
	 * @throws VcloudException
	 */	
	public InitUploadVideoParam initUploadVideo(String originFileName, String userFileName, Long typeId,
			Long presetId, String callbackUrl, String description, Long watermarkId, String uploadCallbackUrl, String userDefInfo) throws IOException, VcloudException{
		
		Map<String, Object> initParamMap = new HashMap<String, Object>();
		
		initParamMap.put("originFileName", originFileName);
		initParamMap.put("userFileName", userFileName);
		initParamMap.put("typeId", typeId);
		initParamMap.put("presetId", presetId);
		initParamMap.put("callbackUrl", callbackUrl);
		initParamMap.put("description", description);
		initParamMap.put("watermarkId", watermarkId);
		initParamMap.put("uploadCallbackUrl", uploadCallbackUrl);
		initParamMap.put("userDefInfo", userDefInfo);	
		
		return this.initUploadVideo(initParamMap);
	}
	
	/**
	 * 
	 * <p>Title: getUploadHost</p>
	 * <p>Description: 获取上传加速节点地址</p>
	 * @param bucket   桶名	
	 * @return getUploadHostParam   获取上传加速节点地址返回结果的封装类
	 * @throws VcloudException 
	 * @throws IOException 	
	 */	
	public GetUploadHostParam getUploadHost(String bucket) throws IOException, VcloudException{
		GetUploadHostService getUploadHostService = new GetUploadHostServiceImpl();
		return getUploadHostService.getUploadHost(bucket);
	}
	
	/**
	 * 
	 * <p>Title: uploadVideo</p>
	 * <p>Description: 上传视频分片</p>
	 * @param bucket             存储上传文件的桶名 
	 * @param uploadHost         上传加速节点地址
	 * @param object             存储上传文件的对象名
	 * @param offset             当前分片在整个对象中的起始偏移量
	 * @param context            上传上下文
	 * @param in                 上传文件的输出流
	 * @param remainderSize      上传文件剩余大小
	 * @param xNosToken          上传的token信息
	 * @return uploadVideoParam  分片上传视频返回结果的封装类
	 * @throws IOException 
	 * @throws VcloudException 
	 */
	public UploadVideoFragmentParam uploadVideoFragment(String bucket,
			String uploadHost, String object, Long offset, String context,
			InputStream in, Long remainderSize, String xNosToken) throws VcloudException, IOException{
		UploadVideoFragmentService uploadVideoFragmentService = new UploadVideoFragmentServiceImpl();
		return uploadVideoFragmentService.uploadVideo(bucket, uploadHost, object, offset, context, in, remainderSize, xNosToken);
	}
	
	/**
	 * 
	 * <p>Title: uploadVideo</p>
	 * <p>Description: 上传视频分片</p>
	 *@param initUploadVideoParam    视频上传初始化返回结果的封装类
	 * @param getUploadHostParam      获取上传加速节点地址返回结果的封装类
	 * @param offset                  当前分片在整个对象中的起始偏移量
	 * @param context                 上传上下文
	 * @param in                      上传文件的输出流
	 * @param remainderSize           上传文件剩余大小
	 * @return uploadVideoParam  分片上传视频返回结果的封装类
	 * @throws IOException 
	 * @throws VcloudException 
	 */
	public UploadVideoFragmentParam uploadVideoFragment(InitUploadVideoParam initUploadVideoParam,
			GetUploadHostParam getUploadHostParam, Long offset, String context,
			InputStream in, Long remainderSize) throws VcloudException, IOException{
		UploadVideoFragmentService uploadVideoFragmentService = new UploadVideoFragmentServiceImpl();
		return uploadVideoFragmentService.uploadVideo(initUploadVideoParam, getUploadHostParam, offset, context, in, remainderSize);
	}
	
	/**
	 * 
	 * <p>Title: queryVideoID</p>
	 * <p>Description: 上传完成后查询视频主ID</p>
	 * @param objectNamesList  查询视频的对象名集合
	 * @return queryVideoIDParam 上传完成后查询视频主ID返回结果的封装类
	 * @throws VcloudException 
	 * @throws IOException 
	 */
	public QueryVideoIDorWatermarkIDParam queryVideoID(List<String> objectNamesList) throws IOException, VcloudException{
		QueryVideoIDorWatermarkIDService queryVideoIDService = new QueryVideoIDorWatermarkIDServiceImpl();
		return queryVideoIDService.queryVideoID(objectNamesList);
	}
	
	/** 
	 * <p>Title: getPartOffset</p>
	 * <p>Description: 断点续传查询断点</p>
	 * @param uploadHost        上传加速节点地址
	 * @param bucket            存储上传文件的桶名
	 * @param object            存储上传文件的对象名
	 * @param context           上传上下文
	 * @param xNosToken         上传的token信息
	 * @return  queryOffsetParam 断点续传查询断点输出参数的封装类
	 * @throws IOException 
	 * @throws VcloudException
	 */
	public QueryOffsetParam getPartOffset(String uploadHost,
			String bucket, String object, String context, String xNosToken) throws IOException, VcloudException{
		QueryOffsetService queryOffsetService = new QueryOffsetServiceImpl();
		return queryOffsetService.getPartOffset(uploadHost, bucket, object, context, xNosToken);
	}

	/**
	 * 
	 * <p>Title: getPartOffset</p>
	 * <p>Description: 断点续传查询断点</p>
	 * @param initUploadVideoParam    视频上传初始化返回结果的封装类
	 * @param getUploadHostParam      获取上传加速节点地址返回结果的封装类
	 * @param uploadVideoParam        分片上传视频返回结果的封装类
	 * @return queryOffsetParam       断点续传查询断点输出参数的封装类
	 * @throws IOException
	 * @throws VcloudException
	 */
	public QueryOffsetParam getPartOffset(InitUploadVideoParam initUploadVideoParam, GetUploadHostParam getUploadHostParam, UploadVideoFragmentParam uploadVideoParam) throws IOException, VcloudException{
		String uploadHost = getUploadHostParam.getUpload().get(0);
		String bucket = initUploadVideoParam.getRet().getBucket();
		String object = initUploadVideoParam.getRet().getObject();
		String context = uploadVideoParam.getContext();
		String xNosToken = initUploadVideoParam.getRet().getxNosToken();
		return this.getPartOffset(uploadHost, bucket, object, context, xNosToken);				
	}
	
	/**
	 * 
	 * <p>Title: uploadVideo</p>
	 * <p>Description: 简单的视频上传</p>
	 * @param filePath       上传文件路径
	 * @param initParamMap   初始化参数集合
	 * @return 视频上传成功，则返回根据对象名查询视频ID输出参数的封装类，否则返回null
	 * @throws VcloudException
	 * @throws IOException
	 */
	public QueryVideoIDorWatermarkIDParam uploadVideo(String filePath,
			Map<String, Object> initParamMap)throws IOException, VcloudException{
		UploadVideoService uploadVideoService = new UploadVideoServiceImpl();
		return uploadVideoService.uploadVideo(filePath, initParamMap);
	}
	
	/**
	 * 
	 * <p>Title: uploadVideo</p>
	 * <p>Description: 简单的视频上传</p>
	 * @param filePath        上传文件路径
	 * @param originFileName  上传文件的原始名称（包含后缀名）
	 * @param userFileName    用户命名的上传文件名称 
	 * @param typeId          视频所属的类别ID（不填写为默认分类）
	 * @param presetId        视频所需转码模板ID（不填写为默认模板）
	 * @param callbackUrl     转码成功后回调客户端的URL地址（需标准http格式）
	 * @param description     上传视频的描述信息 
	 * @param watermarkId     上传视频的水印Id 
	 * @param uploadCallbackUrl     上传成功后回调客户端的URL地址（需标准http格式）
	 * @param userDefInfo           用户自定义信息，会在上传成功或转码成功后通过回调返回给用户
	 * @return 视频上传成功，则返回根据对象名查询视频ID输出参数的封装类，否则返回null
	 * @throws VcloudException
	 * @throws IOException
	 */
	public QueryVideoIDorWatermarkIDParam uploadVideo(String filePath, String originFileName, String userFileName, Long typeId,
			Long presetId, String callbackUrl, String description, Long watermarkId, String uploadCallbackUrl, String userDefInfo)throws IOException, VcloudException{
		
		Map<String, Object> initParamMap = new HashMap<String, Object>();
		
		initParamMap.put("originFileName", originFileName);
		initParamMap.put("userFileName", userFileName);
		initParamMap.put("typeId", typeId);
		initParamMap.put("presetId", presetId);
		initParamMap.put("callbackUrl", callbackUrl);
		initParamMap.put("description", description);
		initParamMap.put("watermarkId", watermarkId);
		initParamMap.put("uploadCallbackUrl", uploadCallbackUrl);
		initParamMap.put("userDefInfo", userDefInfo);
		return this.uploadVideo(filePath, initParamMap);
	}
	
	
	
	/**
	 * 
	 * <p>Title: uploadVideoWithRecorder</p>
	 * <p>Description: 支持断点续传的视频上传</p>
	 * @param filePath       上传文件路径
	 * @param initParamMap   初始化参数集合
	 * @param recorder       断点续传时记录上传进度的实现类
	 * @return  视频上传成功，则返回根据对象名查询视频ID输出参数的封装类，否则返回null
	 * @throws IOException
	 * @throws VcloudException
	 */
	public QueryVideoIDorWatermarkIDParam uploadVideoWithRecorder(String filePath,
			Map<String, Object> initParamMap, Recorder recorder)throws IOException, VcloudException{
		UploadVideoWithRecorderService uploadVideoWithRecorderService = new UploadVideoWithRecorderServiceImpl();
		return uploadVideoWithRecorderService.uploadVideoWithRecorder(filePath, initParamMap, recorder);
	}
	
	/**
	 * 
	 * <p>Title: setCallback</p>
	 * <p>Description: 设置上传回调地址</p>
	 * @param callbackUrl  上传成功后回调客户端的URL地址
	 * @return setCallbackParam  设置上传回调地址接口输出参数的封装类
	 * @throws IOException
	 * @throws VcloudException
	 */
	public SetCallbackParam setCallback(String callbackUrl) throws IOException, VcloudException{
		SetCallbackService setCallbackService = new SetCallbackServiceImpl();
		return setCallbackService.setCallback(callbackUrl);
	}
	
}
