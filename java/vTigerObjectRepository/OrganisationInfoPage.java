package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfoPage {
	
	//declration
		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement OrgHeaderText;
		//inilization
		public OrganisationInfoPage(WebDriver driver)
		{
			PageFactory.initElements(driver ,this );
		}
		//utilization
		public WebElement getOrgHeaderText() {
			return OrgHeaderText;
		}
		
		//business library
		/**
		 * This method will get the header text and return it to the caller 
		 * @return
		 */
		public String getOrgHeader()
		{
			return OrgHeaderText.getText();
			
		}
		
		
	
	
	  

}
