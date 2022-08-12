package com.crm.GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ObjectRepository.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
		// public WebDriver driver;
		 public WebDriver driver = null;
		 public static WebDriver sDriver;
		 
		 propertyUtility plib=new propertyUtility();
		 @BeforeSuite(groups= {"smokeTest","regressionTest"})
		 public void BS()
		 {
		  System.out.println("DataBase Connection");
		 }
		 @BeforeTest(groups= {"smokeTest","regressionTest"})
		 public void BT()
		 {
		  System.out.println("Execute Script in Parallel Mode");
		 }
	    // @Parameters("BROWSER")
		 @BeforeClass(groups={"smokeTest","regressionTest"})
		 public void BC() throws Throwable
		 {
		  String Browser = plib.getPropertyKeyValue("Browser");
		  if(Browser.equalsIgnoreCase("chrome"))
		  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();

		  }
		   else if(Browser.equalsIgnoreCase("firefox"))
		  {
		   WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		  }
		  else if(Browser.equalsIgnoreCase("edge"))
		   {
		   WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		   }
		   else
		   {
		     driver = new ChromeDriver();
		   }
		  sDriver=driver;
		   }
		  
		 @BeforeMethod(groups= {"smokeTest","regressionTest"})
		 public void BM() throws Throwable
		 {
		  System.out.println("Login to Application");
		  propertyUtility plib = new propertyUtility();
		  String Url=plib.getPropertyKeyValue("url");
		  String UN=plib.getPropertyKeyValue("un");
		  String PWD=plib.getPropertyKeyValue("pwd");
		  driver.get(Url);
		  LoginPage loginpage = new LoginPage(driver);
		  loginpage.login(UN, PWD);
		  }
		 
		 @AfterMethod(groups= {"smokeTest","regressionTest"})
		 public void AM()
		 {
		  System.out.println("logout from Application");
		 }
		 @AfterClass(groups= {"smokeTest","regressionTest"})
		 public void AC()
		 {
		  System.out.println("closing the Browser");
		 }
		    @AfterTest(groups= {"smokeTest","regressionTest"})
		    public void At()
		    {
		     System.out.println("parallel Execution is done");
		    } 
		    @AfterSuite(groups= {"smokeTest","regressionTest"})
		    public void AS()
		    {
		     System.out.println("Data Base Connection Close");
		    }
		    }