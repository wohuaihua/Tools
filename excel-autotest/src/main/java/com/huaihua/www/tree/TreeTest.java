package com.huaihua.www.tree;

import java.util.ArrayList;
import java.util.HashMap;
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
		int min = arr[0];
		for (Entry<String, Integer> entry : keySet) {
			if (!root.hasChild()) {
				TreeNode node = new TreeNode();
				TreeNode temp = node;
				String[] keys = entry.getKey().split("\\.");
				node.setData(keys[0]);
				root.setFirstChild(node);
				keys = StringUtil.remove(keys, keys[0]);
				for (String key : keys) {
					TreeNode child = new TreeNode();
					child.setData(key);
					temp.setFirstChild(child);
					temp = child;
				}
			} else {
				String[] keys = entry.getKey().split("\\.");
				for (int i = 0; i < keys.length; i++) {
					System.out.println(StringUtil.sayArr(keys));
					TreeNode child = new TreeNode();
					child.setData(keys[i]);
					//有这个节点时
					if(TreeNodeUtil.getTreeNodeUsingRecursion(root, entry.getKey())!=null) {
						continue;
					}
					//没有这个节点，并且没有父节点
					if(i==0&&TreeNodeUtil.getTreeNodeUsingRecursion(root, entry.getKey())==null&&
							TreeNodeUtil.isExistFatherNode(root, entry.getKey())) {
						System.out.println("123");
						/*
						TreeNode temp = root.getFirstChild();
						while(temp.hasNextSibiling()) {
							temp=temp.getNextSibiling();
						}
						temp.setNextSibiling(child);
						continue;
						*/
						
					}
					//没有这个节点，但是有父节点
					TreeNode treeNode=TreeNodeUtil.getTreeNodeUsingRecursion(root, 
							StringUtil.changePath(StringUtil.before(keys, i), "."));
					if(!treeNode.hasChild()) {
						treeNode.setFirstChild(child);
					}else {
						TreeNode temp = treeNode.getFirstChild();
						while(temp.hasNextSibiling()) {
							temp=temp.getNextSibiling();
						}
						temp.setNextSibiling(child);
					}
				}
			}
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
