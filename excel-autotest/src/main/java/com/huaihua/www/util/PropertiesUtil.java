package com.huaihua.www.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;


public class PropertiesUtil {

	public static String getProperty(String name) {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties"), "UTF-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	    String ignore=properties.getProperty(name);
	    return ignore;
	}
	
	
}
