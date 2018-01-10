package cn.msosm.shop.model;

import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.msosm.shop.constants.Constants;

public class ResultModel {
	private static final long serialVersionUID = -3071264863352903578L;

	private static final Logger logger = Logger.getLogger(ResultModel.class);
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// 响应业务状态码
	private Integer code;
	// 响应消息
	private String message;
	// 响应数据
	private Object data; 

	public ResultModel() {
	}

	public ResultModel(Object data) {
		this.code = Constants.RESULT_CODE_SUCCESS;
		this.message = Constants.RESULT_MESSAGE_SUCCESS;
		this.data = data;
	}

	public ResultModel(Integer code, String message, Object data) {
		if(data==null) {
			this.data="";
		}else {
			this.data = data;
		}
		this.code = code;
		this.message = message;
		
	}

	public Integer getcode() {
		return code;
	}

	public void setcode(Integer code) {
		this.code = code;
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

 

 

	/**
	 * 将json结果集转化为ResultModel对象
	 * 
	 * @param jsonData
	 * @param clazz
	 * @return
	 */
	public static ResultModel formatToPojo(String jsonData, Class<?> clazz) {
		Object obj = null;
		try {
			if (clazz == null) {
				return MAPPER.readValue(jsonData, ResultModel.class);
			}
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get(Constants.RESULT_DATA_KEY);
			if (clazz != null) {
				if (data.isObject()) {
					obj = (String) MAPPER.readValue(data.traverse(), clazz);
				} else if (data.isTextual()) {
					obj = (String) MAPPER.readValue(data.asText(), clazz);
				}
			}
			return build(jsonNode.get(Constants.RESULT_CODE_KEY).intValue(),
					jsonNode.get(Constants.RESULT_MESSAGE_KEY).asText(), obj);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * 无Object对象转化
	 * 
	 * @param jsonData
	 * @return
	 */
	public static ResultModel format(String jsonData) {
		try {
			return MAPPER.readValue(jsonData, ResultModel.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * 集合对象转化
	 * 
	 * @param jsonData
	 * @param clazz
	 *            集合类型
	 * @return
	 */
	public static ResultModel formatToList(String jsonData, Class<?> clazz) {
		String obj = "";
		try {
			JsonNode jsonNode = MAPPER.readTree(jsonData);
			JsonNode data = jsonNode.get(Constants.RESULT_DATA_KEY);
			if (data.isArray() && data.size() > 0) {
				obj = MAPPER.readValue(data.traverse(),
						MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
			}
			return build(jsonNode.get(Constants.RESULT_CODE_KEY).intValue(),
					jsonNode.get(Constants.RESULT_MESSAGE_KEY).asText(), obj);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public static ResultModel build(Integer code, String message, Object obj) {
		return new ResultModel(code, message, obj);
	}

	public static ResultModel build(Integer code, String message) {
		return new ResultModel(code, message, "");
	}

	public static ResultModel ok(String data) {
		return new ResultModel(data);
	}

	public static ResultModel ok() {
		return new ResultModel(null);
	}
}
