package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	public CampaignPage(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}
	
	//@FindBy(id="more")
	//private WebElement CampaignModuleBtn;
	
	//@FindBy(linkText="Campaigns")
	//private WebElement campaignpage;
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement imgForCreateCampaign;
	
	//public WebElement getCampaignModuleBtn() {
		//return CampaignModuleBtn;
	//}

	/*public WebElement getCampaignModuleBtn1() {
		return campaignpage;
	}*/

	public WebElement getImgForCreateCampaign() {
		return imgForCreateCampaign;
	}
	/**
	 * this method used to create campaign
	 * @author Chetan
	 */
	/*public void campaignpage()
	{
		campaignpage.click();
	}*/
	public void imgForCreateCampaign()
	{
		imgForCreateCampaign.click();
	}


}
