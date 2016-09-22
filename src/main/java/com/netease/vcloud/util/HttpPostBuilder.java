package com.netease.vcloud.util;

import java.util.Date;

import org.apache.http.client.methods.HttpPost;
import org.apache.log4j.Logger;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.config.Config;

/**
* <p>Title: HttpPostBuilder</p>
* <p>Description: 构造HttpPost的工具类 </p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-21
*/
public class HttpPostBuilder {
	
	/** 日志实例*/
	public static final Logger  logger = Logger.getLogger(HttpPostBuilder.class);
	
	
	/**
	 * 
	 * <p>Title: getHttpPost</p>
	 * <p>Description: 根据接口地址创建相应的HttpPost</p>
	 * @param url    接口地址
	 * @return 创建的HttpPost
	 * @throws VcloudException
	 */
	public static HttpPost getHttpPost(String url) throws VcloudException{

		HttpPost httpPost = new HttpPost(url);

		String appKey = null;
		String appSecret = null;
//		appKey = VcloudPropertiesUtil.readValue("appKey");
//		appSecret = VcloudPropertiesUtil.readValue("appSecret");

		appKey = Config.getAppKey();
		appSecret = Config.getAppSecret();

		if(null == appKey || null == appSecret){			
			throw new VcloudException("[HttpPostBuilder] fail to read appKey or appSecret");
		}

		String nonce =  "1";
		String curTime = String.valueOf((new Date()).getTime() / 1000L);
		String checkSum = CheckSumBuilder.getCheckSum(appSecret, nonce ,curTime);//参考 计算CheckSum的java代码

		// 设置请求的header
		httpPost.addHeader("AppKey", appKey);
		httpPost.addHeader("Nonce", nonce);
		httpPost.addHeader("CurTime", curTime);
		httpPost.addHeader("CheckSum", checkSum);
		httpPost.addHeader("Content-Type", "application/json;charset=utf-8"); 


		//	        logger.info("[HttpPostBuilder] : AppKey:      " + appKey);
		//	        logger.info("[HttpPostBuilder] : Nonce:       " + nonce);
		//	        logger.info("[HttpPostBuilder] : CurTime:     " + curTime);
		//	        logger.info("[HttpPostBuilder] : CheckSum:    " + checkSum);
		//	        logger.info("[HttpPostBuilder] : Content-Type:" + "application/json;charset=utf-8");


		return httpPost;			
	}
}
