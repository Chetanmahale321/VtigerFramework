package com.crm.Sdet.organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.GenericUtility.BaseClass;
import com.crm.GenericUtility.Excel_Utility;
import com.crm.GenericUtility.Java_Utility;
import com.crm.GenericUtility.WebDriver_Utility;
import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;
import ObjectRepository.OrganizationValidation;
import ObjectRepository.OrganizationInformation;


public class CreateOrganization extends BaseClass
{
	@Test (groups= {"smokeTest","regressionTest"}) 
	//public static void main(String[]args) throws Throwable
	public void CreateOrganization()throws Throwable
	{
		WebDriver_Utility wlib=new WebDriver_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib=new Excel_Utility();
		
	    HomePage homepage =new HomePage(driver);
	    homepage.Organizationbutton();
	    
	    OrganizationPage organizationpage = new OrganizationPage(driver);
	    organizationpage.Createorganization();
	    
		int RanNum = jlib.getRandomNum();
		String orgName=elib.getDataFromExcel("./Data/Book12.xlsx","organization",4 , 1 )+RanNum;
	    System.out.println(orgName);
	    
	    OrganizationInformation organizationinformation=new OrganizationInformation(driver);
	    organizationinformation.orgtextfield(orgName);
	    organizationinformation.Savebutton();
		
	    OrganizationValidation actualOrganizationName = new OrganizationValidation(driver);
	    String actualOrganizationData = actualOrganizationName.actualOrganizationName();
	    Assert.assertEquals(actualOrganizationData.contains(orgName), true);
	    

	    WebElement element=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	    wlib.mouseOverOnElement(driver, element);
	    
	    homepage.signOutButton();
	    //driver.close();
	    }
	}

