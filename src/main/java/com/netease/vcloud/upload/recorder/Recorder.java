package com.netease.vcloud.upload.recorder;


import java.io.IOException;
import java.util.Map;
import com.netease.vcloud.VcloudException;

/**
* <p>Title: Recorder</p>
* <p>Description: 断点续传时记录上传进度的接口</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-7-1
*/
public interface Recorder {

	
	/**
	 * 
	* <p>Title: setRecorderMap</p>
	* <p>Description: 新建或更新文件分片上传的进度</p>
	* @param uploadRecorderMap 进度信息集合	
	 * @throws VcloudException 
	 */
	public void saveRecorderInfo(Map<String, Object> uploadRecorderMap) throws  VcloudException;
	
	/**
	 * 
	* <p>Title: getRecorderMap</p>
	* <p>Description: 获取文件分片上传的进度信息，以便可以进行断点续传</p>
	* @return	 
	 * @throws IOException 
	 * @throws VcloudException 
	 */
	public Map<String, Object> getRecorderInfo() throws IOException, VcloudException;
	
	/**
	 * 
	* <p>Title: deleteRecorder</p>
	* <p>Description: 文件上传完成后，将删除记录断点续传的进度文件</p>
	 */
	public void deleteRecorder();
	

	/**
	 * 
	* <p>Title: setUploadAgain</p>
	* <p>Description: 设置文件是否是续传</p>
	* @param uploadAgain
	 */
	public void setUploadAgain(boolean uploadAgain);
	
	/**
	 * 
	* <p>Title: getUploadAgain</p>
	* <p>Description: 返回文件是否是续传</p>
	* @return
	 */
	public boolean getUploadAgain();
	
}
