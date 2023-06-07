package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTigetGenericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	//declration
	@FindBy(linkText="Organizations")
	private WebElement Organisationlink;
	
	@FindBy(linkText="Contacts")
	private WebElement Contactslink;
	

	@FindBy(linkText="Opportunities")
	private WebElement opportuniteslink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	
	private WebElement administarterimg;
	

	@FindBy(linkText="Sign Out")
	
	private WebElement signoutlink;
	
	
	//initilzation
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this );
	}
	// utilization


	public WebElement getOrganisationlink() {
		return Organisationlink;
	}


	public WebElement getContactslink() {
		return Contactslink;
	}


	public WebElement getOpportuniteslink() {
		return opportuniteslink;
	}


	public WebElement getAdministarterimg() {
		return administarterimg;
	}


	public WebElement getSignoutlink() {
		return signoutlink;
	}
	// business library
	/**
	 * This method is used for click on organisation
	 */
	public void clickOnOrganisationLink()
	{
		Organisationlink.click();
	}
/**
 * This method is used for click on contacts
 */
	public void clickOnContactsLink()
	{
		Contactslink.click();
	}
	/**
	 * This method is used for logout from application
	 * @param driver
	 */
	public void logOutApplicaton(WebDriver driver)
	{
		 mousehovering(driver,administarterimg);
		 signoutlink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
