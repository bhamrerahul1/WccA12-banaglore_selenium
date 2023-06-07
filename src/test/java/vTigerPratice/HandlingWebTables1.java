package vTigerPratice;//Scenario No02

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWebTables1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//table[@class='lvt small']/tbody/tr[*]/td[1]/input[@name='selected_id'])[4]")).click();
		driver.close();
		
		
		

	}

}
