package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	public LoginPage(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
	}
 	//Declaration
     @FindBy(name="user_name")
     private WebElement usernametext;

     @FindBy(name="user_password")
     private WebElement userpasswordtext;

     @FindBy(id="submitButton")
     private WebElement submitbutton;
 
    public WebElement getUserNameTextField()
   {
	return usernametext;
   }

    public WebElement getUserPasswordTextField()
   {
	return userpasswordtext;
   }

    public WebElement getSubmitButton()
    {
	return submitbutton;
    }
//Business Logics
/**
 * this method is used for login to app
 * @param username
 * @param password
 * @author Chetan
 */
public void login(String UserName,String PassWord)
{
	usernametext.sendKeys(UserName);
	userpasswordtext.sendKeys(PassWord);
	submitbutton.click();
    
	}
	
}





 
