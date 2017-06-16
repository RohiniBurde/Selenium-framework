package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://us.jetcost.com/en/airlines/indigo");
		dr.findElement(By.xpath(".//*[@id='main-search-flight']/section/section/div[3]/div[1]/input[2]")).click();
		
		List<WebElement> allDates = dr.findElements(By.xpath("//table[@class='day start selstart selected']//tbody//tr//td "));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("30"))
			{
				ele.click();
				break;
			}
			
		}
		
	}

}
