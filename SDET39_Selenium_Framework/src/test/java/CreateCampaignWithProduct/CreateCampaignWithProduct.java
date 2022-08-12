package CreateCampaignWithProduct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
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
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.Excel_Utility;
import com.crm.GenericUtility.Java_Utility;
import com.crm.GenericUtility.WebDriver_Utility;
import com.crm.GenericUtility.propertyUtility;

public class CreateCampaignWithProduct extends BaseClass  {

	//public static void main(String[] args)throws Throwable{
	@Test
	public void CreateCampaignWithProduct()throws Throwable
	{
		
	//Create An Object to Utility
	    propertyUtility plib = new propertyUtility();
	    Java_Utility jlib = new Java_Utility();	
	    WebDriver_Utility wlib=new WebDriver_Utility();
	    Excel_Utility elib=new Excel_Utility();
	/*    
	//Read common data from property Files
	    String Url = plib.getPropertyKeyValue("url");
	    String Browser = plib.getPropertyKeyValue("browser");
        String UN = plib.getPropertyKeyValue("un");
	    String PWD= plib.getPropertyKeyValue("pwd");
    	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//wlib.waitForPageToLoad(driver);
	   //Step-1: Login to app
	    wlib.waitForPageToLoad(driver);
	    driver.get(Url);
		Thread.sleep(2000);
		driver.findElement(By.name("user_name")).sendKeys(UN);  
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();
*/
	    
	//Step-2: navigate to Product page 
	    driver.findElement(By.linkText("Products")).click();
	    
	//Step-3: navigate to create Product page
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		
		//Get ranDomNum
		int RanNum = jlib.getRandomNum();
		String productName=elib.getDataFromExcel("./Data/Book12.xlsx","organization",3 , 1 )+RanNum;
	        System.out.println(productName);
	        
	//Step-4: create a new product
		driver.findElement(By.name("productname")).sendKeys(productName);
        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	//verify
	    
    //Step-5: navigate to Campaign page  
		WebElement element= driver.findElement(By.xpath("//a[text()='More']"));
		wlib.mouseOverOnElement(driver, element);
		
		driver.findElement(By.name("Campaigns")).click();

	//Step-6: Navigate to create Campaign page
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();

		driver.findElement(By.xpath("//img[@title='Select']")).click();

		//read test data from Excel
        String campaignName=elib.getDataFromExcel("./Data/Book12.xlsx","organization",3 , 1 );
        System.out.println(campaignName);
	    
	//Step-7: create a new Campaign with product
        driver.findElement(By.name("campaignname")).sendKeys(campaignName);
		//driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(campaignName);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		Thread.sleep(3000);
		wlib.switchToWindow(driver,"Products&action");
		
		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(productName);
		
		driver.findElement(By.name("search")).click();

		//driver.findElement(By.xpath("//input[@type()='button']")).click();
		driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
		//driver.findElement(By.name("search")).click();

        wlib.switchToWindow(driver,"Campaigns&action");
		
        driver.findElement(By.xpath("//input[@title='Save [Alt+S]'])")).click();
		
	//Verify
		String actData= driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		
		if(actData.contains(campaignName))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
    //Step-8: Logout
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wlib.mouseOverOnElement(driver, ele);
		
		
		driver.findElement(By.linkText("Sign Out")).click();
		//driver.close();
		}

	}