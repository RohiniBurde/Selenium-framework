package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReirectOnEachLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.amazon.in/?tag=googinhydmabk-21&ref_=pd_mn_ABKror78");
		List<WebElement> alllinkss = dr.findElements(By.tagName("a"));
		System.out.println("Total links"+ alllinkss.size());
		
		for (int i = 0; i < alllinkss.size(); i++) {
			Thread.sleep(5000L);
			System.out.println(alllinkss.get(i).getText());
			alllinkss.get(i).click();
			System.out.println(dr.getTitle());
			dr.get("http://www.amazon.in/?tag=googinhydmabk-21&ref_=pd_mn_ABKror78");
			System.out.println("************");
			
		}
		
		
		
		
		
		
	}

}
