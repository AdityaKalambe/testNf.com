package com.qa.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * OutPutexcel class are used to store the data in excel sheet 
 * This excel code is handled by using Apache POI jars
 */
public class OutPutExcel {

		public static void WriteData(int r,int c,String val) throws IOException  {
			
			//step-1-set the path of file
			String path=System.getProperty("user.dir")+"\\outputcontroller.xlsx";
		
			//step-2-create object of file
			File file=new File(path);
		
			//step-3-create object of fileInputstream
			FileInputStream fis=new FileInputStream(file);
		
			//step-4-create object of XSSFWorkbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			//step-5-locate the sheet under workbook
			XSSFSheet sheet=wb.getSheetAt(0);
			
			//step-6-create the row from sheet context
			XSSFRow row=sheet.createRow(r);
			
			//step-7-create cell from row context
			XSSFCell cell= row.createCell(c);
			
			//step-8-set cell value
			cell.setCellValue(val);
			
			//step-9-create object of OutputStream
			FileOutputStream fos=new FileOutputStream (path);
			
			wb.write(fos);
			
			wb.close();
			
			}
	
		

}
