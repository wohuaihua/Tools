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
	
	/**
	 * 获取一个字符串数组的前几位：additional.second.sex
	 * 3:additional.second.sex,
	 * 2:additional.second,
	 * 1:additional
	 * 
	 * @param arr	字符串数组
	 * @param i		获取前几位的数字
	 * @return
	 */
	public static String[] before(String[] arr,int i) {
		String[] newArr=new String[i+1];
		for(int t=0;t<newArr.length;t++) {
			if(t<=i) {
				newArr[t]=arr[t];
			}
		}
		return newArr;
	}
	
	/**
	 * 辅助方法，用于输出字符串数组
	 * @param  arr		字符串数组
	 * @return String	字符串数组通过','拼接成的字符串 	
	 */
	public static String sayArr(String[] arr) {
		String str="";
		for(int t =0;t < arr.length ;t++) {
			str=str+arr[t]+",";
		}
		return str;
	}
	
	/**
	 * 将字符串数组变成一个字符串，每个元素之间通过regix相连
	 * @param arr	字符串
	 * @param regix 相连符
	 * @return
	 */
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
		System.out.println(StringUtil.changePath(StringUtil.before(str.split("\\."), 1),"."));
	}
}
