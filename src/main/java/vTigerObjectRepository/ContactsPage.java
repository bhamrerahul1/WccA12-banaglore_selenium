package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	//declration
		@FindBy(xpath="//img[@alt='Create Contact...']")
		private WebElement contactlookupimage;
		//inilization
		public ContactsPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//utilization
		public WebElement getContactlookupimage() {
			return contactlookupimage;
		}
		/**
		 * This method will clcik on create conatct look up iamge
		 */
		
		//business library
		public void clickOnContactLookUpImage()
		{
			contactlookupimage.click();
		}
		
		

}

