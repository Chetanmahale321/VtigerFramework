package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampWithProdValidation {


	 public CampWithProdValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(css="span.dvHeaderText")
	 private WebElement actualCampWithProdData;

	 public WebElement getactualCampWithProdData() {
	  return actualCampWithProdData;
	 }

	 public String actualCampWithProdName()
	 {
	  return actualCampWithProdData.getText();
	 }
	 public void actualCampWithProdData()
	 {
		 actualCampWithProdData.click(); 
	 }
	 /*
	 public class ProductValidation 
	{
	 public ProductValidation(WebDriver driver)
	 {
	  PageFactory.initElements(driver, this);
	 }*/
	 
}
