package com.huaihua.www.tree;

public class TreeNode {
	
	/**
	 * 路径结构
	 */
	private String data;
	
	private TreeNode firstChild;
	
	private TreeNode nextSibiling;
	
	private String value;
	
	/**
	 * 数据类型
	 */
	private String type;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public TreeNode getFirstChild() {
		return firstChild;
	}

	public void setFirstChild(TreeNode firstChild) {
		this.firstChild = firstChild;
	}

	public TreeNode getNextSibiling() {
		return nextSibiling;
	}

	public void setNextSibiling(TreeNode nextSibiling) {
		this.nextSibiling = nextSibiling;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean hasChild() {
		if(firstChild==null) {
			return false;
		}
		return true;
	}
	
	public boolean hasNextSibiling() {
		if(nextSibiling==null) {
			return false;
		}
		return true;
	}
	
	
}
