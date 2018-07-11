package com.huaihua.www.dubbo.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.meyacom.ruleapp.ext.service.Result;
import com.meyacom.ruleapp.ext.service.RuleService;

public class DubboConnection {
	
	public Map<String,String> connection(String serviceId,Map<String,Object> request) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new
				String[] {"consumer.xml"});
		context.registerShutdownHook();
		context.start();
		RuleService service = (RuleService) context.getBean("uWService");
		Map<String,String> result=new HashMap<String,String>();
		for(Entry<String, Object> keyValue:request.entrySet()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("bom", keyValue.getValue());
			Result res = service.execute(serviceId, map);
			String resJson=JSON.toJSONString(res);
			result.put(keyValue.getKey(), resJson);
			System.out.println(keyValue.getKey()+"返回 : "+resJson);
		}
		//context.close();
		return result;
	}
}
