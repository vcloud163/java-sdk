package com.netease.vcloud.upload.service;

import java.io.IOException;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.QueryOffsetParam;

/**
* <p>Title: QueryOffsetService</p>
* <p>Description: 断点续传查询断点接口</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public interface QueryOffsetService {

	/** 
	 * <p>Title: getPartOffset</p>
	 * <p>Description: 断点续传查询断点</p>
	 * @param uploadHost        上传加速节点地址
	 * @param bucket            存储上传文件的桶名
	 * @param object            存储上传文件的对象名
	 * @param context           上传上下文
	 * @param xNosToken         上传的token信息
	 * @return  queryOffsetParam 断点续传查询断点输出参数的封装类
	 * @throws IOException 
	 * @throws VcloudException
	 */
	public abstract QueryOffsetParam getPartOffset(String uploadHost,
			String bucket, String object, String context, String xNosToken)
			throws IOException, VcloudException;

}