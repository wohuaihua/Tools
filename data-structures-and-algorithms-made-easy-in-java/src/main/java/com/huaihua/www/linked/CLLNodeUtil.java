package com.huaihua.www.linked;

public class CLLNodeUtil {
	
	/**
	 * 获取链表的长度
	 * 时间复杂度O(n)
	 * 空间复杂度O(1)
	 * @param headNode
	 * @return
	 */
	public static int circularListLength(CLLNode headNode) {
		int length=0;
		CLLNode currentNode=headNode;
		while(currentNode!=null) {
			length++;
			currentNode=currentNode.getNext();
			if(currentNode==headNode) {
				break;
			}
		}
		return length;
	}
	
	
	/**
	 * 输出循环链表的内容
	 * 时间复杂度O(n)
	 * 空间复杂度O(1)
	 * @param headNode
	 */
	public static void printCircularListData(CLLNode headNode) {
		CLLNode currentNode=headNode;
		while(currentNode!=null) {
			System.out.println(currentNode.getData()+"->");
			currentNode=currentNode.getNext();
			if(currentNode==headNode) break; 
		}
		
		if(currentNode!=null) {
			System.out.println("("+currentNode.getData()+")headNode");
		}
	}
	
	/**
	 * 在循环链表的尾部插入元素
	 * 时间复杂度O(n)
	 * 空间复杂度O(1)
	 * @param headNode
	 * @param nodeToInsert
	 * @return 返回头节点
	 */
	public static CLLNode insertAtEndInCLL(CLLNode headNode,CLLNode nodeToInsert) {
		CLLNode currentNode=headNode;
		while(currentNode!=null) {
			currentNode=currentNode.getNext();
			//TODO 这里时有问题的
			if(currentNode.getNext()==headNode) break;
		}
		if(headNode==null) {
			nodeToInsert.setNext(nodeToInsert);
			return nodeToInsert;
		}
		currentNode.setNext(nodeToInsert);
		nodeToInsert.setNext(headNode);
		return headNode;
	}
	
	/**
	 * 在循环链表的表头插入元素
	 * @param headNode
	 * @param nodeToInsert
	 */
	public static CLLNode insertBegInCLL(CLLNode headNode,CLLNode nodeToInsert) {
		CLLNode currentNode=headNode;
		while(currentNode!=null) {
			currentNode=currentNode.getNext();
			//TODO 这里时有问题的
			if(currentNode.getNext()==headNode) break;
		}
		if(headNode==null) {
			nodeToInsert.setNext(nodeToInsert);
			return nodeToInsert;
		}
		currentNode.setNext(nodeToInsert);
		nodeToInsert.setNext(headNode);
		return nodeToInsert;
	}
}
