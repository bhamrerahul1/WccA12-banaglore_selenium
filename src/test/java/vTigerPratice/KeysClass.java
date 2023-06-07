package vTigerPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeysClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
	    WebElement daylist = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	   
	    daylist.click();
	    Thread.sleep(2000);
	    daylist.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    daylist.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    daylist.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    WebElement monthlist= driver.findElement(By.id("month"));
	    monthlist.click();
	    Thread.sleep(2000);
	    monthlist.sendKeys(Keys.ARROW_UP);
	    Thread.sleep(3000);
	    monthlist.sendKeys(Keys.ARROW_UP);
	    System.out.println("hii");
	    driver.close();
	    
	    
	    
	    
	    
	    
	      
	    
		
		
	}
		

	

}
