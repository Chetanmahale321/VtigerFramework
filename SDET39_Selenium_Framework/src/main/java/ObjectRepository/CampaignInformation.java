package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInformation {

	public CampaignInformation(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}
	   //Declaration
	
	  @FindBy(name="campaignname")
	   private WebElement Campaignname;
	  
	  @FindBy(xpath="//img[@title='Select']")
	   private WebElement selectbutton;
	  
	   @FindBy(xpath="//input[@title='Save [Alt+S]']")
	   private WebElement savebutton;
	   
	
    public WebElement getCampaignname() {
		return Campaignname;
	}

	public WebElement getSelectbutton() {
		return selectbutton;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	/**
     * this method is used to create campaign
     * @param Campaignname
     * @author Chetan
     */
    public void Campaignname(String mobile)
    {
    	Campaignname.sendKeys(mobile);
    }/*
    public void Campaignname1(String value)
    {
    	
    }*/
    public void selectbutton()
    {
    	selectbutton.click();
    }
    public void savebutton()
    {
    	savebutton.click();
    }
    
}
