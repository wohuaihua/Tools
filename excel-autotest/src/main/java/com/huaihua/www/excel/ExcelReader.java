package com.huaihua.www.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	
	
	public static void main(String[] args) {
		ExcelReader reader=new ExcelReader();
		try {
			reader.read("Sheet1","3-4");
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
	public Map<String,Map<String,String>> read(String sheetName,String nums) throws Exception {
		 FileInputStream in = new FileInputStream(getFile());
		 return excelHandler(in,getFile(),sheetName,nums);
	}
	
	
	public Map<String,Map<String,String>> excelHandler(FileInputStream in,File file,String sheetName,String nums) throws Exception {
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
			int rowcount = sheet.getLastRowNum();
			if(rowcount<Integer.parseInt(nums.trim())-1) {
				throw new Exception("指定的sheet页没有那么多行，请确认！");
			}
			rows.add(sheet.getRow(Integer.parseInt(nums.trim())-1));
			if(rows.size()==0) {
				throw new Exception("指定的sheet页没有那么多行rows.size()==0，请确认！");
			}
		}else {
			String[] sheetNums=nums.split("-");
			int start=Integer.parseInt(sheetNums[0].trim())-1;
			int end=Integer.parseInt(sheetNums[sheetNums.length-1].trim())-1;
			for(int i=start;i<end+1;i++) {
				rows.add(sheet.getRow(i));
			}
		}
		Map<String,Map<String,String>> returnRecord=new HashMap<String,Map<String,String>>();
		for(Row row:rows) {
			//取得一行的有效单元格个数
			int cellNum=row.getLastCellNum(); 
			Map<String,String> keyValueMap=new HashMap<String,String>();
			for(int i=0;i<cellNum;i++) {
				int rowNum=row.getRowNum();
				if(row.getCell(i)==null) {
					continue;
				}
				String value=row.getCell(i).getStringCellValue().trim();
				if(value==null||"".equals(value)) {
					continue;
				}
				Row title=sheet.getRow(1);
				String key=title.getCell(i).getStringCellValue().trim();
				keyValueMap.put(key, value);
				returnRecord.put((rowNum+1)+"", keyValueMap);
			}
		}
		return returnRecord;
	}
	
	private File getFile() throws IOException  {
		Properties properties = new Properties();
	    InputStream in = ExcelReader.class.getClassLoader().getResourceAsStream("config.properties");
	    properties.load(in);
	    String path=properties.getProperty("excelPath");
		File excelFile = new File(path);
		return excelFile;
	}
}
