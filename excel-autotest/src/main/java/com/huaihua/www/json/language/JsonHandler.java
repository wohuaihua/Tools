package com.huaihua.www.json.language;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.huaihua.www.enums.JsonElement;
import com.huaihua.www.tree.TreeNode;
import com.huaihua.www.util.StringUtil;
import com.huaihua.www.util.EnumsUtil;

public class JsonHandler {
	
	
	public static void main(String[] args) {
	//字符串
	 String stringToJsonKey="name:\"\"";
	 String stringToJsonValue="huaihua";
	 if(stringToJsonKey.split(":")[1].equals("\"\"")) {
		 String ret=JsonHandler.stringToJson(stringToJsonKey.split(":")[0], stringToJsonValue);
		 ret=StringUtil.addComma(ret);
		 System.out.println("1:"+"\n"+ret);
	 }
	 
	 //数字
	 String numToJsonKey="age:num";
	 String numToJsonValue="18.0";
	 if(numToJsonKey.split(":")[1].equals("num")) {
		 String ret=JsonHandler.numToJson(stringToJsonKey.split(":")[0], numToJsonValue);
		 ret=StringUtil.addComma(ret);
		 System.out.println("2:"+"\n"+ret);
	 }
	 
	 //时间
	 String dateToJsonKey="time:time/yyyy-mm-dd hh:mm:ss";
	 String dateToJsonValue="2018-06-29 12:30:00";
	 if(dateToJsonKey.split(":")[1].startsWith("time/")) {
		 String ret=JsonHandler.dateToJson(dateToJsonKey, dateToJsonValue);
		 ret=StringUtil.addComma(ret);
		 System.out.println("3:"+"\n"+ret);
	 }
	 
	 //boolean
	 String booleanToJsonKey="isgood:boolean";
	 String booleanToJsonValue="true";
	 if(booleanToJsonKey.split(":")[1].equals("boolean")) {
		 String ret=JsonHandler.booleanToJson(booleanToJsonKey.split(":")[0], booleanToJsonValue);
		 ret=StringUtil.addComma(ret);
		 System.out.println("4:"+"\n"+ret); 
	 }
	 
	 //对象
	 String ObjectToJsonKey="isgood:boolean";
	 String ObjectToJsonValue="true";
	 if(booleanToJsonKey.split(":")[1].startsWith("{}")&&
			 booleanToJsonKey.split(":")[1].startsWith("{}map")) {
		 String ret=JsonHandler.booleanToJson(ObjectToJsonKey, ObjectToJsonValue);
		 ret=StringUtil.addComma(ret);
		 System.out.println("4:"+"\n"+ret); 
	 }
	}
	
	/**
	 * 字符串转为json
	 * @param key
	 * @param value
	 * @return
	 */
	public static String stringToJson(String key,String value) {
		return StringUtil.addHeadEnd(key)+":"+StringUtil.addHeadEnd(value);
	}
	
	/**
	 * 数字转为json,非时间
	 * @param key
	 * @param value
	 * @return
	 */
	public static String numToJson(String key,String value) {
		return StringUtil.addHeadEnd(key)+":"+value;
	}
	
	public static String dateToJson(String key,String value) {
		String start=key.split(":")[0];
		String end=key.split(":")[1];
		String format=end.split("/")[1];
		String ret="";
		Date date=null;
		try {
			date=new SimpleDateFormat(format).parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
			return ret;
		}
		long longs=date.getTime();
		return StringUtil.addHeadEnd(start)+":"+longs;
	}
	
	public static String booleanToJson(String key,String value) {
		return JsonHandler.numToJson(key, value);
	}
	
	
	
	//---------------------------------------------------------------------------
	
}
