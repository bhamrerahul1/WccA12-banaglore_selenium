package vTigerObjectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTigetGenericUtilities.ExcelFileUtilty;
import vTigetGenericUtilities.JavaUtility;
import vTigetGenericUtilities.PropertyFileUtility;
import vTigetGenericUtilities.WebDriverUtility;
/**
 * This class consist of all Basic configuration annotations
 * @author R@hulBhamre
 *
 */
public class BaseClass {
	public ExcelFileUtilty eutil = new ExcelFileUtilty();
	public JavaUtility jutil = new  JavaUtility();
	public PropertyFileUtility putil = new PropertyFileUtility();
	public WebDriverUtility wutil= new WebDriverUtility();
	public  WebDriver driver= null;
	public static WebDriver sDriver;
	
	 
	@BeforeSuite(alwaysRun=true)
	public void bsConfig()
	{
		System.out.println("database connection sucessfully");
		
	}
//	@Parameters("BROWSER")
	//@BeforeTest
	@BeforeClass(groups= {"SmokeSuite","RegressionSuite"})
	public void bcConfig(/*String BROWSER*/ ) throws IOException
	{
		
	String BROWSER = putil.ReadDataFromProperyFile("browser");  
           String URL = putil.ReadDataFromProperyFile("url");
           if(BROWSER.equalsIgnoreCase("Chrome"))
           {
        	   WebDriverManager.chromedriver().setup();
        	 //  driver = new ChromeDriver();
        	   System.out.println(BROWSER+" browser launch sucessfully");
           }
           else if(BROWSER.equalsIgnoreCase("firefox"))
           {
        	   WebDriverManager.firefoxdriver().setup();
        	   driver = new FirefoxDriver();
           }
           else
           {
        	   System.out.println("invalid browser");
           }
          // driver = new ChromeDriver();
         //  driver = new ChromeDriver();
    	   ChromeOptions options= new ChromeOptions();
           options.addArguments("--remote-allow-origins=*");
           driver =new ChromeDriver(options);
    	   sDriver=driver;
           wutil.maximize(driver);
           wutil.WaitForPageLoad(driver);
           driver.get(URL);
           
	}
	@BeforeMethod (groups= {"SmokeSuite","RegressionSuite"})
	public void bmConfig() throws IOException
	{
		
		String Username = putil.ReadDataFromProperyFile("username");
		String password = putil.ReadDataFromProperyFile("password");

		LoginPage  lp= new LoginPage (driver);
		lp.loginToApplication(Username, password);
		System.out.println("login is sucessfully");
		
	}
	@AfterMethod (/*groups= {"SmokeSuite","RegressionSuite"}*/)
	public void amConfig()
	{
		HomePage  hp= new HomePage (driver);
	
		hp.logOutApplicaton(driver);
		System.out.println("logout  is sucessfully");
	}
	
	//@AfterTest
	@AfterClass (groups= {"SmokeSuite","RegressionSuite"})
	public void acConfig()
	{
		driver.quit();
		System.out.println("browser closed");
		
	}
	@AfterSuite (groups= {"SmokeSuite","RegressionSuite"})
	public void asConfig()
	{
		System.out.println("database closed sucessfully");
		
	}
	
	
	
	
	
	
	
	

}
