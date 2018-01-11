package cn.msosm.shop.utils;

import java.io.UnsupportedEncodingException;

/**
 * Created by sunp on 2017/5/4.
 */
public class UrlUtil {
	private final static String ENCODE = "UTF-8";

	/**
	 * URL 解码
	 *
	 * @return String
	 * @author lifq
	 * @date 2015-3-17 下午04:09:51
	 */
	public static String getURLDecoderString(String str) {
		String result = "";
		if (null == str) {
			return "";
		}
		try {
			result = java.net.URLDecoder.decode(str, ENCODE);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * URL 转码
	 *
	 * @return String
	 * @author lifq
	 * @date 2015-3-17 下午04:10:28
	 */
	public static String getURLEncoderString(String str) {
		String result = "";
		if (null == str) {
			return "";
		}
		try {
			result = java.net.URLEncoder.encode(str, ENCODE);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 *
	 * @return void
	 * @author lifq
	 * @date 2015-3-17 下午04:09:16
	 */
	public static void main(String[] args) {
		String str = "http://www.oschina.net/search?scope=bbs&q=C语言";
		System.out.println(getURLEncoderString(str));
		System.out.println(getURLDecoderString(str));

	}
}
