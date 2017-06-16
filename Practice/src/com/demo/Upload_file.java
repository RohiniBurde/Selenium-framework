package com.demo;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Upload_file {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        String baseUrl = "http://demo.guru99.com/selenium/upload/";
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\rohini.burde\\Documents\\AvailableResourceCreation\\AvailableResourceCreation.docx");

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        }
}