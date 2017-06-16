package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
        
        dr.findElement(By.xpath(".//*[@id='menu1']")).click();
        
        Thread.sleep(2000);
        
       List<WebElement> list = dr.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

   for (WebElement ele : list) {

	   System.out.println("values are"+ ele.getAttribute(""));
	   
}
	}
}
        /*for (WebElement ele : list) {

 
                  System.out.println("Values " + ele.getAttribute("innerHTML"));



                  // Here we will verify if link (item) is equal to Java Script

                  if (ele.getAttribute("innerHTML").contains("JavaScript")) {

                     // if yes then click on link (iteam)

                     ele.click();



                     // break the loop or come out of loop

                     break;

                  }

               }

               // here you can write rest piece of code

           }

}}

}
*/