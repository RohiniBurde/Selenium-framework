package com.demo;

import org.openqa.selenium.Alert;		
import org.openqa.selenium.By;		
import org.openqa.selenium.NoAlertPresentException;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;		

public class Alert_Demo {				
        		
        public static void main(String[] args) throws NoAlertPresentException, InterruptedException {		
        	System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();		
           
    		
         
                        		
           driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");	
           
         
//           
//           driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();;	
//           Alert alert=driver.switchTo().alert();
//           Thread.sleep(5000);
//           String alertMessage1=driver.switchTo().alert().getText();
//           Thread.sleep(5000);
//           System.out.println(alertMessage1);			
//   		   alert.accept();		
//   		   
   		   
   		   
           driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();	
           Alert alert=driver.switchTo().alert();   
           Thread.sleep(5000);
           String alertMessage2=driver.switchTo().alert().getText();
           Thread.sleep(5000);
           System.out.println(alertMessage2);			
   		   alert.accept();		
   		   
           
//           driver.findElement(By.xpath(".//*[@id='content']/p[11]/button"));	
//          
//           Thread.sleep(5000);
//           String alertMessage3=driver.switchTo().alert().getText();
//           Thread.sleep(5000);
//           System.out.println(alertMessage3);			
//   		   alert.accept();		
   		   		
   		   
      	
                		
        }		
}		