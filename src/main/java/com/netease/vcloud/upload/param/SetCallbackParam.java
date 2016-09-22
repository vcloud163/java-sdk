package com.netease.vcloud.upload.param;

/**
 * 
* <p>Title: SetCallbackParam</p>
* <p>Description: 设置上传回调地址接口输出参数的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-8-28
 */
public class SetCallbackParam {

	/** 输出参数中的响应码*/
	private Integer code;		
	
	/** 输出参数中的错误信息*/
	private String msg;	
	
	public SetCallbackParam() {
	}
	public SetCallbackParam(Integer code, String msg) {		
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}	
	
}
