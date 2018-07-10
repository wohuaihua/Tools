package com.huaihua.www.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
public static void main(String[] args){
//    String str = "\"second\":{b56a2e92933e42dfb2194d667c3d1c67},\"girl2\":\"刘朱\",\"first\":11,\"third\":{29484c7863434e4e827e1fabbff9b0c3}";
//    Pattern p=Pattern.compile("\\{([^\\}]+)\\}");
//    Matcher m=p.matcher(str);
//    while(m.find()){
//        System.out.println(m.group(1));
//    }
     
	

		String url = "\"additional\":{\"third\":{c582fb18521745109825df5028ad91d2},\"girl2\":\"刘朱\",\"first\":11,\"second\":{70f681aede52453c8159c9f346130149}}\r\n" + 
				"";
		//String reg = "(?<=\\{)[0-9a-f]{32}(?=\\})";
		String reg = "(?<=\\{)[0-9a-f]{32}(?=\\})";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(url); 
		while(m.find()){
	       // System.out.println(m.group());
	    }
		
		String str="#$ignore.expected";
		p=Pattern.compile("\\#\\$ignore.excepted");
		m=p.matcher(str); 
		while(m.find()){
	        System.out.println(m.group());
	    }
}
}