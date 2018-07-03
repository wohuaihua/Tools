package com.huaihua.www.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.huaihua.www.util.IntegerUtil;
import com.huaihua.www.util.StringUtil;

public class TreeTest {

	public static void main(String[] args) {

		String str01 = "name:\"\"";
		String str02 = "age:num";
		String str03 = "time:time/yyyy-mm-dd hh:mm:ss";
		String str04 = "isgood:boolean";
		String str05 = "book.name:{}\"\"";
		String str06 = "familyNames:[]\"\"";
		String str07 = "childs.sex:[]{}";
		String str08 = "additional.girl2:map\"\"";
		String str09 = "additional.first:mapnum";
		String str11 = "additional.second.sex:mapnum{}\"\"";

		List<String> strs = new ArrayList<String>();
		strs.add(str01);
		strs.add(str02);
		strs.add(str03);
		strs.add(str04);
		strs.add(str05);
		strs.add(str06);
		strs.add(str07);
		strs.add(str08);
		strs.add(str09);
		strs.add(str11);

		List<String> keyTree = new ArrayList<String>();
		for (String s : strs) {
			keyTree.add(s.split(":")[0]);
			// System.out.println(s.split(":")[0]);
		}

		Map<String, Integer> keyHeightMap = new HashMap<String, Integer>();
		for (String s : keyTree) {
			int hegiht = StringUtil.getHegiht(s);
			// System.out.println(hegiht+" : "+s);
			keyHeightMap.put(s, hegiht);
		}

		TreeNode root = new TreeNode();
		Set<Entry<String, Integer>> keySet = keyHeightMap.entrySet();

		// 定义特定长度数组
		int[] arr = new int[keySet.size()];
		int index = 0;
		for (Entry<String, Integer> entry : keySet) {
			arr[index] = entry.getValue();
			index++;
		}

		// 冒泡排序
		arr = IntegerUtil.dubboSort(arr);
		//最大值
		int max=arr[arr.length-1];
		Map<String,String[]> map=new HashMap<String,String[]>();
		for (Entry<String, Integer> entry : keySet) {
			String[] array=entry.getKey().split("\\.");
			map.put(entry.getKey(), array);
		}
		
		Set<Entry<String, String[]>> set=map.entrySet();
		for(int i=0;i<max;i++) {
			Map<String,String[]> elemMap=new HashMap<String,String[]>();
			for(Entry<String, String[]> enrty:set) {
				if(enrty.getValue().length-1>=i) {
					if(!elemMap.keySet().contains(enrty.getValue()[i])) {
						elemMap.put(enrty.getValue()[i], StringUtil.before(enrty.getValue(), i));
					}
				}
			}
			
			Set<Entry<String, String[]>> elemSet=elemMap.entrySet();
			List<TreeNode> nodeList=new ArrayList<TreeNode>();
			Map<TreeNode,List<String>> nodeTree=new HashMap<TreeNode,List<String>>();
			for(Entry<String, String[]> entry:elemSet) {
				//表明是第一层元素
				if(entry.getValue().length==1) {
					String key=entry.getKey();
					TreeNode node=new TreeNode();
					node.setData(key);
					nodeList.add(node);
					continue;
				}else {
					//获取父路径
					String str=StringUtil.changePath(StringUtil.remove(entry.getValue(), 
							entry.getValue()[entry.getValue().length-1]), ".");
					
					//获取父节点
					TreeNode node=TreeNodeUtil.getTreeNodeUsingRecursion(root, str);
					if(nodeTree.get(node)==null) {
						List<String> elems=new ArrayList<String>();
						elems.add(entry.getKey());
						nodeTree.put(node, elems);
					}else {
						nodeTree.get(node).add(entry.getKey());
					}
				}
			}
			if(!root.hasChild()) {
				TreeNode first=TreeNodeUtil.setNextSibilingList(nodeList);
				root.setFirstChild(first);
			}else {
				Set<Map.Entry<TreeNode,List<String>>>  nodeTreeSet= nodeTree.entrySet();
				for(Map.Entry<TreeNode,List<String>> entry:nodeTreeSet) {
					List<String> nodes=entry.getValue();
					List<TreeNode> treenodes=new ArrayList<TreeNode>();
					for(String s:nodes) {
						TreeNode node=new TreeNode();
						node.setData(s);
						treenodes.add(node);
					}
					TreeNode first=TreeNodeUtil.setNextSibilingList(treenodes);
					entry.getKey().setFirstChild(first);
				}
			}
			
			System.out.println();
		}
		System.out.println("=======================");
		TreeNodeUtil.inOrder(root);
		/*
		 * System.out.println(TreeNodeUtil.findInTreeNodeUsingRecursion(root,"name1"));
		 * TreeNode treeNode=TreeNodeUtil.getTreeNodeUsingRecursion(root,"name");
		 * System.out.println(treeNode.getData());
		 */
	}
}
