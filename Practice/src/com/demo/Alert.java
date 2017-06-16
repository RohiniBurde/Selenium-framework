package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://toolsqa.com/automation-practice-switch-windows/");
        dr.findElement(By.xpath(".//*[@id='alert']")).click();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        org.openqa.selenium.Alert al =dr.switchTo().alert();
        System.out.println(al.getText());
        al.accept(); //for +ve
        
         
        //al.dismiss();//for -ve scenario
        
	}

}
