package org.demo.sachin.jagtap;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void anotherclass() {
	  System.out.println("This is another class ");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test of another class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test of another class");
  }

}
