package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignValidation {

	 public CampaignValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(css="span.dvHeaderText")
	 private WebElement actualCampaignData;

	 public WebElement getActualProductData() {
	  return actualCampaignData;
	 }
	 public String actualCampaignName()
	 {
	  return actualCampaignData.getText();
	 }
	 /*
	 public class ProductValidation 
	{
	 public ProductValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }*/
  }
