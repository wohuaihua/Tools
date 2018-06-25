package com.huaihua.sun.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huaihua.www.action.ConnectResAction;


public class Consumer {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new
				String[] {"consumer.xml"});
		context.start();
		ConnectResAction demoService = (ConnectResAction)context.getBean("resConnection"); 
		String str="";
		String returnStr = demoService.executeRule("", "");
	}


}
