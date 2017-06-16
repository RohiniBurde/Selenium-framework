package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefoxprofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ProfilesIni profile = new ProfilesIni();
     FirefoxProfile myprofile = profile.getProfile("default");
     System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
     WebDriver dr = new FirefoxDriver(myprofile);
     dr.navigate().to("https://google.com");
     
	}

}
