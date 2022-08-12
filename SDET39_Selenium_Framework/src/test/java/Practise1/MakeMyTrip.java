package Practise1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

    public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement src=driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement des=driver.findElement(By.xpath("//input[@id='toCity']"));
		
		src.sendKeys("Bangkok");
		driver.findElement(By.xpath("//p[text()='Bangkok, Thailand']")).click();
		Thread.sleep(3000);
		
		des.sendKeys("Mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//navigate to Departure
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		String requiredMonth="November";
		String requiredYear="2022";
		String requiredDate="14";
		String currentMonthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div)[1]")).getText();
		String currentMonth=currentMonthYear.split(" ")[0];
		String currentYear=currentMonthYear.split(" ")[1];
		
		while(!(currentMonth.equalsIgnoreCase(requiredMonth)&& currentYear.equals(requiredYear))) {
    	 driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click(); 
    	 currentMonthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div)[1]")).getText();
    	 currentMonth=currentMonthYear.split(" ")[0];
 		 currentYear=currentMonthYear.split(" ")[1];
      }
		driver.findElement(By.xpath("//p[.='"+requiredDate+"'])[1]")).click();
		
		
		
		

	
	}

	private static boolean currentMonthequalsIgnoreCase(String requiredMonth) {
		// TODO Auto-generated method stub
		return false;
	}

}