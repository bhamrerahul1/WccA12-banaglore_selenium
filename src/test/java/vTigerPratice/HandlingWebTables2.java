package vTigerPratice;//Scenarion no03

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWebTables2 {

	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
				
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		List<WebElement> value = driver.findElements(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
		
		System.out.println(value.size());
		for(WebElement ele:value)
		{
			String alltext = ele.getText();
			System.out.println( alltext);
			
			
		}
		 
		

	}

}
