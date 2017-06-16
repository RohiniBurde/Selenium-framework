package Pom.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver startBrowser(String Browsername, String Url) {

		if (Browsername.equalsIgnoreCase("firefox")) {
			ProfilesIni profile = new ProfilesIni();
		    FirefoxProfile myprofile = profile.getProfile("default");
			System.setProperty("webdriver.gecko.driver", "C:\\New folder\\geckodriver.exe");
			driver = new FirefoxDriver(myprofile);
		}

		else if (Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (Browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:/New folder/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.get(Url);
		return driver;
	}

}
