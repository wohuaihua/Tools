package com.huaihua.www.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;

import com.huaihua.www.enums.JsonElement;
import com.huaihua.www.tree.TreeNode;
import com.huaihua.www.tree.TreeNodeUtil;

public class JsonObjUtil {

	/**
	 * 获取一个字符串代表的对象的深度
	 * 
	 * @param str
	 * @return
	 */
	public static int getHeightObj(String str) {
		String[] details = str.split(".");
		return details.length - 1;
	}

	/**
	 * 将树生成一个json数据
	 * 
	 * @param root
	 * @return
	 */
	/**
	 * @param root
	 * @return
	 */
//	public static String treeToJson(TreeNode root) {
//		int firstNodeHeight = TreeNodeUtil.getTreeMaxHeight(root);
//		if(root==null) {
//			return "";
//		}
//		List<String> jsonExp=new ArrayList<String>();
//		Stack<Map<String,TreeNode>> stack=new Stack<Map<String,TreeNode>>();
//		for (int i = 1; i < firstNodeHeight ; i++) {
//			String str="";
//			root.setNextSibiling(null);
//			List<TreeNode> nodes=TreeNodeUtil.heightLevelNodes(root, i);
//			boolean isRecord=false;
//			for(TreeNode node:nodes) {
//				if(node.getType().equals(JsonElement.MAP.getType())||
//						node.getType().equals(JsonElement.OBJECT.getType())) {
//					String uuid=UUID.randomUUID().toString().replaceAll("-", "");
//					str+= StringUtil.addHeadEnd(node.getData()) + ":" + "{"+uuid+"}"+",";
//					Map<String,TreeNode> map=new HashMap<String,TreeNode>();
//					map.put(uuid, node);
//					stack.add(map);
//					if(node==nodes.get(nodes.size()-1)) {
//						str=str.substring(0, str.length()-1);
//					}
//					isRecord=true;
//					continue;
//				}
//				//TODO 
//				str+=toJsonElem(node)+",";
//			}
//			if(str.endsWith(",")) {
//				str=str.substring(0, str.length()-1);
//			}
//			if(isRecord) {
//				jsonExp.add(str);
//			}
//		}
//		return "";
//	}
	
	
	public static String treeToJson(TreeNode root) {
		if(root==null) {
			return "";
		}
		int firstNodeHeight = TreeNodeUtil.getTreeMaxHeight(root);
		Map<String,List<TreeNode>> mapNodes=new LinkedHashMap<String,List<TreeNode>>();
		List<TreeNode> initNodes=new ArrayList<TreeNode>();
		initNodes.add(root);
		mapNodes.put("", initNodes);
		List<TreeNode> firstNodes=null;
		for (int i = 1; i < firstNodeHeight+1 ; i++) {
			root.setNextSibiling(null);
			List<TreeNode> nodes=TreeNodeUtil.heightLevelNodes(root, i);
			for(TreeNode node:nodes) {
				if(node.getType().equals(JsonElement.MAP.getType())||
						node.getType().equals(JsonElement.OBJECT.getType())) {
					String uuid=UUID.randomUUID().toString().replaceAll("-", "");
					String str= StringUtil.addHeadEnd(node.getData()) + ":" + "{"+uuid+"}"+",";
					//System.out.println(i+"&&"+str);
					firstNodes=TreeNodeUtil.firstChilds(node);
//					mapNodes.put(i+"&&"+uuid, firstNodes);
					mapNodes.put(uuid, firstNodes);
					continue;
				}
				String str=toJsonElem(node)+",";
				//System.out.println(i+"&&"+str);
			}
		}
		
		Set<Entry<String, List<TreeNode>>> nodeSet=mapNodes.entrySet();
		Map<String,List<String>> expMap=new HashMap<String,List<String>>();
		for(Entry<String, List<TreeNode>> entry:nodeSet) {
			for(TreeNode node:entry.getValue()) {
				String key="";
				for(Entry<String, List<TreeNode>> e:nodeSet) {
					if(TreeNodeUtil.firstChilds(node)!=null&&
							e.getValue().containsAll(TreeNodeUtil.firstChilds(node))&&
							TreeNodeUtil.firstChilds(node).containsAll(e.getValue())) {
						key=e.getKey();
						break;
					}
				}
				String value="";
				if(node.getType().equals(JsonElement.MAP.getType())||
						node.getType().equals(JsonElement.OBJECT.getType())) {
					value= StringUtil.addHeadEnd(node.getData()) + ":" + "{"+key+"}"+",";
				}else {
					value=toJsonElem(node)+",";
				}
				if(expMap.get(entry.getKey())==null) {
					List<String> exps=new ArrayList<String>();
					exps.add(value);
					expMap.put(entry.getKey(), exps);
				}else {
					List<String> exps=expMap.get(entry.getKey());
					exps.add(value);
					expMap.remove(entry.getKey());
					expMap.put(entry.getKey(), exps);
				}
			}
		}
		
		Set<Entry<String, List<String>>> expSet=expMap.entrySet();
		Map<String,String> summary=new HashMap<String,String>();
		String temp="";
		for(Entry<String, List<String>> exp:expSet) {
			String key=exp.getKey();
//			if("".equals(key)) {
//				continue;
//			}
			String value="";
			for(String str:exp.getValue()) {
				value+=str;
			}
			if(value.endsWith(",")) {
				value=value.substring(0, value.length()-1);
			}
			summary.put(key, value);
//			for(Entry<String, List<String>> otherExp:expSet) {
//				if(exp==otherExp) {
//					continue;
//				}
//				List<String> exps=otherExp.getValue();
//				for(String expStr:exps) {
//					if(expStr.contains(key)) {
//						expStr=expStr.replace(key, value);
//						System.out.println(expStr);
//					}
//				}
//			}
		}
		
		Set<Entry<String, String>> summarySet=summary.entrySet();
		String rootJson=summary.get("");
		List<String> keys=new ArrayList<String>();
		for(Entry<String, String> s:summarySet) {
			if("".equals(s.getKey())) {
				continue;
			}
			Pattern p=Pattern.compile("\\{([^\\}]+)\\}");
			Matcher m=p.matcher(s.getValue());
			while(m.find()){
				keys.add(m.group(1));
			}
			for(String key:keys) {
				//s.getValue()=s.getValue().replace(key, summary.get(key));
			}
		}
		return "";
	}

	public static String toJsonElem(TreeNode node) {
		// 获取表达式
		String exp = node.getType();
		JsonElement elem = EnumsUtil.findJsonElement(exp);
		String type = EnumsUtil.returnSuitType(elem, exp);
		String key = node.getData();
		String value = node.getValue();
		if (type.equals(JsonElement.STRING.getType())) {
			return StringUtil.addHeadEnd(key) + ":" + StringUtil.addHeadEnd(value);
		}
		if (type.equals(JsonElement.ARRAY.getType())) {

		}
		if (type.equals(JsonElement.BOOLEAN.getType())) {
			return StringUtil.addHeadEnd(key) + ":" + value;
		}
		if (type.equals(JsonElement.MAP.getType())) {

		}
		if (type.equals(JsonElement.NUMBER.getType())) {
			return StringUtil.addHeadEnd(key) + ":" + value;
		}
		if (type.equals(JsonElement.OBJECT.getType())) {

		}
		if (type.equals(JsonElement.TIME.getType())) {
			String[] strs = value.split("/");
			SimpleDateFormat format = new SimpleDateFormat(strs[1]);
			try {
				Date date = format.parse(strs[0]);
				return StringUtil.addHeadEnd(key) + ":" + date.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return "";
	}
}
