package vTigerPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTigerObjectRepository.LoginPage;
import vTigetGenericUtilities.ExcelFileUtilty;
import vTigetGenericUtilities.JavaUtility;
import vTigetGenericUtilities.PropertyFileUtility;
import vTigetGenericUtilities.WebDriverUtility;

public class DemoScript {

	public static void main(String[] args) throws IOException {
		ExcelFileUtilty eutil = new ExcelFileUtilty();
		 JavaUtility jutil = new  JavaUtility();
		 PropertyFileUtility putil = new PropertyFileUtility();
		 WebDriverUtility wutil= new WebDriverUtility();
		 
		 
		 
		
		
		     //read all the required data 
		     
		   String BROWSER = putil.ReadDataFromProperyFile("browser");
		        String URL = putil.ReadDataFromProperyFile("url");
		       String USERNAME = putil.ReadDataFromProperyFile("username");
		       String PASSWORD = putil.ReadDataFromProperyFile("password");
		       String OrgName = eutil.ReadDataFromExcelSheet("organisation", 1, 2)+jutil.getRandomNumber();
		               
		            
		            
		            WebDriver driver= null;
		            
		            
		            //step 01 launch the browser...................> RUNTIME Polymorphism
		            if(BROWSER.equalsIgnoreCase("Chrome"))
		            	{
		            	    WebDriverManager.chromedriver().setup();
		            	    
		          
		            	    
		            	}
		            else  if(BROWSER.equalsIgnoreCase("firefox"))
		            {
		            	WebDriverManager.firefoxdriver().setup();
		            	
		            }
		            else
		            {
		            	System.out.println("please check ur browser");
		            	
		            }
		            WebDriverManager.chromedriver().setup();
		            ChromeOptions options= new ChromeOptions();
		            options.addArguments("--remote-allow-origins=*");
		            driver =new ChromeDriver(options);
		                
		        //   WebDriver driver1= new ChromeDriver( options);
		           
		            
		            wutil.maximize(driver);
		            wutil.WaitForPageLoad(driver);
		             driver.get(URL);
		           
		          /*  driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		          //step02: clcik on login button 
		            driver.findElement(By.name("user_password")).sendKeys(PASSWORD );
		           //tep02: click on login button
		            driver.findElement(By.id("submitButton")).click();*/
		             LoginPage lp= new  LoginPage(driver);
		             lp.loginToApplication(USERNAME, PASSWORD);
		             
		             
		           //tep03:click on organisation link
		            driver.findElement(By.linkText("Organizations")).click();
		           //step04: click on organisation look up image
		            driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		            //step05:create orgname with mandatary field
		           driver.findElement(By.name("accountname")).sendKeys(OrgName);
		         //step06:save
		           driver.findElement(By.name("button")).click();
		           String orgheader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		           //step07:validate
		           if(orgheader.contains(OrgName))
		           {

		            	System.out.println("------PASS-------");
		           }
		           else
		           {

		            	System.out.println("fail");
		           }
		            // step08:logout
		           
		           WebElement element = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		          wutil.mousehovering(driver, element);
		           driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		           
		           System.out.println("sucessfully logout");
		           driver.close();
	           
		           
		           
		            
		            
		           
		              
		            
		       
		    
		     
		     
		     

	}

	
}
