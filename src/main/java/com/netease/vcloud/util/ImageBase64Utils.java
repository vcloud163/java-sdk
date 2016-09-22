package com.netease.vcloud.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import sun.misc.BASE64Encoder;

/**
* <p>Title: ImageBase64Utils</p>
* <p>Description: 将图片转换成Base编码的字符串工具类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-7-15
*/
public class ImageBase64Utils {	

	/** 日志实例 */
	public static final Logger  logger = Logger.getLogger(ImageBase64Utils.class);

	/* 
	 * 将图片文件转化为字节数组字符串，并对其进行Base64编码处理 	 * 
	 * 
	 *@param imgFilePath 待处理的图片路径 imgFilePath  = "e:/2.jpg"; 
	 * 
	 */
	public static String imageToBase64String(String imgFilePath) {		
		InputStream in = null;
		byte[] data = null;
		/* 读取图片字节数组 */
		try {
			in = new FileInputStream(imgFilePath);
			data = new byte[in.available()];
			in.read(data);	
			//logger.info("[ImageBase64Utils] the length of image :" + in.available());
		} catch (IOException e) {
			logger.error("[CallbackImageBase64Utils] failed to change image to Base64String : " + e + ",msg : " + e.getMessage());			
		}finally{
			if(null != in){
				try {
					in.close();
				} catch (IOException e) {
					logger.error("[CallbackImageBase64Utils] failed to close InputStream : " + e + ",msg : " + e.getMessage());
				}
			}			
		}

		/* 对字节数组Base64编码 */
		BASE64Encoder encoder = new BASE64Encoder();
		/* 返回Base64编码过的字节数组字符串  */
		return encoder.encode(data);
	}

	
}