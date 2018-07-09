package com.huaihua.www.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.TreeUI;

import java.util.Set;

import com.huaihua.www.enums.JsonElement;
import com.huaihua.www.json.language.JsonHandler;
import com.huaihua.www.util.IntegerUtil;
import com.huaihua.www.util.JsonObjUtil;
import com.huaihua.www.util.StringUtil;
import com.huaihua.www.util.EnumsUtil;		

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
		String str11 = "additional.second.sex:map{}\"\"";
		String str13 = "additional.second.one:map{}\"\"";
		String str12 = "additional.third.thirdsex:map{}\"\"";
		String str14 = "additional.third.four:map{}\"\"";
		
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
		strs.add(str12);
		strs.add(str13);
		strs.add(str14);

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
				//这里可以读取配置文件
				root.setType("{}");
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
			
		}
		//TreeNodeUtil.preOrder(root);
		
		String s1 = "name:\"\"";
		String s2 = "age:num";
		String s3 = "time:time/yyyy-mm-dd hh:mm:ss";
		String s4 = "isgood:boolean";
		String s5 = "book.name:{}\"\"";
		String s6 = "familyNames:[]\"\"";
		String s7 = "childs.sex:[]{}\"\"";
		String s8 = "additional.girl2:map\"\"";
		String s9 = "additional.first:mapnum";
		String s10 ="additional.second.sex:map{}\"\"";
		String s12 ="additional.second.one:map{}\"\"";
		String s11 ="additional.third.thirdsex:map{}\"\"";
		String s13 ="additional.third.four:map{}\"\"";
		
		Map<String,String> keyValue=new HashMap<String,String>();
		keyValue.put(s1, "hah");
		keyValue.put(s2, "18");
		keyValue.put(s3, "2018-07-03 15:00:00");
		keyValue.put(s4, "true");
		keyValue.put(s5, "时间简史");
		keyValue.put(s6, "familyNames01,familyNames02");
		keyValue.put(s7, "男,女");
		keyValue.put(s8, "刘朱");
		keyValue.put(s9, "11");
		keyValue.put(s10, "男");
		keyValue.put(s11, "女");
		keyValue.put(s12, "one");
		keyValue.put(s13, "four");
		
		Set<Entry<String, String>> keyValueSet=keyValue.entrySet();
		//用于解析json的map
		Map<String,TreeNode> jsonMap=new HashMap<String, TreeNode>();
		for(Entry<String, String> entry:keyValueSet) {
			String path=entry.getKey().split(":")[0];
			//获取对应的节点
			TreeNode node=TreeNodeUtil.getTreeNodeUsingRecursion(root, path);
			node.setValue(entry.getValue());
			jsonMap.put(entry.getKey(), node);
			
			String type=entry.getKey().replaceFirst(path+":", "");
			if(path.contains(".")) {
				String[] paths = path.split("\\.");
				//通过枚举匹配类型
				for (int i = 0; i < paths.length; i++) {
					String[] array = StringUtil.before(paths, i);
					String s = StringUtil.changePath(array, ".");
					TreeNode beforeNode = TreeNodeUtil.getTreeNodeUsingRecursion(root, s);
					JsonElement jsonElement= EnumsUtil.findJsonElement(type);
					String returnType=EnumsUtil.returnSuitType(jsonElement, type);
					beforeNode.setType(returnType);
					type=EnumsUtil.reomveHead(type, jsonElement);
				}
				continue;
			}
			node.setType(type);
		}
		
		//生成json,单位是根节点下属性为整个的json部分
		
		//TreeNodeUtil.preOrder(root);
		List<TreeNode> levelNodes=TreeNodeUtil.heightLevelNodes(root, 2);
		JsonObjUtil.treeToJson(levelNodes.get(3));
//		TreeNode father=TreeNodeUtil.returnNodeFather(root, levelNodes.get(0));
//		TreeNode botehr=TreeNodeUtil.returnBother(root, levelNodes.get(0));
//		TreeNode node01=TreeNodeUtil.getOldFather(root, levelNodes.get(0));
		
		
		//System.out.println(JsonObjUtil.toJsonElem(levelNodes.get(0)));
		//JsonObjUtil.treeToJson(root);
		System.out.println("=======================");
	}
}
