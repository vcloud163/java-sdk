package com.netease.vcloud.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.Logger;

import com.netease.vcloud.VcloudException;

/**
* <p>Title: FileUtil</p>
* <p>Description: 文件相关操作的工具类 </p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-21
*/
public class FileUtil {

	/** 日志实例*/
	public static final Logger  logger = Logger.getLogger(FileUtil.class);
	/**
	 * 
	 * <p>Title: doesFileExist</p>
	 * <p>Description: 根据文件路径判断文件是否存在</p>
	 * @param filePath   上传文件的路径
	 * @return 如果文件存在返回true，否则抛异常
	 * @throws VcloudException
	 */
	public static boolean doesFileExist(String filePath) throws VcloudException{

		File file = new File(filePath);
		if(file.exists()){
			return true;
		}else{
			throw new VcloudException("[FileUtil] the file does not exit");
		}
	}
	/**
	 * 
	 * <p>Title: getFileLength</p>
	 * <p>Description: 根据文件路径得到上传文件的大小</p>
	 * @param filePath 上传文件的路径
	 * @return 如果文件存在返回该文件的大小，否则返回null
	 * @throws VcloudException
	 */
	public static Long getFileLength(String filePath) throws VcloudException {
		
		if(doesFileExist(filePath)){
			File file = new File(filePath);
			return file.length();
		}
		return null;
	}
	/**
	 * 
	 * <p>Title: getFileInputStream</p>
	 * <p>Description: 根据文件路径得到上传文件的输出流</p>
	 * @param filePath 上传文件的路径
	 * @return 如果文件存在返回该文件的输出流，否则返回null
	 * @throws VcloudException
	 * @throws FileNotFoundException
	 */
	public static InputStream getFileInputStream(String filePath) throws VcloudException, FileNotFoundException{
		
		if(doesFileExist(filePath)){
			return new FileInputStream(new File(filePath));
		}
		return null;
	}
	/**
	 * 
	 * <p>Title: getFileName</p>
	 * <p>Description: 根据文件路径取得文件名</p>
	 * @param filePath 上传文件的路径
	 * @return 如果文件存在返回该文件的文件名（带后缀），否则返回null
	 * @throws VcloudException
	 */
	public static String getFileName(String filePath) throws VcloudException{

		if(doesFileExist(filePath)){
			//String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
			File file = new File(filePath);
			String fileName = file.getName();
			return fileName;
		}
		return null;
	}
	

}
