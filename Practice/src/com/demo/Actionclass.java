package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://www.amazon.in/?tag=googinhydmabk-21&ref_=pd_mn_ABKror78");
        dr.manage().window().maximize(); 
        
        
        
        Actions abs = new Actions(dr);
		WebElement elem = dr.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
		abs.moveToElement(elem).build().perform();
		
		
		
		//to pass capital letters
		
		WebElement elem2 = dr.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abs.keyDown(Keys.SHIFT).moveToElement(elem2).sendKeys("ipod").build().perform();
		//to rightclick
		
		abs.contextClick(elem2).build().perform();
	}

}
