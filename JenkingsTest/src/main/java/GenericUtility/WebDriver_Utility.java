package GenericUtility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility 
{
/**
 * Wait for page to load before identifying any sychronized element in POM
 * @author Mr. Chetan Mahale 
 */

public void waitForPageToLoad(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
/**
 * After every action it will for next action to perform
 * @author Mr. Chetan Mahale
 */
public void scriptTimeOut(WebDriver driver)
{
	driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
}
/**
 * used to wait for element to be clikable in GUI,and check for specific element for every 1000 mileseconds
 * @param driver
 * @param Element
 * @author Mr. Chetan Mahale
 */
public void DriverWaitForElementToBeClickable(WebDriver driver,WebElement Element)
{
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(Element));
/**
 * used to wait for element to be clikable in GUI,and check for specific element for every 500 mileseconds
 * @param driver
 * @param PartialWindowTitle
 * @author Mr. Chetan Mahale
 */
}
public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
{
	FluentWait wait=new FluentWait(driver);
	wait.pollingEvery(Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(Element));	
}
/**
 * used to switch to any Window based on window title
 * @param driver
 * @param PartialWindowTitle
 * @author Mr. Chetan Mahale
 */

public void switchToWindow(WebDriver driver,String PartialWindowTitle)
{
	Set<String> allId = driver.getWindowHandles();
	Iterator<String> it=allId.iterator();
	while(it.hasNext())
	{
		String wid= it.next();
		driver.switchTo().window(wid);
		if(driver.getTitle().contains(PartialWindowTitle))
		{
			break;
		}
}}
/**
 * used to switch to AlertWindow and Accept (click on ok Button)
 * @param driver
 * @author Mr. Chetan Mahale
 */
public void switchToAlertAndAccept(WebDriver driver,String PartialWindowTitle)	{
	
	 driver.switchTo().alert().accept();
	 
}
/**
 * used to switch to AlertWindow and except(click on ok Button)
 * @param driver
 * @author Mr. Chetan Mahale
 *
 */
public void switchToAlertAndDismiss(WebDriver driver)
{
	 driver.switchTo().alert().dismiss();	 		
}
/**
 * used to click to AlrtWindow and Dismiss (click on cancel Button)
 * @param driver
 * @author Mr. Chetan Mahale
 *
 */
public void switchToFrame(WebDriver driver, int index)
{
	 driver.switchTo().frame(index);	 		
}
/**
 * used to switch to frame window based on index
 * @param driver
 * @param id_name_attribute
 * @author Mr. Chetan Mahale
 */
public void switchToFrame(WebDriver driver, String id_name_Attribute)
{
	 driver.switchTo().frame(id_name_Attribute);	 		
}
/**
 * used to select the value from the dropdown based on text
 * @param element
 * @param index
 * @author Mr. Chetan Mahale
 * @param text 
 */
public void select(WebElement element, int index, String text)
{
	Select sel =new Select(element);
	sel.selectByVisibleText(text);
}
/**
*used to select the value from the specified element
* @param element
* @param text
* @author Mr. Chetan Mahale 
*/	

public void mouseOverOnElement(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
/**
 * used to right click on specific element
 * @param driver
 * @param element
 * @author Mr. Chetan Mahale
 */
public void rightClickOnElement(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}}
/**
 * used to place mouse cursor on specific element
 * @param driver
 * @param element
 * @author Mr. Chetan Mahale
*/
