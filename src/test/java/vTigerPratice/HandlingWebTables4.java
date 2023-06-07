package vTigerPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
// for verfication of column heading
public class HandlingWebTables4 {
@Test

	public  void verfiyTable() throws InterruptedException{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/");
		List<WebElement> allheader = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(allheader.size()+"=all header");
		Assert.assertEquals(allheader.size(),5,"column count is not  same");
	
		boolean status = false;
		for(WebElement ele:allheader)
		{
			String valuesofheading = ele.getText();
			System.out.println(valuesofheading);
			if( valuesofheading.contains("Country"))
			{
				status=true;
				break;
				
				
			}
			
		}
		Assert.assertTrue(status, "header is not present");
		
		List<WebElement> numberofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println( numberofrows.size()+"=number of rows present ");
		Assert.assertEquals(numberofrows.size(),7,"Table row count mismatch");
		System.out.println("............................................hii................................");
		List<WebElement> numberofcells = driver.findElements(By.xpath("//table[@id='customers']//td"));
		boolean datastatus = false;
		for(WebElement ele1:numberofcells)
		{
			String valuesofheading1 = ele1.getText();
			System.out.println(valuesofheading1);
			if( valuesofheading1.contains("Ola"))
			{
				status=true;
				break;
				
				
			}
			
		}
		Assert.assertTrue(status, "data is not valid or  present");
		
		List<WebElement> thirdcolumndata= driver.findElements(By.xpath("//table[@id='customers']//tr//td[3]"));
		System.out.println(thirdcolumndata.size()+"=thirdcolumn data present ");
		for(WebElement ele2:thirdcolumndata)
		{
			String data = ele2.getText();
			System.out.println( data);
		}
		driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr[*]/td[1]/input[@type='checkbox'])[4]")).click();
		Thread.sleep(1000);
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
