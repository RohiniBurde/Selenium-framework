package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Listelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://toolsqa.com/automation-practice-form/");
        dr.manage().window().maximize(); 
        
        List<WebElement> abc = dr.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(abc.size());
        abc.get(1).click();
        abc.get(3).click();
	}

}
