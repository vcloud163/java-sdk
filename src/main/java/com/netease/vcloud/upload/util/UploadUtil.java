package com.netease.vcloud.upload.util;

import java.io.IOException;
import java.io.InputStream;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;

import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;


import com.alibaba.fastjson.JSON;
import com.netease.vcloud.VcloudException;
import com.netease.vcloud.config.Config;
import com.netease.vcloud.upload.module.InitUploadVideoModule;
import com.netease.vcloud.upload.module.QueryVideoIDorWatermarkIDModule;
import com.netease.vcloud.upload.module.SetCallbackModule;
import com.netease.vcloud.upload.param.GetUploadHostParam;
import com.netease.vcloud.upload.param.InitUploadVideoParam;
import com.netease.vcloud.upload.param.QueryOffsetParam;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;
import com.netease.vcloud.upload.param.UploadVideoFragmentParam;
import com.netease.vcloud.upload.param.SetCallbackParam;
import com.netease.vcloud.util.HttpClientBuilder;
import com.netease.vcloud.util.HttpGetBuilder;
import com.netease.vcloud.util.HttpPostBuilder;

/**
* <p>Title: UploadUtil</p>
* <p>Description: 视频上传模板的工具类</p>
* <p>Company: com.netease.vcloud</p>
* @date       2016-6-21
*/

public class UploadUtil {

	/** 日志实例*/
	public static final Logger logger = Logger.getLogger(UploadUtil.class);
	
	/** 切片上传：最小片字节数（默认不变） */
	private long uploadDataSize = Config.getUploadDataSize();
		
	
	/** 存储上传文件的桶名  */
	private String bucket;
	
	/** 上传加速节点地址 */
	private String uploadHost;
	
	/** 存储上传文件的对象名 */
	private String object;
	
	/** 当前分片在整个对象中的起始偏移量 */
	private Long offset;
	
	/** 上传上下文  */
	private String context;
	
	/** 上传文件的输出流  */
	private InputStream in;
	
	/** 上传文件剩余大小 */
	private Long remainderSize;
	
	/** 上传的token信息  */
	private String xNosToken;
	
	/** 视频上传初始化输入参数的封装类*/
	private InitUploadVideoModule initUploadVideoModule;
	
	/** 根据对象名查询视频或水印图片主ID输入参数的封装类*/
	private QueryVideoIDorWatermarkIDModule queryVideoIDorWatermarkIDModule;
	
	/** 设置上传回调地址接口输入参数的封装类 */
	private SetCallbackModule setCallbackModule;
	/**
	 * 
	* <p>Description: 视频上传初始化 的构造函数</p>
	* @param initUploadVideoModule  视频上传初始化输入参数的封装类
	 */
	public UploadUtil(InitUploadVideoModule initUploadVideoModule){
		this.initUploadVideoModule = initUploadVideoModule;
	}
	
	
	/**
	* <p>Description:  获取上传加速节点地址 的构造函数</p> 
	*/
	public UploadUtil(String bucket) {
		this.bucket = bucket;
	}	


	/**
	* <p>Description: 上传视频分片的构造函数</p>
	* @param bucket             存储上传文件的桶名 
	* @param uploadHost         上传加速节点地址
	* @param object             存储上传文件的对象名
	* @param offset             当前分片在整个对象中的起始偏移量
	* @param context            上传上下文
	* @param in                 上传文件的输出流
	* @param remainderSize      上传文件剩余大小
	* @param xNosToken          上传的token信息
	*/
	public UploadUtil(String bucket, String uploadHost, String object,
			Long offset, String context, InputStream in, Long remainderSize, String xNosToken) {		
		this.bucket = bucket;
		this.uploadHost = uploadHost;
		this.object = object;
		this.offset = offset;
		this.context = context;
		this.in = in;
		this.remainderSize = remainderSize;
		this.xNosToken = xNosToken;
	}
	/**
	 * 
	 * <p>Description: 上传视频分片的构造函数</p>
	 * @param initUploadVideoParam    视频上传初始化返回结果的封装类
	 * @param getUploadHostParam      获取上传加速节点地址返回结果的封装类
	 * @param offset                  当前分片在整个对象中的起始偏移量
	 * @param context                 上传上下文
	 * @param in                      上传文件的输出流
	 * @param remainderSize           上传文件剩余大小
	 */
	public UploadUtil(InitUploadVideoParam initUploadVideoParam, GetUploadHostParam getUploadHostParam, Long offset, String context, InputStream in, Long remainderSize){
		this.bucket = initUploadVideoParam.getRet().getBucket();
		this.uploadHost = getUploadHostParam.getUpload().get(0);
		this.object = initUploadVideoParam.getRet().getObject();
		this.offset = offset;
		this.context = context;
		this.in = in;
		this.remainderSize = remainderSize;
		this.xNosToken = initUploadVideoParam.getRet().getxNosToken();
	}


	/**
	 * 
	* <p>Description: 上传完成根据对象名查询视频主ID的构造函数</p>
	* @param queryVideoIDorWatermarkIDModule 根据对象名查询视频或水印图片主ID输入参数的封装类
	 */
	public UploadUtil(QueryVideoIDorWatermarkIDModule queryVideoIDorWatermarkIDModule) {		
		this.queryVideoIDorWatermarkIDModule = queryVideoIDorWatermarkIDModule;
	}

	
	/**
	* <p>Description: 断点续传查询断点的构造函数 </p>
	* @param uploadHost        上传加速节点地址
	* @param bucket            存储上传文件的桶名
	* @param object            存储上传文件的对象名
	* @param context           上传上下文
	* @param xNosToken         上传的token信息
	*/
	public UploadUtil(String uploadHost, String bucket, String object, String context, String xNosToken) {		
		this.uploadHost = uploadHost;
		this.bucket = bucket;
		this.object = object;
		this.context = context;
		this.xNosToken = xNosToken;
	}
	
	/**
	 * 
	 * <p>Description: 断点续传查询断点的构造函数 </p>
	 * @param initUploadVideoParam    视频上传初始化返回结果的封装类
	 * @param getUploadHostParam      获取上传加速节点地址返回结果的封装类
	 * @param uploadVideoParam        分片上传视频返回结果的封装类
	 */
	public UploadUtil(InitUploadVideoParam initUploadVideoParam, GetUploadHostParam getUploadHostParam, UploadVideoFragmentParam uploadVideoParam){
		this.uploadHost = getUploadHostParam.getUpload().get(0);
		this.bucket = initUploadVideoParam.getRet().getBucket();
		this.object = initUploadVideoParam.getRet().getObject();
		this.context = uploadVideoParam.getContext();
		this.xNosToken = initUploadVideoParam.getRet().getxNosToken();
	}	
		
	
	/**
	 * 	
	* <p>Description: 设置上传回调地址的构造函数</p>
	* @param setCallbackModule   设置上传回调地址接口输入参数的封装类
	 */
	public UploadUtil(SetCallbackModule setCallbackModule) {		
		this.setCallbackModule = setCallbackModule;
	}


	/**
	* <p>Title: initUploadVideo</p>
	* <p>Description: 视频上传初始化</p>
	* @return  initUploadVideoParam  视频上传初始化返回结果的封装类
	* @throws IOException
	 * @throws VcloudException 
	*/
	public InitUploadVideoParam initUploadVideo() throws IOException, VcloudException{
		
		/* 接口 */
		//String url = "https://vcloud.163.com/app/vod/upload/init";	
		
		String url = Config.getInitUploadVideoURL();
		
		/* 设置请求的参数 */
		StringEntity params = new StringEntity(JSON.toJSONString(initUploadVideoModule),"UTF-8");			
		/* 得到Json数据 */
		InitUploadVideoParam initUploadVideoParam = (InitUploadVideoParam) jsonParamObjectBuilder(url, params, InitUploadVideoParam.class);		

		return initUploadVideoParam;
	}	
	
	
	/**
	* <p>Title: getUploadHost</p>
	* <p>Description: 获取上传加速节点地址</p>
	* @return getUploadHostParam  获取上传加速节点地址返回结果的封装类
	* @throws IOException   
	 * @throws VcloudException 
	*/
	public GetUploadHostParam getUploadHost() throws IOException, VcloudException{
		
		/* 接口 */
		String url = "http://wanproxy.127.net/lbs?version=1.0&bucketname=" + bucket;		
		//String url = Config.getGetUploadHostURL();
			
		/* 得到Json数据 */
		GetUploadHostParam getUploadHostParam = (GetUploadHostParam) jsonParamObjectBuilder(url, GetUploadHostParam.class, null);		

		return getUploadHostParam;
	}
	
	
	/**
	* <p>Title: uploadVideoFragment</p>
	* <p>Description: 上传视频分片</p>
	* @return uploadVideoFragmentParam   上传视频分片返回结果的封装类
	 * @throws VcloudException 
	 * @throws IOException 
	*/
	public UploadVideoFragmentParam uploadVideoFragment() throws VcloudException, IOException{

		byte buffer[];
		String url;
		if(remainderSize > 0){

			//logger.info("[UploadVideo] : 文件剩余大小： " + remainderSize);
			/* 判读是否是最后一片 */
			if (remainderSize <= uploadDataSize) {
				url = uploadHost + "/" + bucket + "/" + object + "?offset="	+ offset + "&complete=" + "true" + "&version=1.0";
				/* 如果是最后一片，申请的数组大小要根据实际情况 */
				buffer = new byte[remainderSize.intValue()];
			} else {
				url = uploadHost + "/" + bucket + "/" + object + "?offset="	+ offset + "&complete=" + "false" + "&version=1.0";
				buffer = new byte[(int) uploadDataSize];
			}
			/* 如果不是第一次传输，需要加入此参数 */
			if (null != context) {
				url = url + "&context=" + context;
			}

			//logger.info("[UploadVideoFragment] : url： " + url);
			int len = in.read(buffer);
			//logger.info("[UploadVideoFragment] : 当前读取的文件大小： " + len);
			ByteArrayEntity arrayEntity = new ByteArrayEntity(buffer);
			arrayEntity.setContentType("application/octet-stream");
			UploadVideoFragmentParam uploadVideoFragmentParam = (UploadVideoFragmentParam) jsonParamObjectBuilder(url, arrayEntity, UploadVideoFragmentParam.class, xNosToken);
			return uploadVideoFragmentParam;
		}
		return null;
	}
		
	
	/**
	* <p>Title: queryVideoID</p>
	* <p>Description: 上传完成根据对象名查询视频主ID</p>
	* @return queryVideoIDParam  查询视屏ID返回结果的封装类
	* @throws IOException
	 * @throws VcloudException 
	*/
	public QueryVideoIDorWatermarkIDParam queryVideoID() throws IOException, VcloudException{
		
		/* 接口 */
		//String url = "https://vcloud.163.com/app/vod/video/query";	
		String url = Config.getQueryVideoIDURL();		
		/* 设置请求的参数 */
		StringEntity params = new StringEntity(JSON.toJSONString(queryVideoIDorWatermarkIDModule),"UTF-8");	
		
		//logger.info(JSON.toJSONString(queryVideoIDorWatermarkIDModule));
		/* 得到Json数据 */
		QueryVideoIDorWatermarkIDParam queryVideoIDParam = (QueryVideoIDorWatermarkIDParam) jsonParamObjectBuilder(url, params, QueryVideoIDorWatermarkIDParam.class);		

		return queryVideoIDParam;
	}
	
	
	/**
	* <p>Title: getPartOffset</p>
	* <p>Description: 断点续传查询断点</p>
	* @return queryOffsetParam  断点续传查询断点返回结果的封装类
	* @throws IOException
	 * @throws VcloudException 
	*/
	public QueryOffsetParam getPartOffset() throws IOException, VcloudException{
		/* 接口 */
		String url = uploadHost + "/" + bucket + "/" + object + "?uploadContext&context=" + context + "&version=1.0";
		//logger.info("[getPartOffset] ************ " + url);
		/* 得到Json数据 */
		QueryOffsetParam queryOffsetParam = (QueryOffsetParam) jsonParamObjectBuilder(url, QueryOffsetParam.class, xNosToken);
		
		return queryOffsetParam;
		
	}
	
	
	/**
	 * 
	* <p>Title: setCallback</p>
	* <p>Description: 设置上传回调地址</p>
	* @return setCallbackParam  设置上传回调地址接口输出参数的封装类
	* @throws IOException
	* @throws VcloudException
	 */
	public SetCallbackParam setCallback() throws IOException, VcloudException{
		/* 接口 */
		String url = Config.getSetCallbackURL();
		/* 设置请求的参数 */
		StringEntity params = new StringEntity(JSON.toJSONString(setCallbackModule),"UTF-8");		
		/* 得到Json数据 */
		SetCallbackParam setCallbackParam = (SetCallbackParam) jsonParamObjectBuilder(url, params, SetCallbackParam.class);	
		
		return setCallbackParam;		
	}

	
	/**
	* <p>Title: jsonParamObjectBuilder</p>
	* <p>Description: 执行HttpPost请求 得到 json数据对应的参数封装类工具</p>
	* @param url            接口地址
	* @param params         请求的参数 
	* @param clazz          对应待返回的参数封装类的class
	* @return object        对应待返回的参数封装类
	* @throws IOException
	 * @throws VcloudException 
	*/
	private <T> T jsonParamObjectBuilder(String url, StringEntity params, Class <T> clazz) throws IOException, VcloudException{

		HttpClient httpClient = HttpClientBuilder.getHttpClient();
		HttpPost httpPost = HttpPostBuilder.getHttpPost(url);		
		
		// 设置请求的参数		
		httpPost.setEntity(params);		
		// 执行请求
		HttpResponse response = httpClient.execute(httpPost);
		String stringBody = EntityUtils.toString(response.getEntity(), "utf-8");		
//		logger.info("[UploadUtil] : json stringBody" + stringBody);

		// 得到Json数据
		T object = null;
		try {
			 object =  JSON.parseObject(stringBody, clazz);			
		} catch (Exception e) {
			logger.error("[UploadUtil] json parse exception : "	+ e + ",msg : " + e.getMessage());
			throw new VcloudException("[UploadUtil] json parse exception", e);			
		}		

		return object;		
	}
	
	
	/**
	* <p>Title: jsonParamObjectBuilder</p>
	* <p>Description: 执行HttpPost请求 得到 json数据对应的参数封装类 工具</p>
	* @param url                接口地址
	* @param arrayEntity        上传的分片数据
	* @param clazz              对应待返回的参数封装类的class
	* @param xNosToken          上传的token信息
	* @return object            对应待返回的参数封装类
	* @throws IOException
	 * @throws VcloudException 
	*/
	private <T> T jsonParamObjectBuilder(String url, ByteArrayEntity arrayEntity, Class <T> clazz, String xNosToken) throws IOException, VcloudException{

		HttpClient httpClient = HttpClientBuilder.getHttpClient();
		HttpPost httpPost = HttpPostBuilder.getHttpPost(url);		
		if(null != xNosToken){
			/* 亲，此处要添加这个报头哦 */
			httpPost.addHeader("x-nos-token", xNosToken);
		}
		
		// 设置请求的参数		
		httpPost.setEntity(arrayEntity);		
		// 执行请求
		HttpResponse response = httpClient.execute(httpPost);
		String stringBody = EntityUtils.toString(response.getEntity(), "utf-8");		
		//logger.info("[UploadUtil] : json stringBody" + stringBody);

		// 得到Json数据
		T object = null;
		try {
			 object =  JSON.parseObject(stringBody, clazz);			
		} catch (Exception e) {
			logger.error("[UploadUtil] json parse exception : "	+ e + ",msg : " + e.getMessage());
			throw new VcloudException("[UploadUtil] json parse exception", e);	
		}

		return object;
		
	}
	
	
	/**
	 * <p>Title: jsonParamObjectBuilder</p>
	 * <p>Description: 执行HttpGet请求 得到 json数据对应的参数封装类 工具</p>
	 * @param url              接口地址
	 * @param clazz            对应待返回的参数封装类的class 
	 * @param xNosToken        上传的token信息
	 * @return object          对应待返回的参数封装类
	 * @throws IOException
	 * @throws VcloudException 
	 */
	private <T> T jsonParamObjectBuilder(String url, Class <T> clazz, String xNosToken) throws IOException, VcloudException{

		HttpClient httpClient = HttpClientBuilder.getHttpClient();
		HttpGet httpGet = HttpGetBuilder.getHttpGet(url);	
		
			
		if(null != xNosToken){
			/* 亲，此处要添加这个报头哦 */
			httpGet.addHeader("x-nos-token", xNosToken);
		}
		// 执行请求
		HttpResponse response = httpClient.execute(httpGet);
		String stringBody = EntityUtils.toString(response.getEntity(), "utf-8");		
		//logger.info("[UploadUtil] : json stringBody" + stringBody);

		// 得到Json数据
		T object = null;
		try {
			 object =  JSON.parseObject(stringBody, clazz);			
		} catch (Exception e) {
			logger.error("[UploadUtil] json parse exception : "	+ e + ",msg : " + e.getMessage());
			throw new VcloudException("[UploadUtil] json parse exception", e);	
		}

		return object;
		
	}
	
}
