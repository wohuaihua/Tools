package com.huaihua.www.tree;

import com.huaihua.www.util.StringUtil;

public class TreeNodeUtil {

	
	//前序遍历-递归式
	//1.方位根节点
	//2.按前序遍历方式遍历左子树
	//3.按前序遍历方式遍历右子树
	static void preOrder(TreeNode root) {
		if(root!=null) {
			System.out.println(root.getData());
			preOrder(root.getFirstChild());
			preOrder(root.getNextSibiling());
		}
	}
	
	/**
	 * 中序遍历-递归式
	 * 按中序遍历的方式遍历左子树
	 * 访问根节点
	 * 按中序遍历的方式遍历右子树
	 * @param root  根节点
	 */
	static void inOrder(TreeNode root) {
		if(root!=null) {
			inOrder(root.getFirstChild());
			System.out.println(root.getData());
			inOrder(root.getNextSibiling());
		}
	}
	
	/**
	 * 后序遍历-递归式
	 * 按后序遍历左子树
	 * 按后序遍历右子树
	 * 访问根节点
	 * @param root	根节点
	 */
	static void postOrder(TreeNode root) {
		if(root!=null) {
			postOrder(root.getFirstChild());
			postOrder(root.getNextSibiling());
			System.out.println(root.getData());
		}
	}
	
	/**
	 * 在给出的二叉树中搜索某个元素的算法
	 * @param root
	 * @param data
	 * @return
	 */
	static Boolean findInTreeNodeUsingRecursion(TreeNode root,String data) {
		if(root==null||"".equals(data)) {
			return false;
		}else {
			if(data.equals(root.getData())) {
				return true;
			}else {
				boolean temp=findInTreeNodeUsingRecursion(root.getFirstChild(),data);
				if(temp==true) {
					return temp;
				}else {
					return (findInTreeNodeUsingRecursion(root.getNextSibiling(),data));
				}
			}
			
		}
		
	}
	
	/**
	 * 在二叉树中搜索某个节点
	 * 这个节点必须完全路径相同
	 * @param root
	 * @param data
	 * @return
	 */
	static TreeNode getTreeNodeUsingRecursion(TreeNode root,String data) {
		TreeNode temp=null;
		if(root==null||"".equals(data)||data==null) {
			return null;
		}else {
			//包含父类路径如：additional.second.sex
			if(data.contains(".")) {
				String[] arr=data.split("\\.");
				data=arr[arr.length-1];
				//看有没有相应的父节点
				//arr=StringUtil.remove(arr, arr[arr.length-1]);
				for(int i=0;i<arr.length;i++) {
					arr=StringUtil.remove(arr, arr[arr.length-1-i]);
					String s=StringUtil.changePath(arr, "\\.");
					TreeNode node=getTreeNodeUsingRecursion(root,s);
					if(node==null) {
						return null;
					}
				}
			}
			
			if(data.equals(root.getData())) {
				return root;
			}else {
				temp=getTreeNodeUsingRecursion(root.getFirstChild(),data);
				if(temp!=null) {
					return temp;
				}else {
					return (getTreeNodeUsingRecursion(root.getNextSibiling(),data));
				}
			}
			
		}
		
	}
	
	/**
	 * 是否存在父节点如：additional.second.sex
	 * 存在additional.second
	 * 且存在additional
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	static boolean isExistFatherNode(TreeNode root,String data) {
		if(root==null||"".equals(data)||data==null) {
			return false;
		}else {
			//包含父类路径如：additional.second.sex
			if(data.contains(".")) {
				String[] arr=data.split("\\.");
				//看有没有相应的初始节点
				for(int i=0;i<arr.length;i++) {
					String orgin=StringUtil.changePath(StringUtil.remove(arr, arr[arr.length-1-i]),".");
					boolean isExist=isExistFatherNode(root,orgin);
					if(!isExist) {
						return false;
					}
				}
			}
			
			if(data.equals(root.getData())) {
				return true;
			}else {
				boolean isExist=isExistFatherNode(root.getFirstChild(),data);
				if(!isExist) {
					return isExist;
				}else {
					return (isExistFatherNode(root.getNextSibiling(),data));
				}
			}
			
		}
		
	}
	
}
