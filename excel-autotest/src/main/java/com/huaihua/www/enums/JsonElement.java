package com.huaihua.www.enums;

public enum JsonElement {
	STRING("\"\""),
	NUMBER("num"),
	TIME("time"),
	OBJECT("{}"),
	BOOLEAN("boolean"),
	MAP("map"),
	ARRAY("[]"),
	NULL("null");
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private JsonElement(String type) {
		this.type = type;
	}
	
	public static void main(String[] args) {
		System.out.println(JsonElement.NULL.getType());
	}
}
