package task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
WebDriver driver;

	
	//parameterized constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;

	}
	
	
	//click on signup button to register.
	
	@FindBy(how=How.XPATH, using="//a[@id='ch_signup_icon']") 
	@CacheLookup
	WebElement Signup_button;
	
	
	public void Homepagenew(){
		
		Signup_button.click();
	}
	
	
}
