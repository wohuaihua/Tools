package com.huaihua.www.linked;

/**
 * 单向链表
 * @author 76494
 *
 */
public class ListNode {
	
	private int data;
	
	//下一个节点的指针
	private ListNode nextNode;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode nextNode) {
		this.nextNode = nextNode;
	}
}
