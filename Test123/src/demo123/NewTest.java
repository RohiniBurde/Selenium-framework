package demo123;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class NewTest {
	@Test(groups = {"priority2"})
	@Parameters({ "adminUserid", "adminPwd" })
	public void anotherclass(String uname, String pwd) {
	System.out.println("hjhg");
		System.out.println("gj");

	System.out.println("This is another class ");
	}

	
     /*@Test(groups = {"priority2"})
	
	public void anotherclass3() {
		System.out.println("Priority 2 ");
	}*/
	
	
	@Test(groups = {"priority1"})
	
	public void anotherclass2() {
		System.out.println("Priority 1 ");
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
