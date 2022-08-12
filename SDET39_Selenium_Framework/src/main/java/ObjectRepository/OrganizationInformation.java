package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformation {

	//initialization
   public OrganizationInformation(WebDriver driver) 
  {
	 PageFactory.initElements(driver, this);
   }
   //Declaration
  @FindBy(name="accountname")
   private WebElement accountnametextfield;
  
   @FindBy(xpath="//input[@title='Save [Alt+S]']")
   private WebElement savebutton;
   
   
   public WebElement getAccountnametextfield() {
	return accountnametextfield;
}
   public WebElement getSavebutton() {
	  return savebutton;
}
/**
	 * this method is used for Create new organization
	 * @param organizationname
	 * @author Chetan
	 */
   public void Savebutton()
   {
	   savebutton.click();
   }
   public void orgtextfield(String Mobile)
   {
	   accountnametextfield.sendKeys(Mobile);
   }
  
   
   
}