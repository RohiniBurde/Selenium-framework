package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class DownloadFile {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
	    //Create FireFox Profile object
		 ProfilesIni profile = new ProfilesIni();
	     FirefoxProfile myprofile = profile.getProfile("default");
 
		//Set Location to store files after downloading.
	     myprofile.setPreference("browser.download.dir", "D:\\seleniumdownloads");
	     myprofile.setPreference("browser.download.folderList", 2);
 
		//Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
	     myprofile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
		    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"); 
 
	     myprofile.setPreference( "browser.download.manager.showWhenStarting", false );
	     myprofile.setPreference( "pdfjs.disabled", true );
 
		//Pass FProfile parameter In webdriver to use preferences to download file.
		FirefoxDriver driver = new FirefoxDriver(myprofile);  
 
		// Open APP to download application
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
 
		// Click to download 
		driver.findElement(By.linkText("Test File to Download")).click();
 
		//Halting the execution for 5 secs to donwload the file completely
		Thread.sleep(5000);
 
		driver.close();
 
	}
 
}