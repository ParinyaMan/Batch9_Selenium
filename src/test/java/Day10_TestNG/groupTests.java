package Day10_TestNG;

import org.testng.annotations.Test;

public class groupTests {
	@Test(groups = {"Smoke", "Regression"})
	public void test1() {
		
	}
	@Test(groups = {"Smoke"})
	public void test2() {
		
	}
	@Test(groups = {"Smoke"})
	public void test3() {
		
	}
	@Test(groups = {"Regression", "Integration"})
	public void test4() {
		
	}
	
}
