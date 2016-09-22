package com.netease.vcloud.upload.service;

import java.io.IOException;
import java.util.List;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;

/**
* <p>Title: QueryVideoIDorWatermarkIDService</p>
* <p>Description:  查询视频主ID或水印图片主ID接口</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public interface QueryVideoIDorWatermarkIDService {

	/**
	 * 
	 * <p>Title: queryVideoID</p>
	 * <p>Description: 上传完成后查询视频主ID</p>
	 * @param objectNamesList  查询视频的对象名集合
	 * @return queryVideoIDParam 上传完成后查询视频主ID返回结果的封装类
	 * @throws VcloudException 
	 * @throws IOException 
	 */
	public abstract QueryVideoIDorWatermarkIDParam queryVideoID(List<String> objectNamesList)
			throws IOException, VcloudException;

}