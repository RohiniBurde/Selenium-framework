package task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Afterlogin {
	
WebDriver driver;

	
	//parameterized constructor
	public Afterlogin(WebDriver driver) {
		this.driver = driver;

	}
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='ch_logged-in']/span[3]")
	WebElement Hey;

	@FindBy(how=How.XPATH, using=".//*[@id='ch_logged-inlogout']")
	WebElement Logout;*/
	
	public void Afterloginnew() throws InterruptedException {

		Actions actions = new Actions(driver);
		  WebElement a = driver.findElement(By.cssSelector(".ch__marL5.o-i-down_arrow"));
		  actions.moveToElement(a).build().perform();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//a[@id='ch_logged-inlogout']")).click();
		
		//Logout.click();
	}
}
