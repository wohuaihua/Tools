package com.huaihua.www.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	
	
	public static void main(String[] args) {
		ExcelReader reader=new ExcelReader();
		try {
			reader.read("Sheet1","");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 进行EXCEL读取,返回Map集合，key是树结构的节点,value是节点对应的值
	 * @param sheetName
	 * @param nums
	 * @throws Exception 
	 */
	public void read(String sheetName,String nums) throws Exception {
		 FileInputStream in = new FileInputStream(getFile());
		 excelHandler(in,getFile(),sheetName,nums);
	}
	
	
	public void excelHandler(FileInputStream in,File file,String sheetName,String nums) throws Exception {
		Workbook workbook = ExcelUtil.getWorkbok(in,file);
		int sheetsNum=workbook.getNumberOfSheets();
		Map<String,Integer> sheetMap=new HashMap<String,Integer>();
		for(int i=0;i<sheetsNum;i++) {
			Sheet sheet=workbook.getSheetAt(i);
			sheetMap.put(sheet.getSheetName(), i);
		}
		
		int testSheetNum=sheetMap.get(sheetName);
		Sheet sheet=workbook.getSheetAt(testSheetNum);
		if(sheet==null) {
			throw new Exception("没有找到相应的sheet页，请确认！");
		}
		List<Row> rows=new ArrayList<Row>();
		if(!nums.contains("-")) {
			rows.add(sheet.getRow(Integer.parseInt(nums.trim())));
		}else {
			String[] sheetNums=nums.split("-");
			int start=Integer.parseInt(sheetNums[0].trim());
			int end=Integer.parseInt(sheetNums[sheetNums.length-1].trim());
			for(int i=start;i<end+1;i++) {
				rows.add(sheet.getRow(i));
			}
		}
		
		for(Row row:rows) {
			
		}
	}
	
	private File getFile()  {
		 //TODO 读取配置文件
		 File excelFile = new File("C:\\Users\\76494\\Desktop\\test.xlsx");
		 return excelFile;
	}
}
