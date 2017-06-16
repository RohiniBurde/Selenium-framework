package com.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://toolsqa.com/automation-practice-form/");
		
		List<WebElement> alllinkss = dr.findElements(By.tagName("a"));
		System.out.println("Total links"+ alllinkss.size());
        for (int i = 0; i < alllinkss.size(); i++) {
        	
        	System.out.println(alllinkss.get(i).getText());
        	//dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	//dr.close();
        	
		
		}
		
		
		
	}

}
