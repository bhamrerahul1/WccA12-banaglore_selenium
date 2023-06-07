package vTigerObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vTigetGenericUtilities.WebDriverUtility;

public class CreateNewContactsPage extends WebDriverUtility{
	
	
	// declare
		@FindBy(name="lastname")
		private WebElement lastnameedit;
		
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
		private WebElement savebtn;
		
		@FindBy(xpath="//input[@name='account_name']/following-sibling::img[@alt='Select']")
		private WebElement orglookupimg;

		@FindBy(name="search_text")
		private WebElement Orgsearchedit;
		
		@FindBy(name="search")
		private WebElement Orgsearhbutton;
		
		

		//initilzation
		public CreateNewContactsPage(WebDriver driver)
		{
			PageFactory.initElements(driver ,this );
		}
		//utilization



		public WebElement getLastnameedit() {
			return lastnameedit;
		}



		public WebElement getSavebtn() {
			return savebtn;
		}



		public WebElement getOrglookupimg() {
			return orglookupimg;
		}



		public WebElement getOrgsearchedit() {
			return Orgsearchedit;
		}



		public WebElement getOrgsearhbutton() {
			return Orgsearhbutton;
		}
		// business library
		/**
		 * This method is used to create new contacts with mandatary info
		 * @param lastname
		 */
		public void clickOnNewContact(String lastname )
		{
			lastnameedit.sendKeys(lastname);
			savebtn.click();
		}
		/**
		 * This method is used to create new contacts with organisation
		 * @param lastname
		 * @param OrgName
		 * @param driver
		 */
		public void clickOnNewContact(String lastname ,String OrgName,WebDriver driver )
		{
			lastnameedit.sendKeys(lastname);
			orglookupimg.click();
			switchToWinodw(driver,"Accounts");
			 Orgsearchedit.sendKeys(OrgName);
			 Orgsearhbutton.click();
			 driver.findElement(By.xpath("//a[text()='"+ OrgName +"']")).click();
			 switchToWinodw(driver,"Contacts");
			 savebtn.click();
			 
			 
			 
		}
		
		
		

		
		


}
