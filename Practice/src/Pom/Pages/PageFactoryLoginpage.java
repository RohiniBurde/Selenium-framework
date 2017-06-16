package Pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryLoginpage {

	WebDriver driver;

	
	//parameterized constructor
	public PageFactoryLoginpage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(id = "login-email")
	@CacheLookup
	WebElement Username;
   
	
	//how class of selenium default library.
	@FindBy(how = How.XPATH, using = ".//*[@id='login-password']")
	@CacheLookup
	WebElement Password;

	@FindBy(how = How.XPATH, using = ".//*[@id='login-submit']")
	@CacheLookup
	// to give high performance in execution. User only at place where elements on the webpage does not change. 
	WebElement Submit_button;

	
	//method created with arguments.
	public void PageFactoryLoginpageNew(String Uid, String Pass) {

		Username.sendKeys(Uid);
		Password.sendKeys(Pass);
		Submit_button.click();

	}
}
