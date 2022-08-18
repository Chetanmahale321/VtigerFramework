package JenkinsPactise;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void demoTest() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./data.property");
		Properties pro=new Properties();
		pro.load(fis);
		System.out.println("Login To Application");
		String Url=pro.getProperty("url");
		//String UN=pro.getProperty("un");
		//String PWD=pro.getProperty("pwd");
		
		driver.get(Url);
		
		System.out.println("Url");
		System.out.println("Welcome to jenkins");
		System.out.println("Pull Practise");
		
		
		driver.quit();
			
		
	}

}
