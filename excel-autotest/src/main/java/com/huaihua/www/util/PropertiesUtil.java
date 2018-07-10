package com.huaihua.www.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesUtil {

	public static String getProperty(String name) {
		Properties properties = new Properties();
	    InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties");
	    try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    String ignore=properties.getProperty(name);
	    return ignore;
	}
	
	
}
