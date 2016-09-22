package com.netease.vcloud.auth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
* <p>Title: PropertiesCredentials</p>
* <p>Description: 从properties文件中读取appkey和appSecret的Credentials接口简单实现类。
* 	appKey的值应该在"appKey"属性中，appSecret的值应该在"appSecret"属性中。</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public class PropertiesCredentials implements Credentials {
	
	/** 开发者平台分配给用户的appkey */
	private final String appKey;

	/** 开发者平台分配给用户的appSecret */
	private final String appSecret;

	/**
	 * 
	* <p>Description: 从给定的properties文件中读取appkey和appSecret。</p>
	* @param file   给定的properties文件。
	* @throws FileNotFoundException
	* @throws IOException
	* @throws IllegalArgumentException
	 */
	public PropertiesCredentials(File file) throws FileNotFoundException, IOException, IllegalArgumentException {
		if (!file.exists()) {
			throw new FileNotFoundException("File doesn't exist:  " + file.getAbsolutePath());
		}

		Properties accountProperties = new Properties();
		accountProperties.load(new FileInputStream(file));

		if (accountProperties.getProperty("appKey") == null || accountProperties.getProperty("appSecret") == null) {
			throw new IllegalArgumentException("The specified file (" + file.getAbsolutePath() + ") "
					+ "doesn't contain the expected properties 'appKey' and 'appSecret'.");
		}

		appKey = accountProperties.getProperty("appKey");
		appSecret = accountProperties.getProperty("appSecret");
	}

	/**
	 * 
	* <p>Description: 从给定的properties文件的输入流中读取appkey和appSecret。</p>
	* @param inputStream 给定的properties文件的输入流。
	* @throws IOException
	 */
	public PropertiesCredentials(InputStream inputStream) throws IOException {
		Properties accountProperties = new Properties();
		try {
			accountProperties.load(inputStream);
		} finally {
			try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (accountProperties.getProperty("appKey") == null || accountProperties.getProperty("appSecret") == null) {
			throw new IllegalArgumentException("The specified properties data "
					+ "doesn't contain the expected properties 'appKey' and 'appSecret'.");
		}

		appKey = accountProperties.getProperty("appKey");
		appSecret = accountProperties.getProperty("appSecret");
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.com.netease.vcloud.auth.Credentials#getAppKey()
	 */
	public String getAppKey() {		
		return appKey;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.netease.vcloud.auth.Credentials#getAppSecret()
	 */
	public String getAppSecret() {		
		return appSecret;
	}

}
