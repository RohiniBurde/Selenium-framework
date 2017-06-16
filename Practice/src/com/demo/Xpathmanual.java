package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathmanual {

	public static void main(String[] args) {
		// maually finding xpath tagname[@attribute='value']
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://store.demoqa.com");
	    
	    //dr.findElement(By.xpath("//span[@class='icon']")).click();
		
		//by using css selector css==[tagname=attribute='value']
		//dr.findElement(By.cssSelector("span[class='icon']")).click();
		//dr.findElement(By.cssSelector("#icon")).click();
	}

}
