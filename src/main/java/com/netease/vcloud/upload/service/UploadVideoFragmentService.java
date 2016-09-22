package com.netease.vcloud.upload.service;

import java.io.IOException;
import java.io.InputStream;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.GetUploadHostParam;
import com.netease.vcloud.upload.param.InitUploadVideoParam;
import com.netease.vcloud.upload.param.UploadVideoFragmentParam;


/**
* <p>Title: UploadVideoFragmentService</p>
* <p>Description: 上传视频分片接口</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public interface UploadVideoFragmentService {

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
	public abstract UploadVideoFragmentParam uploadVideo(String bucket,
			String uploadHost, String object, Long offset, String context,
			InputStream in, Long remainderSize, String xNosToken)
			throws VcloudException, IOException;

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
	public abstract UploadVideoFragmentParam uploadVideo(
			InitUploadVideoParam initUploadVideoParam,
			GetUploadHostParam getUploadHostParam, Long offset, String context,
			InputStream in, Long remainderSize) throws VcloudException,
			IOException;

}