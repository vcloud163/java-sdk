package com.netease.vcloud.config;


/**
* <p>Title: Config</p>
* <p>Description: 项目中公共参数配置类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-24
*/
public final class Config {

	/** 分片上传视频：分片字节数（默认4M不变） */	
	private static long uploadDataSize = 1024 * 1024 * 4;
	
	
	
	
	/** HttpClient 连接超时时限  */
	private static Integer connectionTimeout;
	
	/** HttpClient socket超时时间    */
	private static Integer socketTimeout;	
	
	
	
	/* 开发者平台分配的appkey */
	private static String appKey ;
	
	/* 开发者平台分配的appSecret */
	private static String appSecret;  
	
	
	
	//转码模板相关的URL、域名、接口名	
	
	/** 创建转码模板的URL 默认值 https://vcloud.163.com/app/vod/preset/create */
	private static String createPresetURL = "https://vcloud.163.com/app/vod/preset/create";
	
	/** 创建转码模板的域名   默认值 https://vcloud.163.com */
	private static String createPresetDomainName = "https://vcloud.163.com";
	
	/** 创建转码模板的接口名  默认值 /app/vod/preset/create*/
	private static String createPresetInterfaceName = "/app/vod/preset/create";
	
	/** 获得单个转码模板的URL 默认值 https://vcloud.163.com/app/vod/preset/get*/
	private static String getSinglePresetURL = "https://vcloud.163.com/app/vod/preset/get";
	
	/** 获得单个转码模板的域名  默认值 https://vcloud.163.com */
	private static String getSinglePresetDomainName = "https://vcloud.163.com";
	
	/** 获得单个转码模板的接口名 默认值 /app/vod/preset/get*/
	private static String getSinglePresetInterfaceName = "/app/vod/preset/get";
	
	/** 获取转码模板列表的URL 默认值 https://vcloud.163.com/app/vod/preset/list*/ 
	private static String getPresetListURL = "https://vcloud.163.com/app/vod/preset/list";
	
	/** 获取转码模板列表的域名  默认值 https://vcloud.163.com*/  
	private static String getPresetListDomainName = "https://vcloud.163.com";
	
	/** 获取转码模板列表的接口名  默认值 /app/vod/preset/list*/ 
	private static String getPresetListInterfaceName = "/app/vod/preset/list";
	
	/** 修改转码模板的URL 默认值 https://vcloud.163.com/app/vod/preset/update*/
	private static String updatePresetURL = "https://vcloud.163.com/app/vod/preset/update";
	
	/** 修改转码模板的域名  默认值  https://vcloud.163.com*/
	private static String updatePresetDomainName = "https://vcloud.163.com";
	
	/** 修改转码模板的接口名  默认值  /app/vod/preset/update*/
	private static String updatePresetInterfaceName = "/app/vod/preset/update";
	
	/** 删除转码模板的URL 默认值 https://vcloud.163.com/app/vod/preset/presetDelete*/
	private static String deletePresetURL = "https://vcloud.163.com/app/vod/preset/presetDelete";
	
	/** 删除转码模板的域名  默认值 https://vcloud.163.com*/
	private static String deletePresetDomainName = "https://vcloud.163.com";	
	
	/** 删除转码模板的接口名 默认值 /app/vod/preset/presetDelete*/
	private static String deletePresetInterfaceName = "/app/vod/preset/presetDelete";	
	
	
	
	
	//视频相关的URL、域名、接口名	
	
	/** 获取单个视频的URL 默认值  https://vcloud.163.com/app/vod/video/get */
	private static String getSingleVideoURL = "https://vcloud.163.com/app/vod/video/get";
	
	/** 获取单个视频的域名 默认值 https://vcloud.163.com */
	private static String getSingleVideoDomainName = "https://vcloud.163.com";
	
	/** 获取单个视频的接口名 默认值  /app/vod/video/get*/
	private static String getSingleVideoInterfaceName = "/app/vod/video/get";
	
	
	/** 获取视频列表的URL 默认值 https://vcloud.163.com/app/vod/video/list*/
	private static String getVideoListURL = "https://vcloud.163.com/app/vod/video/list";
	
	/** 获取视频列表的域名 默认值  https://vcloud.163.com*/
	private static String getVideoListDomainName = "https://vcloud.163.com";
	
	/** 获取视频列表的接口名 默认值  /app/vod/video/list*/
	private static String getVideoListInterfaceName = "/app/vod/video/list";
	
	/** 视频编辑的URL 默认值 https://vcloud.163.com/app/vod/video/edit*/
	private static String editVideoURL = "https://vcloud.163.com/app/vod/video/edit";
	
	/** 视频编辑的域名  默认值 https://vcloud.163.com*/
	private static String editVideoDomainName = "https://vcloud.163.com";
	
	/** 视频编辑的接口名  默认值 /app/vod/video/edit*/
	private static String editVideoInterfaceName = "/app/vod/video/edit";
	
	/** 删除单个转码输出视频的URL 默认值 https://vcloud.163.com/app/vod/video/delete_single*/
	private static String deleteSingleTransCodeVideoURL = "https://vcloud.163.com/app/vod/video/delete_single";
	
	/** 删除单个转码输出视频的域名  默认值  https://vcloud.163.com*/
	private static String deleteSingleTransCodeVideoDomainName = "https://vcloud.163.com";
	
	/** 删除单个转码输出视频的接口名  默认值  /app/vod/video/delete_single*/
	private static String deleteSingleTransCodeVideoInterfaceName = "/app/vod/video/delete_single";
	
	/** 删除单个视频的URL 默认值 https://vcloud.163.com/app/vod/video/videoDelete */
	private static String deleteSingleVideoURL = "https://vcloud.163.com/app/vod/video/videoDelete";
	
	/** 删除单个视频的域名  默认值 https://vcloud.163.com */
	private static String deleteSingleVideoDomainName = "https://vcloud.163.com";
	
	/** 删除单个视频的接口名  默认值  /app/vod/video/videoDelete */
	private static String deleteSingleVideoInterfaceName = "/app/vod/video/videoDelete";
	
	/** 视频屏蔽的URL 默认值  https://vcloud.163.com/app/vod/video/videoDisable*/
	private static String disableVideoURL = "https://vcloud.163.com/app/vod/video/videoDisable";
	
	/** 视频屏蔽的域名   默认值   https://vcloud.163.com*/
	private static String disableVideoDomainName = "https://vcloud.163.com";
	
	/** 视频屏蔽的接口名   默认值   /app/vod/video/videoDisable */
	private static String disableVideoInterfaceName = "/app/vod/video/videoDisable";
	
	/** 视频恢复的URL 默认值   https://vcloud.163.com/app/vod/video/videoRecover*/
	private static String recoverVideoURL = "https://vcloud.163.com/app/vod/video/videoRecover";
	
	/** 视频恢复的域名   默认值  https://vcloud.163.com*/
	private static String recoverVideoDomainName = "https://vcloud.163.com";
	
	/** 视频恢复的接口名   默认值   /app/vod/video/videoRecover*/
	private static String recoverVideoInterfaceName = "/app/vod/video/videoRecover";
	
	/** 多视频转码的URL 默认值   https://vcloud.163.com/app/vod/transcode/resetmulti*/
	private static String multiVideoTranscodingURL = "https://vcloud.163.com/app/vod/transcode/resetmulti";
	
	/** 多视频转码的域名   默认值   https://vcloud.163.com */
	private static String multiVideoTranscodingDomainName = "https://vcloud.163.com";	
	
	/** 多视频转码的接口名   默认值   /app/vod/transcode/resetmulti*/
	private static String multiVideoTranscodingInterfaceName = "/app/vod/transcode/resetmulti";
	
	
	/** 多视频无模板转码的URL 默认值  https://vcloud.163.com/app/vod/transcode */
	private static String multiVideoTranscodingWithoutPresetURL = "https://vcloud.163.com/app/vod/transcode";
	
	/** 多视频无模板转码的域名   默认值   https://vcloud.163.com*/
	private static String multiVideoTranscodingWithoutPresetDomainName = "https://vcloud.163.com";
	
	/** 多视频无模板转码的接口名   默认值   /app/vod/transcode */
	private static String multiVideoTranscodingWithoutPresetInterfaceName = "/app/vod/transcode";
	
	/** 设置回调地址的URL 默认值  https://vcloud.163.com/app/vod/transcode/setcallback*/
	private static String setVideoCallBackURL = "https://vcloud.163.com/app/vod/transcode/setcallback";
	
	/** 设置回调地址的域名   默认值   https://vcloud.163.com*/
	private static String setVideoCallBackDomainName = "https://vcloud.163.com";
	
	/** 设置回调地址的接口名   默认值  /app/vod/transcode/setcallback */
	private static String setVideoCallBackInterfaceName = "/app/vod/transcode/setcallback";
	
	
	
	
	//上传相关的URL、域名、接口名	
	
	/** 视频上传初始化的URL 默认值  https://vcloud.163.com/app/vod/upload/init */
	private static String initUploadVideoURL = "https://vcloud.163.com/app/vod/upload/init";
	
	/** 视频上传初始化的域名   默认值   https://vcloud.163.com*/
	private static String initUploadVideoDomainName = "https://vcloud.163.com";
	
	/** 视频上传初始化的接口名   默认值    /app/vod/upload/init*/
	private static String initUploadVideoInterfaceName = "/app/vod/upload/init";
	
//	/** 获取上传加速节点地址的URL 默认值  http://wanproxy.127.net/lbs?version=1.0*/
//	private static String getUploadHostURL = "http://wanproxy.127.net/lbs?version=1.0";
	
	/** 根据对象名查询视频主ID的URL 默认值   https://vcloud.163.com/app/vod/video/query*/
	private static String queryVideoIDURL = "https://vcloud.163.com/app/vod/video/query";
	
	/** 根据对象名查询视频主ID的域名   默认值   https://vcloud.163.com */
	private static String queryVideoIDDomainName = "https://vcloud.163.com";
	
	/** 根据对象名查询视频主ID的接口名    默认值   /app/vod/video/query*/
	private static String queryVideoIDInterfaceName = "/app/vod/video/query";
	
	/** 设置上传回调地址的URL 默认值  https://vcloud.163.com/app/vod/upload/setcallback*/
	private static String setCallbackURL = "https://vcloud.163.com/app/vod/upload/setcallback";
	
	/** 设置上传回调地址的域名   默认值   https://vcloud.163.com*/
	private static String setCallbackDomainName = "https://vcloud.163.com";
	
	/** 设置上传回调地址的接口名   默认值   /app/vod/upload/setcallback*/
	private static String setCallbackInterfaceName = "/app/vod/upload/setcallback";
	
	
	
	// 视频分类管理相关的URL、域名、接口名
	
	/** 创建视频分类的URL  默认值  https://vcloud.163.com/app/vod/type/create */
	private static String createTypeURL = "https://vcloud.163.com/app/vod/type/create";
	
	/** 创建视频分类的域名      默认值  https://vcloud.163.com*/
	private static String createTypeDomainName = "https://vcloud.163.com";
	
	/** 创建视频分类的接口名    默认值  /app/vod/type/create */
	private static String createTypeInterfaceName = "/app/vod/type/create";
	
	
	/** 获取视频分类的URL  默认值https://vcloud.163.com/app/vod/type/get */
	private static String getSingleTypeURL = "https://vcloud.163.com/app/vod/type/get";
	
	/** 获取视频分类的域名     默认值https://vcloud.163.com */
	private static String getSingleTypeDomainName = "https://vcloud.163.com";
	
	/** 获取视频分类的接口名    默认值 /app/vod/type/get */
	private static String getSingleTypeInterfaceName = "/app/vod/type/get";
	
	
	/** 获取视频分类列表的URL  默认值https://vcloud.163.com/app/vod/type/list */
	private static String getTypeListURL = "https://vcloud.163.com/app/vod/type/list";
	
	/** 获取视频分类列表的域名     默认值https://vcloud.163.com */
	private static String getTypeListDomainName = "https://vcloud.163.com";
	
	/** 获取视频分类列表的接口名   默认值/app/vod/type/list */
	private static String getTypeListInterfaceName = "/app/vod/type/list";
	
	
	/** 修改视频分类的URL  默认值https://vcloud.163.com/app/vod/type/update */
	private static String updateTypeURL = "https://vcloud.163.com/app/vod/type/update";
	
	/** 修改视频分类的域名     默认值https://vcloud.163.com */
	private static String updateTypeDomainName = "https://vcloud.163.com";
	
	/** 修改视频分类的接口名     默认值/app/vod/type/update */
	private static String updateTypeInterfaceName = "/app/vod/type/update";
	
	
	/** 删除视频分类的URL  默认值https://vcloud.163.com/app/vod/type/typeDelete */
	private static String deleteTypeURL = "https://vcloud.163.com/app/vod/type/typeDelete";
	
	/** 删除视频分类的域名  默认值https://vcloud.163.com */
	private static String deleteTypeDomainName = "https://vcloud.163.com";
	
	/** 删除视频分类的接口名    默认值/app/vod/type/typeDelete */
	private static String deleteTypeInterfaceName = "/app/vod/type/typeDelete";
	
	
	/** 设置视频的分类的URL  默认值https://vcloud.163.com/app/vod/type/set */
	private static String setVideoTypeURL = "https://vcloud.163.com/app/vod/type/set";
	
	/** 设置视频的分类的域名     默认值https://vcloud.163.com */
	private static String setVideoTypeDomainName = "https://vcloud.163.com";
	
	/** 设置视频的分类的接口名  默认值/app/vod/type/set */
	private static String setVideoTypeInterfaceName = "/app/vod/type/set";
	
	
	
	


	
	
	// 视频水印管理相关的URL、域名、接口名
	
	/** 创建视频水印模板的URL  默认值https://vcloud.163.com/app/vod/watermark/create */
	private static String createWatermarkURL = "https://vcloud.163.com/app/vod/watermark/create";
	
	/** 创建视频水印模板的域名      默认值https://vcloud.163.com*/
	private static String createWatermarkDomainName = "https://vcloud.163.com";
	
	/** 创建视频水印模板的接口名    默认值/app/vod/watermark/create */
	private static String createWatermarkInterfaceName = "/app/vod/watermark/create";
	
	
	/** 获取视频水印模板的URL  默认值https://vcloud.163.com/app/vod/watermark/get */
	private static String getSingleWatermarkURL = "https://vcloud.163.com/app/vod/watermark/get";
	
	/** 获取视频水印模板的域名          默认值https://vcloud.163.com */
	private static String getSingleWatermarkDomainName = "https://vcloud.163.com";
	
	/** 获取视频水印模板的接口名          默认值/app/vod/watermark/get */
	private static String getSingleWatermarkInterfaceName = "/app/vod/watermark/get";
	
	
	
	/** 获取视频水印模板列表的URL  默认值https://vcloud.163.com/app/vod/watermark/list */
	private static String  getWatermarkListURL = "https://vcloud.163.com/app/vod/watermark/list";
	
	/** 获取视频水印模板列表的域名      默认值https://vcloud.163.com */
	private static String  getWatermarkListDomainName = "https://vcloud.163.com";
	
	/** 获取视频水印模板列表的接口名     默认值/app/vod/watermark/list */
	private static String  getWatermarkListInterfaceName = "/app/vod/watermark/list";
	
	
	
	/** 修改视频水印模板的URL  默认值https://vcloud.163.com/app/vod/watermark/update */
	private static String  updateWatermarkURL = "https://vcloud.163.com/app/vod/watermark/update";
	
	/** 修改视频水印模板的域名      默认值https://vcloud.163.com */
	private static String  updateWatermarkDomainName = "https://vcloud.163.com";
	
	/** 修改视频水印模板的接口      默认值/app/vod/watermark/update */
	private static String  updateWatermarkInterfaceName = "/app/vod/watermark/update";
	
	
	/** 删除视频水印模板的URL  默认值https://vcloud.163.com/app/vod/watermark/delete */
	private static String  deleteWatermarkURL = "https://vcloud.163.com/app/vod/watermark/delete";
	
	/** 删除视频水印模板的域名          默认值https://vcloud.163.com*/
	private static String  deleteWatermarkDomainName = "https://vcloud.163.com";
	
	/** 删除视频水印模板的接口名     默认值/app/vod/watermark/delete */
	private static String  deleteWatermarkInterfaceName = "/app/vod/watermark/delete";
	
	
	
	
	

	// 数据查询相关的URL、域名、接口名

	/** 流量统计查询的URL  默认值https://vcloud.163.com/app/vod/stats/flow */
	private static String flowStatsURL = "https://vcloud.163.com/app/vod/stats/flow";
	
	/** 流量统计查询的域名      默认值https://vcloud.163.com */
	private static String flowStatsDomainName = "https://vcloud.163.com";
	
	/** 流量统计查询的接口    默认值/app/vod/stats/flow */
	private static String flowStatsInterfaceName = "/app/vod/stats/flow";
	
	
	
	/** 带宽统计查询的URL  默认值https://vcloud.163.com/app/vod/stats/band */
	private static String bandStatsURL = "https://vcloud.163.com/app/vod/stats/band";
	
	/** 带宽统计查询的域名      默认值https://vcloud.163.com */
	private static String bandStatsDomainName = "https://vcloud.163.com";
	
	/** 带宽统计查询的接口名     默认值/app/vod/stats/band */
	private static String bandStatsInterfaceName = "/app/vod/stats/band";
	
	
	/** 存储统计查询的URL  默认值https://vcloud.163.com/app/vod/stats/storage */
	private static String storageStatsURL = "https://vcloud.163.com/app/vod/stats/storage";
	
	/** 存储统计查询的域名       默认值https://vcloud.163.com */
	private static String storageStatsDomainName = "https://vcloud.163.com";
	
	/** 存储统计查询的接口名    默认值 /app/vod/stats/storage */
	private static String storageStatsInterfaceName = "/app/vod/stats/storage";
	
	
	
	
	
	
	// 视频截图相关的URL、域名、接口名
	
	/** 获取视频截图地址的URL   默认值https://vcloud.163.com/app/vod/snapshot/create */
	private static String createSnapshotURL = "https://vcloud.163.com/app/vod/snapshot/create";
	
	/** 获取视频截图地址的域名          默认值https://vcloud.163.com*/
	private static String createSnapshotDomainName = "https://vcloud.163.com";
	
	/** 获取视频截图地址的接口名     默认值/app/vod/snapshot/create */
	private static String createSnapshotInterfaceName = "/app/vod/snapshot/create";
	
	
	/** 设置视频封面的URL   默认值https://vcloud.163.com/app/vod/snapshot/set*/
	private static String setSnapshotURL = "https://vcloud.163.com/app/vod/snapshot/set";
	
	/** 设置视频封面的域名        默认值https://vcloud.163.com*/
	private static String setSnapshotDomainName = "https://vcloud.163.com";
	
	/** 设置视频封面的接口名    默认值/app/vod/snapshot/set*/
	private static String setSnapshotInterfaceName = "/app/vod/snapshot/set";
	
	/**
	 * 
	* <p>Title: getUploadDataSize</p>
	* <p>Description: 得到上传视频分片时的分片字节数</p>
	* @return 分片字节数
	 */
	public static long getUploadDataSize() {
		return uploadDataSize;
	}

	/**
	 * 
	* <p>Title: setUploadDataSize</p>
	* <p>Description: 设置上传视频分片时的分片字节数</p>
	* @param uploadDataSize 分片字节数
	 */
	public static void setUploadDataSize(long uploadDataSize) {
		Config.uploadDataSize = uploadDataSize;
	}
	
	/**
	 * 
	* <p>Title: getConnectionTimeout</p>
	* <p>Description: 得到连接超时时限</p>
	* @return 连接超时时限
	 */
	public static Integer getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * 
	* <p>Title: setConnectionTimeout</p>
	* <p>Description: 设置连接超时时限</p>
	* @param connectionTimeout 连接超时时限
	 */
	public static void setConnectionTimeout(Integer connectionTimeout) {
		Config.connectionTimeout = connectionTimeout;
	}

	
	
	/**
	 * 
	* <p>Title: getSocketTimeout</p>
	* <p>Description: 返回socket超时时间</p>
	* @return socket超时时间
	 */
	public static Integer getSocketTimeout() {
		return socketTimeout;
	}

	/**
	 * 
	* <p>Title: setSocketTimeout</p>
	* <p>Description: 设置socket超时时间</p>
	* @param socketTimeout socket超时时间
	 */
	public static void setSocketTimeout(Integer socketTimeout) {
		Config.socketTimeout = socketTimeout;
	}

	/**
	 * 
	* <p>Title: getAppKey</p>
	* <p>Description: 得到开发者平台分配的appkey</p>
	* @return 开发者平台分配的appkey
	 */
	public static String getAppKey() {
		return appKey;
	}

	/***
	 * 
	* <p>Title: setAppKey</p>
	* <p>Description: 设置开发者平台分配的appkey</p>
	* @param appKey 开发者平台分配的appkey
	 */
	public static void setAppKey(String appKey) {
		Config.appKey = appKey;
	}

	/**
	 * 
	* <p>Title: getAppSecret</p>
	* <p>Description: 得到开发者平台分配的appSecret</p>
	* @return 开发者平台分配的appSecret
	 */
	public static String getAppSecret() {
		return appSecret;
	}

	/**
	 * 
	* <p>Title: setAppSecret</p>
	* <p>Description: 设置开发者平台分配的appSecret</p>
	* @param appSecret 开发者平台分配的appSecret
	 */
	public static void setAppSecret(String appSecret) {
		Config.appSecret = appSecret;
	}

	
	/**
	 * 
	* <p>Title: getCreatePresetURL</p>
	* <p>Description: 得到创建转码模板的URL</p>
	* @return 创建转码模板的URL
	 */
	public static String getCreatePresetURL() {
		return createPresetURL;
	}	
	
	/**
	 * 
	* <p>Title: setCreatePresetURL</p>
	* <p>Description: 设置创建转码模板的URL</p>
	* @param createPresetURL 创建转码模板的URL
	 */
	private static void setCreatePresetURL(String createPresetURL) {
		Config.createPresetURL = createPresetURL;
	}

	/**
	 * 
	* <p>Title: getCreatePresetDomainName</p>
	* <p>Description: 得到创建转码模板的域名</p>
	* @return 创建转码模板的域名
	 */
	public static String getCreatePresetDomainName() {
		return createPresetDomainName;
	}

	/**
	 * 
	* <p>Title: setCreatePresetDomainName</p>
	* <p>Description: 设置创建转码模板的域名</p>
	* @param createPresetDomainName 创建转码模板的域名
	 */
	public static void setCreatePresetDomainName(String createPresetDomainName) {
		Config.createPresetDomainName = createPresetDomainName;
		setCreatePresetURL(Config.createPresetDomainName + Config.createPresetInterfaceName);
	}

	/**
	 * 
	* <p>Title: getCreatePresetInterfaceName</p>
	* <p>Description: 得到创建转码模板的接口名</p>
	* @return 创建转码模板的接口名
	 */
	public static String getCreatePresetInterfaceName() {
		return createPresetInterfaceName;
	}	

	/**
	 * 
	* <p>Title: setCreatePresetInterfaceName</p>
	* <p>Description: 设置创建转码模板的接口名</p>
	* @param createPresetInterfaceName 创建转码模板的接口名
	 */
	private static void setCreatePresetInterfaceName(String createPresetInterfaceName) {
		Config.createPresetInterfaceName = createPresetInterfaceName;
	}

	
	
	/**
	 * 
	* <p>Title: getGetSinglePresetURL</p>
	* <p>Description: 得到获得单个转码模板的URL</p>
	* @return 获得单个转码模板的URL
	 */
	public static String getGetSinglePresetURL() {
		return getSinglePresetURL;
	}
	
	/**
	 * 
	* <p>Title: setGetSinglePresetURL</p>
	* <p>Description: 设置获得单个转码模板的URL</p>
	* @param getSinglePresetURL 获得单个转码模板的URL
	 */
	private static void setGetSinglePresetURL(String getSinglePresetURL) {
		Config.getSinglePresetURL = getSinglePresetURL;
	}

	/**
	 * 
	* <p>Title: getGetSinglePresetDomainName</p>
	* <p>Description: 得到获得单个转码模板的域名</p>
	* @return 获得单个转码模板的域名
	 */
	public static String getGetSinglePresetDomainName() {
		return getSinglePresetDomainName;
	}

	/**
	 * 
	* <p>Title: setGetSinglePresetDomainName</p>
	* <p>Description: 设置获得单个转码模板的域名</p>
	* @param getSinglePresetDomainName 获得单个转码模板的域名
	 */
	public static void setGetSinglePresetDomainName(String getSinglePresetDomainName) {
		Config.getSinglePresetDomainName = getSinglePresetDomainName;
		setGetSinglePresetURL(Config.getSinglePresetDomainName + Config.getSinglePresetInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetSinglePresetInterfaceName</p>
	* <p>Description: 得到获得单个转码模板的接口名</p>
	* @return 获得单个转码模板的接口名
	 */
	public static String getGetSinglePresetInterfaceName() {
		return getSinglePresetInterfaceName;
	}	
	
	/**
	 * 
	* <p>Title: setGetSinglePresetInterfaceName</p>
	* <p>Description: 设置获得单个转码模板的接口名</p>
	* @param getSinglePresetInterfaceName 获得单个转码模板的接口名
	 */
	private static void setGetSinglePresetInterfaceName(
			String getSinglePresetInterfaceName) {
		Config.getSinglePresetInterfaceName = getSinglePresetInterfaceName;
	}
	
	
	

	/**
	 * 
	* <p>Title: getGetPresetListURL</p>
	* <p>Description: 取得获取转码模板列表的URL</p>
	* @return 获取转码模板列表的URL
	 */
	public static String getGetPresetListURL() {
		return getPresetListURL;
	}	
	
	/**
	 * 
	* <p>Title: setGetPresetListURL</p>
	* <p>Description: 设置获取转码模板列表的URL</p>
	* @param getPresetListURL 获取转码模板列表的URL
	 */
	private static void setGetPresetListURL(String getPresetListURL) {
		Config.getPresetListURL = getPresetListURL;
	}

	/**
	 * 
	* <p>Title: getGetPresetListDomainName</p>
	* <p>Description: 取得获取转码模板列表的域名</p>
	* @return 获取转码模板列表的域名
	 */
	public static String getGetPresetListDomainName() {
		return getPresetListDomainName;
	}

	/**
	 * 
	* <p>Title: setGetPresetListDomainName</p>
	* <p>Description: 设置获取转码模板列表的域名</p>
	* @param getPresetListDomainName 获取转码模板列表的域名
	 */
	public static void setGetPresetListDomainName(String getPresetListDomainName) {
		Config.getPresetListDomainName = getPresetListDomainName;
		setGetPresetListURL(Config.getPresetListDomainName + Config.getPresetListInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetPresetListInterfaceName</p>
	* <p>Description: 取得获取转码模板列表的接口名</p>
	* @return 获取转码模板列表的接口名
	 */
	public static String getGetPresetListInterfaceName() {
		return getPresetListInterfaceName;
	}	
	
	/**
	 * 
	* <p>Title: setGetPresetListInterfaceName</p>
	* <p>Description: 设置获取转码模板列表的接口名</p>
	* @param getPresetListInterfaceName 获取转码模板列表的接口名
	 */
	private static void setGetPresetListInterfaceName(
			String getPresetListInterfaceName) {
		Config.getPresetListInterfaceName = getPresetListInterfaceName;
	}

	
	
	/**
	 * 
	* <p>Title: getUpdatePresetURL</p>
	* <p>Description: 取得修改转码模板的URL</p>
	* @return 修改转码模板的URL
	 */
	public static String getUpdatePresetURL() {
		return updatePresetURL;
	}
	
	/**
	 * 
	* <p>Title: setUpdatePresetURL</p>
	* <p>Description: 设置修改转码模板的URL</p>
	* @param updatePresetURL 修改转码模板的URL
	 */
	private static void setUpdatePresetURL(String updatePresetURL) {
		Config.updatePresetURL = updatePresetURL;
	}

	/**
	 * 
	* <p>Title: getUpdatePresetDomainName</p>
	* <p>Description: 取得修改转码模板的域名</p>
	* @return 修改转码模板的域名
	 */
	public static String getUpdatePresetDomainName() {
		return updatePresetDomainName;
	}

	/**
	 * 
	* <p>Title: setUpdatePresetDomainName</p>
	* <p>Description: 设置修改转码模板的域名</p>
	* @param updatePresetDomainName 修改转码模板的域名
	 */
	public static void setUpdatePresetDomainName(String updatePresetDomainName) {
		Config.updatePresetDomainName = updatePresetDomainName;
		setUpdatePresetURL(Config.updatePresetDomainName + Config.updatePresetInterfaceName);
	}

	/**
	 * 
	* <p>Title: getUpdatePresetInterfaceName</p>
	* <p>Description: 得到修改转码模板的接口名</p>
	* @return 修改转码模板的接口名
	 */
	public static String getUpdatePresetInterfaceName() {
		return updatePresetInterfaceName;
	}	
	
	/**
	 * 
	* <p>Title: setUpdatePresetInterfaceName</p>
	* <p>Description: 设置修改转码模板的接口名</p>
	* @param updatePresetInterfaceName 修改转码模板的接口名
	 */
	private static void setUpdatePresetInterfaceName(String updatePresetInterfaceName) {
		Config.updatePresetInterfaceName = updatePresetInterfaceName;
	}
	
	

	/**
	 * 
	* <p>Title: getDeletePresetURL</p>
	* <p>Description: 取得删除转码模板的URL</p>
	* @return 删除转码模板的URL
	 */
	public static String getDeletePresetURL() {
		return deletePresetURL;
	}

	/**
	 * 
	* <p>Title: setDeletePresetURL</p>
	* <p>Description: 设置删除转码模板的URL</p>
	* @param deletePresetURL 删除转码模板的URL
	 */
	private static void setDeletePresetURL(String deletePresetURL) {
		Config.deletePresetURL = deletePresetURL;
	}	
	
	/**
	 * 
	* <p>Title: getDeletePresetDomainName</p>
	* <p>Description: 取得删除转码模板的域名</p>
	* @return 删除转码模板的域名
	 */
	public static String getDeletePresetDomainName() {
		return deletePresetDomainName;
	}

	/**
	 * 
	* <p>Title: setDeletePresetDomainName</p>
	* <p>Description: 设置删除转码模板的域名</p>
	* @param deletePresetDomainName
	 */
	public static void setDeletePresetDomainName(String deletePresetDomainName) {
		Config.deletePresetDomainName = deletePresetDomainName;		
		setDeletePresetURL(Config.deletePresetDomainName + Config.deletePresetInterfaceName);
	}

	/**
	 * 
	* <p>Title: getDeletePresetInterfaceName</p>
	* <p>Description: 取得删除转码模板的接口名</p>
	* @return 删除转码模板的接口名
	 */
	public static String getDeletePresetInterfaceName() {
		return deletePresetInterfaceName;
	}		

	/**
	 * 
	* <p>Title: setDeletePresetInterfaceName</p>
	* <p>Description: 设置删除转码模板的接口名</p>
	* @param deletePresetInterfaceName 删除转码模板的接口名
	 */
	private static void setDeletePresetInterfaceName(String deletePresetInterfaceName) {
		Config.deletePresetInterfaceName = deletePresetInterfaceName;
	}
		
	
	

	/**
	 * 
	* <p>Title: getGetSingleVideoURL</p>
	* <p>Description: 取得获取单个视频的URL</p>
	* @return 获取单个视频的URL
	 */
	public static String getGetSingleVideoURL() {
		return getSingleVideoURL;
	}

	/**
	 * 
	* <p>Title: setGetSingleVideoURL</p>
	* <p>Description: 设置获取单个视频的URL</p>
	* @param getSingleVideoURL 获取单个视频的URL
	 */
	private static void setGetSingleVideoURL(String getSingleVideoURL) {
		Config.getSingleVideoURL = getSingleVideoURL;
	}	
	
	
	/**
	 * 
	* <p>Title: getGetSingleVideoDomainName</p>
	* <p>Description: 取得获取单个视频的域名</p>
	* @return 获取单个视频的域名
	 */
	public static String getGetSingleVideoDomainName() {
		return getSingleVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setGetSingleVideoDomainName</p>
	* <p>Description: 设置获取单个视频的域名</p>
	* @param getSingleVideoDomainName 获取单个视频的域名
	 */
	public static void setGetSingleVideoDomainName(String getSingleVideoDomainName) {
		Config.getSingleVideoDomainName = getSingleVideoDomainName;
		setGetSingleVideoURL(Config.getSingleVideoDomainName + Config.getSingleVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetSingleVideoInterfaceName</p>
	* <p>Description: 取得获取单个视频的接口名</p>
	* @return 获取单个视频的接口名
	 */
	public static String getGetSingleVideoInterfaceName() {
		return getSingleVideoInterfaceName;
	}

	/**
	 * 
	* <p>Title: setGetSingleVideoInterfaceName</p>
	* <p>Description: 设置获取单个视频的接口名</p>
	* @param getSingleVideoInterfaceName 获取单个视频的接口名
	 */
	private static void setGetSingleVideoInterfaceName(
			String getSingleVideoInterfaceName) {
		Config.getSingleVideoInterfaceName = getSingleVideoInterfaceName;
	}
	
	
	
	

	/**
	 * 
	* <p>Title: getGetVideoListURL</p>
	* <p>Description: 取得获取视频列表的URL</p>
	* @return 获取视频列表的URL
	 */
	public static String getGetVideoListURL() {
		return getVideoListURL;
	}

	/**
	 * 
	* <p>Title: setGetVideoListURL</p>
	* <p>Description: 设置获取视频列表的URL</p>
	* @param getVideoListURL 获取视频列表的URL
	 */
	private static void setGetVideoListURL(String getVideoListURL) {
		Config.getVideoListURL = getVideoListURL;
	}
	

	/**
	 * 
	* <p>Title: getGetVideoListDomainName</p>
	* <p>Description: 取得获取视频列表的域名</p>
	* @return 获取视频列表的域名
	 */
	public static String getGetVideoListDomainName() {
		return getVideoListDomainName;
	}

	/**
	 * 
	* <p>Title: setGetVideoListDomainName</p>
	* <p>Description: 设置获取视频列表的域名</p>
	* @param getVideoListDomainName 获取视频列表的域名
	 */
	public static void setGetVideoListDomainName(String getVideoListDomainName) {
		Config.getVideoListDomainName = getVideoListDomainName;
		setGetVideoListURL(Config.getVideoListDomainName + Config.getVideoListInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetVideoListInterfaceName</p>
	* <p>Description: 取得获取视频列表的接口名</p>
	* @return 获取视频列表的接口名
	 */
	public static String getGetVideoListInterfaceName() {
		return getVideoListInterfaceName;
	}

	/**
	 * 
	* <p>Title: setGetVideoListInterfaceName</p>
	* <p>Description: 设置获取视频列表的接口名</p>
	* @param getVideoListInterfaceName 获取视频列表的接口名
	 */
	private static void setGetVideoListInterfaceName(String getVideoListInterfaceName) {
		Config.getVideoListInterfaceName = getVideoListInterfaceName;
	}
	
	

	/**
	 * 
	* <p>Title: getEditVideoURL</p>
	* <p>Description: 取得视频编辑的URL</p>
	* @return 视频编辑的URL
	 */
	public static String getEditVideoURL() {
		return editVideoURL;
	}

	/**
	 * 
	* <p>Title: setEditVideoURL</p>
	* <p>Description: 设置视频编辑的URL</p>
	* @param editVideoURL 视频编辑的URL
	 */
	private static void setEditVideoURL(String editVideoURL) {
		Config.editVideoURL = editVideoURL;
	}		

	/**
	 * 
	* <p>Title: getEditVideoDomainName</p>
	* <p>Description: 取得视频编辑的域名</p>
	* @return 视频编辑的域名
	 */
	public static String getEditVideoDomainName() {
		return editVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setEditVideoDomainName</p>
	* <p>Description: 设置视频编辑的域名</p>
	* @param editVideoDomainName 视频编辑的域名
	 */
	public static void setEditVideoDomainName(String editVideoDomainName) {
		Config.editVideoDomainName = editVideoDomainName;
		setEditVideoURL(Config.editVideoDomainName + Config.editVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getEditVideoInterfaceName</p>
	* <p>Description: 取得视频编辑的接口名</p>
	* @return 视频编辑的接口名
	 */
	public static String getEditVideoInterfaceName() {
		return editVideoInterfaceName;
	}

	/**
	 * 
	* <p>Title: setEditVideoInterfaceName</p>
	* <p>Description: 设置视频编辑的接口名</p>
	* @param editVideoInterfaceName 视频编辑的接口名
	 */
	private static void setEditVideoInterfaceName(String editVideoInterfaceName) {
		Config.editVideoInterfaceName = editVideoInterfaceName;
	}
	

	
	/**
	 * 
	* <p>Title: getDeleteSingleTransCodeVideoURL</p>
	* <p>Description:  取得删除单个转码输出视频的URL</p>
	* @return  删除单个转码输出视频的URL
	 */
	public static String getDeleteSingleTransCodeVideoURL() {
		return deleteSingleTransCodeVideoURL;
	}

	/**
	 * 
	* <p>Title: setDeleteSingleTransCodeVideoURL</p>
	* <p>Description: 设置删除单个转码输出视频的URL</p>
	* @param deleteSingleTransCodeVideoURL  删除单个转码输出视频的URL
	 */
	private static void setDeleteSingleTransCodeVideoURL(
			String deleteSingleTransCodeVideoURL) {
		Config.deleteSingleTransCodeVideoURL = deleteSingleTransCodeVideoURL;
	}
	
	/**
	 * 
	* <p>Title: getDeleteSingleTransCodeVideoDomainName</p>
	* <p>Description: 取得删除单个转码输出视频的域名</p>
	* @return 删除单个转码输出视频的域名
	 */
	public static String getDeleteSingleTransCodeVideoDomainName() {
		return deleteSingleTransCodeVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setDeleteSingleTransCodeVideoDomainName</p>
	* <p>Description: 设置删除单个转码输出视频的域名</p>
	* @param deleteSingleTransCodeVideoDomainName 删除单个转码输出视频的域名
	 */
	public static void setDeleteSingleTransCodeVideoDomainName(
			String deleteSingleTransCodeVideoDomainName) {
		Config.deleteSingleTransCodeVideoDomainName = deleteSingleTransCodeVideoDomainName;
		setDeleteSingleTransCodeVideoURL(Config.deleteSingleTransCodeVideoDomainName + Config.deleteSingleTransCodeVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getDeleteSingleTransCodeVideoInterfaceName</p>
	* <p>Description: 取得删除单个转码输出视频的接口名</p>
	* @return 删除单个转码输出视频的接口名
	 */
	public static String getDeleteSingleTransCodeVideoInterfaceName() {
		return deleteSingleTransCodeVideoInterfaceName;
	}

	/**
	 * 
	* <p>Title: setDeleteSingleTransCodeVideoInterfaceName</p>
	* <p>Description: 设置删除单个转码输出视频的接口名</p>
	* @param deleteSingleTransCodeVideoInterfaceName 删除单个转码输出视频的接口名
	 */
	private static void setDeleteSingleTransCodeVideoInterfaceName(
			String deleteSingleTransCodeVideoInterfaceName) {
		Config.deleteSingleTransCodeVideoInterfaceName = deleteSingleTransCodeVideoInterfaceName;
	}
	
	

	/**
	 * 
	* <p>Title: getDeleteSingleVideoURL</p>
	* <p>Description:取得删除单个视频的URL</p>
	* @return 删除单个视频的URL
	 */
	public static String getDeleteSingleVideoURL() {
		return deleteSingleVideoURL;
	}

	/**
	 * 
	* <p>Title: setDeleteSingleVideoURL</p>
	* <p>Description: 设置删除单个视频的URL</p>
	* @param deleteSingleVideoURL 删除单个视频的URL
	 */
	private static void setDeleteSingleVideoURL(String deleteSingleVideoURL) {
		Config.deleteSingleVideoURL = deleteSingleVideoURL;
	}
	
	/**
	 * 
	* <p>Title: getDeleteSingleVideoDomainName</p>
	* <p>Description: 取得删除单个视频的域名</p>
	* @return 删除单个视频的域名
	 */
	public static String getDeleteSingleVideoDomainName() {
		return deleteSingleVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setDeleteSingleVideoDomainName</p>
	* <p>Description: 设置删除单个视频的域名</p>
	* @param deleteSingleVideoDomainName 删除单个视频的域名
	 */
	public static void setDeleteSingleVideoDomainName(
			String deleteSingleVideoDomainName) {
		Config.deleteSingleVideoDomainName = deleteSingleVideoDomainName;
		setDeleteSingleVideoURL(Config.deleteSingleVideoDomainName + Config.deleteSingleVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getDeleteSingleVideoInterfaceName</p>
	* <p>Description: 取得删除单个视频的接口名</p>
	* @return 删除单个视频的接口名
	 */
	public static String getDeleteSingleVideoInterfaceName() {
		return deleteSingleVideoInterfaceName;
	}
	
	/**
	 * 
	* <p>Title: setDeleteSingleVideoInterfaceName</p>
	* <p>Description: 设置删除单个视频的接口名</p>
	* @param deleteSingleVideoInterfaceName 删除单个视频的接口名
	 */
	private static void setDeleteSingleVideoInterfaceName(
			String deleteSingleVideoInterfaceName) {
		Config.deleteSingleVideoInterfaceName = deleteSingleVideoInterfaceName;
	}

	
	
	/**
	 * 
	* <p>Title: getDisableVideoURL</p>
	* <p>Description: 取得视频屏蔽的URL</p>
	* @return 视频屏蔽的URL
	 */
	public static String getDisableVideoURL() {
		return disableVideoURL;
	}

	/**
	 * 
	* <p>Title: setDisableVideoURL</p>
	* <p>Description: 设置视频屏蔽的URL</p>
	* @param disableVideoURL 视频屏蔽的URL
	 */
	private static void setDisableVideoURL(String disableVideoURL) {
		Config.disableVideoURL = disableVideoURL;
	}
	

	/**
	 * 
	* <p>Title: getDisableVideoDomainName</p>
	* <p>Description: 取得视频屏蔽的域名</p>
	* @return 视频屏蔽的域名
	 */
	public static String getDisableVideoDomainName() {
		return disableVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setDisableVideoDomainName</p>
	* <p>Description: 设置视频屏蔽的域名</p>
	* @param disableVideoDomainName 视频屏蔽的域名
	 */
	public static void setDisableVideoDomainName(String disableVideoDomainName) {
		Config.disableVideoDomainName = disableVideoDomainName;		
		setDisableVideoURL(Config.disableVideoDomainName + Config.disableVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getDisableVideoInterfaceName</p>
	* <p>Description: 取得视频屏蔽的接口名</p>
	* @return 视频屏蔽的接口名
	 */
	public static String getDisableVideoInterfaceName() {
		return disableVideoInterfaceName;
	}

	/**
	 * 
	* <p>Title: setDisableVideoInterfaceName</p>
	* <p>Description: 设置视频屏蔽的接口名</p>
	* @param disableVideoInterfaceName 视频屏蔽的接口名
	 */
	private static void setDisableVideoInterfaceName(String disableVideoInterfaceName) {
		Config.disableVideoInterfaceName = disableVideoInterfaceName;
	}
	
	
	

	/**
	 * 
	* <p>Title: getRecoverVideoURL</p>
	* <p>Description: 取得视频恢复的URL</p>
	* @return 视频恢复的URL
	 */
	public static String getRecoverVideoURL() {
		return recoverVideoURL;
	}

	/**
	 * 
	* <p>Title: setRecoverVideoURL</p>
	* <p>Description: 设置视频恢复的URL</p>
	* @param recoverVideoURL 视频恢复的URL
	 */
	private static void setRecoverVideoURL(String recoverVideoURL) {
		Config.recoverVideoURL = recoverVideoURL;
	}
	
	/**
	 * 
	* <p>Title: getRecoverVideoDomainName</p>
	* <p>Description: 取得视频恢复的域名</p>
	* @return 视频恢复的域名
	 */
	public static String getRecoverVideoDomainName() {
		return recoverVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setRecoverVideoDomainName</p>
	* <p>Description: 设置视频恢复的域名</p>
	* @param recoverVideoDomainName  视频恢复的域名
	 */
	public static void setRecoverVideoDomainName(String recoverVideoDomainName) {
		Config.recoverVideoDomainName = recoverVideoDomainName;
		setRecoverVideoURL(Config.recoverVideoDomainName + Config.recoverVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getRecoverVideoInterfaceName</p>
	* <p>Description: 取得视频恢复的接口名</p>
	* @return 视频恢复的接口名
	 */
	public static String getRecoverVideoInterfaceName() {
		return recoverVideoInterfaceName;
	}

	/**
	 * 
	* <p>Title: setRecoverVideoInterfaceName</p>
	* <p>Description: 设置视频恢复的接口名</p>
	* @param recoverVideoInterfaceName 视频恢复的接口名
	 */
	private static void setRecoverVideoInterfaceName(String recoverVideoInterfaceName) {
		Config.recoverVideoInterfaceName = recoverVideoInterfaceName;
	}
	
	

	/**
	 * 
	* <p>Title: getMultiVideoTranscodingURL</p>
	* <p>Description: 取得 多视频转码的URL</p>
	* @return  多视频转码的URL
	 */
	public static String getMultiVideoTranscodingURL() {
		return multiVideoTranscodingURL;
	}

	/**
	 * 
	* <p>Title: setMultiVideoTranscodingURL</p>
	* <p>Description: 设置 多视频转码的URL</p>
	* @param multiVideoTranscodingURL  多视频转码的URL
	 */
	private static void setMultiVideoTranscodingURL(String multiVideoTranscodingURL) {
		Config.multiVideoTranscodingURL = multiVideoTranscodingURL;
	}	
	
	/**
	 * 
	* <p>Title: getMultiVideoTranscodingDomainName</p>
	* <p>Description: 取得 多视频转码的域名</p>
	* @return 多视频转码的域名
	 */
	public static String getMultiVideoTranscodingDomainName() {
		return multiVideoTranscodingDomainName;
	}

	/**
	 * 
	* <p>Title: setMultiVideoTranscodingDomainName</p>
	* <p>Description: 设置多视频转码的域名</p>
	* @param multiVideoTranscodingDomainName 多视频转码的域名
	 */
	public static void setMultiVideoTranscodingDomainName(
			String multiVideoTranscodingDomainName) {
		Config.multiVideoTranscodingDomainName = multiVideoTranscodingDomainName;
		setMultiVideoTranscodingURL(Config.multiVideoTranscodingDomainName + Config.multiVideoTranscodingInterfaceName);
	}

	/**
	 * 
	* <p>Title: getMultiVideoTranscodingInterfaceName</p>
	* <p>Description: 取得 多视频转码的接口名</p>
	* @return 多视频转码的接口名
	 */
	public static String getMultiVideoTranscodingInterfaceName() {
		return multiVideoTranscodingInterfaceName;
	}
	
	/**
	 * 
	* <p>Title: setMultiVideoTranscodingInterfaceName</p>
	* <p>Description: 设置多视频转码的接口名</p>
	* @param multiVideoTranscodingInterfaceName 多视频转码的接口名
	 */
	private static void setMultiVideoTranscodingInterfaceName(
			String multiVideoTranscodingInterfaceName) {
		Config.multiVideoTranscodingInterfaceName = multiVideoTranscodingInterfaceName;
	}	

	
	/**
	 * 
	* <p>Title: getMultiVideoTranscodingWithoutPresetURL</p>
	* <p>Description: 取得多视频无模板转码的URL</p>
	* @return 多视频无模板转码的URL
	 */
	public static String getMultiVideoTranscodingWithoutPresetURL() {
		return multiVideoTranscodingWithoutPresetURL;
	}

	/**
	 * 
	* <p>Title: setMultiVideoTranscodingWithoutPresetURL</p>
	* <p>Description: 设置多视频无模板转码的URL</p>
	* @param multiVideoTranscodingWithoutPresetURL 多视频无模板转码的URL
	 */
	private static void setMultiVideoTranscodingWithoutPresetURL(
			String multiVideoTranscodingWithoutPresetURL) {
		Config.multiVideoTranscodingWithoutPresetURL = multiVideoTranscodingWithoutPresetURL;
	}
	
	/**
	 * 
	* <p>Title: getMultiVideoTranscodingWithoutPresetDomainName</p>
	* <p>Description: 取得多视频无模板转码的域名</p>
	* @return 多视频无模板转码的域名
	 */
	public static String getMultiVideoTranscodingWithoutPresetDomainName() {
		return multiVideoTranscodingWithoutPresetDomainName;
	}

	/**
	 * 
	* <p>Title: setMultiVideoTranscodingWithoutPresetDomainName</p>
	* <p>Description: 设置多视频无模板转码的域名</p>
	* @param multiVideoTranscodingWithoutPresetDomainName 多视频无模板转码的域名
	 */
	public static void setMultiVideoTranscodingWithoutPresetDomainName(
			String multiVideoTranscodingWithoutPresetDomainName) {
		Config.multiVideoTranscodingWithoutPresetDomainName = multiVideoTranscodingWithoutPresetDomainName;
		setMultiVideoTranscodingWithoutPresetURL(Config.multiVideoTranscodingWithoutPresetDomainName + Config.multiVideoTranscodingWithoutPresetInterfaceName);
	}

	/**
	 * 
	* <p>Title: getMultiVideoTranscodingWithoutPresetInterfaceName</p>
	* <p>Description:  取得多视频无模板转码的接口名</p>
	* @return 多视频无模板转码的接口名
	 */
	public static String getMultiVideoTranscodingWithoutPresetInterfaceName() {
		return multiVideoTranscodingWithoutPresetInterfaceName;
	}

	/**
	 * 
	* <p>Title: setMultiVideoTranscodingWithoutPresetInterfaceName</p>
	* <p>Description: 设置多视频无模板转码的接口名</p>
	* @param multiVideoTranscodingWithoutPresetInterfaceName 多视频无模板转码的接口名
	 */
	private static void setMultiVideoTranscodingWithoutPresetInterfaceName(
			String multiVideoTranscodingWithoutPresetInterfaceName) {
		Config.multiVideoTranscodingWithoutPresetInterfaceName = multiVideoTranscodingWithoutPresetInterfaceName;
	}

	/**
	 * 
	* <p>Title: getSetVideoCallBackURL</p>
	* <p>Description: 取得设置回调地址的URL</p>
	* @return 设置回调地址的URL
	 */
	public static String getSetVideoCallBackURL() {
		return setVideoCallBackURL;
	}

	/**
	 * 
	* <p>Title: setSetVideoCallBackURL</p>
	* <p>Description: 设置回调地址的URL</p>
	* @param setVideoCallBackURL 设置回调地址的URL
	 */
	private static void setSetVideoCallBackURL(String setVideoCallBackURL) {
		Config.setVideoCallBackURL = setVideoCallBackURL;
	}
	
	/**
	 * 
	* <p>Title: getSetVideoCallBackDomainName</p>
	* <p>Description:  取得设置回调地址的域名</p>
	* @return 设置回调地址的域名
	 */
	public static String getSetVideoCallBackDomainName() {
		return setVideoCallBackDomainName;
	}

	/**
	 * 
	* <p>Title: setSetVideoCallBackDomainName</p>
	* <p>Description: 修改设置回调地址的域名</p>
	* @param setVideoCallBackDomainName 设置回调地址的域名
	 */
	public static void setSetVideoCallBackDomainName(
			String setVideoCallBackDomainName) {
		Config.setVideoCallBackDomainName = setVideoCallBackDomainName;
		setSetVideoCallBackURL(Config.setVideoCallBackDomainName + Config.setVideoCallBackInterfaceName);
	}

	/**
	 * 
	* <p>Title: getSetVideoCallBackInterfaceName</p>
	* <p>Description:  取得设置回调地址的接口名</p>
	* @return 设置回调地址的接口名
	 */
	public static String getSetVideoCallBackInterfaceName() {
		return setVideoCallBackInterfaceName;
	}

	/**
	 * 
	* <p>Title: setSetVideoCallBackInterfaceName</p>
	* <p>Description: 修改设置回调地址的接口名</p>
	* @param setVideoCallBackInterfaceName 设置回调地址的接口名
	 */
	private static void setSetVideoCallBackInterfaceName(
			String setVideoCallBackInterfaceName) {
		Config.setVideoCallBackInterfaceName = setVideoCallBackInterfaceName;
	}
	
	
	
	
	

	/**
	 * 
	* <p>Title: getInitUploadVideoURL</p>
	* <p>Description: 取得视频上传初始化的URL</p>
	* @return 视频上传初始化的URL
	 */
	public static String getInitUploadVideoURL() {
		return initUploadVideoURL;
	}

	/**
	 * 
	* <p>Title: setInitUploadVideoURL</p>
	* <p>Description: 设置视频上传初始化的URL</p> 
	* @param initUploadVideoURL 视频上传初始化的URL
	 */
	private static void setInitUploadVideoURL(String initUploadVideoURL) {
		Config.initUploadVideoURL = initUploadVideoURL;
	}	

	/**
	 * 
	* <p>Title: getInitUploadVideoDomainName</p>
	* <p>Description: 取得视频上传初始化的域名</p>
	* @return 视频上传初始化的域名
	 */
	public static String getInitUploadVideoDomainName() {
		return initUploadVideoDomainName;
	}

	/**
	 * 
	* <p>Title: setInitUploadVideoDomainName</p>
	* <p>Description: 设置视频上传初始化的域名</p>
	* @param initUploadVideoDomainName 视频上传初始化的域名
	 */
	public static void setInitUploadVideoDomainName(String initUploadVideoDomainName) {
		Config.initUploadVideoDomainName = initUploadVideoDomainName;
		setInitUploadVideoURL(Config.initUploadVideoDomainName + Config.initUploadVideoInterfaceName);
	}

	/**
	 * 
	* <p>Title: getInitUploadVideoInterfaceName</p>
	* <p>Description: 取得视频上传初始化的接口名</p>
	* @return 视频上传初始化的接口名
	 */
	public static String getInitUploadVideoInterfaceName() {
		return initUploadVideoInterfaceName;
	}

	/**
	 * 
	* <p>Title: setInitUploadVideoInterfaceName</p>
	* <p>Description: 设置视频上传初始化的接口名</p>
	* @param initUploadVideoInterfaceName 视频上传初始化的接口名
	 */
	private static void setInitUploadVideoInterfaceName(
			String initUploadVideoInterfaceName) {
		Config.initUploadVideoInterfaceName = initUploadVideoInterfaceName;
	}
	

//	/**
//	 * 
//	* <p>Title: getGetUploadHostURL</p>
//	* <p>Description: 取得获取上传加速节点地址的URL</p>
//	* @return 获取上传加速节点地址的URL
//	 */
//	public static String getGetUploadHostURL() {
//		return getUploadHostURL;
//	}
//
//	/**
//	 * 
//	* <p>Title: setGetUploadHostURL</p>
//	* <p>Description: 设置获取上传加速节点地址的URL</p>
//	* @param getUploadHostURL 获取上传加速节点地址的URL
//	 */
//	private static void setGetUploadHostURL(String getUploadHostURL) {
//		Config.getUploadHostURL = getUploadHostURL;
//	}

	/**
	 * 
	* <p>Title: getQueryVideoIDURL</p>
	* <p>Description: 取得根据对象名查询视频主ID的URL</p>
	* @return 根据对象名查询视频主ID的URL
	 */
	public static String getQueryVideoIDURL() {
		return queryVideoIDURL;
	}

	/**
	 * 
	* <p>Title: setQueryVideoIDURL</p>
	* <p>Description: 设置根据对象名查询视频主ID的URL</p>
	* @param queryVideoIDURL 根据对象名查询视频主ID的URL
	 */
	private static void setQueryVideoIDURL(String queryVideoIDURL) {
		Config.queryVideoIDURL = queryVideoIDURL;
	}

	/**
	 * 
	* <p>Title: getQueryVideoIDDomainName</p>
	* <p>Description: 取得根据对象名查询视频主ID的域名</p>
	* @return 根据对象名查询视频主ID的域名
	 */
	public static String getQueryVideoIDDomainName() {
		return queryVideoIDDomainName;
	}

	/**
	 * 
	* <p>Title: setQueryVideoIDDomainName</p>
	* <p>Description: 设置根据对象名查询视频主ID的域名</p>
	* @param queryVideoIDDomainName 根据对象名查询视频主ID的域名
	 */
	public static void setQueryVideoIDDomainName(String queryVideoIDDomainName) {
		Config.queryVideoIDDomainName = queryVideoIDDomainName;
		setQueryVideoIDURL(Config.queryVideoIDDomainName + Config.queryVideoIDInterfaceName);		
	}

	/**
	 * 
	* <p>Title: getQueryVideoIDInterfaceName</p>
	* <p>Description: 取得根据对象名查询视频主ID的接口名</p>
	* @return 根据对象名查询视频主ID的接口名
	 */
	public static String getQueryVideoIDInterfaceName() {
		return queryVideoIDInterfaceName;
	}

	/**
	 * 
	* <p>Title: setQueryVideoIDInterfaceName</p>
	* <p>Description: 设置根据对象名查询视频主ID的接口名</p>
	* @param queryVideoIDInterfaceName 根据对象名查询视频主ID的接口名
	 */
	private static void setQueryVideoIDInterfaceName(String queryVideoIDInterfaceName) {
		Config.queryVideoIDInterfaceName = queryVideoIDInterfaceName;
	}
	
	
	public static String getSetCallbackURL() {
		return setCallbackURL;
	}

	private static void setSetCallbackURL(String setCallbackURL) {
		Config.setCallbackURL = setCallbackURL;
	}

	public static String getSetCallbackDomainName() {
		return setCallbackDomainName;
	}

	private static void setSetCallbackDomainName(String setCallbackDomainName) {
		Config.setCallbackDomainName = setCallbackDomainName;
		setSetCallbackURL(Config.setCallbackDomainName + Config.setCallbackInterfaceName);
	}

	public static String getSetCallbackInterfaceName() {
		return setCallbackInterfaceName;
	}

	private static void setSetCallbackInterfaceName(String setCallbackInterfaceName) {
		Config.setCallbackInterfaceName = setCallbackInterfaceName;
	}

	/**
	 * 
	* <p>Title: getCreateTypeURL</p>
	* <p>Description: 取得创建视频分类的URL</p>
	* @return 创建视频分类的URL
	 */
	public static String getCreateTypeURL() {
		return createTypeURL;
	}

	/**
	 * 
	* <p>Title: setCreateTypeURL</p>
	* <p>Description: 设置创建视频分类的URL</p>
	* @param createTypeURL 创建视频分类的URL
	 */
	private static void setCreateTypeURL(String createTypeURL) {
		Config.createTypeURL = createTypeURL;
	}

	/**
	 * 
	* <p>Title: getCreateTypeDomainName</p>
	* <p>Description: 取得创建视频分类的域名</p>
	* @return 创建视频分类的域名
	 */
	public static String getCreateTypeDomainName() {
		return createTypeDomainName;
	}

	/**
	 * 
	* <p>Title: setCreateTypeDomainName</p>
	* <p>Description: 设置创建视频分类的域名</p>
	* @param createTypeDomainName 创建视频分类的域名
	 */
	public static void setCreateTypeDomainName(String createTypeDomainName) {
		Config.createTypeDomainName = createTypeDomainName;
		setCreateTypeURL(Config.createTypeDomainName + Config.createTypeInterfaceName);
	}

	/**
	 * 
	* <p>Title: getCreateTypeInterfaceName</p>
	* <p>Description: 取得创建视频分类的接口名</p>
	* @return 创建视频分类的接口名
	 */
	public static String getCreateTypeInterfaceName() {
		return createTypeInterfaceName;
	}

	/**
	 * 
	* <p>Title: setCreateTypeInterfaceName</p>
	* <p>Description: 设置创建视频分类的接口名</p>
	* @param createTypeInterfaceName 创建视频分类的接口名
	 */
	private static void setCreateTypeInterfaceName(String createTypeInterfaceName) {
		Config.createTypeInterfaceName = createTypeInterfaceName;
	}
	
	
	/**
	 * 
	* <p>Title: getGetSingleTypeURL</p>
	* <p>Description: 取得获取视频分类的URL</p>
	* @return 获取视频分类的URL
	 */
	public static String getGetSingleTypeURL() {
		return getSingleTypeURL;
	}

	/**
	 * 
	* <p>Title: setGetSingleTypeURL</p>
	* <p>Description: 设置获取视频分类的URL</p>
	* @param getSingleTypeURL 获取视频分类的URL
	 */
	private static void setGetSingleTypeURL(String getSingleTypeURL) {
		Config.getSingleTypeURL = getSingleTypeURL;
	}

	/**
	 * 
	* <p>Title: getGetSingleTypeDomainName</p>
	* <p>Description: 取得获取视频分类的域名</p>
	* @return 获取视频分类的域名
	 */
	public static String getGetSingleTypeDomainName() {
		return getSingleTypeDomainName;
	}

	/**
	 * 
	* <p>Title: setGetSingleTypeDomainName</p>
	* <p>Description: 设置获取视频分类的域名</p>
	* @param getSingleTypeDomainName 获取视频分类的域名
	 */
	public static void setGetSingleTypeDomainName(String getSingleTypeDomainName) {
		Config.getSingleTypeDomainName = getSingleTypeDomainName;
		setGetSingleTypeURL(Config.getSingleTypeDomainName + Config.getSingleTypeInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetSingleTypeInterfaceName</p>
	* <p>Description: 取得获取视频分类的接口名</p>
	* @return 获取视频分类的接口名
	 */
	public static String getGetSingleTypeInterfaceName() {
		return getSingleTypeInterfaceName;
	}

	/**
	 * 
	* <p>Title: setGetSingleTypeInterfaceName</p>
	* <p>Description: 设置获取视频分类的接口名</p>
	* @param getSingleTypeInterfaceName 获取视频分类的接口名
	 */
	private static void setGetSingleTypeInterfaceName(
			String getSingleTypeInterfaceName) {
		Config.getSingleTypeInterfaceName = getSingleTypeInterfaceName;
	}

	
	
	/**
	 * 
	* <p>Title: getGetTypeListURL</p>
	* <p>Description: 取得获取视频分类列表的URL</p>
	* @return 获取视频分类列表的URL
	 */
	public static String getGetTypeListURL() {
		return getTypeListURL;
	}

	/**
	 * 
	* <p>Title: setGetTypeListURL</p>
	* <p>Description: 设置获取视频分类列表的URL</p>
	* @param getTypeListURL 获取视频分类列表的URL
	 */
	private static void setGetTypeListURL(String getTypeListURL) {
		Config.getTypeListURL = getTypeListURL;
	}

	/**
	 * 
	* <p>Title: getGetTypeListDomainName</p>
	* <p>Description: 取得获取视频分类列表的域名</p>
	* @return 取得获取视频分类列表的域名
	 */
	public static String getGetTypeListDomainName() {
		return getTypeListDomainName;
	}

	/**
	 * 
	* <p>Title: setGetTypeListDomainName</p>
	* <p>Description: 设置获取视频分类列表的域名</p>
	* @param getTypeListDomainName  取得获取视频分类列表的域名
	 */
	public static void setGetTypeListDomainName(String getTypeListDomainName) {
		Config.getTypeListDomainName = getTypeListDomainName;
		setGetTypeListURL(Config.getTypeListDomainName + Config.getTypeListInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetTypeListInterfaceName</p>
	* <p>Description: 取得获取视频分类列表的接口名</p>
	* @return 获取视频分类列表的接口名
	 */
	public static String getGetTypeListInterfaceName() {
		return getTypeListInterfaceName;
	}

	/**
	 * 
	* <p>Title: setGetTypeListInterfaceName</p>
	* <p>Description: 设置获取视频分类列表的接口名</p>
	* @param getTypeListInterfaceName 获取视频分类列表的接口名
	 */
	private static void setGetTypeListInterfaceName(String getTypeListInterfaceName) {
		Config.getTypeListInterfaceName = getTypeListInterfaceName;
	}
	
		
	/**
	 * 
	* <p>Title: getUpdateTypeURL</p>
	* <p>Description: 取得修改视频分类的URL</p>
	* @return 修改视频分类的URL
	 */ 
	public static String getUpdateTypeURL() {
		return updateTypeURL;
	}

	/**
	 * 
	* <p>Title: setUpdateTypeURL</p>
	* <p>Description: 设置修改视频分类的URL</p>
	* @param updateTypeURL  修改视频分类的URL
	 */
	private static void setUpdateTypeURL(String updateTypeURL) {
		Config.updateTypeURL = updateTypeURL;
	}

	/**
	 * 
	* <p>Title: getUpdateTypeDomainName</p>
	* <p>Description:  取得修改视频分类的域名</p>
	* @return 修改视频分类的域名
	 */
	public static String getUpdateTypeDomainName() {
		return updateTypeDomainName;
	}

	/**
	 * 
	* <p>Title: setUpdateTypeDomainName</p>
	* <p>Description: 设置修改视频分类的域名</p>
	* @param updateTypeDomainName 修改视频分类的域名
	 */
	public static void setUpdateTypeDomainName(String updateTypeDomainName) {
		Config.updateTypeDomainName = updateTypeDomainName;
		setUpdateTypeURL(Config.updateTypeDomainName + Config.updateTypeInterfaceName);		
	}

	/**
	 * 
	* <p>Title: getUpdateTypeInterfaceName</p>
	* <p>Description: 取得修改视频分类的接口名</p>
	* @return 修改视频分类的接口名
	 */
	public static String getUpdateTypeInterfaceName() {
		return updateTypeInterfaceName;
	}

	/**
	 * 
	* <p>Title: setUpdateTypeInterfaceName</p>
	* <p>Description: 设置修改视频分类的接口名</p>
	* @param updateTypeInterfaceName 修改视频分类的接口名
	 */
	private static void setUpdateTypeInterfaceName(String updateTypeInterfaceName) {
		Config.updateTypeInterfaceName = updateTypeInterfaceName;
	}

	
	/**
	 * 
	* <p>Title: getDeleteTypeURL</p>
	* <p>Description: 取得删除视频分类的URL</p>
	* @return 删除视频分类的URL
	 */
	public static String getDeleteTypeURL() {
		return deleteTypeURL;
	}

	/**
	 * 
	* <p>Title: setDeleteTypeURL</p>
	* <p>Description: 设置删除视频分类的URL</p>
	* @param deleteTypeURL 删除视频分类的URL
	 */
	private  static void setDeleteTypeURL(String deleteTypeURL) {
		Config.deleteTypeURL = deleteTypeURL;
	}

	/**
	 * 
	* <p>Title: getDeleteTypeDomainName</p>
	* <p>Description: 取得删除视频分类的域名</p>
	* @return 删除视频分类的域名
	 */
	public static String getDeleteTypeDomainName() {
		return deleteTypeDomainName;
	}

	/**
	 * 
	* <p>Title: setDeleteTypeDomainName</p>
	* <p>Description: 设置删除视频分类的域名</p>
	* @param deleteTypeDomainName 删除视频分类的域名
	 */
	public static void setDeleteTypeDomainName(String deleteTypeDomainName) {
		Config.deleteTypeDomainName = deleteTypeDomainName;
		setDeleteTypeURL(Config.deleteTypeDomainName + Config.deleteTypeInterfaceName);
	}

	/**
	 * 
	* <p>Title: getDeleteTypeInterfaceName</p>
	* <p>Description: 取得删除视频分类的接口名</p>
	* @return 删除视频分类的接口名
	 */
	public static String getDeleteTypeInterfaceName() {
		return deleteTypeInterfaceName;
	}

	/**
	 * 
	* <p>Title: setDeleteTypeInterfaceName</p>
	* <p>Description: 设置删除视频分类的接口名</p>
	* @param deleteTypeInterfaceName  删除视频分类的接口名
	 */
	private static void setDeleteTypeInterfaceName(String deleteTypeInterfaceName) {
		Config.deleteTypeInterfaceName = deleteTypeInterfaceName;
	}

		
	/**
	 * 
	* <p>Title: getSetVideoTypeURL</p>
	* <p>Description: 取得设置视频分类的URL</p>
	* @return 设置视频分类的URL
	 */
	public static String getSetVideoTypeURL() {
		return setVideoTypeURL;
	}

	/**
	 * 
	* <p>Title: setSetVideoTypeURL</p>
	* <p>Description: 设置视频分类的URL</p>
	* @param setVideoTypeURL 设置视频分类的URL
	 */
	private static void setSetVideoTypeURL(String setVideoTypeURL) {
		Config.setVideoTypeURL = setVideoTypeURL;
	}

	/**
	 * 
	* <p>Title: getSetVideoTypeDomainName</p>
	* <p>Description: 取得设置视频分类的域名</p>
	* @return 设置视频分类的域名
	 */
	public static String getSetVideoTypeDomainName() {
		return setVideoTypeDomainName;
	}

	/**
	 * 
	* <p>Title: setSetVideoTypeDomainName</p>
	* <p>Description: 设置视频分类的域名</p>
	* @param setVideoTypeDomainName 设置视频分类的域名
	 */
	public static void setSetVideoTypeDomainName(String setVideoTypeDomainName) {
		Config.setVideoTypeDomainName = setVideoTypeDomainName;
		setSetVideoTypeURL(Config.setVideoTypeDomainName + Config.setVideoTypeInterfaceName);
	}

	/**
	 * 
	* <p>Title: getSetVideoTypeInterfaceName</p>
	* <p>Description: 设置视频分类的接口名</p>
	* @return 设置视频分类的接口名
	 */
	public static String getSetVideoTypeInterfaceName() {
		return setVideoTypeInterfaceName;
	}

	/**
	 * 
	* <p>Title: setSetVideoTypeInterfaceName</p>
	* <p>Description: 设置视频分类的接口名</p>
	* @param setVideoTypeInterfaceName 设置视频分类的接口名
	 */
	private static void setSetVideoTypeInterfaceName(String setVideoTypeInterfaceName) {
		Config.setVideoTypeInterfaceName = setVideoTypeInterfaceName;
	}

	
	
	
	
	
	
	
	
	
	/**
	 * 
	* <p>Title: getCreateWatermarkURL</p>
	* <p>Description: 取得创建视频水印模板的URL</p>
	* @return 创建视频水印模板的URL
	 */
	public static String getCreateWatermarkURL() {
		return createWatermarkURL;
	}

	/**
	 * 
	* <p>Title: setCreateWatermarkURL</p>
	* <p>Description: 设置创建视频水印模板的URL</p>
	* @param createWatermarkURL  创建视频水印模板的URL
	 */
	private static void setCreateWatermarkURL(String createWatermarkURL) {
		Config.createWatermarkURL = createWatermarkURL;
	}

	/**
	 * 
	* <p>Title: getCreateWatermarkDomainName</p>
	* <p>Description: 取得创建视频水印模板的域名</p>
	* @return 创建视频水印模板的域名
	 */
	public static String getCreateWatermarkDomainName() {
		return createWatermarkDomainName;
	}

	/**
	 * 
	* <p>Title: setCreateWatermarkDomainName</p>
	* <p>Description: 设置创建视频水印模板的域名</p>
	* @param createWatermarkDomainName 创建视频水印模板的域名
	 */
	public static void setCreateWatermarkDomainName(String createWatermarkDomainName) {
		Config.createWatermarkDomainName = createWatermarkDomainName;
		setCreateWatermarkURL(Config.createWatermarkDomainName + Config.createWatermarkInterfaceName);
	}

	/**
	 * 
	* <p>Title: getCreateWatermarkInterfaceName</p>
	* <p>Description: 取得创建视频水印模板的接口名</p>
	* @return 创建视频水印模板的接口名
	 */
	public static String getCreateWatermarkInterfaceName() {
		return createWatermarkInterfaceName;
	}

	/**
	 * 
	* <p>Title: setCreateWatermarkInterfaceName</p>
	* <p>Description: 设置创建视频水印模板的接口名</p>
	* @param createWatermarkInterfaceName 创建视频水印模板的接口名
	 */
	private static void setCreateWatermarkInterfaceName(
			String createWatermarkInterfaceName) {
		Config.createWatermarkInterfaceName = createWatermarkInterfaceName;
	}	
	
	
	/**
	 * 
	* <p>Title: getGetSingleWatermarkURL</p>
	* <p>Description: 取得获取视频水印模板的URL</p>
	* @return 获取视频水印模板的URL
	 */
	public static String getGetSingleWatermarkURL() {
		return getSingleWatermarkURL;
	}

	/**
	 * 
	* <p>Title: setGetSingleWatermarkURL</p>
	* <p>Description: 设置获取视频水印模板的URL</p>
	* @param getSingleWatermarkURL 获取视频水印模板的URL
	 */
	private static void setGetSingleWatermarkURL(String getSingleWatermarkURL) {
		Config.getSingleWatermarkURL = getSingleWatermarkURL;
	}

	/**
	 * 
	* <p>Title: getGetSingleWatermarkDomainName</p>
	* <p>Description: 取得获取视频水印模板的域名</p>
	* @return  获取视频水印模板的域名
	 */
	public static String getGetSingleWatermarkDomainName() {
		return getSingleWatermarkDomainName;
	}

	/**
	 * 
	* <p>Title: setGetSingleWatermarkDomainName</p>
	* <p>Description: 设置获取视频水印模板的域名</p>
	* @param getSingleWatermarkDomainName 获取视频水印模板的域名
	 */
	public static void setGetSingleWatermarkDomainName(
			String getSingleWatermarkDomainName) {
		Config.getSingleWatermarkDomainName = getSingleWatermarkDomainName;
		setGetSingleWatermarkURL(Config.getSingleWatermarkDomainName + Config.getSingleWatermarkInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetSingleWatermarkInterfaceName</p>
	* <p>Description: 取得获取视频水印模板的接口名</p>
	* @return 获取视频水印模板的接口名
	 */
	public static String getGetSingleWatermarkInterfaceName() {
		return getSingleWatermarkInterfaceName;
	}

	/**
	 * 
	* <p>Title: setGetSingleWatermarkInterfaceName</p>
	* <p>Description: 设置获取视频水印模板的接口名</p>
	* @param getSingleWatermarkInterfaceName  获取视频水印模板的接口名
	 */
	private static void setGetSingleWatermarkInterfaceName(
			String getSingleWatermarkInterfaceName) {
		Config.getSingleWatermarkInterfaceName = getSingleWatermarkInterfaceName;
	}
		
	
	/**
	 * 
	* <p>Title: getGetWatermarkListURL</p>
	* <p>Description: 取得获取视频水印模板列表的URL</p>
	* @return 获取视频水印模板列表的URL
	 */
	public static String getGetWatermarkListURL() {
		return getWatermarkListURL;
	}

	/**
	 * 
	* <p>Title: setGetWatermarkListURL</p>
	* <p>Description: 设置获取视频水印模板列表的URL</p>
	* @param getWatermarkListURL 获取视频水印模板列表的URL
	 */
	private static void setGetWatermarkListURL(String getWatermarkListURL) {
		Config.getWatermarkListURL = getWatermarkListURL;
	}

	/**
	 * 
	* <p>Title: getGetWatermarkListDomainName</p>
	* <p>Description: 取得获取视频水印模板列表的域名</p>
	* @return 获取视频水印模板列表的域名
	 */
	public static String getGetWatermarkListDomainName() {
		return getWatermarkListDomainName;
	}

	/**
	 * 
	* <p>Title: setGetWatermarkListDomainName</p>
	* <p>Description: 设置获取视频水印模板列表的域名</p>
	* @param getWatermarkListDomainName  获取视频水印模板列表的域名
	 */
	public static void setGetWatermarkListDomainName(
			String getWatermarkListDomainName) {
		Config.getWatermarkListDomainName = getWatermarkListDomainName;
		setGetWatermarkListURL(Config.getWatermarkListDomainName + Config.getWatermarkListInterfaceName);
	}

	/**
	 * 
	* <p>Title: getGetWatermarkListInterfaceName</p>
	* <p>Description: 取得获取视频水印模板列表的接口名</p>
	* @return 获取视频水印模板列表的接口名
	 */
	public static String getGetWatermarkListInterfaceName() {
		return getWatermarkListInterfaceName;
	}

	/**
	 * 
	* <p>Title: setGetWatermarkListInterfaceName</p>
	* <p>Description: 设置获取视频水印模板列表的接口名</p>
	* @param getWatermarkListInterfaceName  获取视频水印模板列表的接口名
	 */
	private static void setGetWatermarkListInterfaceName(
			String getWatermarkListInterfaceName) {
		Config.getWatermarkListInterfaceName = getWatermarkListInterfaceName;
	}
	
	
	
	/**
	 * 
	* <p>Title: getUpdateWatermarkURL</p>
	* <p>Description: 取得修改视频水印模板的URL</p>
	* @return 修改视频水印模板的URL
	 */
	public static String getUpdateWatermarkURL() {
		return updateWatermarkURL;
	}

	/**
	 * 
	* <p>Title: setUpdateWatermarkURL</p>
	* <p>Description: 设置修改视频水印模板的URL</p>
	* @param updateWatermarkURL  修改视频水印模板的URL
	 */
	private static void setUpdateWatermarkURL(String updateWatermarkURL) {
		Config.updateWatermarkURL = updateWatermarkURL;
	}

	/**
	 * 
	* <p>Title: getUpdateWatermarkDomainName</p>
	* <p>Description: 取得修改视频水印模板的域名</p>
	* @return 修改视频水印模板的域名
	 */
	public static String getUpdateWatermarkDomainName() {
		return updateWatermarkDomainName;
	}

	/**
	 * 
	* <p>Title: setUpdateWatermarkDomainName</p>
	* <p>Description: 设置修改视频水印模板的域名</p>
	* @param updateWatermarkDomainName  修改视频水印模板的域名
	 */
	public static void setUpdateWatermarkDomainName(String updateWatermarkDomainName) {
		Config.updateWatermarkDomainName = updateWatermarkDomainName;
		setUpdateWatermarkURL(Config.updateWatermarkDomainName + Config.updateWatermarkInterfaceName);
	}

	/**
	 * 
	* <p>Title: getUpdateWatermarkInterfaceName</p>
	* <p>Description: 取得修改视频水印模板的接口名</p>
	* @return 修改视频水印模板的接口名
	 */
	public static String getUpdateWatermarkInterfaceName() {
		return updateWatermarkInterfaceName;
	}

	/**
	 * 
	* <p>Title: setUpdateWatermarkInterfaceName</p>
	* <p>Description: 设置修改视频水印模板的接口名</p>
	* @param updateWatermarkInterfaceName  修改视频水印模板的接口名
	 */
	private static void setUpdateWatermarkInterfaceName(
			String updateWatermarkInterfaceName) {
		Config.updateWatermarkInterfaceName = updateWatermarkInterfaceName;
	}
	
		
	/**
	 * 
	* <p>Title: getDeleteWatermarkURL</p>
	* <p>Description: 取得删除视频水印模板的URL</p>
	* @return 删除视频水印模板的URL
	 */
	public static String getDeleteWatermarkURL() {
		return deleteWatermarkURL;
	}

	/**
	 * 
	* <p>Title: setDeleteWatermarkURL</p>
	* <p>Description: 设置删除视频水印模板的URL</p>
	* @param deleteWatermarkURL 删除视频水印模板的URL
	 */
	private static void setDeleteWatermarkURL(String deleteWatermarkURL) {
		Config.deleteWatermarkURL = deleteWatermarkURL;
	}

	/**
	 * 
	* <p>Title: getDeleteWatermarkDomainName</p>
	* <p>Description: 取得删除视频水印模板的域名</p>
	* @return 删除视频水印模板的域名
	 */
	public static String getDeleteWatermarkDomainName() {
		return deleteWatermarkDomainName;
	}

	/**
	 * 
	* <p>Title: setDeleteWatermarkDomainName</p>
	* <p>Description: 设置删除视频水印模板的域名</p>
	* @param deleteWatermarkDomainName 删除视频水印模板的域名
	 */
	public static void setDeleteWatermarkDomainName(String deleteWatermarkDomainName) {
		Config.deleteWatermarkDomainName = deleteWatermarkDomainName;
		setDeleteWatermarkURL(Config.deleteWatermarkDomainName + Config.deleteWatermarkInterfaceName);
	}

	/**
	 * 
	* <p>Title: getDeleteWatermarkInterfaceName</p>
	* <p>Description: 取得删除视频水印模板的接口名</p>
	* @return 删除视频水印模板的接口名
	 */
	public static String getDeleteWatermarkInterfaceName() {
		return deleteWatermarkInterfaceName;
	}

	/**
	 * 
	* <p>Title: setDeleteWatermarkInterfaceName</p>
	* <p>Description: 设置删除视频水印模板的接口名</p>
	* @param deleteWatermarkInterfaceName 删除视频水印模板的接口名
	 */
	private static void setDeleteWatermarkInterfaceName(
			String deleteWatermarkInterfaceName) {
		Config.deleteWatermarkInterfaceName = deleteWatermarkInterfaceName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	* <p>Title: getFlowStatsURL</p>
	* <p>Description: 取得流量统计查询的URL</p>
	* @return 流量统计查询的URL
	 */
	public static String getFlowStatsURL() {
		return flowStatsURL;
	}

	/**
	 * 
	* <p>Title: setFlowStatsURL</p>
	* <p>Description: 设置流量统计查询的URL</p>
	* @param flowStatsURL 流量统计查询的URL
	 */
	private static void setFlowStatsURL(String flowStatsURL) {
		Config.flowStatsURL = flowStatsURL;
	}

	/**
	 * 
	* <p>Title: getFlowStatsDomainName</p>
	* <p>Description: 取得流量统计查询的域名</p>
	* @return 流量统计查询的域名
	 */
	public static String getFlowStatsDomainName() {
		return flowStatsDomainName;
	}

	/**
	 * 
	* <p>Title: setFlowStatsDomainName</p>
	* <p>Description: 设置流量统计查询的域名</p>
	* @param flowStatsDomainName 流量统计查询的域名
	 */
	private static void setFlowStatsDomainName(String flowStatsDomainName) {
		Config.flowStatsDomainName = flowStatsDomainName;
		setFlowStatsURL(Config.flowStatsDomainName + Config.flowStatsInterfaceName);
	}

	/**
	 * 
	* <p>Title: getFlowStatsInterfaceName</p>
	* <p>Description: 取得流量统计查询的接口名</p>
	* @return 流量统计查询的接口名
	 */
	public static String getFlowStatsInterfaceName() {
		return flowStatsInterfaceName;
	}

	/**
	 * 
	* <p>Title: setFlowStatsInterfaceName</p>
	* <p>Description: 设置流量统计查询的接口名</p>
	* @param flowStatsInterfaceName 流量统计查询的接口名
	 */
	private static void setFlowStatsInterfaceName(String flowStatsInterfaceName) {
		Config.flowStatsInterfaceName = flowStatsInterfaceName;
	}
	
	
	
	/**
	 * 
	* <p>Title: getBandStatsURL</p>
	* <p>Description: 取得带宽统计查询的URL</p>
	* @return 带宽统计查询的URL
	 */
	public static String getBandStatsURL() {
		return bandStatsURL;
	}

	/**
	 * 
	* <p>Title: setBandStatsURL</p>
	* <p>Description: 设置带宽统计查询的URL</p>
	* @param bandStatsURL  带宽统计查询的URL
	 */
	private static void setBandStatsURL(String bandStatsURL) {
		Config.bandStatsURL = bandStatsURL;
	}

	/**
	 * 
	* <p>Title: getBandStatsDomainName</p>
	* <p>Description: 取得带宽统计查询的域名</p>
	* @return 带宽统计查询的域名
	 */
	public static String getBandStatsDomainName() {
		return bandStatsDomainName;
	}

	/**
	 * 
	* <p>Title: setBandStatsDomainName</p>
	* <p>Description: 设置带宽统计查询的域名</p>
	* @param bandStatsDomainName 带宽统计查询的域名
	 */
	public static void setBandStatsDomainName(String bandStatsDomainName) {
		Config.bandStatsDomainName = bandStatsDomainName;
		setBandStatsURL(Config.bandStatsDomainName + Config.bandStatsInterfaceName);
	}

	/**
	 * 
	* <p>Title: getBandStatsInterfaceName</p>
	* <p>Description: 取得带宽统计查询的接口名</p>
	* @return 带宽统计查询的接口名
	 */
	public static String getBandStatsInterfaceName() {
		return bandStatsInterfaceName;
	}

	/**
	 * 
	* <p>Title: setBandStatsInterfaceName</p>
	* <p>Description: 设置带宽统计查询的接口名</p>
	* @param bandStatsInterfaceName  带宽统计查询的接口名
	 */
	private static void setBandStatsInterfaceName(String bandStatsInterfaceName) {
		Config.bandStatsInterfaceName = bandStatsInterfaceName;
	}
	
	/**
	 * 
	* <p>Title: getStorageStatsURL</p>
	* <p>Description: 取得存储统计查询的URL</p>
	* @return 存储统计查询的URL
	 */
	public static String getStorageStatsURL() {
		return storageStatsURL;
	}

	/**
	 * 
	* <p>Title: setStorageStatsURL</p>
	* <p>Description: 设置存储统计查询的URL</p>
	* @param storageStatsURL 存储统计查询的URL
	 */
	private static void setStorageStatsURL(String storageStatsURL) {
		Config.storageStatsURL = storageStatsURL;
	}

	/**
	 * 
	* <p>Title: getStorageStatsDomainName</p>
	* <p>Description: 取得存储统计查询的域名</p>
	* @return 存储统计查询的域名
	 */
	public static String getStorageStatsDomainName() {
		return storageStatsDomainName;
	}

	/**
	 * 
	* <p>Title: setStorageStatsDomainName</p>
	* <p>Description: 设置存储统计查询的域名</p>
	* @param storageStatsDomainName 存储统计查询的域名
	 */
	public static void setStorageStatsDomainName(String storageStatsDomainName) {
		Config.storageStatsDomainName = storageStatsDomainName;
		setStorageStatsURL(Config.storageStatsDomainName + Config.storageStatsInterfaceName);
	}

	/**
	 * 
	* <p>Title: getStorageStatsInterfaceName</p>
	* <p>Description: 取得存储统计查询的接口名</p>
	* @return 存储统计查询的接口名
	 */
	public static String getStorageStatsInterfaceName() {
		return storageStatsInterfaceName;
	}

	/**
	 * 
	* <p>Title: setStorageStatsInterfaceName</p>
	* <p>Description: 设置存储统计查询的接口名</p>
	* @param storageStatsInterfaceName 存储统计查询的接口名
	 */
	private static void setStorageStatsInterfaceName(String storageStatsInterfaceName) {
		Config.storageStatsInterfaceName = storageStatsInterfaceName;
	}

	
	
	
	
	
	/**
	 * 	
	* <p>Title: getCreateSnapshotURL</p>
	* <p>Description: 取得获取视频截图地址的URL</p>
	* @return 获取视频截图地址的URL
	 */
	public static String getCreateSnapshotURL() {
		return createSnapshotURL;
	}

	/**
	 * 
	* <p>Title: setCreateSnapshotURL</p>
	* <p>Description: 设置获取视频截图地址的URL</p>
	* @param createSnapshotURL  获取视频截图地址的URL
	 */
	private static void setCreateSnapshotURL(String createSnapshotURL) {
		Config.createSnapshotURL = createSnapshotURL;
	}

	/**
	 * 
	* <p>Title: getCreateSnapshotDomainName</p>
	* <p>Description: 取得获取视频截图地址的域名</p>
	* @return 获取视频截图地址的域名
	 */
	public static String getCreateSnapshotDomainName() {
		return createSnapshotDomainName;
	}

	/**
	 * 
	* <p>Title: setCreateSnapshotDomainName</p>
	* <p>Description: 设置获取视频截图地址的域名</p>
	* @param createSnapshotDomainName  获取视频截图地址的域名
	 */
	public static void setCreateSnapshotDomainName(String createSnapshotDomainName) {
		Config.createSnapshotDomainName = createSnapshotDomainName;
		setCreateSnapshotURL(Config.createSnapshotDomainName + Config.createSnapshotInterfaceName);
	}

	/**
	 * 
	* <p>Title: getCreateSnapshotInterfaceName</p>
	* <p>Description: 取得获取视频截图地址的接口名</p>
	* @return 获取视频截图地址的接口名
	 */
	public static String getCreateSnapshotInterfaceName() {
		return createSnapshotInterfaceName;
	}

	/**
	 * 
	* <p>Title: setCreateSnapshotInterfaceName</p>
	* <p>Description: 设置获取视频截图地址的接口名</p>
	* @param createSnapshotInterfaceName  获取视频截图地址的接口名
	 */
	private static void setCreateSnapshotInterfaceName(
			String createSnapshotInterfaceName) {
		Config.createSnapshotInterfaceName = createSnapshotInterfaceName;
	}
	
		
	
	/**
	 * 
	* <p>Title: getSetSnapshotURL</p>
	* <p>Description: 取得设置视频封面的URL</p>
	* @return 设置视频封面的URL
	 */
	public static String getSetSnapshotURL() {
		return setSnapshotURL;
	}

	/**
	 * 
	* <p>Title: setSetSnapshotURL</p>
	* <p>Description: 设置视频封面的URL</p>
	* @param setSnapshotURL  设置视频封面的URL
	 */
	private static void setSetSnapshotURL(String setSnapshotURL) {
		Config.setSnapshotURL = setSnapshotURL;
	}

	/**
	 * 
	* <p>Title: getSetSnapshotDomainName</p>
	* <p>Description: 取得设置视频封面的域名</p>
	* @return 设置视频封面的URL
	 */
	public static String getSetSnapshotDomainName() {
		return setSnapshotDomainName;
	}

	/**
	 * 
	* <p>Title: setSetSnapshotDomainName</p>
	* <p>Description: 设置视频封面的域名</p>
	* @param setSnapshotDomainName 设置视频封面的域名
	 */
	public static void setSetSnapshotDomainName(String setSnapshotDomainName) {
		Config.setSnapshotDomainName = setSnapshotDomainName;
		setSetSnapshotURL(Config.setSnapshotDomainName + Config.setSnapshotInterfaceName);
	}

	/**
	 * 
	* <p>Title: getSetSnapshotInterfaceName</p>
	* <p>Description: 取得设置视频封面的接口名</p>
	* @return 设置视频封面的接口名
	 */
	public static String getSetSnapshotInterfaceName() {
		return setSnapshotInterfaceName;
	}

	/**
	 * 
	* <p>Title: setSetSnapshotInterfaceName</p>
	* <p>Description: 设置视频封面的接口名</p>
	* @param setSnapshotInterfaceName 设置视频封面的接口名
	 */
	private static void setSetSnapshotInterfaceName(String setSnapshotInterfaceName) {
		Config.setSnapshotInterfaceName = setSnapshotInterfaceName;
	}

	/**
	 * 
	* <p>Title: setAllDomianName</p>
	* <p>Description: 将所有的域名统一设置</p>
	* @param domainName 域名
	 */
	public static void setAllDomianName(String domainName){		
		
		setCreatePresetDomainName(domainName);
		setGetSinglePresetDomainName(domainName);
		setGetPresetListDomainName(domainName);
		setUpdatePresetDomainName(domainName);
		setDeletePresetDomainName(domainName);
		setGetSingleVideoDomainName(domainName);
		setGetVideoListDomainName(domainName);
		setEditVideoDomainName(domainName);
		setDeleteSingleTransCodeVideoDomainName(domainName);
		setDeleteSingleVideoDomainName(domainName);
		setDisableVideoDomainName(domainName);
		setRecoverVideoDomainName(domainName);
		setMultiVideoTranscodingDomainName(domainName);
		setMultiVideoTranscodingWithoutPresetDomainName(domainName);
		setSetVideoCallBackDomainName(domainName);
		setInitUploadVideoDomainName(domainName);
		setQueryVideoIDDomainName(domainName);
		setSetCallbackDomainName(domainName);
		
		setCreateTypeDomainName(domainName);
		setGetSingleTypeDomainName(domainName);
		setGetTypeListDomainName(domainName);
		setUpdateTypeDomainName(domainName);
		setDeleteTypeDomainName(domainName);
		setSetVideoTypeDomainName(domainName);
		
		
		setCreateWatermarkDomainName(domainName);
		setGetSingleWatermarkDomainName(domainName);
		setGetWatermarkListDomainName(domainName);
		setUpdateWatermarkDomainName(domainName);
		setDeleteWatermarkDomainName(domainName);
		
		
		setFlowStatsDomainName(domainName);
		setBandStatsDomainName(domainName);
		setStorageStatsDomainName(domainName);
		
		
		
		setCreateSnapshotDomainName(domainName);
		setSetSnapshotDomainName(domainName);
		
	}
	
	
	
	
	
	
}
