package com.crm.GenericUtility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility 
{                                  
	public String getDataFromExcel(String Path,String sheetName,int RowNum,int CellNum) throws Throwable
{
	
	FileInputStream fis=new FileInputStream("./Data/Book12.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	Row row = sh.getRow(RowNum);
	Cell cell=row.getCell(CellNum);
	String data=cell.getStringCellValue();
	return data;
	
	//DataFormatter format=new DataFormatter();
	//return format.formatCellValue(book.getSheet(sheetName).getRow(RowNum).getCell(CellNum));
			
}
	}
