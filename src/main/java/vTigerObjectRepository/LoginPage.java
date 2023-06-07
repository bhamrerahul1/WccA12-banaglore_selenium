package vTigerObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * POM class Designed for Login Page
 * @author Rahul 
 *
 */
public class LoginPage {
	// declare
	@FindBy(xpath="//input[@type='text']")
	private WebElement usernamedt;
	
	@FindAll({@FindBy(name="user_password"),@FindBy(xpath="//input[@type='password']")})
			private WebElement pawwordedit;
	
	@FindBy(id="submitButton")
	private WebElement  submibutton;
	// initilzation
	public  LoginPage (WebDriver driver)
     {
   	  PageFactory.initElements( driver,this);
     }
	// utilization
public WebElement getUsernamedt() {
		return usernamedt;
	}

public WebElement getPawwordedit() {
		return pawwordedit;
	}

public WebElement getSubmibutton() {
		return submibutton;
	}
/**
 * This method will login to the Application
 * @param Username
 * @param password
 */
// business librarys
	public void loginToApplication(String Username,String password)
	{
		usernamedt.sendKeys(Username);
		pawwordedit.sendKeys(password);
		submibutton.click();
		
	}
	 
	 
	 
	 
	 
	}
     
     


   

