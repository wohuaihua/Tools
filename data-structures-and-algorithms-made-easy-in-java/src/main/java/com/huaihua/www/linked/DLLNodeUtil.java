package com.huaihua.www.linked;

/**
 * 操作双向链表
 * @author 76494
 *
 */
public class DLLNodeUtil {
	
	/**
	 * 获取链表的长度
	 * 时间复杂度O(n),用于扫描长度为n的链表
	 * 空间复杂度O(1),用于创建临时变量
	 * @param headNode
	 * @return
	 */
	static int getDLLlength(DLLNode headNode) {
		int length=0;
		DLLNode currentNode=headNode;
		while(currentNode!=null) {
			length++;
			currentNode=currentNode.getNext();
		}
		return length;
	}
	
	static DLLNode dllNodeInsert(DLLNode headNode,DLLNode nodeToInsert,int position) {
		if(headNode==null) {
			return nodeToInsert;
		}
		int size=getDLLlength(headNode);
		if(position>size+1||position<1) {
			System.out.println("非法的位置插入链表数据。合法的输入为  1 到"+(size+1));
			return headNode;
		}
		if(position==1) {//从链表的头开始插入
			nodeToInsert.setNext(headNode);
			headNode.setPrevious(nodeToInsert);
			return nodeToInsert;
		}else {//从链表的中间或者尾开始插入
			DLLNode previousNode=headNode;
			int count=1;
			while(count<position-1) {
				previousNode=previousNode.getNext();
				count++;
			}
			DLLNode currentNode=previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			if(currentNode!=null) {
				currentNode.setPrevious(nodeToInsert);
				previousNode.setNext(nodeToInsert);
				nodeToInsert.setPrevious(previousNode);
			}
		}
		return headNode;
	}
	
	static DLLNode dllDelete(DLLNode headNode ,int position) {
		int size=getDLLlength(headNode);
		if(position>size+1||position<1) {
			System.out.println("非法的位置插入链表数据。合法的输入为  1 到"+(size+1));
			return headNode;
		}
		if(position==1) {//删除链表的第一个节点
			DLLNode currentNode=headNode.getNext();
			headNode=null;
			currentNode.setPrevious(null);
			return currentNode;
		}else {//删除中间节点或者尾节点
			DLLNode previousNode=headNode;
			int count=1;
			while(count<position-1) {
				previousNode=previousNode.getNext();
				count++;
			}
			
		}
		return null;
	}
	
}
