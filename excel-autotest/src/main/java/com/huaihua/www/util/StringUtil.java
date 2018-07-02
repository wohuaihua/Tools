package com.huaihua.www.util;

import java.util.ArrayList;
import java.util.List;

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
	
	public static String[] remove(String[] arr,String i) {
		if(arr==null) {
			return null;
		}
		List<String> strings=new ArrayList<String>();
		for(int t =0;t < arr.length ;t++) {
			if(arr[t]!=i) {
				strings.add(arr[t]);
			}
		}
		String[] newArr=new String[strings.size()];
		for(int t =0;t < newArr.length ;t++) {
			newArr[t]=strings.get(t);
		}
		
		return newArr;
	}
	
	public static String[] before(String[] arr,int i) {
		String[] newArr=new String[i];
		for(int t=0;t<newArr.length;t++) {
			if(t<i) {
				newArr[t]=arr[t];
			}
		}
		return newArr;
	}
	
	public static String sayArr(String[] arr) {
		String str="";
		for(int t =0;t < arr.length ;t++) {
			str=str+arr[t]+",";
		}
		return str;
	}
	
	public static String changePath(String[] arr,String regix) {
		String str="";
		for(int t =0;t < arr.length ;t++) {
			if(t!=arr.length-1) {
				str=str+arr[t]+regix;
			}else {
				str=str+arr[t];
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String str="additional.second.sex";
		System.out.println(StringUtil.sayArr(StringUtil.before(str.split("\\."), 2)));
	}
}
