package com.sira.learning.SelAutomation.utils;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtility {
	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelSheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	public static void getExcelData() throws Exception {
		try {
			String path = System.getProperty("user.dir");
			FileInputStream fileData = new FileInputStream(path + "/data/TestData.xlsx");
			excelWBook = new XSSFWorkbook(fileData);
			excelSheet = excelWBook.getSheet("data");
			System.out.println(excelSheet);
			row = excelSheet.getRow(0);
			cell = row.getCell(0);
			System.out.println(excelSheet.getRow(1).getCell(0));
			
		} catch (Exception Ex) {
			throw (Ex);
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		getExcelData();
		
	}

}
