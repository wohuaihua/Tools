package com.huaihua.www.linked;

/**
 * 双向链表
 * @author 76494
 *
 */
public class DLLNode {
	
	private int data;
	
	private DLLNode next;
	
	private DLLNode previous;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	public DLLNode getPrevious() {
		return previous;
	}

	public void setPrevious(DLLNode previous) {
		this.previous = previous;
	}
}
