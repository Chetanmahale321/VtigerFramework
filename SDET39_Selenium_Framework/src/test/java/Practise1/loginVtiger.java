package Practise1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginVtiger {

	public static void main(String[] args)throws Throwable
	{
		
		FileInputStream fis=new FileInputStream("./Data/data.property");
		Properties pboj=new Properties();
		pboj.load(fis);
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit);
		String Url=pboj.getProperty("url");
		String UN=pboj.getProperty("un");
		String PWD=pboj.getProperty("pwd");
		
		WebDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(UN);  
		driver.findElement(By.name("user_password")).sendKeys(PWD);
		driver.findElement(By.id("submitButton")).click();
	}

}
