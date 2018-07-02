package com.huaihua.www.util;

public class StringUtil {

	public static String addHeadEnd(String str) {
		return "\""+str+"\"";
	}
	
	public static String addComma(String str) {
		return str+",";
	}
	
	
	public static int getHegiht(String str) {
		if(!str.contains(".")) {
			return 1;
		}
		String[] strs=str.split("\\.");
		return strs.length;
	}
}
