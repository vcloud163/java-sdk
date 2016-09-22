package com.netease.vcloud.upload.param;

import java.util.List;


/**
* <p>Title: QueryVideoIDorWatermarkIDRet</p>
* <p>Description: 根据对象名查询视频ID输出参数的ret部分的封装类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-27
*/
public class QueryVideoIDorWatermarkIDRet {

	/** 输出参数中ret部分的vid个数*/
	Long count;
	
	/** 输出参数中ret部分的list*/
	List <QueryVideoIDorWatermarkIDListParam> list;
	
	/**
	 * 
	* <p>Title: getCount</p>
	* <p>Description: 得到根据对象名查询视频ID输出参数中ret部分的vid个数</p>
	* @return vid个数
	 */
	public Long getCount() {
		return count;
	}
	
	/**
	 * 
	* <p>Title: setCount</p>
	* <p>Description: 设置根据对象名查询视频ID输出参数中ret部分的vid个数</p>
	* @param count vid个数
	 */
	public void setCount(Long count) {
		this.count = count;
	}
	
	/**
	 * 
	* <p>Title: getList</p>
	* <p>Description:  得到根据对象名查询视频ID输出参数中ret部分的list</p>
	* @return  ret部分的list
	 */
	public List<QueryVideoIDorWatermarkIDListParam> getList() {
		return list;
	}
	
	/**
	 * 
	* <p>Title: setList</p>
	* <p>Description: 设置根据对象名查询视频ID输出参数中ret部分的list</p>
	* @param list 
	 */
	public void setList(List<QueryVideoIDorWatermarkIDListParam> list) {
		this.list = list;
	}	
	
}
