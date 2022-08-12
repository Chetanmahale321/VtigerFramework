package CreateCampaign;

   import java.io.FileInputStream;
		import java.util.Properties;
		import java.util.Random;
		import java.util.concurrent.TimeUnit;

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

import com.crm.GenericUtility.Excel_Utility;
import com.crm.GenericUtility.Java_Utility;
import com.crm.GenericUtility.WebDriver_Utility;
import com.crm.GenericUtility.propertyUtility;
	    
 public class CreateCampaign  {
 
     public static void main(String[]args) throws Throwable
     {
	    		//Generic Utilities
				
			    propertyUtility plib = new propertyUtility();
			    Java_Utility jlib = new Java_Utility();	
			    WebDriver_Utility wlib=new WebDriver_Utility();
			    Excel_Utility elib=new Excel_Utility();
			    
			    WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//webDriver Utility
				wlib.waitForPageToLoad(driver);
				
				Excel_Utility elib1 =new Excel_Utility();
				
				String Url = plib.getPropertyKeyValue("url");
			    String UN = plib.getPropertyKeyValue("un");
			    String PWD= plib.getPropertyKeyValue("pwd");
			    
			    driver.get(Url);
			    driver.findElement(By.name("user_name")).sendKeys(UN);  
				driver.findElement(By.name("user_password")).sendKeys(PWD);
				driver.findElement(By.id("submitButton")).click();
				//driver.findElement(By.linkText("//a[text()='Organizations'])[1]")).click();
				WebElement element =driver.findElement(By.xpath("//a[text()='More']"));
				
				Actions a= new Actions(driver);
				a.moveToElement(element).perform();
				
				driver.findElement(By.linkText("Campaigns")).click();
				driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
				
				//Java utility used
				
				//Random ran = new Random();
				//int ranNum = ran.nextInt(1000);
				int RanNum = jlib.getRandomNum();
				//Excel utility used
				
				String CampaignName=elib.getDataFromExcel("./Data/Book12.xlsx","organization",3 , 1 );
			    System.out.println(CampaignName);
			    
				driver.findElement(By.xpath("//input[@name='campaignname']")).sendKeys(CampaignName);
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				//String actData =driver.findElement(By.className("dvHeaderText")).getText();
				String actData =driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				System.out.println(actData);
				
				if(actData.contains(CampaignName))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
			    WebElement element1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				
			    //WebDriver Utility used
			    wlib.mouseOverOnElement(driver, element1);
			    
			    driver.findElement(By.linkText("Sign Out")).click();
				
				driver.close();
			    
			   
			}

			}
