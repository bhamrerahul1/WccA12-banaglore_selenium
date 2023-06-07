package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTigetGenericUtilities.WebDriverUtility;

public class ContactsInfoPage   extends WebDriverUtility {
	//delcartion
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement contactheaderText;
	

	//initilzation
	public  ContactsInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this );
	}

	//utilization
	public WebElement getOrgheaderText()
	{
		return  contactheaderText;
	}
	//business lib
	/**
	 * This method will return the contact header
	 * @return
	 */
	public String  getContactHeaderText()
	{
		return  contactheaderText.getText();
	}
	
	
	

}
