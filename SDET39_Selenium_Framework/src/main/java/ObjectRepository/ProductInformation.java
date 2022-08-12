package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformation
{
		public ProductInformation(WebDriver driver) 
		{
			 PageFactory.initElements(driver, this);
		}
	//Declaration
	 @FindBy(name="productname")
	 private WebElement productName;
		  
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement savebuttonOfproduct;
	
   //getters
	public WebElement getProductName()
	{
		return productName;
	}
	public WebElement getSavebuttonOfproduct() 
	{
		return savebuttonOfproduct;
	}
    /**
	 * this method is used for Create new organization
	 * @param productnname
	 * @author Chetan
	 */
	public void createproduct(String Mobile)
	{
		productName.sendKeys(Mobile);
	}
	public void SaveButton()
	{
		savebuttonOfproduct.click();
	}
} 
   
