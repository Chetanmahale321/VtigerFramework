package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage
{
	//initialization
	public ProductPage(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}
	//declaration
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement createorganization;
    //getters
	public WebElement getImgForCreateProduct() {
		return createorganization;
	}
	/**
	 * this method is used for Create product
	 * @author Chetan
	 */
  public void createProduct()
  {
	  createorganization.click();
  }  
	 
}
