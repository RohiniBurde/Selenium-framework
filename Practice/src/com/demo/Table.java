package com.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://toolsqa.com/automation-practice-table/");
		WebElement table = dr.findElement(By.className("tsc_table_s13"));
		//finding rows in a table
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("no of rows are"+ "  " +rows.size());
		 //finding column no.
		int i = 0;
		
		for (WebElement eachrow : rows) {
			
			List<WebElement> eachcol = eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("No.of columns"+" " +i+ "in rows are" +" "+ eachcol.size());
		//to find value in each col
			for (WebElement eachtext : eachcol) {
				
				System.out.println(eachtext.getText());
				
			}
		}
		
			
		}
	}

