package task.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import task.pages.Afterlogin;
import task.pages.Afterlogout;
import task.pages.HomePage;
import task.pages.SignupPage;

public class Testcase {
	  WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		//WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.makemytrip.com/flights?=&cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7cNew_Ad%7c106469387888&s_kwcid=AL!1631!3!106469387888!e!!g!!make%2520my%2520trip&ef_id=WSZdaQAAAZ0qDBHL%3A20170601043314%3As");
	
		 ProfilesIni profile = new ProfilesIni();
	     FirefoxProfile myprofile = profile.getProfile("default");
	     System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
	     driver = new FirefoxDriver(myprofile);
	     driver.navigate().to("https://www.makemytrip.com/flights?=&cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7cNew_Ad%7c106469387888&s_kwcid=AL!1631!3!106469387888!e!!g!!make%2520my%2520trip&ef_id=WSZdaQAAAZ0qDBHL%3A20170601043314%3As");
		Thread.sleep(50000L);
		}
@Test
	
	public void Testcase13() throws InterruptedException{
		
		//WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.makemytrip.com/flights?=&cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7cNew_Ad%7c106469387888&s_kwcid=AL!1631!3!106469387888!e!!g!!make%2520my%2520trip&ef_id=WSZdaQAAAZ0qDBHL%3A20170601043314%3As");
	
		HomePage home = PageFactory.initElements(driver, HomePage.class);
	
		
		home.Homepagenew();
		
		Thread.sleep(5000L);
		
		SignupPage sign = PageFactory.initElements(driver, SignupPage.class);	
		
		sign.signupnew("hat.aha@gmail.com", "7709503700", "tester@123");
		
		Thread.sleep(50000);
		
		Afterlogin after1 = PageFactory.initElements(driver, Afterlogin.class );
		Thread.sleep(50000);
	    after1.Afterloginnew();
		
	   
	    
	    Afterlogout after2 = PageFactory.initElements(driver, Afterlogout.class);

	    after2.Afterlogoutnew("hat.aha@gmail.com", "tester@123");
	    
	    Thread.sleep(50000);
	}
	
	/*@Test
	
	public void TestCase12(){
		
	//WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.makemytrip.com/");
		
	SignupPage sign = PageFactory.initElements(driver, SignupPage.class);	
	
	sign.signupnew("rohiniburde23@gmail.com", "8237342221", "tester@123");
	
	}
	@Test

	public void Testcase15(){
		
	WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.makemytrip.com/flights?cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7cExpanded%7c162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%2520my%2520trip&ef_id=WSZdaQAAAZ0qDBHL%3A20170601055036%3As");
	Afterlogout after2 = PageFactory.initElements(driver, Afterlogout.class);

	after2.Afterlogoutnew("rohiniburde23@gmail.com", "tester@123");
		
		
		
		
	}
	
@Test
	
	public void TestCase14(){
		
//WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.makemytrip.com/");
		
    Afterlogin after1 = PageFactory.initElements(driver, Afterlogin.class );
    
    after1.Afterloginnew();
	
	}
	*/


}
