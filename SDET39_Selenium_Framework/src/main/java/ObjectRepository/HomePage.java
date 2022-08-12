package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	public HomePage(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}
	//Declaration
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationModuleBtn;
	

	@FindBy(linkText="Products")
	private WebElement Productpage;
	

	@FindBy(linkText="Campaigns")
	private WebElement campaignpage;
	
	//@FindBy(xpath="//img[@title='Create Campaign...")
	//private WebElement imgForCreateCampaign;
	
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutButton;
	
	public WebElement getOrganizationModuleBtn() {
		return OrganizationModuleBtn;
	}
	
	public WebElement getProductpage() {
		return Productpage;
	}
	public WebElement getcampaignpage() {
		return campaignpage;
	}
	//public WebElement getImgForCreateCampaign() {
		//return imgForCreateCampaign;
	//}
	
	public WebElement getSignOutButton() {
		return signOutButton;
	}
	/**
	 * used to perform task in particular module
	 * @author Chetan
	 * 
	 */
	public void Organizationbutton()
	{
		OrganizationModuleBtn.click();
	}
	public void Productpage1()
	{
		Productpage.click();
	}
	public void campaignpage()
	{
		campaignpage.click();
	}
	/*public void imgForCampaignOption()
	{
		imgForCreateCampaign.click();
	}*/
	public void signOutButton()
	{
		signOutButton.click();	
	}
	
	
}
