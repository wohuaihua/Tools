package com.huaihua.www.linked;

/**
 * 循环链表
 * @author 76494
 *
 */
public class CLLNode {
	
	private int data;
	
	private CLLNode next;
	
	private CLLNode previous;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CLLNode getNext() {
		return next;
	}

	public void setNext(CLLNode next) {
		this.next = next;
	}

	public CLLNode getPrevious() {
		return previous;
	}

	public void setPrevious(CLLNode previous) {
		this.previous = previous;
	}
}
