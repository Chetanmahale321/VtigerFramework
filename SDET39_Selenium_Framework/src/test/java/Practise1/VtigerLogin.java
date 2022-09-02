package Practise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerLogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./Data/data.property");
		Properties pboj=new Properties();
		pboj.load(fis);
		
		String Url =pboj.getProperty("url");
		String UN=pboj.getProperty("un");
		String PWD=pboj.getProperty("pwd");
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		FileInputStream fis1=new FileInputStream("./Data/Book12.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		Sheet sh=wb.getSheet("organization");
		Row row = sh.getRow(3);
		Cell cell=row.getCell(1);
		Random ran = new Random();
		int random = ran.nextInt(1000);
		
		String OrgName=cell.getStringCellValue()+random;
		System.out.println(OrgName);
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		String value = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
		//Thread.sleep(3000);
		
		if(value.contains(OrgName))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	    WebElement element =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        
	    Actions act =new Actions(driver);
	    act.moveToElement(element);
	    driver.findElement(By.xpath("//a[text()='Sign Out']"));
	    driver.close();
	}

}
