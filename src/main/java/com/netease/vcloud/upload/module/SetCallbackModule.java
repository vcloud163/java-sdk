package com.netease.vcloud.upload.module;

/**
 * 
* <p>Title: SetCallbackModule</p>
* <p>Description: 设置上传回调地址接口输入参数的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-8-28
 */
public class SetCallbackModule {

	/**  上传成功后回调客户端的URL地址     参数必填*/
	private String callbackUrl;	
	
	public SetCallbackModule() {
		
	}
	public SetCallbackModule(String callbackUrl) {		
		this.callbackUrl = callbackUrl;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
}
