package com.meyacom.bom.util;


import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.meyacom.bom.PolicyBom;
import com.meyacom.result.Result;

/**
 * 此类用于核心传送报文，将对象转化为JSON的工具类
 * @author 76494
 *
 */
public class JsonUtil {
	
	protected static ObjectMapper jsonMapper = new ObjectMapper();
	
	/**
	 * 将请求对象转为json
	 * @param bom
	 * @return
	 * @throws Exception
	 */
	public static String BomToJson(PolicyBom bom) throws Exception{
		return jsonMapper.writerWithType(
				new TypeReference<PolicyBom>() {
				}).writeValueAsString(bom);
	}
	
	/**
	 * 将返回json转为结果对象
	 * @param json
	 * @return
	 * @throws Exception
	 */
	public static Result JsonToResult(String json) throws Exception {
		return jsonMapper.readValue(json, Result.class);
	}
}
