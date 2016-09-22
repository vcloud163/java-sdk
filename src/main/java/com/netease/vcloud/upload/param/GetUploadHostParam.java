package com.netease.vcloud.upload.param;

import java.util.List;


/**
* <p>Title: GetUploadHostParam</p>
* <p>Description: 获取上传加速节点地址输出参数的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-27
*/
public class GetUploadHostParam {
	
	/** 输出参数中的响应码*/
	private Integer code;		
	
	/** 输出参数中的错误信息*/
	private String msg;
	
	/** 输出参数中的lbs*/
	private String lbs;
	
	/** 输出参数中的上传节点地址集合*/
	private List<String> upload;
	
	/**
	 * 
	* <p>Title: getLbs</p>
	* <p>Description: 得到获取上传加速节点地址输出参数的lbs</p>
	* @return lbs
	 */ 
	public String getLbs() {
		return lbs;
	}
	/**
	 * 
	* <p>Title: setLbs</p>
	* <p>Description: 设置获取上传加速节点地址输出参数的lbs</p>
	* @param lbs
	 */
	public void setLbs(String lbs) {
		this.lbs = lbs;
	}
	/**
	 * 
	* <p>Title: getUpload</p>
	* <p>Description: 得到获取上传加速节点地址输出参数的上传节点地址集合</p>
	* @return 上传节点地址集合
	 */
	public List<String> getUpload() {
		return upload;
	}
	
	/**
	 * 
	* <p>Title: setUpload</p>
	* <p>Description: 设置获取上传加速节点地址输出参数的上传节点地址集合</p>
	* @param upload 上传节点地址集合
	 */
	public void setUpload(List<String> upload) {
		this.upload = upload;
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
	@Override
	public String toString() {
		return "GetUploadHostParam [code=" + code + ", msg=" + msg + ", lbs=" + lbs + ", upload=" + upload + "]";
	}
	
	
	
}
