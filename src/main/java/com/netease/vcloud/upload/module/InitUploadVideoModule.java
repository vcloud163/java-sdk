package com.netease.vcloud.upload.module;

import java.util.Map;

/**
* <p>Title: InitUploadVideoModule</p>
* <p>Description: 视频上传初始化输入参数的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-7-7
*/
public class InitUploadVideoModule {

	/** 上传文件的原始名称（包含后缀名） 此参数必填*/
	String originFileName; 

	/** 用户命名的上传文件名称  此参数非必填*/
	String userFileName;

	/** 视频所属的类别ID（不填写为默认分类）此参数非必填*/
	Long typeId;

	/** 视频所需转码模板ID（不填写为默认模板） 此参数非必填*/
	Long presetId; 

	/** 转码成功后回调客户端的URL地址（需标准http格式）  此参数非必填*/
	String callbackUrl; 

	/** 上传视频的描述信息  此参数非必填*/
	String description;

	/** 上传视频的视频水印Id 此参数非必填*/
	Long watermarkId;
	
	/** 上传成功后回调客户端的URL地址（需标准http格式） */
	String uploadCallbackUrl;
	
	/** 用户自定义信息，会在上传成功或转码成功后通过回调返回给用户 */
	String userDefInfo;
	

	/**
	 * 
	* <p>Description: 无参构造函数</p>
	 */
	public InitUploadVideoModule() {		
	}
	
	/**
	 * 
	* <p>Description: 传入初始化参数集合构造封装类</p>
	* @param initParamMap  初始化参数集合
	 */
	public InitUploadVideoModule(Map<String, Object> initParamMap) {	
		this.originFileName = (String) initParamMap.get("originFileName");
		this.userFileName = (String) initParamMap.get("userFileName");
		this.typeId = (Long) initParamMap.get("typeId");
		this.presetId = (Long) initParamMap.get("presetId");
		this.callbackUrl = (String) initParamMap.get("callbackUrl");
		this.description = (String) initParamMap.get("description");
		this.watermarkId = (Long) initParamMap.get("watermarkId");
		this.uploadCallbackUrl  = (String) initParamMap.get("uploadCallbackUrl");
		this.userDefInfo  = (String) initParamMap.get("userDefInfo");
	}
	
	/**
	 * 
	* <p>Description: 传入参数构造封装类</p>
	* @param originFileName        上传文件的原始名称
	* @param userFileName          用户命名的上传文件名称
	* @param typeId                视频所属的类别ID
	* @param presetId              视频所需转码模板ID
	* @param callbackUrl           转码成功后回调客户端的URL地址
	* @param description           上传视频的描述信息
	* @param watermarkId           上传视频的视频水印Id
	* @param uploadCallbackUrl     上传成功后回调客户端的URL地址（需标准http格式）
	* @param userDefInfo           用户自定义信息，会在上传成功或转码成功后通过回调返回给用户
	 */
	public InitUploadVideoModule(String originFileName, String userFileName,
			Long typeId, Long presetId, String callbackUrl, String description,
			Long watermarkId, String uploadCallbackUrl, String userDefInfo) {	
		this.originFileName = originFileName;
		this.userFileName = userFileName;
		this.typeId = typeId;
		this.presetId = presetId;
		this.callbackUrl = callbackUrl;
		this.description = description;
		this.watermarkId = watermarkId;
		this.uploadCallbackUrl  = uploadCallbackUrl;
		this.userDefInfo  =  userDefInfo ;
	}
	/**
	 * 
	* <p>Title: getOriginFileName</p>
	* <p>Description: 取得上传文件的原始名称</p>
	* @return 上传文件的原始名称
	 */
	public String getOriginFileName() {
		return originFileName;
	}
	/**
	 * 
	* <p>Title: setOriginFileName</p>
	* <p>Description: 设置上传文件的原始名称</p>
	* @param originFileName  上传文件的原始名称
	 */
	public void setOriginFileName(String originFileName) {
		this.originFileName = originFileName;
	}
	/**
	 * 
	* <p>Title: getUserFileName</p>
	* <p>Description: 取得用户命名的上传文件名称</p>
	* @return 用户命名的上传文件名称
	 */
	public String getUserFileName() {
		return userFileName;
	}
	/**
	 * 
	* <p>Title: setUserFileName</p>
	* <p>Description: 设置用户命名的上传文件名称</p>
	* @param userFileName 用户命名的上传文件名称
	 */
	public void setUserFileName(String userFileName) {
		this.userFileName = userFileName;
	}
	/**
	 * 
	* <p>Title: getTypeId</p>
	* <p>Description: 取得视频所属的类别ID</p>
	* @return 视频所属的类别ID
	 */
	public Long getTypeId() {
		return typeId;
	}
	/**
	 * 
	* <p>Title: setTypeId</p>
	* <p>Description: 设置视频所属的类别ID</p>
	* @param typeId 视频所属的类别ID
	 */
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	/**
	 * 
	* <p>Title: getPresetId</p>
	* <p>Description: 取得视频所需转码模板ID</p>
	* @return 视频所需转码模板ID
	 */
	public Long getPresetId() {
		return presetId;
	}
	/**
	 * 
	* <p>Title: setPresetId</p>
	* <p>Description: 设置视频所需转码模板ID</p>
	* @param presetId 视频所需转码模板ID
	 */
	public void setPresetId(Long presetId) {
		this.presetId = presetId;
	}
	/**
	 * 
	* <p>Title: getCallbackUrl</p>
	* <p>Description: 取得转码成功后回调客户端的URL地址</p>
	* @return 转码成功后回调客户端的URL地址
	 */
	public String getCallbackUrl() {
		return callbackUrl;
	}
	/**
	 * 
	* <p>Title: setCallbackUrl</p>
	* <p>Description: 设置转码成功后回调客户端的URL地址</p>
	* @param callbackUrl 转码成功后回调客户端的URL地址
	 */
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	/**
	 * 
	* <p>Title: getDescription</p>
	* <p>Description: 取得上传视频的描述信息</p>
	* @return 上传视频的描述信息
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 
	* <p>Title: setDescription</p>
	* <p>Description: 设置上传视频的描述信息</p>
	* @param description 上传视频的描述信息
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 
	* <p>Title: getWatermarkId</p>
	* <p>Description: 取得上传视频的视频水印Id</p>
	* @return 上传视频的视频水印Id
	 */
	public Long getWatermarkId() {
		return watermarkId;
	}
	/**
	 * 
	* <p>Title: setWatermarkId</p>
	* <p>Description: 设置上传视频的视频水印Id</p>
	* @param watermarkId 上传视频的视频水印Id
	 */
	public void setWatermarkId(Long watermarkId) {
		this.watermarkId = watermarkId;
	}

	/**
	 * 
	* <p>Title: getUploadCallbackUrl</p>
	* <p>Description: 取得上传成功后回调客户端的URL地址</p>
	* @return 上传成功后回调客户端的URL地址
	 */
	public String getUploadCallbackUrl() {
		return uploadCallbackUrl;
	}

	/**
	 * 
	* <p>Title: setUploadCallbackUrl</p>
	* <p>Description: 设置上传成功后回调客户端的URL地址</p>
	* @param uploadCallbackUrl  上传成功后回调客户端的URL地址
	 */
	public void setUploadCallbackUrl(String uploadCallbackUrl) {
		this.uploadCallbackUrl = uploadCallbackUrl;
	}

	/**
	 * 
	* <p>Title: getUserDefInfo</p>
	* <p>Description: 取得用户自定义信息</p>
	* @return 用户自定义信息
	 */
	public String getUserDefInfo() {
		return userDefInfo;
	}

	/**
	 * 
	* <p>Title: setUserDefInfo</p>
	* <p>Description: 用户自定义信息</p>
	* @param userDefInfo 设置用户自定义信息
	 */
	public void setUserDefInfo(String userDefInfo) {
		this.userDefInfo = userDefInfo;
	}
	
	
	
}
