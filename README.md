
# Java-SDK 说明

## 1 简介

Java-SDK 是用于服务器端点播上传的软件开发工具包，提供简单、便捷的方法，方便用户开发上传视频或图片文件的功能。

## 2 功能特性

- 文件上传
- 获取进度
- 断点续传
- 查询视频
- 设置回调

## 3 开发准备

### 3.1 下载地址

视频云点播上传的 java sdk 的下载地址：https://github.com/vcloud/java-sdk.git

### 3.2 环境准备

- 推荐使用1.7及以上版本的 jdk 开发；
- 通过管理控制台->账户信息获取AppKey和AppSecret；
- 下载 java sdk，如果安装了git命令行，执行 git clone https://github.com/vcloud/java-sdk.git或者直接在github下载zip包；
- 参照 API 说明和 sdk 中提供的 demo，开发代码。

### 3.3 sdk 依赖包

- httpclient5-cache（5.0-alpha1）
- fastjson（1.2.7）
- httpmime（4.5.2）
- fluent-h（4.5.2）
- commons-logging（1.1.1）

### 3.4 https 支持

默认使用https协议，如需修改为http协议，请在sdk包中Config目录修改。

## 4 使用说明

### 4.1 初始化

接入视频云点播，需要拥有一对有效的 AppKey 和 AppSecret 进行签名认证，可通过如下步骤获得：

- 开通视频云点播服务；
- 登陆视频云开发者平台，通过管理控制台->账户信息获取 AppKey 和 AppSecret。

在获取到 AppKey 和 AppSecret 之后，可按照如下方式进行初始化：

	Credentials credentials = new BasicCredentials(appKey, appSecret);
	VcloudClient vclient = new VcloudClient(credentials);

### 4.2 文件上传

视频云点播在全国各地覆盖大量上传节点，会选择适合用户的最优节点进行文件上传，并根据用户传入的参数做不同处理，具体详见点播服务端 API 文档。

以下是使用示例：

	Credentials credentials = new BasicCredentials(appKey, appSecret);
	VcloudClient vclient = new VcloudClient(credentials);
	
	/*请输入上传文件路径*/
	String filePath = "e:\\你好.mp4";
	
	Map<String, Object> initParamMap = new HashMap<String, Object>();
	/*输入上传文件的相关信息 */
	/* 上传文件的原始名称（包含后缀名） 此参数必填*/
	initParamMap.put("originFileName", FileUtil.getFileName(filePath));
	
	QueryVideoIDorWatermarkIDParam queryVideoIDParam = vclient.uploadVideo(filePath, initParamMap);

**注：具体使用示例详见 sdk 包中 upload/demo 目录下的 UploadVideoDemo 类文件。**

### 4.3 查询进度

视频云点播文件上传采用分片处理，可通过以下方法查询上传完成的文件进度。

以下是使用示例：

	in = FileUtil.getFileInputStream(filePath);
	Long fileSize = FileUtil.getFileLength(filePath);
	
	/*上传文件剩余大小*/
	Long remainderSize = fileSize;
	/*分片上传视频*/
	while (remainderSize > 0) {
		UploadVideoFragmentParam uploadVideoParam = vclient.uploadVideoFragment(initUploadVideoParam, 
			getUploadHostParam, offset, context, in, remainderSize);
		context = uploadVideoParam.getContext();
	
		QueryOffsetParam queryOffsetParam = vclient.getPartOffset(getUploadHostParam.getUpload().get(0), 
			initUploadVideoParam.getRet().getBucket(), initUploadVideoParam.getRet().getObject(), context, 
			initUploadVideoParam.getRet().getxNosToken());
	
		// 使用断点续传查询offset，文件全部上传之后，再通过getPartOffset()是无法查询到offset的，即无法通过 remainderSize  = FileUtil.getFileLength(filePath) - offset 将remainderSize设置为0
	
		offset = queryOffsetParam.getOffset();
		if (null != offset) {
			remainderSize = fileSize - offset;
		} else {
			remainderSize = 0L;
		}
	}

**注：具体使用示例详见 sdk 包中 upload/demo 目录下的 Upload_RecoderDemo 类文件。**

### 4.4 断点续传

在上传文件中，视频云点播通过唯一标识 context 标识正在上传的文件，可通过此标识获取到已经上传视频云的文件字节数。通过此方法可实现文件的断点续传。

为防止服务中止造成文件上传信息丢失，可通过在本地存储文件信息来记录断点信息，当服务重启启动，可根据文件继续上传文件。临时文件会在上传完成后删除记录。

以下是使用示例：

	Credentials credentials = new BasicCredentials(appKey, appSecret);
	VcloudClient vclient = new VcloudClient(credentials);
	
	/*请输入上传文件路径*/
	String filePath = "e:\\3.mp4";
	
	Map<String, Object> initParamMap = new HashMap<String, Object>();
	/*输入上传文件的相关信息 */
	/* 上传文件的原始名称（包含后缀名） 此参数必填*/
	initParamMap.put("originFileName", FileUtil.getFileName(filePath));
	/* 本地用于存放上传进度相关信息的文件 */
	String recorderFilePath = "e:\\1\\2.docx";
		
	Recorder recorder = new UploadRecorder(recorderFilePath);

	vclient.uploadVideoWithRecorder(filePath, initParamMap, recorder);

**注：具体使用示例详见 sdk 包中 upload/demo 目录下的 Upload_RecoderDemo 类文件。**

### 4.5 查询视频

视频上传成功后，可通过主动查询的方式获取到视频唯一标识，支持批量查询。

以下是使用示例：

	Credentials credentials = new BasicCredentials(appKey, appSecret);
	VcloudClient vclient = new VcloudClient(credentials);
	
	/* 请输入 查询文件的对象名,参数必填*/
	List<String> objectNamesList = new ArrayList<String>();
	objectNamesList.add("33cf71b1-86ac-4555-a071-d70db07b9685.mp4");
	objectNamesList.add("14e36114-13f8-48f4-b7a2-90b1b76c531c.mp4");
	
	/*上传完成后查询视频主ID返回结果的封装类*/
	QueryVideoIDorWatermarkIDParam queryVideoIDParam = vclient.queryVideoID(objectNamesList);

**注：具体使用示例详见 sdk 包中 upload/demo 目录下的 QueryVideoIDDemo 类文件。**

### 4.6 设置回调

如果设置回调，视频上传成功后会发送相关视频信息给回调接口。

以下是使用示例：

	Credentials credentials = new BasicCredentials(appKey, appSecret);
	VcloudClient vclient = new VcloudClient(credentials);
	
	/* 上传成功后回调客户端的URL地址    参数必填*/
	String callbackUrl = "http://127.0.0.1/client/callback";
			
	/*设置上传回调地址接口输出参数的封装类*/
	SetCallbackParam setCallbackParam = vclient.setCallback(callbackUrl); 

**注：具体使用示例详见 sdk 包中 upload/demo 目录下的 SetCallbackDemo 类文件。**

## 5 版本更新记录

**v1.0.0**

1. Java SDK 的初始版本，提供点播上传的基本功能。包括：文件上传、获取进度、断点续传、查询视频、设置回调。

