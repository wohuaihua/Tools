package com.huaihua.www.util;

public class JsonObjUtil {
	
	
	/**
	 * 获取一个字符串代表的对象的深度
	 * @param str
	 * @return
	 */
	public static int getHeightObj(String str) {
		String[] details=str.split(".");
		return details.length-1;
	}
	
	//person.childs.name
	//  深度为2
	//	person:{		0
	//		childs:{	1
	//			name:	2
	//		}
	//	}
	
	public static String expressionToObjJson(String str) {
		String[] details=str.split(".");
		StringBuffer sb=new StringBuffer();
		sb.append(StringUtil.addHeadEnd(details[0]));
		sb.append(":");
		sb.append("{");
		int height=JsonObjUtil.getHeightObj(str);
		for(int i=0;i<height;i++) {
			
		}
		sb.append("}");
		/**
		 * TODO 这个方法没有写完
		 */
		return "";
	}
}
