package Day09;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class testingWebDriver {
	
	
	@BeforeMethod
	public void setUp() {
		Driver.getDriver();
	}
//	@After
//	public void afterMethod() {
//		Driver.tearDown();
//	}
	@Test
	public void orderShortCode() {
		// no hard code here
//		driver.findElement(By.id("userIdLabel")).sendKeys(PropertiesReader.getProperty("username"));
//		driver.findElement(By.id("password")).sendKeys(PropertiesReader.getProperty("freedom123!"));
//		driver.findElement(By.xpath("/html/body/app-root/div[2]/scr-login/div[3]/form/div[3]/button")).click();
	
	
	}

	
	
	
	
}
