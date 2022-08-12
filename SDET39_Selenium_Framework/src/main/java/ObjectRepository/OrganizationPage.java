package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	public OrganizationPage(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement imgForCreateOrg;

	//Initialization
	
	public WebElement getImgForCreateOrg() {
		return imgForCreateOrg;
	}
	/**
	 * this method is used for Create organization
	 * @author Chetan
	 */
	
	public void  Createorganization()
	{
		imgForCreateOrg.click();
	}
	
}
