package vTiger.OrganisationTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTigerObjectRepository.BaseClass;
import vTigerObjectRepository.CreateNewOrganisationPage;
import vTigerObjectRepository.HomePage;
import vTigerObjectRepository.LoginPage;
import vTigerObjectRepository.OrganisationInfoPage;
import vTigerObjectRepository.OrganisationPage;
import vTigetGenericUtilities.ExcelFileUtilty;
import vTigetGenericUtilities.JavaUtility;
import vTigetGenericUtilities.PropertyFileUtility;
import vTigetGenericUtilities.WebDriverUtility;

public class CreateMultipleOrgWithIndustryTest extends BaseClass {
	
	@Test(dataProvider="getData")
	public void createMultipleOrgTest(String ORG,String INDUSTRY) throws IOException
	{
		 
		 
		    String ORGNAME1= ORG+jutil.getRandomNumber();
		    
		               
		            
		            
		           
		          
		             HomePage hp= new  HomePage(driver);
		             hp.clickOnOrganisationLink();
		             //step 04: click on create org look up iamge
		             OrganisationPage orgpag= new OrganisationPage(driver);
		             orgpag.clickOnCreateOrgLookUpImage();
		             //Step 05:create org with mandantary field
		             CreateNewOrganisationPage norg=new  CreateNewOrganisationPage(driver);
		             norg.createNewOrg(ORG, INDUSTRY);
		             //step 06:validation
		             wutil.acceptAlert(driver);
		             OrganisationInfoPage oinfopage= new OrganisationInfoPage(driver);
		             
		          String orheader = oinfopage.getOrgHeader();
		             
		             Assert.assertTrue(orheader.contains(ORGNAME1));
		          
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		return eutil.readMuttpleDataFromExcel("DataProviderOrg");
		
		
		
	}
	

}
