package task.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import task.pages.HoverLogout;

public class Testhover {
	WebDriver driver;
	
   @BeforeMethod
	public void ClearBrowserCache() throws InterruptedException
	{
	driver.manage().deleteAllCookies(); //delete all cookies
	Thread.sleep(5000L); //wait 5 seconds to clear cookies.
	}
		@BeforeTest
		public void beforeTest() throws InterruptedException {
		
			 ProfilesIni profile = new ProfilesIni();
		     FirefoxProfile myprofile = profile.getProfile("default");
		     System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		     driver = new FirefoxDriver(myprofile);
		     driver.navigate().to("https://www.makemytrip.com/flights?=&cmp=SEM%7CD%7CDF%7CG%7CBrand%7CB_M_Makemytrip_Search_Exact%7CBrand_Top_5_Exact%7CNew_Ad%7C106469387888&s_kwcid=AL!1631!3!106469387888!e!!g!!make%2520my%2520trip&ef_id=WSZdaQAAAZ0qDBHL%3A20170601043314%3As");
			 Thread.sleep(4000L);
			}
	@Test
	public void loginToMakeMyTrip()
	{
		HoverLogout hvr = PageFactory.initElements(driver,HoverLogout.class );
		hvr.Hovernew();
		
		
	}

}
