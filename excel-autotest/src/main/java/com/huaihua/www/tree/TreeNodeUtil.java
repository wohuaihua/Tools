package com.huaihua.www.tree;

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
	static Boolean FindInTreeNodeUsingRecursion(TreeNode root,String data) {
		Boolean temp;
		if(root==null||"".equals(data)) {
			return false;
		}else {
			if(data.equals(root.getData())) {
				return true;
			}else {
				temp=FindInTreeNodeUsingRecursion(root.getFirstChild(),data);
				if(temp!=true) {
					return temp;
				}else {
					return (FindInTreeNodeUsingRecursion(root.getNextSibiling(),data));
				}
			}
			
		}
		
	}
	
	public int getNodeHeight(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int height=0;
		TreeNode fristChild=root.getFirstChild();
		if(fristChild==null) {
			return 0;
		}
		TreeNode temp=null;
		
		/**
		 * TODO 
		 */
		return 0;
	}
}
