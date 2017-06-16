package com.demo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://toolsqa.com/automation-practice-form/");
        dr.manage().window().maximize(); 
        
        dr.findElement(By.linkText("Link Test")).click();
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.navigate().back();
        dr.findElement(By.partialLinkText("Partial")).click();
        
        
        dr.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("Rohini");

        dr.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys("Burde");
        dr.findElement(By.xpath(".//*[@id='sex-1']")).click();
        dr.findElement(By.xpath(".//*[@id='exp-1']")).click();
        WebElement month = dr.findElement(By.xpath(".//*[@id='continents']"));
        Select ab = new Select(month);
        ab.selectByIndex(2);
        dr.findElement(By.xpath(".//*[@id='datepicker']")).sendKeys("5/15/2017");
        dr.findElement(By.xpath(".//*[@id='profession-1']")).click();
        //To check checkbox is selected
        System.out.println(dr.findElement(By.xpath(".//*[@id='profession-1']")).isSelected());
        //dr.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
        /*org.openqa.selenium.Alert al =dr.switchTo().alert();
        al.dismiss();
        */

        dr.findElement(By.xpath(".//*[@id='tool-2']")).click();
        System.out.println(dr.findElement(By.xpath(".//*[@id='tool-2']")).isSelected());
        ab.selectByIndex(4);
        System.out.println(dr.findElement(By.xpath(".//*[@id='content']/h1")).getText());
	}

}
