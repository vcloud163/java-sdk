package com.netease.vcloud.upload.param;

/**
* <p>Title: QueryOffsetParam</p>
* <p>Description: 断点续传查询断点输出参数的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-27
*/
public class QueryOffsetParam {

	/** 输出参数中的uid字符串，服务器端生成的唯一UUID，用于记录日志排查问题使用*/
	private String requestId;
	
	/** 输出参数中的下一个上传片在上传块中的偏移*/
	private Long offset;
	
	/** 输出参数中的上传上下文*/
	private String context;
	
	/** 输出参数中的错误信息*/
	private String errMsg;
	
	/** 输出参数中的上传回调信息*/
	private String callbackRetMsg;
	
	/**
	 * 
	* <p>Title: getRequestId</p>
	* <p>Description: 得到断点续传查询断点输出参数中的请求Id</p>
	* @return 请求Id
	 */
	public String getRequestId() {
		return requestId;
	}
	
	/**
	 * 
	* <p>Title: setRequestId</p>
	* <p>Description: 设置断点续传查询断点输出参数中的请求Id</p>
	* @param requestId
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	
	/**
	 * 
	* <p>Title: getOffset</p>
	* <p>Description: 得到断点续传查询断点输出参数中的下一个上传片在上传块中的偏移</p>
	* @return 下一个上传片在上传块中的偏移
	 */
	public Long getOffset() {
		return offset;
	}
	
	/**
	 * 
	* <p>Title: setOffset</p>
	* <p>Description: 设置断点续传查询断点输出参数中的下一个上传片在上传块中的偏移</p>
	* @param offset 下一个上传片在上传块中的偏移
	 */
	public void setOffset(Long offset) {
		this.offset = offset;
	}
	
	/**
	 * 
	* <p>Title: getContext</p>
	* <p>Description:  得到断点续传查询断点输出参数中的上传上下文</p>
	* @return 上传上下文
	 */
	public String getContext() {
		return context;
	}
	
	/**
	 * 
	* <p>Title: setContext</p>
	* <p>Description: 设置断点续传查询断点输出参数中的上传上下文</p>
	* @param context 上传上下文
	 */
	public void setContext(String context) {
		this.context = context;
	}
	
	/**
	 * 
	* <p>Title: getCallbackRetMsg</p>
	* <p>Description: 得到断点续传查询断点输出参数中的上传回调信息</p>
	* @return 上传回调信息
	 */
	public String getCallbackRetMsg() {
		return callbackRetMsg;
	}
	
	/**
	 * 
	* <p>Title: setCallbackRetMsg</p>
	* <p>Description: 设置断点续传查询断点输出参数中的上传回调信息</p>
	* @param callbackRetMsg 上传回调信息
	 */
	public void setCallbackRetMsg(String callbackRetMsg) {
		this.callbackRetMsg = callbackRetMsg;
	}
	
	/**
	 * 
	* <p>Title: getErrMsg</p>
	* <p>Description: 得到断点续传查询断点输出参数中的错误信息</p>
	* @return 错误信息
	 */
	public String getErrMsg() {
		return errMsg;
	}
	
	/**
	 * 
	* <p>Title: setErrMsg</p>
	* <p>Description: 设置断点续传查询断点输出参数中的错误信息</p>
	* @param errMsg 错误信息
	 */
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	
}
