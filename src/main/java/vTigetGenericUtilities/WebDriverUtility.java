package vTigetGenericUtilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * 
 * @author Admin
 *
 */
public class WebDriverUtility {
	/**
	 * This method will maximize the browser
	 * @param driver
	 */
	public void maximize(WebDriver driver)
	
	{
		driver.manage().window().maximize();
	}
	/**
	 *  This method will minimize the browser
	 * @param driver
	 */
public void minimize(WebDriver driver)
	
	{
		driver.manage().window().minimize();
	}
/**
 * This method will full screen the browser
 * @param driver
 */

public void fullScreen(WebDriver driver)

{
	driver.manage().window().fullscreen();
}
/**
 * This methos will wait for 10 second for the page to get to load
 * @param driver
 */
public void WaitForPageLoad(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


 }
/**
 * This methosd will wait for an element to be clickable
 * @param driver
 * @param element
 */
   public void ElementTobeClickable(WebDriver driver,WebElement element)
   {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	     
	   }
   /**
    * This methosd will wait for an element to be visible
    * @param driver
    * @param element
    */
   public void ElementTobeVisible(WebDriver driver,WebElement element)
   {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.visibilityOf(element));
	     
	     
	   }
   /**
    * This method will handle dropdown by index
    * @param ele
    * @param index
    */
   public void handleDropDown(WebElement ele,int index)
   {
	   Select s= new   Select(ele);
	   s.selectByIndex(index);
	   
   }
   /**
    * This method will handle dropdown by string
    * @param ele
    * @param value
    */
   public void handleDropDown(WebElement ele,String  value)
   {
	   Select s= new   Select(ele);
	   s.selectByValue(value);
	   
   }
   /**
    *  This method will handle dropdown by text
    * @param ele
    * @param bytext
    * @param ele
    */
   
   public void handleDropDown(String bytext,WebElement ele )
   {
	   Select s= new   Select(ele);
	   s.selectByVisibleText(bytext);
	   
   }
   /**
    * this methos will use for mousehovering opertion
    * @param driver
    * @param ele
    */
   public void mousehovering(WebDriver driver,WebElement ele)
   {
	   Actions act= new Actions(driver);
	   act.moveToElement(ele).perform();
	   
	   
   }
   /**
    * This methos will use for double click opertion
    * @param driver
    * @param ele
    */
   public void doubleClick(WebDriver driver,WebElement ele)
   {
	   Actions act= new Actions(driver);
	   act.doubleClick(ele).perform();
	   }
   /**
    * This methos will use for right click opertion
    * @param driver
    * @param ele
    */
   public void rightClick(WebDriver driver,WebElement ele)
   {
	   Actions act= new Actions(driver);
	   act.contextClick(ele).perform();
	   }
   /**
    * This methos will use for right click opertion
    * @param driver
    * @param ele1
    * @param ele2
    */
   public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2)
   {
	   Actions act= new Actions(driver);
	   act.dragAndDrop(ele1, ele2).perform();
	   }
   /**
    * This method will press and realse the enter  key
    * @throws AWTException
    */
   public void pressEnter() throws AWTException
   {
	   Robot r= new Robot();
	   r.keyPress(KeyEvent.VK_ENTER); 
	   r.keyRelease(KeyEvent.VK_ENTER);
   }
   /**
    * this method is used to switch the frame based on index
    * @param driver
    * @param indexofframe
    */
   public void switchToFrame(WebDriver driver,int indexofframe)
   {
	  driver.switchTo().frame(indexofframe);
	  
   }
   /**
    * This method is used to switch the frame based on name or ID
    * @param driver
    * @param nameId
    */
   public void switchToFrame(WebDriver driver,String nameId)
   {
	  driver.switchTo().frame(nameId);
	  
	  
   }
   /**
    *  This method is used to switch the frame based on webelement
    * @param driver
    * @param element
    */
   public void switchToFrame(WebDriver driver,WebElement element)
   {
	  driver.switchTo().frame(element);
	  
	  
	  
   }
   /**
    * This method is used to switch the control to the immediate parent frame
    * @param driver
    */
   public void switchToParentFrame(WebDriver driver)
   {
	   driver.switchTo().parentFrame();
	   
   }
   /**
    * This methos switch the control to the default frame
    * @param driver
    */
   public void switchToDefaultContent(WebDriver driver)
   {
	   driver.switchTo().defaultContent();
	   
   }
   /**
    * this method is used to accept the alert popup
    * @param driver
    */
   public void acceptAlert(WebDriver driver)
   {
	   driver.switchTo().alert().accept();
   }
   /**
    * This method is used to dismiss the alert popup
    * @param driver
    */
   public void dismissAlert(WebDriver driver)
   {
	   driver.switchTo().alert().dismiss();
   }
   /**
    *This methos will get the alert text
    * @param driver
    * @return
    */
   public String getAlerttext(WebDriver driver)
   {
	   return driver.switchTo().alert().getText();
	   
   }
   /**
    * this method will take the screenshot and return the destinition path 
    * @param driver
    * @param Screenshotname
    * @return
    * @throws IOException
    */
   public String takeScreenShot(WebDriver driver ,String Screenshotname) throws IOException
   {
	   TakesScreenshot st= (  TakesScreenshot)driver;
	  File src = st.getScreenshotAs(OutputType.FILE);
	       File des= new File(".\\ScreenShots"+Screenshotname+".png");
	       Files.copy(src, des);
	       return des.getAbsolutePath();// used in extent report
	       // D:/MavenProject/AutomationFrameWork01/Screenshots/name.png
   }
   /**
    * This method will perform random scroll action 
    * @param driver
    */
   public void scrollAction(WebDriver driver)
   {
	   JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)"," ");
	
   }
   /**
    * This method will switch to window based on title
    * @param driver
    * @param Partialwintitle
    */
   public void switchToWinodw(WebDriver driver,String Partialwintitle)
   { 
	   // step 01: capture all the windows ID
	              Set<String> allwindowId = driver.getWindowHandles();
	              
	   // step 02:navigate to each Win ID
	              for(String winId: allwindowId)
	              {
	            	  // step 03: switch to each window and capature the title
	            	  
	            	 String acttitle = driver.switchTo().window(winId).getTitle();
	            	 // step 04: compare the title with required title
	            	 if(acttitle.contains(Partialwintitle))
	            	 {
	            		 break;
	            		
	            		 
	            	 }
	            	
	            	
	            	 
	              }
	              
   }
   
   
   
   

   
   
   
   


}
