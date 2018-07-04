package com.huaihua.www.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.huaihua.www.util.StringUtil;

public class TreeNodeUtil {

	// 前序遍历-递归式
	// 1.方位根节点
	// 2.按前序遍历方式遍历左子树
	// 3.按前序遍历方式遍历右子树
	public static void preOrder(TreeNode root) {
		if (root != null) {
			System.out.println(root.getData());
			preOrder(root.getFirstChild());
			preOrder(root.getNextSibiling());
		}
	}

	/**
	 * 中序遍历-递归式 按中序遍历的方式遍历左子树 访问根节点 按中序遍历的方式遍历右子树
	 * 
	 * @param root
	 *            根节点
	 */
	static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.getFirstChild());
			System.out.println(root.getData());
			inOrder(root.getNextSibiling());
		}
	}

	/**
	 * 后序遍历-递归式 按后序遍历左子树 按后序遍历右子树 访问根节点
	 * 
	 * @param root
	 *            根节点
	 */
	static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.getFirstChild());
			postOrder(root.getNextSibiling());
			System.out.println(root.getData());
		}
	}

	/**
	 * 在给出的二叉树中搜索某个元素的算法
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	static Boolean findInTreeNodeUsingRecursion(TreeNode root, String data) {
		if (root == null || "".equals(data)) {
			return false;
		} else {
			if (data.equals(root.getData())) {
				return true;
			} else {
				boolean temp = findInTreeNodeUsingRecursion(root.getFirstChild(), data);
				if (temp == true) {
					return temp;
				} else {
					return (findInTreeNodeUsingRecursion(root.getNextSibiling(), data));
				}
			}

		}

	}

	/**
	 * 在二叉树中搜索某个节点 这个节点必须完全路径相同
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	static TreeNode getTreeNodeUsingRecursion(TreeNode root, String data) {
		TreeNode temp = null;
		if (root == null || "".equals(data) || data == null) {
			return null;
		} else {
			TreeNode orginNode=null;
			// 包含父类路径如：additional.second.sex
			if (data.contains(".")) {
				String[] arr = data.split("\\.");
				data = arr[arr.length - 1];
				// 看有没有相应的父节点
				// arr=StringUtil.remove(arr, arr[arr.length-1]);
				arr = StringUtil.remove(arr, arr[arr.length-1]);
				for (int i = 0; i < arr.length; i++) {
					String[] array = StringUtil.before(arr, i);
					String s = StringUtil.changePath(array, ".");
					TreeNode node = getTreeNodeUsingRecursion(root, s);
					orginNode=node;
					if (node == null) {
						return null;
					}
				}
			}else {
				orginNode=root;
			}

			if (data.equals(orginNode.getData())) {
				return root;
			} else {
				temp = getTreeNodeUsingRecursion(orginNode.getFirstChild(), data);
				if (temp != null) {
					return temp;
				} else {
					temp = getTreeNodeUsingRecursion(orginNode.getNextSibiling(), data);
					return temp;
				}
			}

		}

	}


	static TreeNode getSmallestChild(TreeNode node) {
		TreeNode temp = node;
		while (temp.hasChild()) {
			temp = temp.getFirstChild();
		}
		return temp;
	}

	static TreeNode getSmallestSibiling(TreeNode node) {
		TreeNode temp = node;
		while (temp.hasNextSibiling()) {
			temp = temp.getNextSibiling();
		}
		return temp;
	}
	
	/*
	 * 将集合中的树节点都设置成兄弟节点
	 */
	static TreeNode setNextSibilingList(List<TreeNode> nodes) {
		TreeNode first=nodes.get(0);
		for(TreeNode node:nodes) {
			if(node!=first) {
				TreeNode temp=getSmallestSibiling(first);
				if(temp==first) {
					first.setNextSibiling(node);
				}else {
					temp.setNextSibiling(node);
				}
			}
		}
		return first;
	}
	
	/**
	 * 获取树的最大高度
	 * @param root
	 * @return
	 */
	public static int getTreeMaxHeight(TreeNode root) {
		/**
		 * TODO
		 */
		return 0;
	}
	
	/**
	 * 获取根节点到特定节点的路径
	 * @param root
	 * @param node
	 * @return
	 */
	public static String TreePath(TreeNode root,TreeNode node,String path) {
		if(root != null) {
			if(!root.hasNextSibiling()) {
				path=path+"."+root.getData();
			}
			path=TreePath(root.getFirstChild(),node,path);
			path=TreePath(root.getNextSibiling(),node,path);
		}
		return path;
	}
	
	/**
	 * 前序遍历方式获取所有树节点
	 * @param root
	 * @param nodes
	 * @return
	 */
	public static List<TreeNode> AllNode(TreeNode root,List<TreeNode> nodes){
		if (root != null) {
			nodes.add(root);
			System.out.println(root.getData());
			nodes=AllNode(root.getFirstChild(),nodes);
			nodes=AllNode(root.getNextSibiling(),nodes);
		}
		return nodes;
	}
	
}
