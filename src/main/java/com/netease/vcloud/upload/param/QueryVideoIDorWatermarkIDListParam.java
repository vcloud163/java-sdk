package com.netease.vcloud.upload.param;


/**
* <p>Title: QueryVideoIDorWatermarkIDListParam</p>
* <p>Description: 根据对象名查询视频ID输出参数的ret部分的list的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-27
*/
public class QueryVideoIDorWatermarkIDListParam {

	/** 输出参数中的存储上传文件的对象名*/
	String objectName;
	
	/** 输出参数中的视频ID*/
	Long vid;
	
	/** 输出参数中的图片ID*/
	Long imgId;
	
	/**
	 * 
	* <p>Title: getObjectName</p>
	* <p>Description: 得到根据对象名查询视频ID输出参数的ret部分的存储上传文件的对象名</p>
	* @return 存储上传文件的对象名
	 */
	public String getObjectName() {
		return objectName;
	}
	/**
	 * 
	* <p>Title: setObjectName</p>
	* <p>Description: 设置根据对象名查询视频ID输出参数的ret部分的存储上传文件的对象名</p>
	* @param objectName 存储上传文件的对象名
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	
	/**
	 * 
	* <p>Title: getVid</p>
	* <p>Description: 得到根据对象名查询视频ID输出参数的ret部分的视频ID</p>
	* @return 视频ID
	 */
	public Long getVid() {
		return vid;
	}
	
	/**
	 * 
	* <p>Title: setVid</p>
	* <p>Description: 设置根据对象名查询视频ID输出参数的ret部分的视频ID</p>
	* @param vid 视频ID
	 */
	public void setVid(Long vid) {
		this.vid = vid;
	}
	
	/**
	 * 
	* <p>Title: getImgId</p>
	* <p>Description: 得到根据对象名查询ID输出参数的ret部分的图片ID</p>
	* @return 图片ID
	 */
	public Long getImgId() {
		return imgId;
	}
	/**
	 * 
	* <p>Title: setImgId</p>
	* <p>Description: 设置根据对象名查询ID输出参数的ret部分的图片ID</p>
	* @param imgId 图片ID
	 */
	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}
	@Override
	public String toString() {
		return "QueryVideoIDorWatermarkIDListParam [objectName=" + objectName + ", vid="
				+ vid + ", imgId=" + imgId + "]";
	}	
	
	
	
	
}
