package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://toolsqa.com/automation-practice-switch-windows/");
        dr.manage().window().maximize(); 
        

	}

}
