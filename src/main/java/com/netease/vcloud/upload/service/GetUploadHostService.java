package com.netease.vcloud.upload.service;

import java.io.IOException;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.GetUploadHostParam;

/**
* <p>Title: GetUploadHostService</p>
* <p>Description: 获取上传加速节点地址接口</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public interface GetUploadHostService {

	
	/**
	* <p>Title: getUploadHost</p>
	* <p>Description: </p>
	* @param bucket   存储上传文件的桶名
	* @return getUploadHostParam   获取上传加速节点地址返回结果的封装类
	* @throws IOException
	* @throws VcloudException
	*/
	public abstract GetUploadHostParam getUploadHost(String bucket) throws IOException,
			VcloudException;

}