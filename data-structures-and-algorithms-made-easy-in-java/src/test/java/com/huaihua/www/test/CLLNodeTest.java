package com.huaihua.www.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.huaihua.www.linked.CLLNode;
import com.huaihua.www.linked.CLLNodeUtil;

public class CLLNodeTest {
	CLLNode head;
	
	@Before
	public void init() {
		CLLNode headNode=new CLLNode();
		headNode.setData(4);
		CLLNode node01=new CLLNode();
		node01.setData(15);
		CLLNode node02=new CLLNode();
		node02.setData(17);
		CLLNode node03=new CLLNode();
		node03.setData(40);
		headNode.setNext(node01);
		node01.setNext(node02);
		node02.setNext(node03);
		node03.setNext(headNode);
		head=headNode;
	}
	
	@Test
	public void testCircularListLength() {
		assertEquals("测试失败", 4, CLLNodeUtil.circularListLength(head));
	}
	
	@Test
	@Ignore
	public void testPrintCircularListData() {
		CLLNodeUtil.printCircularListData(head);
	}
	
	
	@Test
	public void testInsertAtEndInCLL() {
		CLLNode newNode=new CLLNode();
		newNode.setData(70);
		CLLNodeUtil.insertAtEndInCLL(newNode, newNode);
		CLLNodeUtil.printCircularListData(newNode);
	}
}
