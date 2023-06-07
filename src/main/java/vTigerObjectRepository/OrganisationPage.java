package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTigetGenericUtilities.WebDriverUtility;

public class OrganisationPage extends WebDriverUtility {
	//declration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement orglookupimage;
	//initilzation
	public OrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    //utilization
	public WebElement getOrglookupimage() {
		return orglookupimage;
	}
	
	//business library
	/**
	 * This method will click on create organisation lookup image
	 */
	public void clickOnCreateOrgLookUpImage()
	{
		orglookupimage.click();
	}
	
	

	
	
	
}
