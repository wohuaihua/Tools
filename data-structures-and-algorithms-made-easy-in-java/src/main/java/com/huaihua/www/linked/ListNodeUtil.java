package com.huaihua.www.linked;

public class ListNodeUtil {
	
	
	/*
	 * 单向链表
	 */
	
	/**
	 * 获取链表的长度
	 * 时间复杂度O(n),用于扫描长度为n的链表
	 * 空间复杂度O(1),用于创建临时变量
	 * @param headNode
	 * @return
	 */
	public static int listLinkedListLength(ListNode headNode) {
		int length=0;
		ListNode currentNode=headNode;
		while(currentNode!=null) {
			length++;
			currentNode=currentNode.getNextNode();
		}
		return length;
	}
	
	/**
	 * 在单向链表的中间插入节点
	 * 时间复杂度O(n)
	 * 空间复杂度为O(1),用于创建临时变量
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return
	 */
	public static ListNode insertInLinkedList(ListNode headNode,ListNode nodeToInsert,int position) {
		if(headNode==null) {	//链表为空
			return nodeToInsert;
		}
		//可能出现参数为空的各种情况
		if(nodeToInsert==null) {
			return headNode;
		}
		int size=listLinkedListLength(headNode);
		if(position>size+1||position<1) {
			System.out.println("非法的位置插入链表数据。合法的输入为  1 到"+(size+1));
			return headNode;
		}
		if(position==1) {//在链表开头插入元素
			nodeToInsert.setNextNode(nodeToInsert);
			return nodeToInsert;
		}else {
			//在链表中间插入元素
			ListNode previousNode=headNode;
			int count=1;
			while(count<position-1) {
				previousNode=previousNode.getNextNode();
				count++;
			}
			ListNode currentNode=previousNode.getNextNode();
			nodeToInsert.setNextNode(currentNode);
			previousNode.setNextNode(nodeToInsert);
		}
		return headNode;
		
	}
	
	/**
	 * 删除单项链表中的一个节点
	 * 时间复杂度为O(n)
	 * 空间复杂度为O(1)
	 * @param headNode
	 * @param position
	 * @return
	 */
	public static ListNode deleteNodeFormLinkedList(ListNode headNode,int position) {
		int size=listLinkedListLength(headNode);
		if(position>size||position<1) {
			System.out.println("非法的位置插入链表数据。合法的输入为  1 到"+(size+1));
			return headNode;
		}
		if(position==1) {//删除单向链表的表头节点
			ListNode currentNode=headNode.getNextNode();
			headNode=null;
			return currentNode;
		}else {//删除中间或表尾节点
			ListNode previousNode=headNode;
			int count=1;
			while(count<position) {
				previousNode=previousNode.getNextNode();
				count++;
			}
			ListNode currentNode=previousNode.getNextNode();
			if(currentNode==null) {
				previousNode.setNextNode(null);
				return headNode;
			}
			previousNode.setNextNode(currentNode.getNextNode());
			currentNode=null;
		}
		return headNode;
	}
}
