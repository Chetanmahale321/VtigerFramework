package CreateCampaignWithProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.Excel_Utility;
import com.crm.GenericUtility.Java_Utility;
import com.crm.GenericUtility.WebDriver_Utility;
import com.crm.GenericUtility.propertyUtility;

import ObjectRepository.CampWithProdValidation;
import ObjectRepository.CampaignInformation;
import ObjectRepository.CampaignPage;
import ObjectRepository.CampaignWithProduct;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ProductInformation;
import ObjectRepository.ProductPage;

public class CreateCampaignwithProductInPOM extends BaseClass{
      
	@Test
	//public static void main(String[] args) throws Throwable{ 
	public void CreateOrganization1()throws Throwable
	{
	    Java_Utility jlib = new Java_Utility();	
	    WebDriver_Utility wlib=new WebDriver_Utility();
	    Excel_Utility elib=new Excel_Utility();
	
	    HomePage homepage =new HomePage(driver);
	    homepage.Productpage1();
	    
	    ProductPage createProduct=new ProductPage(driver);
	    createProduct.createProduct();
	    
	    int RanNum = jlib.getRandomNum();
	    String orgName=elib.getDataFromExcel("./Data/Book12.xlsx","product",3 , 1 )+RanNum;
	    System.out.println(orgName);
	    
	    ProductInformation productinformation=new ProductInformation(driver);
	    productinformation.createproduct(orgName);
	    productinformation.SaveButton();
	    
	    WebElement element =driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
	    wlib.mouseOverOnElement(driver, element);
	    
	    HomePage home =new HomePage(driver);
	    home.campaignpage();
	    
	    CampaignPage campaignpage = new CampaignPage(driver);
	    campaignpage.imgForCreateCampaign();
	    
		//int RanNum = jlib.getRandomNum();
		String orgName1=elib.getDataFromExcel("./Data/Book12.xlsx","product",3 , 1 )+RanNum;
	    System.out.println(orgName1);
	    
	    CampaignInformation campaigninformation=new CampaignInformation(driver);
	    campaigninformation.Campaignname(orgName1);
	    campaigninformation.selectbutton();
	    Thread.sleep(3000);
	    
	    wlib.switchToWindow(driver, "Products&action");
	    Thread.sleep(3000);
	    CampaignWithProduct campaign=new CampaignWithProduct(driver);
	    //campaign.searchtextbox();
	   campaign.searchbutton(orgName);
	    campaign.searchproduct();
	    //campaign.searchbutton(orgName);
	   wlib.switchToWindow(driver, "Campaigns&action");
	   campaigninformation.savebutton();
		
	    CampWithProdValidation actualCampWithProdName = new CampWithProdValidation(driver);
	    String actualCampWithProdData = actualCampWithProdName.actualCampWithProdName();
	    Assert.assertEquals(actualCampWithProdData.contains(orgName), true);

	    WebElement element1=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		//WebDriver Utility used
	    wlib.mouseOverOnElement(driver, element1);
	   
	    home.signOutButton();
	    //driver.findElement(By.linkText("Sign Out"));
		//driver.close();
	    
	   
	}

}


