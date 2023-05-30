package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {


	public  String getProperty(String key) throws IOException {
		FileInputStream file=new FileInputStream("./data/commondatafile.property.txt");
		Properties p=new Properties();
		p.load(file);
		String data = p.getProperty(key);
		return data;
		
	}

	public  String getExcelData(String sheet, int row, int cell) throws IOException {
		FileInputStream file=new FileInputStream("./data/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
		
	}
	/*public  void getUpdateData(String sheet, int row, int cell ) throws IOException {
		FileInputStream file=new FileInputStream("./data/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		   wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("./data/TestScript1.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}*/
	
}