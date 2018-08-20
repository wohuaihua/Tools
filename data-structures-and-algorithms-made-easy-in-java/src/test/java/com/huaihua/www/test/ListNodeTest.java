package com.huaihua.www.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.huaihua.www.linked.ListNode;
import com.huaihua.www.linked.ListNodeUtil;

public class ListNodeTest {
	
	ListNode head;
	
	@Before
	public void init() {
		ListNode headNode=new ListNode();
		headNode.setData(4);
		ListNode node01=new ListNode();
		node01.setData(15);
		ListNode node02=new ListNode();
		node02.setData(17);
		ListNode node03=new ListNode();
		node03.setData(40);
		headNode.setNextNode(node01);
		node01.setNextNode(node02);
		node02.setNextNode(node03);
		head=headNode;
	}
	
	@Test
	public void testListLinkedListLength() {
		//int length=ListNodeUtil.listLinkedListLength(head);
		//assertEquals("测试失败"+length, 4, length);
		
		int length=ListNodeUtil.listLinkedListLength(null);
		assertEquals("测试失败"+length, 0, length);
	}
	
	@Test
	public void testInsertInLinkedList() {
		ListNode newNode=new ListNode();
		newNode.setData(70);
		head=ListNodeUtil.insertInLinkedList(head, null, 1);
		assertEquals("测试失败"+head.getData(), 4, head.getData());
	}
	
	@Test
	public void testDeleteNodeFormLinkedList() {
		head=ListNodeUtil.deleteNodeFormLinkedList(head, 4);
		assertEquals("测试失败"+head.getData(), 4, head.getData());
	}
}
