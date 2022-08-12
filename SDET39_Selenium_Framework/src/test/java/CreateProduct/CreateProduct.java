package CreateProduct;

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

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import ObjectRepository.ProductPage;
import ObjectRepository.ProductValidation;
import ObjectRepository.ProductInformation;
public class CreateProduct extends BaseClass
{
	/*@Test
	public void modifyContact()
	{
		System.out.println("modified contact");
	}
	@Test(retryAnalyzer = com.crm.GenericUtility.RetryImpClass.class)
	public void modifyContact()
	{
		Assert.assertEquals(false, true);
		System.out.println("modified contact");
	}*/
	@Test (groups= {"smokeTest","regressionTest"})
	//public static void main(String[] args) throws Throwable {
	  public void CreateProductTest()throws Throwable
		{
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

	         WebElement element=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	         wlib.mouseOverOnElement(driver, element);
	           homepage.signOutButton();
	         //driver.findElement(By.linkText("Sign Out"));
		       driver.close();
	    
	}

	}