package Day09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Driver;
import utilities.PropertiesReader;

public class testingWebDriver {
	
	
	@Before
	public void setUp() {
		Driver.getDriver();
		
		
	}
	@Test
	public void orderShortCode() {
		// no hard code here
//		driver.findElement(By.id("userIdLabel")).sendKeys(PropertiesReader.getProperty("username"));
//		driver.findElement(By.id("password")).sendKeys(PropertiesReader.getProperty("freedom123!"));
//		driver.findElement(By.xpath("/html/body/app-root/div[2]/scr-login/div[3]/form/div[3]/button")).click();
	
	}
//	@After
//	public void afterMethod() {
//		Driver.tearDown();
//	}
	
	
	
	
}
