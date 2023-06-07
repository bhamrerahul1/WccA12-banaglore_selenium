package vTigerPratice;

// note this program i have not executed but concept was cleared ................
// 	
	

	import java.util.Date;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CalenderPopUp {
		
		@Test
		public void SelectAnyDateInDOM() throws InterruptedException
		{
			//Set the web driver manager to chrome
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
			//Launch the browser
			WebDriver driver = new FirefoxDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
			act.moveByOffset(10, 10).click().perform();
			
			//driver.findElement(By.xpath("//a[@class='close']")).click();
			
			driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[1]")).click();
			
			//Navigate to From and To Elements
			WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
			WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
			
			
			src.sendKeys("mumbai");
			driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
			
			Thread.sleep(2000);
			
			dst.sendKeys("chennai");
			driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
			
			Thread.sleep(2000);
			
			//navigate to departure
			//driver.findElement(By.id("departure")).click();
			
			//navigate to desired date in calender
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@aria-label='Wed May 10 2023']")).click();
			driver.close();
		}
		
		
		
		@Test
		public void SelectCurrentDate() throws InterruptedException
		{
			Date d = new Date();
			String dArr=d.toString();       //Sat Sep 24 2022
			System.out.println(dArr);
			String arr[]=dArr.split(" ");
			String day = arr[0];
			String month = arr[1];
			String date = arr[2];
			String year = arr[5];
			String travelDate = day+" "+month+" "+date+" "+year;
			System.out.println(travelDate);
			
			//Set the web driver manager to chrome
		//	WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
			//Launch the browser
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
			act.moveByOffset(10, 10).click().perform();
			
			//driver.findElement(By.xpath("//a[@class='close']")).click();
			
			//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
			driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[1]")).click();
			//Navigate to From and To Elements
			WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
			WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
			
			
			src.sendKeys("mumbai");
			driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
			
			Thread.sleep(2000);
			
			dst.sendKeys("chennai");
			driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
			
			Thread.sleep(2000);
			
			//navigate to departure
		//	driver.findElement(By.xpath("//label[@for='departure']")).click();
			
			//navigate to desired date in calender - Dynamic xpath
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@aria-label='"+travelDate+"']")).click();
			                             //div[@aria-label='wed sep 21 2022']
			                             //div[@aria-label='thu sep 22 2022']
			
		}
		
		@Test
		public void selectFutureDate() throws InterruptedException
		{
			//Set the web driver manager to chrome
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
			//Launch the browser
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.makemytrip.com/");
			
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
			act.moveByOffset(10, 10).click().perform();
			
			//driver.findElement(By.xpath("//a[@class='close']")).click();
			
			//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
			
			//Navigate to From and To Elements
			WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
			WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
			
			
			src.sendKeys("mumbai");
			driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
			
			Thread.sleep(2000);
			
			dst.sendKeys("chennai");
			driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
			
			Thread.sleep(2000);
			
			//navigate to departure
		//	driver.findElement(By.xpath("//label[@for='departure']")).click();
			
			//navigate to desired date in calender -
			
			for(;;)
			{// here we have created infinity loop 
				try
				{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@aria-label='Sat Nov 25 2023']")).click();
					break;
				}
				catch (Exception e) 
				{
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
			}
			
			                           
		}

	}



