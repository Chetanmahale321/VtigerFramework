package Practise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("./Data/Book12.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("organization");
		Row ro = sh.createRow(1);
		Cell cell=ro.createCell(7);
		
		//Cell cell=ro.getCell(0);
		
		cell.setCellValue("TestYantra");
		
		FileOutputStream fos=new FileOutputStream("./Data/Book12.xlsx");
		wb.write(fos);
		wb.close();
	}

}
