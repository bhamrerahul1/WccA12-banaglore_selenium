package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTigetGenericUtilities.WebDriverUtility;

public class CreateNewOrganisationPage extends WebDriverUtility {
	//declration
		@FindBy(name="accountname")
		private WebElement orgNameEdit;
		@FindBy(name="industry")
		private WebElement industrydropdown;
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
		private WebElement savebtn;
		
		
		//inilitization
		public CreateNewOrganisationPage(WebDriver driver)
		{

			PageFactory.initElements(driver,this);
		}
		//utilization


		public WebElement getOrgNameEdit() {
			return orgNameEdit;
		}


		public WebElement getIndustrydropdown() {
			return industrydropdown;
		}


		public WebElement getSavebtn() {
			return savebtn;
		}
		// business libraray
		/**
		 * This method will create new org with mandatary field and save it
		 * @param OrgName
		 */
		public void createNewOrg(String OrgName)
		{
			orgNameEdit.sendKeys(OrgName);
			savebtn.click();
		}
		/**
		 *  This method will create new org with industry  field and save it
		 * @param OrgName
		 * @param Industry
		 */
		public void createNewOrg(String OrgName,String Industry)
		{
			orgNameEdit.sendKeys(OrgName);
			handleDropDown(industrydropdown,Industry);
			savebtn.click();
		}
		 
		
		
	
		

}
