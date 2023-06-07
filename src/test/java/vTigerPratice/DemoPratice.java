package vTigerPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPratice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");


		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Organizations")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("accountname")).sendKeys("rahull89555");
		Thread.sleep(1000);
		driver.findElement(By.name("button")).click();
		Thread.sleep(1000);
		     String ele = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		     if(ele.contains("rahull89"))
		     {
		    	 System.out.println("passes");
		     }
		     else
		     {
		    	 System.out.println("failed");
		     }
		     
		WebElement element = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		Thread.sleep(1000);

		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		Thread.sleep(1000);
		
		 System.out.println("sucessfully logout:");
		driver.close();






























	}

}
