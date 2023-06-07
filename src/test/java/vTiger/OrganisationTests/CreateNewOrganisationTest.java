package vTiger.OrganisationTests;

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
public class CreateNewOrganisationTest extends    BaseClass  
{
	@Test(groups="SmokeSuite")
	public void createNewOrgTest() throws IOException
	{
		
		       String OrgName = eutil.ReadDataFromExcelSheet("organisation", 1, 2)+jutil.getRandomNumber();
		               
		            
		  
		          // step 03:  naviagte to orginsation link
		             HomePage hp= new  HomePage(driver);
		             hp.clickOnOrganisationLink();
		             //step 04: click on create org look up iamge
		             OrganisationPage orgpag= new OrganisationPage(driver);
		             orgpag.clickOnCreateOrgLookUpImage();
		             //Step 05:create org with mandantary field
		             CreateNewOrganisationPage norg=new  CreateNewOrganisationPage(driver);
		             norg.createNewOrg(OrgName);
		             //step 06:validation
		             OrganisationInfoPage oinfopage= new OrganisationInfoPage(driver);
		             
		          String orheader = oinfopage.getOrgHeader();
		             
		          Assert.assertTrue(orheader.contains(OrgName));
		           
	}
	@Test(groups= "RegressionSuite")
	public void orgDemo()
	{
		System.out.println("from demoorg");
		}

}
