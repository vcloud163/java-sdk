package com.netease.vcloud.util;
import java.security.MessageDigest;

/**
 * 
 * <p>Title: CheckSumBuilder</p>
 * <p>Description: 构造 CheckSum 的工具类 </p>
 * <p>Company: com.netease.vcloud</p>
 * @date       2016-6-21
 */
public class CheckSumBuilder {
	/**
	 * 
	 * <p>Title: getCheckSum</p>
	 * <p>Description: 将appSecret、 nonce、 curTime 按照SHA-1加密算法生成 checkSum</p>
	 * @param appSecret  开发者平台分配的appkey
	 * @param nonce      随机数（随机数，最大长度128个字符）
	 * @param curTime    当前UTC时间戳，从1970年1月1日0点0分0秒开始到现在的秒数
	 * @return 加密生成的checkSum
	 */
    public static String getCheckSum(String appSecret, String nonce, String curTime) {
        return encode("sha1", appSecret + nonce + curTime);
    }
    /**
     * 
     * <p>Title: encode</p>
     * <p>Description: 将数据按照指定的加密算法加密</p>
     * @param algorithm    加密的算法
     * @param value        待加密的数据  
     * @return 加密之后的数据
     */
    private static String encode(String algorithm, String value) {
        if (value == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(value.getBytes());
            return getFormattedText(messageDigest.digest());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 
     * <p>Title: getFormattedText</p>
     * <p>Description: 从摘要中取未加工的字节并将其格式化</p>
     * @param bytes    从摘要中取得的未加工的字节
     * @return 格式化后的字节
     */
    private static String getFormattedText(byte[] bytes) {
        int len = bytes.length;
        StringBuilder buf = new StringBuilder(len * 2);
        for (int j = 0; j < len; j++) {
            buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
            buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
        }
        return buf.toString();
    }
    /**
     * 十六进制数据的char数组
     */
    private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        
}