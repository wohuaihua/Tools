package com.huaihua.www.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huaihua.www.action.ConnectResAction;
import com.meyacom.bom.BaseBom;
import com.meyacom.bom.PolicyBom;
import com.meyacom.bom.util.JsonUtil;
import com.meyacom.result.Result;

import cn.com.huaihua.www.Person;

public class Consumer {
	
	 protected static ObjectMapper jsonMapper = new ObjectMapper();
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new
		String[] {"consumer.xml"});
		context.start();
		ConnectResAction demoService = (ConnectResAction)context.getBean("resConnection"); 
		
		//JSONObject json=(JSONObject)JSONObject.parse(Consumer.readFileByLines("D:\\WorkProject\\anxin_car_policy\\jianxin_dubbo_intf_00\\powerTest\\src\\main\\java\\1.txt"));
		//Person policy=json.toJavaObject(Person.class);
		//Person person=new Person();
		
		PolicyBom bom=new PolicyBom();
		BaseBom base=new BaseBom();
		base.setCAppNo("12345678");
		bom.setBaseBom(base);
		JsonUtil.BomToJson(bom);
		
		String returnStr = demoService.executeRule("", JsonUtil.BomToJson(bom));
		System.out.println( returnStr ); 
		Result result=JsonUtil.JsonToResult(returnStr);
		System.out.println(result);
	}
	
	
	public static String readFileByLines(String fileName) {
		StringBuffer requestXML = new StringBuffer();
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			while ((tempString = reader.readLine()) != null) {
				requestXML.append(tempString).append("\r\n");
				line++;
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e1) {
				}
			}
		}
		return requestXML.toString();
	}
}
