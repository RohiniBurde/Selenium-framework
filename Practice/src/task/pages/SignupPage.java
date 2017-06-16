package task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignupPage {

WebDriver driver;

	
	//parameterized constructor
	public SignupPage(WebDriver driver) {
		this.driver = driver;

	}
	
	
	@FindBy(how=How.ID, using="ch_signup_email")

	WebElement Email;
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='ch_signup_phone']")

	WebElement Mobile_no;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ch_signup_password']")

	WebElement Password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ch_signup_btn']")

	WebElement Signup2;


public void signupnew(String email1,String Mo_no, String Pass ){

	Email.sendKeys(email1);
	Mobile_no.sendKeys(Mo_no);
	Password.sendKeys(Pass);
	Signup2.click();
}
}