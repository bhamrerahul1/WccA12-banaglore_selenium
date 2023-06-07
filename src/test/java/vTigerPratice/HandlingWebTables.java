package vTigerPratice;// Scenario01

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\wcsa3workspace\\selniumautomation\\chromedriver.exe");
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
				
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input[@name='selectall']")).click();
		
		
		
		
		
		
		
		
	driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
