package com.demo;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownGetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://toolsqa.com/automation-practice-form/");
        dr.manage().window().maximize(); 
        
        WebElement address = dr.findElement(By.xpath(".//*[@id='continents']"));
	    org.openqa.selenium.support.ui.Select drop = new  org.openqa.selenium.support.ui.Select(address);
	    
	    drop.selectByIndex(4);
	    
	    List<WebElement> alloptins = address.findElements(By.tagName("option"));
	    System.out.println("Total options="+ alloptins.size());
	    
	    for (int i = 0; i < alloptins.size(); i++) {
	    	
	    	System.out.println(alloptins.get(i).getText());
			
		}
	    
	
	
	
	
	}
	

}
