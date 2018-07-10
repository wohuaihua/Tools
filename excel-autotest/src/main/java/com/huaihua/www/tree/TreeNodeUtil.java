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
	
	/**
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
	 * 获取树的最大深度
	 * @param root 根节点
	 * @return	   
	 */
	public static int getTreeMaxHeight(TreeNode root) {
		if(root==null||root.getFirstChild()==null) {
			return 0;
		}
		List<TreeNode> nodes=new ArrayList<TreeNode>();
		nodes=AllNode(root,nodes);
		TreeNode temp=root;
		List<TreeNode> tempSaves=new ArrayList<TreeNode>();
		List<TreeNode> tempUses=new ArrayList<TreeNode>();
		tempUses.add(temp);
		int height=0;
		for(int i=0;i<nodes.size();i++) {
			for(TreeNode node:tempUses) {
				if(!node.hasNextSibiling()) {
					tempSaves.add(node);
				}else {
					tempSaves.add(node);
					while(node.hasNextSibiling()) {
						node=node.getNextSibiling();
						tempSaves.add(node);
					}
				}
			}
			for(TreeNode node:tempSaves) {
				if(node.hasChild()) {
					++height;
					break;
				}
			}
			tempUses.clear();
			for(TreeNode node:tempSaves) {
				if(node.hasChild()) {
					tempUses.add(node.getFirstChild());
				}
			}
			tempSaves.clear();
			if(tempUses.size()==0) {
				break;
			}
		}
		return height+1;
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
			//System.out.println(root.getData());
			nodes=AllNode(root.getFirstChild(),nodes);
			nodes=AllNode(root.getNextSibiling(),nodes);
		}
		return nodes;
	}
	
	/**
	 * 获取特定深度下的所有节点
	 * @param root
	 * @param i
	 * @return
	 */
	public static List<TreeNode> heightLevelNodes(TreeNode root,int level){
		if(root==null) {
			return null;
		}
		List<TreeNode> returnNodes=new ArrayList<TreeNode>();
		if(level==0) {
			returnNodes.add(root);
			return returnNodes;
		}
		List<TreeNode> nodes=new ArrayList<TreeNode>();
		nodes=AllNode(root,nodes);
		TreeNode temp=root;
		List<TreeNode> tempSaves=new ArrayList<TreeNode>();
		List<TreeNode> tempUses=new ArrayList<TreeNode>();
		tempUses.add(temp);
		for(int i=0;i<nodes.size();i++) {
			for(TreeNode node:tempUses) {
				if(!node.hasNextSibiling()) {
					tempSaves.add(node);
				}else {
					tempSaves.add(node);
					while(node.hasNextSibiling()) {
						node=node.getNextSibiling();
						tempSaves.add(node);
					}
				}
			}
			if(i==level-1) {
				return tempSaves;
			}
			tempUses.clear();
			for(TreeNode node:tempSaves) {
				if(node.hasChild()) {
					tempUses.add(node.getFirstChild());
				}
			}
			tempSaves.clear();
			if(tempUses.size()==0) {
				break;
			}
		}
		return null;
	}
	
	/**
	 * 返回一个节点的父节点
	 * @param node 需要查找父节点的节点
	 * @param root 根节点
	 * @return
	 */
	public static TreeNode returnNodeFather(TreeNode root,TreeNode node) {
		if(root==null||node==null) {
			return null;
		}
		int height=getTreeMaxHeight(root);
		for(int i=1;i<height+1;i++) {
			TreeNode brother= returnBother(root,node);
			List<TreeNode> nodes=heightLevelNodes(root,i);
			if(nodes.contains(node)) {
				nodes=heightLevelNodes(root,i-1);
				for(TreeNode n:nodes) {
					if(n.getFirstChild()==brother) {
						return n;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * 获取最外层的兄弟节点
	 * @param root 根节点
	 * @param node 想要查询的节点
	 */
	public static TreeNode returnBother(TreeNode root,TreeNode node) {
		if(root==null||node==null) {
			return null;
		}
		int height=getTreeMaxHeight(root);
		List<TreeNode> nodes=new ArrayList<TreeNode>();
		for(int i=1;i<height+1;i++) {
			nodes=heightLevelNodes(root,i);
			if(nodes.contains(node)) {
				break;
			}
		}
		TreeNode temp;
		temp=node;
		//移除不可能的节点
		while(temp.hasNextSibiling()) {
			temp=temp.getNextSibiling();
			nodes.remove(temp);
		}
		
		for(TreeNode innerNode:nodes) {
			TreeNode t=innerNode;
			TreeNode record=innerNode;
			if(node==t) {
				return record;
			}
			while(t.hasNextSibiling()) {
				t=t.getNextSibiling();
				if(node==t) {
					return record;
				}
			}
		}
		return null;
	}
	
	
	/**
	 * 获取除根节点下的最外层节点
	 * @param root
	 * @param node
	 * @return
	 */
	public static TreeNode getOldFather(TreeNode root,TreeNode node) {

		if(root==null||node==null) {
			return null;
		}
		int height=getTreeMaxHeight(root);
		TreeNode temp;
		temp=node;
		for(int i=1;i<height+1;i++) {
			//获取最外层节点
			TreeNode borther=returnBother(root, temp);
			TreeNode father=returnNodeFather(root, borther);
			if(root==father) {
				return temp;
			}
			temp=father;
		}
		return null;
		
	}
	
	/**
	 * 获取指定节点的直接子节点集
	 * @param node   指定节点
	 * @return
	 */
	public static List<TreeNode> firstChilds(TreeNode node){
		if(node==null||node.getFirstChild()==null) {
			return null;
		}
		TreeNode temp;
		List<TreeNode> nodes=new ArrayList<TreeNode>();
		temp=node.getFirstChild();
		while(temp.hasNextSibiling()) {
			nodes.add(temp);
			temp=temp.getNextSibiling();
		}
		if(!nodes.contains(temp)) {
			nodes.add(temp);
		}
		return nodes;
	}
	
	/**
	 * 用于判断节点是否为[],且子节点为{}
	 * @param node
	 * @return
	 */
	public static boolean isArrayObject(TreeNode node) {
		List<TreeNode> firsts=TreeNodeUtil.firstChilds(node);
		boolean isArrayObject=false;
		if("[]".equals(node.getType())) {
			for(TreeNode firstNode:firsts) {
				if("{}".equals(firstNode.getType())) {
					isArrayObject=true;
					break;
				}
			}
		}
		return isArrayObject;
	}
	
}
