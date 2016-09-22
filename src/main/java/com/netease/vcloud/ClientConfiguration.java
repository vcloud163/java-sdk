package com.netease.vcloud;


/**
* <p>Title: ClientConfiguration</p>
* <p>Description: 客户端配置选项，如连接超时时限，socket超时时间。</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-30
*/
public class ClientConfiguration {
	
	/** 默认的连接超时时限  10秒*/
	public static final Integer DEFAULT_CONNECTION_TIMEOUT = 10 * 1000;
	
	/** 默认的socket超时时间    50秒 */
	public static final Integer DEFAULT_SOCKET_TIMEOUT = 50 * 1000;
	
	
	/** HttpClient 连接超时时限  */
	private  Integer connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;
	
	/** HttpClient socket超时时间 */
	private  Integer socketTimeout = DEFAULT_SOCKET_TIMEOUT;

	/**
	 * 
	* <p>Description: 无参构造函数</p>
	 */
	public ClientConfiguration() {
		
	}

	/**
	 * 
	* <p>Description: 传入连接超时时限和socket超时时间的构造函数。</p>
	* @param connectionTimeout  连接超时时限
	* @param socketTimeout      socket超时时间
	 */
	public ClientConfiguration(Integer connectionTimeout, Integer socketTimeout) {		
		this.connectionTimeout = connectionTimeout;
		this.socketTimeout = socketTimeout;
	}

	/**
	 * 
	* <p>Title: getConnectionTimeout</p>
	* <p>Description: 返回连接超时时限</p>
	* @return 连接超时时限
	 */
	public Integer getConnectionTimeout() {
		return connectionTimeout;
	}
	
	/**
	 * 
	* <p>Title: setConnectionTimeout</p>
	* <p>Description: 设置连接超时时限</p>
	* @param connectionTimeout 连接超时时限
	 */
	public void setConnectionTimeout(Integer connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	/**
	 * 
	* <p>Title: getSocketTimeout</p>
	* <p>Description: 返回socket超时时间</p>
	* @return socket超时时间
	 */
	public Integer getSocketTimeout() {
		return socketTimeout;
	}

	/**
	 * 
	* <p>Title: setSocketTimeout</p>
	* <p>Description: 设置socket超时时间</p>
	* @param socketTimeout socket超时时间
	 */
	public void setSocketTimeout(Integer socketTimeout) {
		this.socketTimeout = socketTimeout;
	}	
	
}
