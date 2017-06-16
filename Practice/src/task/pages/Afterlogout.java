package task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Afterlogout {
WebDriver driver;

	
	//parameterized constructor
	public Afterlogout(WebDriver driver) {
		this.driver = driver;

	}
	
	
	
	
	@FindBy (how=How.XPATH, using=".//*[@id='ch_login_icon']")
	WebElement Login_button;

	@FindBy (how=How.XPATH, using=".//*[@id='ch_login_email']")
	WebElement email3;
	
	@FindBy (how=How.XPATH, using=".//*[@id='ch_login_password']")
	WebElement Password12;
	
	@FindBy (how=How.XPATH, using="	.//*[@id='ch_login_btn']")
	WebElement Log_in;
	
	public void Afterlogoutnew(String uid, String pass123) {

		Login_button.click();
		email3.sendKeys(uid);
		Password12.sendKeys(pass123);
		Log_in.click();
		
		
	}
}
