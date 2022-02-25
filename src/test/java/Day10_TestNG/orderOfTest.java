package Day10_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class orderOfTest {
	@Test(priority=1)
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=3, enabled=false) //skip not to run this method
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=4)
	public void test4() {
		System.out.println("Test4");
	}
	@Test(priority=1)	//make it run same as test1 and follow by alphabet
	public void test5() {
		System.out.println("Test5");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	
	
	
	
}
