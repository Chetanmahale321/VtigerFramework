package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignWithProduct {
	
	public CampaignWithProduct(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}
	//Declaration
	@FindBy(name="search_text")
	private WebElement searchtextbox;
    
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchbutton;
	
	@FindBy(xpath="//a[@id='1']")
	private WebElement searchproduct;

	public WebElement getSearchtextbox() {
		return searchtextbox;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getSearchproduct() {
		return searchproduct;
	}
	/**
	 *@param searchbutton
	 *@param searchtextbox
	 *@param searchproduct
	 * @author Chetan
	 */
	public void searchbutton(String productName)
	{
		  searchbutton.sendKeys(productName);  
	}
	public void searchtextbox() 
	{
		  searchtextbox.click();
	}
	public void searchproduct()
	{
	      searchproduct.click();
	}
}