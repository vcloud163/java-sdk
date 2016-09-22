package com.netease.vcloud.util;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.Logger;
import com.netease.vcloud.config.Config;



/**
* <p>Title: HttpClientBuilder</p>
* <p>Description: 构造HttpClient的工具类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-24
*/
public class HttpClientBuilder {
	/** 日志实例*/
	public static final Logger logger = Logger.getLogger(HttpClientBuilder.class);
	
	/** 设置连接超时限制  */
	private static Integer connectionTimeout = Config.getConnectionTimeout();	
	
	/** 设置socket超时限制  */
	private static Integer socketTimeout = Config.getSocketTimeout();
	/**
	 * 
	 * <p>Title: getHttpClient</p>
	 * <p>Description: 创建HttpClient</p>
	 * @return 创建的HttpClient
	 */
	public static HttpClient getHttpClient(){ 	
		
		/** 用于获取和配置一些外部的网络环境 */
        RequestConfig config = RequestConfig.custom() /** 获取 RequestConfig.Builder 配置器 */
            .setSocketTimeout(socketTimeout) /** socket 读数据超时时间 : 从服务器获取响应数据的超时时间 */
            .setConnectTimeout(connectionTimeout) /** 与服务器连接超时时间 (HttpClient 会创建一个异步线程以创建 socket 连接, 此处设置该 socket 的连接超时时间) */            
            .build();     

        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(config).build();	
        
		return httpClient;
	}

}
