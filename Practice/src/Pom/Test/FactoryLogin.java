package Pom.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pom.Helper.BrowserFactory;
import Pom.Pages.PageFactoryLoginpage;

public class FactoryLogin {

	@Test

	public void checkvaliduser() {
		//System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://in.linkedin.com/");

		PageFactoryLoginpage login_page = PageFactory.initElements(driver, PageFactoryLoginpage.class);

		login_page.PageFactoryLoginpageNew("jagtapsachin41@gmail.com", "Hirajagtap1234");

	}
}
