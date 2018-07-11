package com.huaihua.www.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.huaihua.www.util.PropertiesUtil;

public class ExcelWriter {
	
	public void writeExcel(String sheetName,Map<String,String> map) {
        //第一步创建workbook  
        HSSFWorkbook wb = new HSSFWorkbook();  
        //第二步创建sheet  
        HSSFSheet sheet = wb.createSheet(sheetName);  
        HSSFCellStyle  style = wb.createCellStyle();      
          
        //第三步创建行row:添加表头0行  
        HSSFRow row = sheet.createRow(0); 
        HSSFCell cellFirst = row.createCell(0);
        HSSFCell cellSecond = row.createCell(1);
        cellFirst.setCellValue("测试编号");
        cellSecond.setCellValue("测试结果");
        cellFirst.setCellStyle(style);
        cellSecond.setCellStyle(style);
          
        int lineNum=1;
        for(Entry<String, String> entry:map.entrySet()) {
        	 HSSFRow lineRow = sheet.createRow(lineNum);
    		 HSSFCell cellf = lineRow.createCell(0);
    		 HSSFCell cells = lineRow.createCell(1);
    		 cellf.setCellValue(entry.getKey());
    		 cells.setCellValue(entry.getValue());
    		 cellFirst.setCellStyle(style);
	         cellSecond.setCellStyle(style);
	         lineNum++;
        }
        
        try {
        	String str=PropertiesUtil.getProperty("savePath");
            FileOutputStream fout = new FileOutputStream(str);  
            wb.write(fout);  
            fout.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  finally {
			try {
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
          
        System.out.println("Excel文件生成成功...");  
    
	}
}
