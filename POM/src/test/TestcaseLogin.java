package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class TestcaseLogin {

	@Test
	private void VerifyValidLogin() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");

		LoginPage login = new LoginPage(driver);

		login.typeUsername();
		login.typePassword();
		login.clickLoginButton();

	}

}
