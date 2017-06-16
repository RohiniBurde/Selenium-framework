package org.demo.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyTest {
  @Test
  public void MyMethod1() {
	  System.out.println("Method1 executed");
  }
  
  //@Test(dependsOnMethods={"MyMethod1"})
  //@Test(enabled=true)
  
  @Test
  public void MyMethod2() {
	  System.out.println("Method2 executed");
  } 
  @Test
  public void MyMethod3() {
	  System.out.println("Method3 executed");
  } 
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Executes before every method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Executes after every method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Executes only once before methods execution");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Executes only once after methods execution");
  }

}
