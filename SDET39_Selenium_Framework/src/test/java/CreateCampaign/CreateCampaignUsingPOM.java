package CreateCampaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.Excel_Utility;
import com.crm.GenericUtility.Java_Utility;
import com.crm.GenericUtility.WebDriver_Utility;
import com.crm.GenericUtility.propertyUtility;

import ObjectRepository.CampaignInformation;
import ObjectRepository.CampaignPage;
import ObjectRepository.CampaignValidation;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
@Listeners(com.crm.GenericUtility.ListenersImplemantationClass.class)
public class CreateCampaignUsingPOM extends BaseClass 
{

	@Test(groups= {"smokeTest","regressionTest"})
	//public static void main(String[]args) throws Throwable{
		
		public void CreateCampaignTest() throws Throwable
	    {
	    Java_Utility jlib = new Java_Utility();	
	    WebDriver_Utility wlib=new WebDriver_Utility();
	    Excel_Utility elib=new Excel_Utility();
	   /* 
	    //propertyUtility pboj = new propertyUtility();
	    wlib.waitForPageToLoad(driver);
		String Url = plib.getPropertyKeyValue("url");
	    String un = plib.getPropertyKeyValue("un");
	    String pwd= plib.getPropertyKeyValue("pwd");
	    driver.get(Url);
	    Thread.sleep(3000);
	    LoginPage login=new LoginPage(driver);
	    login.login(un, pwd);
	    */
	    WebElement element =driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
	    wlib.mouseOverOnElement(driver, element);
	    
	    HomePage home =new HomePage(driver);
	    home.campaignpage();
	    
	    CampaignPage campaignpage = new CampaignPage(driver);
	    campaignpage.imgForCreateCampaign();
	    
	    //wantedly failing the script
	   // Assert.assertEquals(false, true);
	    
		int RanNum = jlib.getRandomNum();
		String CampaignName=elib.getDataFromExcel("./Data/Book12.xlsx","product",3 , 1 )+RanNum;
	    System.out.println(CampaignName);
	    
	    CampaignInformation campaigninformation=new CampaignInformation(driver);
	    campaigninformation.Campaignname(CampaignName);
	    //campaigninformation.selectbutton();
	    campaigninformation.savebutton();
		
	    CampaignValidation actualCampaignName = new CampaignValidation(driver);
	    String actualCampaignData = actualCampaignName.actualCampaignName();
	    Assert.assertEquals(actualCampaignData.contains(CampaignName), true);


	   WebElement element1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//WebDriver Utility used
	    wlib.mouseOverOnElement(driver, element1);
	    
	    home.getSignOutButton();
	    //driver.findElement(By.linkText("Sign Out"));
		driver.close();
		
		
	}

	}
