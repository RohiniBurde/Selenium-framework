package task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HoverLogout {
	
	 WebDriver driver = null;
	
	
	@FindBy(how=How.XPATH, using="//a[@id='ch_login_icon']") 
	WebElement login_button;

	
	@FindBy(how=How.XPATH, using=".//*[@id='ch_login_email']")
	WebElement email ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='ch_login_password']")
	WebElement password ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='ch_login_btn']")
	WebElement logbutton2 ;
	
	
	@FindBy(how=How.ID, using="ch_logged-in") 
	WebElement Hey;
	
	@FindBy(how=How.XPATH, using=".//*[@id='ch_logged-inlogout']")
	WebElement logout;
	
	public void Hovernew() {
		
		login_button.click();
		email.sendKeys("rohini.burde@gmail.com");
		password.sendKeys("tester@123");
		logbutton2.click();
		
		Actions builder = new Actions(driver);
		builder.moveToElement(Hey).perform();
		//driver.click(locator);
		 
		/*Hey.click();
		//Actions abs = new Actions(driver);
		//abs.moveToElement(Hey).build().perform();
		*/
		logout.click();
		
		driver.close();

	}
	
	
	
}
