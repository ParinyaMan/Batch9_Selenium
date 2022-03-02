package Day10;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class dependsOnTest {
	@Test(dependsOnMethods = {"OpenBrowser"}, groups = {"Smoke"})
	public void SignIn() {
		System.out.println("This will excute depending on the success of the open browser method");
	}
	@Test(dependsOnGroups = {"Smoke"}, groups = {"Smoke"})
	public void OpenBrowser() {
		System.out.println("This will execute first (open browser)");
		AssertJUnit.assertTrue(false);
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
