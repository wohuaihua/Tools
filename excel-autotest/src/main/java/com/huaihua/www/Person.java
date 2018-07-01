package com.huaihua.www;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Person {
	
	private String name;
	
	private Double age;
	
	private List<String> familyNames;
	
	private Map<String,Object> addtional;
	
	private Date time;
	
	private List<Child> childs;
	
	private boolean isgood;
	
	private Book book;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public List<String> getFamilyNames() {
		return familyNames;
	}

	public void setFamilyNames(List<String> familyNames) {
		this.familyNames = familyNames;
	}

	public Map<String, Object> getAddtional() {
		return addtional;
	}

	public void setAddtional(Map<String, Object> addtional) {
		this.addtional = addtional;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}


	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Person() {
	}

	public boolean isIsgood() {
		return isgood;
	}

	public void setIsgood(boolean isgood) {
		this.isgood = isgood;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
}
