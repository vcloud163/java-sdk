package com.netease.vcloud.upload.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.module.QueryVideoIDorWatermarkIDModule;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;
import com.netease.vcloud.upload.service.QueryVideoIDorWatermarkIDService;
import com.netease.vcloud.upload.util.UploadUtil;


/**
* <p>Title: QueryVideoIDorWatermarkIDServiceImpl</p>
* <p>Description:  查询视频主ID或水印图片主ID的实现类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-21
*/
public class QueryVideoIDorWatermarkIDServiceImpl implements QueryVideoIDorWatermarkIDService {

	/** 日志实例*/
	public static final Logger logger = Logger.getLogger(QueryVideoIDorWatermarkIDServiceImpl.class);
	
	/* 
	* <p>Title: queryVideoID</p>
	* <p>Description: </p>
	* @param objectNamesList
	* @return
	* @throws IOException
	* @throws VcloudException
	* @see com.netease.vcloud.upload.util.service.impl.QueryVideoIDService#queryVideoID(java.util.List)
	*/
	public QueryVideoIDorWatermarkIDParam queryVideoID(List<String> objectNamesList) throws IOException, VcloudException{
		
		if(null == objectNamesList || objectNamesList.size() < 1)
			throw new VcloudException("objectNamesList is null or invalid");
		QueryVideoIDorWatermarkIDModule queryVideoIDorWatermarkIDModule = new QueryVideoIDorWatermarkIDModule(objectNamesList);
		UploadUtil util = new UploadUtil(queryVideoIDorWatermarkIDModule);		
		QueryVideoIDorWatermarkIDParam queryVideoIDParam = util.queryVideoID();
		return queryVideoIDParam;

	}
}
