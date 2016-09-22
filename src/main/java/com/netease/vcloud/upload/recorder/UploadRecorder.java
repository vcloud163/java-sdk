package com.netease.vcloud.upload.recorder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.netease.vcloud.VcloudException;

/**
* <p>Title: UploadRecorder</p>
* <p>Description: 断点续传时记录上传进度的实现类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-7-1
*/
public class UploadRecorder implements Recorder {	
	
	/** 本地存储上传进度相关信息的文件*/
	private File recorderFile;
	
	/* 标记文件是否是续传，如果文件是续传，则为true，否则为false*/
	private boolean uploadAgain;		
	
	/**
	 * 
	* <p>Description: 传入存储上传进度相关信息的地址，初始化相关信息</p>
	* @param recordFilePath  本地存储上传进度相关信息的文件地址
	* @throws VcloudException
	 */
	public UploadRecorder(String recordFilePath) throws VcloudException {	
		
		recorderFile = new File(recordFilePath);		
		/** 当文件并不存在，则创建*/
		if(!recorderFile.exists()){
			String parentFilePath = recorderFile.getParent();
			//System.out.println(parentFilePath);
			File parentFile = new File(parentFilePath);
			if(!parentFile.exists())
				parentFile.mkdirs();
			try {
				recorderFile.createNewFile();				
			} catch (IOException e) {
				throw new VcloudException(e);				
			}		
			this.setUploadAgain(false);
		}else{ //文件存在则需要判断此文件中是否包含上传进度信息			
			this.setUploadAgain(isUploadAgain());
		}
		
	}	
	
	/**
	 * 
	* <p>Title: setRecorderMap</p>
	* <p>Description: 新建或更新文件分片上传的进度相关信息</p>
	* @param uploadRecorderMap 进度信息集合
	 * @throws VcloudException 
	 * @throws IOException 
	 * @throws UnsupportedEncodingException 
	 */	
	public void saveRecorderInfo(Map<String, Object> uploadRecorderMap) throws VcloudException  {
		
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream(this.recorderFile);			
			String bucket = (String) uploadRecorderMap.get("bucket");
			String uploadHost = (String) uploadRecorderMap.get("uploadHost");
			String object = (String) uploadRecorderMap.get("object");
			Long offset = (Long) uploadRecorderMap.get("offset");
			String context = (String) uploadRecorderMap.get("context");
			//String filePath = (String) uploadRecorderMap.get("filePath");
			Long remainderSize = (Long) uploadRecorderMap.get("remainderSize");
			String xNosToken = (String) uploadRecorderMap.get("xNosToken");
			
			fos.write(("uploadAgain:true" + "\r\n").getBytes("UTF-8"));
			fos.write((bucket + "\r\n").getBytes("UTF-8"));
			fos.write((uploadHost + "\r\n").getBytes("UTF-8"));
			fos.write((object + "\r\n").getBytes("UTF-8"));
			fos.write((offset + "\r\n").getBytes("UTF-8"));
			fos.write((context + "\r\n").getBytes("UTF-8"));
			//fos.write((filePath + "\r\n").getBytes("UTF-8"));
			fos.write((remainderSize + "\r\n").getBytes("UTF-8"));
			fos.write((xNosToken + "\r\n").getBytes("UTF-8"));
			
		}catch (Exception e) {
			throw new VcloudException(e);
		}finally{
			if(null != fos){
				try {
					fos.close();
				} catch (IOException e) {					
					throw new VcloudException(e);
					
				}
			}
		}
	
		
		

	}

	/**
	 * 
	* <p>Title: getRecorderMap</p>
	* <p>Description: 获取文件分片上传的进度相关信息，以便可以进行断点续传</p>
	* @return	 
	 * @throws VcloudException 
	 */
	public Map<String, Object> getRecorderInfo() throws VcloudException {
		Map<String, Object> uploadRecorderMap = new HashMap<String, Object>();
		
		FileInputStream fis = null; 
		InputStreamReader isr = null;
		BufferedReader reader = null;
		try{
			
			fis = new FileInputStream(this.recorderFile);
			isr = new InputStreamReader(fis, "UTF-8");
			reader = new BufferedReader(isr);  		
			
			String uploadAgain = null;
			String bucket = null;
			String uploadHost = null;
			String object = null;
			Long offset = null;
			String context = null;
			//String filePath = null;
			Long remainderSize = null;
			String xNosToken = null;
			
			uploadAgain = reader.readLine();
			bucket = reader.readLine();
			uploadHost = reader.readLine();
			object = reader.readLine();
			offset = Long.valueOf(reader.readLine());
			context = reader.readLine();
			//filePath = reader.readLine();
			remainderSize = Long.valueOf(reader.readLine());
			xNosToken = reader.readLine();
			
			uploadRecorderMap.put("bucket", bucket);
			uploadRecorderMap.put("uploadHost", uploadHost);
			uploadRecorderMap.put("object", object);
			uploadRecorderMap.put("offset", offset);
			uploadRecorderMap.put("context", context);
			//uploadRecorderMap.put("filePath", filePath);
			uploadRecorderMap.put("remainderSize", remainderSize);
			uploadRecorderMap.put("xNosToken", xNosToken);
			
		}catch (Exception e) {
			throw new VcloudException(e);
		}finally{
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					throw new VcloudException(e);
				}
			}
			if(null != isr){
				try {
					isr.close();
				} catch (IOException e) {
					throw new VcloudException(e);
				}
			}
			if(null != fis){
				try {
					fis.close();
				} catch (IOException e) {
					throw new VcloudException(e);
				}
			}
		}		
		
		if(!checkRecorderInfo(uploadRecorderMap))
			throw new VcloudException("[UploadRecorder] 断点续传的进度文件已损坏");
		
		return uploadRecorderMap;
	}
	
	/**
	 * 
	* <p>Title: checkRecorderMap</p>
	* <p>Description: 检查断点续传的进度文件是否已损坏</p>
	* @param uploadRecorderMap 断点续传的进度文件中保存的相关参数集合
	* @return 如果有参数为null，意味着对应信息缺失，则返回false，否则返回true
	 */
	public boolean checkRecorderInfo(Map<String, Object> uploadRecorderMap){
		
		String bucket = (String) uploadRecorderMap.get("bucket");
		String uploadHost = (String) uploadRecorderMap.get("uploadHost");
		String object = (String) uploadRecorderMap.get("object");
		Long offset = (Long) uploadRecorderMap.get("offset");
		String context = (String) uploadRecorderMap.get("context");
		//String filePath = (String) uploadRecorderMap.get("filePath");
		Long remainderSize = (Long) uploadRecorderMap.get("remainderSize");
		String xNosToken = (String) uploadRecorderMap.get("xNosToken");
		
		if( bucket == null  || null == uploadHost || null == object || null == offset || null == context || null == remainderSize || null == xNosToken)
			return false;
		return true;
	}
	
	/**
	 * 
	* <p>Title: isUploadAgain</p>
	* <p>Description: 判断已经存在的文件是否包含上传进度相关信息</p>
	* @return 如果包含上传进度相关信息，则返回true，否则返回false。
	* @throws VcloudException
	 */
	public boolean isUploadAgain() throws VcloudException{
		
		FileInputStream fis = null; 
		InputStreamReader isr = null;
		BufferedReader reader = null;
		try{
			fis = new FileInputStream(this.recorderFile);
			isr = new InputStreamReader(fis, "UTF-8");
			reader = new BufferedReader(isr);  		  
			/* 保存的上传进度相关信息第一行均是 "uploadAgain:true" */
			String uploadAgain = reader.readLine();
			if("uploadAgain:true".equals(uploadAgain))
				return true;
			
		}catch (Exception e) {
			throw new VcloudException(e);
		}finally{
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					throw new VcloudException(e);
				}
			}
			if(null != isr){
				try {
					isr.close();
				} catch (IOException e) {
					throw new VcloudException(e);
				}
			}
			if(null != fis){
				try {
					fis.close();
				} catch (IOException e) {
					throw new VcloudException(e);
				}
			}
		}		
		
		return false;
	}

	/**
	 * 
	* <p>Title: deleteRecorder</p>
	* <p>Description: 文件上传完成后，将删除记录断点续传的进度文件</p>
	 */
	public void deleteRecorder() {
		this.recorderFile.delete();
	}

	

	/**
	 * 
	* <p>Title: setUploadAgain</p>
	* <p>Description: 设置文件是否是续传</p>
	* @param uploadAgain
	 */
	public void setUploadAgain(boolean uploadAgain) {
		this.uploadAgain = uploadAgain;		
	}

	/**
	 * 
	* <p>Title: getUploadAgain</p>
	* <p>Description: 返回文件是否是续传</p>
	* @return
	 */
	public boolean getUploadAgain() {		
		return this.uploadAgain;
	}

	
}
