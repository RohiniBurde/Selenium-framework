package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for chrome
/*System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
WebDriver dr = new ChromeDriver();
dr.get("http://store.demoqa.com/")*/;

//for internet explorer
System.setProperty("webdriver.ie.driver","C:/New folder/IEDriverServer.exe");
WebDriver dr = new InternetExplorerDriver();
dr.get("http://store.demoqa.com");


	}

}
