package com.huaihua.www.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.huaihua.www.Book;
import com.huaihua.www.Child;
import com.huaihua.www.Person;
import com.huaihua.www.enums.JsonElement;

public class Test {
	
	public static void main(String[] args) {
		Person person=new Person();
		person.setName("huaihua");
		person.setAge(18.0);
		person.setTime(new Date());
		List<String> strs=new ArrayList<String>();
		strs.add("111");
		strs.add("222");
		strs.add("333");
		person.setFamilyNames(strs);
		
		List<Child> childs=new ArrayList<Child>();
		childs.add(new Child("男"));
		childs.add(new Child("女"));
		person.setChilds(childs);
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("girl2", "ljy");
		map.put("girl2", "zjy");
		map.put("first", new BigDecimal(1.2));
		map.put("second", new Child("女1"));
		person.setAddtional(map);
		person.setIsgood(true);
		person.setBook(new Book("huaihua"));
		System.out.println(JSON.toJSONString(person));
		
	}
}
