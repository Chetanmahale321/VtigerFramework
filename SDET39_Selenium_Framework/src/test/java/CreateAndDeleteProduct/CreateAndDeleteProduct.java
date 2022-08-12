package CreateAndDeleteProduct;

    import java.io.FileInputStream;
	import java.util.Properties;
	import java.util.Random;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.Excel_Utility;
import com.crm.GenericUtility.Java_Utility;
import com.crm.GenericUtility.WebDriver_Utility;
import com.crm.GenericUtility.propertyUtility;

import ObjectRepository.HomePage;
import ObjectRepository.ProductInformation;
import ObjectRepository.ProductPage;
import ObjectRepository.ProductValidation;
   
	public class CreateAndDeleteProduct extends BaseClass {

		//public static void main(String[]args) throws Throwable{
		@Test
		public void CreateAndDeleteProductTest()throws Throwable
		{
		 //Generic Utilities
			
			    Java_Utility jlib = new Java_Utility();	
			    WebDriver_Utility wlib=new WebDriver_Utility();
			    Excel_Utility elib=new Excel_Utility();

			    HomePage homepage =new HomePage(driver);
			    homepage.Productpage1();
			    
			    ProductPage createProduct=new ProductPage(driver);
			    createProduct.createProduct();
			    
			    int RanNum = jlib.getRandomNum();
			    String productName=elib.getDataFromExcel("./Data/Book12.xlsx","product",3 , 1 )+RanNum;
			    System.out.println(productName);
			
			    ProductInformation productinformation=new ProductInformation(driver);
			    productinformation.createproduct(productName);
			    productinformation.SaveButton();
			    
				 ProductValidation actualProductName = new ProductValidation(driver);
				 String actualProductData = actualProductName.actualProductName();
				 Assert.assertEquals(actualProductData.contains(productName), true);

				 driver.findElement(By.cssSelector("input[title='Delete [Alt+D]']")).click();
				 Thread.sleep(3000);
				 Alert alt=driver.switchTo().alert();
			     alt.accept();
			     
		         WebElement element=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		         wlib.mouseOverOnElement(driver, element);
		          homepage.signOutButton();
		         //driver.findElement(By.linkText("Sign Out"));
			      driver.close();
			    
			    /*
			driver.findElement(By.linkText("Products")).click();
			driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
			
			//Java utility used
			//Random ran = new Random();
			//int ranNum = ran.nextInt(1000);
			int RanNum = jlib.getRandomNum();
			
			String orgName=elib.getDataFromExcel("./Data/Book12.xlsx","product",3 , 1 );
		    System.out.println(orgName);
		    
		    driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(orgName);
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			
			//String actData =driver.findElement(By.className("dvHeaderText")).getText();
			String actData =driver.findElement(By.xpath("//span[@class='lvtHeaderText']")).getText();
			Thread.sleep(2000);
			
			System.out.println(actData);
			if(actData.contains(actData))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			driver.findElement(By.cssSelector("input[title='Delete [Alt+D]']")).click();
				   //driver.findElement(By.linkText("Sign Out")).click();
					Thread.sleep(2000);
					
		   Alert alt=driver.switchTo().alert();
		   alt.accept();
				   
		   WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		   Thread.sleep(2000);
		   
		   //webDriver utility is used
		   wlib.mouseOverOnElement(driver, element);
		   
			driver.findElement(By.xpath("//a[text()='Sign Out']"));
			Thread.sleep(3000);
			driver.close();*/
		}

	} 

