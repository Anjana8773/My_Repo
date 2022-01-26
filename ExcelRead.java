package com.obsqura.excel.java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static FileInputStream f;
	
	public static XSSFWorkbook w;
	
	public static XSSFSheet s;
	
	//Read string values in excel row i ;Coulmn j
	public static String readStringData(int i,int j) throws IOException {
		//Get path of excel by shift+rightclick excel sheet
		f =new FileInputStream("C:\\Users\\anjan\\Desktop\\ExcelRead.xlsx");
		//To which file the workbook to be open
		w=new XSSFWorkbook(f);
		//get the workbook sheet from workbook
		s=w.getSheet("Sheet1");
		
		//Row interface to get row
		Row r=s.getRow(i);
		
		//Cell interface Get coulmn 
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		
	}
	
	//Read integer values in excel
	public static String readIntegerData(int i,int j) throws IOException {
		//Get path of excel by shift+rightclick excel sheet
		f =new FileInputStream("C:\\Users\\anjan\\Desktop\\ExcelRead.xlsx");
		//To which file the workbook to be open
		w=new XSSFWorkbook(f);
		//get the workbook sheet from workbook
		s=w.getSheet("Sheet1");		
		//Row interface to get row
		Row r=s.getRow(i);	
		//Cell interface Get coulmn 
		Cell c=r.getCell(j);
		int numValue=(int) c.getNumericCellValue();
		return String.valueOf(numValue);
		
	}

}
