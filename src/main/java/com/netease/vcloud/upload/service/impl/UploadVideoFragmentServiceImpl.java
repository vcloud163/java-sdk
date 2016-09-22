package com.netease.vcloud.upload.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.GetUploadHostParam;
import com.netease.vcloud.upload.param.InitUploadVideoParam;
import com.netease.vcloud.upload.param.UploadVideoFragmentParam;
import com.netease.vcloud.upload.service.UploadVideoFragmentService;
import com.netease.vcloud.upload.util.UploadUtil;


/**
* <p>Title: UploadVideoFragmentServiceImpl</p>
* <p>Description: 上传视频分片的实现类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-21
*/
public class UploadVideoFragmentServiceImpl implements UploadVideoFragmentService {

	
	/** 日志实例*/
	public static final Logger logger = Logger.getLogger(UploadVideoFragmentServiceImpl.class);	
	
	/* 
	* <p>Title: uploadVideo</p>
	* <p>Description: </p>
	* @param bucket
	* @param uploadHost
	* @param object
	* @param offset
	* @param context
	* @param in
	* @param remainderSize
	* @param xNosToken
	* @return
	* @throws VcloudException
	* @throws IOException
	* @see com.netease.vcloud.upload.util.service.impl.UploadVideoFragmentService#uploadVideo(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.io.InputStream, java.lang.Long, java.lang.String)
	*/
	public UploadVideoFragmentParam uploadVideo(String bucket, String uploadHost, String object,
			Long offset, String context, InputStream in, Long remainderSize, String xNosToken) throws VcloudException, IOException{
		if(null == bucket || "".equals(bucket.trim()))
			throw new VcloudException("bucket is null or invalid");
		
		if(null == uploadHost || "".equals(uploadHost.trim()))
			throw new VcloudException("uploadHost is null or invalid");
		
		if(null == object || "".equals(object.trim()))
			throw new VcloudException("object is null or invalid");
		
		if(null == offset)
			throw new VcloudException("offset is null or invalid");
		
		if(null == in)
			throw new VcloudException("in is null or invalid");
		
		if(null == remainderSize)
			throw new VcloudException("remainderSize is null or invalid");
		
		if(null == xNosToken || "".equals(xNosToken.trim()))
			throw new VcloudException("xNosToken is null or invalid");
		
		UploadUtil util = new UploadUtil(bucket, uploadHost, object, offset, context, in, remainderSize, xNosToken);
		UploadVideoFragmentParam uploadVideoParam = util.uploadVideoFragment(); 
		return uploadVideoParam;
	}
	
	/* 
	* <p>Title: uploadVideo</p>
	* <p>Description: </p>
	* @param initUploadVideoParam
	* @param getUploadHostParam
	* @param offset
	* @param context
	* @param in
	* @param remainderSize
	* @return
	* @throws VcloudException
	* @throws IOException
	* @see com.netease.vcloud.upload.util.service.impl.UploadVideoFragmentService#uploadVideo(com.netease.vcloud.upload.util.param.InitUploadVideoParam, com.netease.vcloud.upload.util.param.GetUploadHostParam, java.lang.Long, java.lang.String, java.io.InputStream, java.lang.Long)
	*/
	public UploadVideoFragmentParam uploadVideo(InitUploadVideoParam initUploadVideoParam, GetUploadHostParam getUploadHostParam, Long offset, String context, InputStream in, Long remainderSize) throws VcloudException, IOException{
		String bucket = initUploadVideoParam.getRet().getBucket();
		String uploadHost = getUploadHostParam.getUpload().get(0);
		String object = initUploadVideoParam.getRet().getObject();		
		String xNosToken = initUploadVideoParam.getRet().getxNosToken();
		
		return uploadVideo(bucket, uploadHost, object,
				offset, context, in, remainderSize, xNosToken);
	}
}
