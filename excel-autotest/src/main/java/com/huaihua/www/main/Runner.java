package com.huaihua.www.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.huaihua.www.dubbo.consumer.DubboConnection;
import com.huaihua.www.excel.ExcelReader;
import com.huaihua.www.excel.ExcelWriter;
import com.huaihua.www.tree.TreeInit;

public class Runner {
	
	public static void main(String[] args) {
		Runner runner=new Runner();
		runner.run("anxin-bc-ruleapp","3-5");
		System.out.println("完成");
	}
	
	
	public void run(String sheetName,String nums) {

		ExcelReader reader=new ExcelReader();
		TreeInit treeInit=new TreeInit();
		try {
			List returnList=treeInit.initTree(reader.read(sheetName,nums));
			DubboConnection connection=new DubboConnection();
			Map<String,String> dubboResult=connection.connection(sheetName,(Map<String,Object>)returnList.get(0));
			Map<String,String> exceptedMap=(Map<String,String>)returnList.get(1);
			Map<String,String> excelResult=new HashMap<String,String>();
			for(Entry<String, String> dResult:dubboResult.entrySet()) {
				for(Entry<String, String> exceptedR:exceptedMap.entrySet()) {
					if(!exceptedR.getKey().equals(dResult.getKey())) {
						continue;
					}
					if(!dResult.getValue().contains(exceptedR.getValue())) {
						excelResult.put(exceptedR.getKey(), dResult.getValue());
						continue;
					}
					excelResult.put(exceptedR.getKey(), "success");
				}
			}
			ExcelWriter writer=new ExcelWriter();
			writer.writeExcel(sheetName, excelResult);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
