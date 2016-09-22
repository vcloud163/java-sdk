package com.netease.vcloud.upload.param;


/**
* <p>Title: InitUploadVideoRet</p>
* <p>Description:  视频上传初始化输出参数中ret部分的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-27
*/
public class InitUploadVideoRet {

	/** 输出参数中的上传的token信息*/
	private String xNosToken;
	
	/** 输出参数中的存储上传文件的桶名*/
	private String bucket;
	
	/** 输出参数中的存储上传文件的对象名*/
	private String object;
	
	/**
	 * 
	* <p>Title: getxNosToken</p>
	* <p>Description: 得到视频上传初始化输出参数中ret部分的上传的token信息</p>
	* @return 上传的token信息
	 */
	public String getxNosToken() {
		return xNosToken;
	}
	/**
	 * 
	* <p>Title: setxNosToken</p>
	* <p>Description: 设置视频上传初始化输出参数中ret部分的上传的token信息</p>
	* @param xNosToken 上传的token信息
	 */
	public void setxNosToken(String xNosToken) {
		this.xNosToken = xNosToken;
	}
	
	/**
	 * 
	* <p>Title: getBucket</p>
	* <p>Description: 得到视频上传初始化输出参数中ret部分的存储上传文件的桶名</p>
	* @return 存储上传文件的桶名
	 */
	public String getBucket() {
		return bucket;
	}
	
	/**
	 * 
	* <p>Title: setBucket</p>
	* <p>Description: 设置视频上传初始化输出参数中ret部分的存储上传文件的桶名</p>
	* @param bucket 存储上传文件的桶名
	 */
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	
	/**
	 * 
	* <p>Title: getObject</p>
	* <p>Description: 得到视频上传初始化输出参数中ret部分的存储上传文件的对象名</p>
	* @return 存储上传文件的对象名
	 */
	public String getObject() {
		return object;
	}
	
	/**
	 * 
	* <p>Title: setObject</p>
	* <p>Description: 设置视频上传初始化输出参数中ret部分的存储上传文件的对象名</p>
	* @param object 存储上传文件的对象名
	 */
	public void setObject(String object) {
		this.object = object;
	}
	@Override
	public String toString() {
		return "InitUploadVideoRet [xNosToken=" + xNosToken + ", bucket="
				+ bucket + ", object=" + object + "]";
	}
	
	
}
