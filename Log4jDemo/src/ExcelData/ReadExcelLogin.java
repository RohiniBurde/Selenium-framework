package ExcelData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadExcelLogin {
	@BeforeTest

	public void openbrowser() {
		System.setProperty("webdriver.gecko.driver", "C://GeckoDriver//geckodriver.exe");

		WebDriver dr = new FirefoxDriver();

		dr.manage().window().maximize();

		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


	
	
}