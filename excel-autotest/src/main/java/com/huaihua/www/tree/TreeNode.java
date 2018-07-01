package com.huaihua.www.tree;

public class TreeNode {
	
	private String data;
	
	private TreeNode firstChild;
	
	private TreeNode nextSibiling;

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
