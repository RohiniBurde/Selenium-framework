package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("https://www.ebay.com/");
        dr.manage().window().maximize(); 
        System.out.println("Total no. of links in the page are:");
        System.out.println(dr.findElement(By.tagName("a")).getSize());
        WebElement foot = dr.findElement(By.xpath(".//*[@id='glbfooter']"));
        System.out.println("Total links in footer are:");
        System.out.println(foot.findElement(By.tagName("a")).getSize());
        WebElement foot2 = dr.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
        System.out.println("Total links in footer 2nd column are:");
        System.out.println(foot2.findElement(By.tagName("a")).getSize());
//        int size= dr.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"")
//    
//
//        for(int i: size)
//        {
//        	
//        }
    
}
}
