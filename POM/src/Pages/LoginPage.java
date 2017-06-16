/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author rohini.burde
 *this class will store all the locators and methods of login page
 */
public class LoginPage {

	WebDriver driver;  
	
	
	By Username = By.id("login-email");
	By Password = By.xpath(".//*[@id='login-password']");
	By Loginbutton = By.xpath(".//*[@id='login-submit']");
			
	public LoginPage(WebDriver driver){
		
		this.driver = driver;		
	}
public void typeUsername() {
	
	driver.findElement(Username).sendKeys("admin");
	
	
}

public void typePassword() {
	
	driver.findElement(Password).sendKeys("demo123");
	
}



public void clickLoginButton() {
	
	driver.findElement(Loginbutton).click();
	
}
}
