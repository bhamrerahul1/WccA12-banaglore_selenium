package vTiger.ContactsTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTigerObjectRepository.BaseClass;
import vTigerObjectRepository.ContactsInfoPage;
import vTigerObjectRepository.ContactsPage;
import vTigerObjectRepository.CreateNewContactsPage;
import vTigerObjectRepository.CreateNewOrganisationPage;
import vTigerObjectRepository.HomePage;
import vTigerObjectRepository.LoginPage;
import vTigerObjectRepository.OrganisationInfoPage;
import vTigerObjectRepository.OrganisationPage;
import vTigetGenericUtilities.ExcelFileUtilty;
import vTigetGenericUtilities.JavaUtility;
import vTigetGenericUtilities.PropertyFileUtility;
import vTigetGenericUtilities.WebDriverUtility;

@Listeners(vTigetGenericUtilities.ListenersImplementationClass.class)
public class CreateContactsWithOrganisationTest extends BaseClass
{    @Test
	public void createContactWithOrgTest() throws IOException
	{
	        String LastName = eutil.ReadDataFromExcelSheet("contacts", 4, 2);
	         String OrgName = eutil.ReadDataFromExcelSheet("contacts", 4, 3)+jutil.getRandomNumber();
	          //step03:navigate to  org link
             HomePage hp= new HomePage(driver);
             
             hp.clickOnOrganisationLink();
             //step04: click on orglookup image
             OrganisationPage op= new OrganisationPage(driver);
             op.clickOnCreateOrgLookUpImage();
             //step05: create orgname with mandatary field
             CreateNewOrganisationPage  cnop= new CreateNewOrganisationPage (driver );
             cnop.createNewOrg(OrgName);
          //   step06:validation
             OrganisationInfoPage oinfoPage= new OrganisationInfoPage(driver);
            String orhHeader = oinfoPage.getOrgHeader();
            //validation by using assertion(hard assert)
          // Assert.fail();
            Assert.assertTrue(orhHeader.contains(OrgName));
        
           //step07: naviagte to clcik on contact look up iamge
           
           hp.clickOnContactsLink(); 
          // step08: create contact look up image
           ContactsPage cpage = new  ContactsPage(driver);
           cpage.clickOnContactLookUpImage();
           // create contact last name with org name
           CreateNewContactsPage  cncp= new CreateNewContactsPage (driver);
           cncp.clickOnNewContact(LastName, OrgName, driver);
           
        
          //step07:validate
           ContactsInfoPage cinfopage = new ContactsInfoPage(driver);
           String ContactHeader = cinfopage.getContactHeaderText();
           Assert.assertTrue(ContactHeader.contains( LastName));
        
            
           
       
           
	        
	        
	        
	          
	            

	}

}
