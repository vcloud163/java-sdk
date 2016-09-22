package com.netease.vcloud.auth;

/**
* <p>Title: Credentials</p>
* <p>Description: 提供用于访问服务的凭据：appKey和appSecret。这些凭据用于安全地签名请求服务。 </p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public interface Credentials {	
	/**
	 * 
	* <p>Title: getAppKey</p>
	* <p>Description: 返回此凭据对象的appKey</p>
	* @return 开发者平台分配给用户的appkey
	 */
	public String getAppKey();
	
	/**
	 * 
	* <p>Title: getAppSecret</p>
	* <p>Description: 返回此凭据对象的appSecret</p>
	* @return 开发者平台分配给用户的appSecret
	 */
	public String getAppSecret();
	
}
