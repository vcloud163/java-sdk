package com.netease.vcloud.upload.service;

import java.io.IOException;
import java.util.Map;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;
import com.netease.vcloud.upload.recorder.Recorder;


/**
* <p>Title: UploadVideoWithRecorderService</p>
* <p>Description: 支持断点续传的视频上传接口</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public interface UploadVideoWithRecorderService {
	/**
	 * 
	* <p>Title: uploadVideoWithRecorder</p>
	* <p>Description: 支持断点续传的视频上传</p>
	* @param filePath       上传文件路径
	* @param initParamMap   初始化参数集合
	* @param recorder       断点续传时记录上传进度的实现类
	* @return  视频上传成功，则返回根据对象名查询视频ID输出参数的封装类，否则返回null
	* @throws VcloudException
	* @throws IOException
	 */
	public abstract QueryVideoIDorWatermarkIDParam uploadVideoWithRecorder(
			String filePath, Map<String, Object> initParamMap, Recorder recorder) throws VcloudException, IOException;

}