package cn.msosm.shop.utils;

import java.util.UUID;

/**
 * 
 * @ClassName: UUIDUtils
 *
 * @Description: UUID 工具类
 *
 * @author sunp
 *
 * @date 2017年9月22日 下午3:12:51
 *
 */
public class UUIDUtils {

	public static String getUUid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
