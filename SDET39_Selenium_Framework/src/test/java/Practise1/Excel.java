package Practise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException,InvalidFormatException, IOException {
		// TODO Auto-generated method stub

	FileInputStream fis=new FileInputStream("./Data/Book12.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("organization");
	Row row=sh.getRow(1);
	Cell cell=row.getCell(1);
	String value=cell.getStringCellValue();
		System.out.println(value);
		
		
	}
	
	}
	


