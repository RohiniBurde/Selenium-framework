package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		//to open browser
		WebDriver dr = new FirefoxDriver();
		//to get hit on url
	    dr.get("http://store.demoqa.com/");
	    //to check navigated url is as expected on console
	    System.out.println(dr.getCurrentUrl());
	    //to get page source
	    //System.out.println(dr.getPageSource());
	    //to get title
	    System.out.println(dr.getTitle());
	    //to find xpath
	    
	    
//	    WebElement element = dr.findElement(By.xpath("//span[@class='icon']"));
//	    //WebElement element = dr.findElement(By.className("searchform"));
//        /*element.sendKeys("iPod");*/
//        element.click();
	    
	    /*WebElement element = dr.findElement(By.linkText("More Details"));
	    element.click();*/
	  
	   
	   
	    
	}

}
