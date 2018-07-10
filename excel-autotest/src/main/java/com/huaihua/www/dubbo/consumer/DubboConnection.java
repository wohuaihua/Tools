package com.huaihua.www.dubbo.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboConnection {
	
	public Map<String,String> connection(String serviceId,Map<String,Object> request) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new
				String[] {"consumer.xml"});
		context.start();
		Map<String,String> result=new HashMap<String,String>();
		for(Entry<String, Object> keyValue:request.entrySet()) {
			
		}
		context.close();
		return result;
	}
}
