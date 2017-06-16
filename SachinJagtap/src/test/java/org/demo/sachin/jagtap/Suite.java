package org.demo.sachin.jagtap;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Suite {
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite");
  }

}
