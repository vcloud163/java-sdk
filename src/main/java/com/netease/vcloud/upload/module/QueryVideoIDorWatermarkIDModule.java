package com.netease.vcloud.upload.module;


import java.util.List;

/**
* <p>Title: QueryVideoIDorWatermarkIDModule</p>
* <p>Description: 根据对象名查询视频或水印图片主ID输入参数的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-7-7
*/
public class QueryVideoIDorWatermarkIDModule {

	/** 查询文件的对象名     参数必填*/
	private List<String> objectNames;	

	/**
	 * 
	* <p>Description: 无参构造函数</p>
	 */
	public QueryVideoIDorWatermarkIDModule() {		
	}
	/**
	 * 
	* <p>Description: 传入查询文件的对象名构造封装类</p>
	* @param objectNamesList  查询文件的对象名
	 */
	public QueryVideoIDorWatermarkIDModule(List<String> objectNamesList) {	
		this.objectNames = objectNamesList;
	}
	/**
	 * 
	* <p>Title: getObjectNames</p>
	* <p>Description: 取得查询文件的对象名</p>
	* @return 查询文件的对象名
	 */
	public List<String> getObjectNames() {
		return objectNames;
	}
	/**
	 * 
	* <p>Title: setObjectNames</p>
	* <p>Description: 设置查询文件的对象名</p>
	* @param objectNames  查询文件的对象名
	 */
	public void setObjectNames(List<String> objectNames) {
		this.objectNames = objectNames;
	}
	
	
	
}
