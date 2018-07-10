package com.huaihua.www.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.Set;
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
	public static String treeToJson(TreeNode root) {
		if(root==null) {
			return "";
		}
		root.setNextSibiling(null);
		int firstNodeHeight = TreeNodeUtil.getTreeMaxHeight(root);
		boolean isContainArrayObject=TreeNodeUtil.isArrayObject(root);
		//获取每层的Map,Object,ArrayObject节点,key是uuid，value是此层的节点集合
		Map<String,List<TreeNode>> mapNodes=new LinkedHashMap<String,List<TreeNode>>();
		//用于初始根节点
		List<TreeNode> initNodes=new ArrayList<TreeNode>();
		initNodes.add(root);
		mapNodes.put("", initNodes);
		List<TreeNode> firstNodes=null;
		for (int i = 1; i < firstNodeHeight+1 ; i++) {
			root.setNextSibiling(null);
			List<TreeNode> nodes=TreeNodeUtil.heightLevelNodes(root, i);
			for(TreeNode node:nodes) {
				if(node.getType().equals(JsonElement.MAP.getType())||
						node.getType().equals(JsonElement.OBJECT.getType())||
						TreeNodeUtil.isArrayObject(node)) {
					String uuid=UUID.randomUUID().toString().replaceAll("-", "");
					firstNodes=TreeNodeUtil.firstChilds(node);
					mapNodes.put(uuid, firstNodes);
					continue;
				}
			}
		}
		
		Map<String,List<String>> expMap=new HashMap<String,List<String>>();
		for(Entry<String, List<TreeNode>> entry:mapNodes.entrySet()) {
			for(TreeNode node:entry.getValue()) {
				String key="";
				for(Entry<String, List<TreeNode>> e:mapNodes.entrySet()) {
					if(TreeNodeUtil.firstChilds(node)!=null&&
							e.getValue().containsAll(TreeNodeUtil.firstChilds(node))&&
							TreeNodeUtil.firstChilds(node).containsAll(e.getValue())) {
						key=e.getKey();
						break;
					}
				}
				String value="";
				if(node.getType().equals(JsonElement.MAP.getType())||
						node.getType().equals(JsonElement.OBJECT.getType())||
						TreeNodeUtil.isArrayObject(node)) {
					//不是ArrayObject类型
					if(!TreeNodeUtil.isArrayObject(node)) {
						int curretnHeght=TreeNodeUtil.getTreeMaxHeight(node);
						if((firstNodeHeight==curretnHeght+1)&&isContainArrayObject) {
							value= "{"+key+"}"+",";
						}else {
							value= StringUtil.addHeadEnd(node.getData()) + ":" + "{"+key+"}"+",";
						}
					}else {
						//是ArrayObject类型
						value= StringUtil.addHeadEnd(node.getData()) + ":" + "["+key+"]"+",";
					}
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
		for(Entry<String, List<String>> exp:expSet) {
			String key=exp.getKey();
			String value="";
			for(String str:exp.getValue()) {
				value+=str;
			}
			if(value.endsWith(",")) {
				value=value.substring(0, value.length()-1);
			}
			summary.put(key, value);
		}
		
		//获取节点json表达式
		String rootJson=summary.get("");
		String jsonBody=rootJson;
		for(int i=0;i<summary.size();i++) {
			List<String> ids=new ArrayList<String>();
			String reg="(?<=\\{)[0-9a-f]{32}(?=\\})";
			//匹配UUID的正则表达式
		 	Pattern p=Pattern.compile(reg);
		    Matcher m=p.matcher(jsonBody);
	    	while(m.find()){
	    		ids.add(m.group());
	    	}
	    	if(ids.size()==0) {
	    		reg="(?<=\\[)[0-9a-f]{32}(?=\\])";
	    		p=Pattern.compile(reg);
	    		m=p.matcher(jsonBody);
	    		while(m.find()){
	    			ids.add(m.group());
	    		}
	    	}
		    for(String id:ids) {
		    	jsonBody=jsonBody.replace(id, summary.get(id));
		    	//System.out.println(jsonBody);
		    }
		}
		//System.out.println(jsonBody);
		return jsonBody;
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
		//这个是处理一般数组
		if (type.startsWith(JsonElement.ARRAY.getType())) {
			String str=EnumsUtil.reomveHead(type, JsonElement.ARRAY);
			if (str.equals(JsonElement.STRING.getType())) {
				String[] strs=value.split(",");
				String returnStr="";
				for(String s:strs) {
					returnStr+=StringUtil.addHeadEnd(s)+",";
				}
				if(returnStr.endsWith(",")) {
					returnStr=returnStr.substring(0, returnStr.length()-1);
				}
				return StringUtil.addHeadEnd(key) + ":" + "["+returnStr+"]";
			}
			if (str.equals(JsonElement.BOOLEAN.getType())) {
				return StringUtil.addHeadEnd(key) + ":[" + value+"]";
			}
			if (str.equals(JsonElement.NUMBER.getType())) {
				return StringUtil.addHeadEnd(key) + ":[" + value+"]";
			}
			/**
			 * TODO数组类型的时间转化
			 */
			if (str.startsWith(JsonElement.TIME.getType())) {
				String[] strs = type.split("/");
				SimpleDateFormat format = new SimpleDateFormat(strs[1]);
				try {
					Date date = format.parse(value);
					return StringUtil.addHeadEnd(key) + ":" + date.getTime();
				} catch (ParseException e) {
					e.printStackTrace();
				}

			}
			return "";
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
		if (type.startsWith(JsonElement.TIME.getType())) {
			String[] strs = type.split("/");
			SimpleDateFormat format = new SimpleDateFormat(strs[1]);
			try {
				Date date = format.parse(value);
				return StringUtil.addHeadEnd(key) + ":" + date.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		return "";
	}
}
