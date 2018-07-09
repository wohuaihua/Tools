package com.huaihua.www.util;

import com.huaihua.www.enums.JsonElement;

public class EnumsUtil {
	
	/**
	 * 将exp表达是的第一个匹配到的枚举所代表的字符串去掉
	 * @param exp
	 * @param jsonElement
	 * @return
	 */
	public static String reomveHead(String exp,JsonElement jsonElement) {
		if(jsonElement==JsonElement.OBJECT) {
			exp=exp.replaceFirst("\\"+jsonElement.getType(), "");
			return exp;
		}
		if(jsonElement==JsonElement.ARRAY) {
			exp=exp.replaceFirst("\\"+jsonElement.getType(), "");
			String str=EnumsUtil.findJsonElement(exp).getType();
			if(str.startsWith("{}")) {
				exp=exp.replaceFirst("\\"+str, "");
			}else {
				exp=exp.replaceFirst(str, "");
			}
			return exp;
		}
		if(jsonElement==JsonElement.TIME) {
			exp=exp.replaceFirst(jsonElement.getType(), "");
			exp="";
			return exp;
		}
		exp=exp.replaceFirst(jsonElement.getType(), "");
		return exp;
	}
	
	/**
	 * 查找字符串先匹配的什么，如果匹配到枚举
	 * @param str
	 * @return
	 */
	public static JsonElement findJsonElement(String str) {
		if(str.startsWith(JsonElement.ARRAY.getType())) {
			return JsonElement.ARRAY;
		}
		if(str.startsWith(JsonElement.BOOLEAN.getType())) {
			return JsonElement.BOOLEAN;
		}
		if(str.startsWith(JsonElement.MAP.getType())) {
			return JsonElement.MAP;
		}
		if(str.startsWith(JsonElement.NUMBER.getType())) {
			return JsonElement.NUMBER;
		}
		if(str.startsWith(JsonElement.OBJECT.getType())) {
			return JsonElement.OBJECT;
		}
		if(str.startsWith(JsonElement.STRING.getType())) {
			return JsonElement.STRING;
		}
		if(str.startsWith(JsonElement.TIME.getType())) {
			return JsonElement.TIME;
		}
		return JsonElement.NULL;
	}
	
	public static String returnSuitType(JsonElement element,String str) {
		if(JsonElement.TIME==element) {
			return str;
		}
		if(JsonElement.ARRAY==element) {
			str=EnumsUtil.reomveHead(str, element);
			JsonElement jsonElement= EnumsUtil.findJsonElement(str);
			return JsonElement.ARRAY.getType()+jsonElement.getType();
		}
		return element.getType();
	}
}
