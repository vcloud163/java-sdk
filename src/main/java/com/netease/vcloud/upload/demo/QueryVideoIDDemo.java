package com.netease.vcloud.upload.demo;

import com.netease.vcloud.auth.BasicCredentials;
import com.netease.vcloud.auth.Credentials;
import com.netease.vcloud.client.VcloudClient;
import com.netease.vcloud.upload.param.QueryVideoIDorWatermarkIDParam;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: QueryVideoIDDemo</p>
 * <p>Description: 上传完成后查询视频主ID的Demo</p>
 * <p>Company: com.netease.vcloud</p>
 *
 * @date 2016-6-21
 */
public class QueryVideoIDDemo {


    /**
     * 日志实例
     */
    public static final Logger logger = Logger.getLogger(QueryVideoIDDemo.class);

    public static void main(String[] args) {

		/* 输入个人信息 */
        /* 开发者平台分配的appkey 和 appSecret */
        String appKey = "";
        String appSecret = "";

        Credentials credentials;
        credentials = new BasicCredentials(appKey, appSecret);
        VcloudClient vclient = new VcloudClient(credentials);

		/* 请输入 查询文件的对象名     参数必填*/
        List<String> objectNamesList = new ArrayList<String>();
        objectNamesList.add("301631cf-98f0-4920-affd-79309408fd5f.flv");
        //objectNamesList.add("14e36114-13f8-48f4-b7a2-90b1b76c531c.mp4");

        try {
			/*上传完成后查询视频主ID返回结果的封装类*/
            QueryVideoIDorWatermarkIDParam queryVideoIDParam = vclient.queryVideoID(objectNamesList);

            if (queryVideoIDParam.getCode() == 200) {
                logger.info("[InitUploadVideoDemo] query videoID successfully. " + queryVideoIDParam.getRet().getList().toString());
            } else {
                logger.info("[InitUploadVideoDemo] fail to query videoID. " + "return code " + queryVideoIDParam.getCode() + " return message " + queryVideoIDParam.getMsg());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
