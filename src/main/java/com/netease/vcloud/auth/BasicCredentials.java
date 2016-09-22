package com.netease.vcloud.auth;


/**
* <p>Title: BasicCredentials</p>
* <p>Description: Credentials接口的基础实现类，允许使用者通过构造函数将appkey和appSecret传入。</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public class BasicCredentials implements Credentials {
	
	/** 开发者平台分配给用户的appkey */
	private final String appKey;
	
	/** 开发者平台分配给用户的appSecret */
	private final String appSecret;
	
	/**
	 * 
	* <p>Description: 用指定的appkey和appSecret构造一个新的BasicCredentials对象。</p>
	* @param appKey       开发者平台分配给用户的appkey
	* @param appSecret    开发者平台分配给用户的appSecret
	 */
	public BasicCredentials(String appKey, String appSecret) {	
		this.appKey = appKey;
		this.appSecret = appSecret;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.com.netease.vcloud.auth.Credentials#getAppKey()
	 */
	public String getAppKey() {		
		return appKey;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.vcloud.auth.Credentials#getAppSecret()
	 */
	public String getAppSecret() {		
		return appSecret;
	}

}
