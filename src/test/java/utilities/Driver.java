package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	//declare WebDriver at class level
	public static WebDriver driver;
	//static you can access without create an object of this method
	public static WebDriver getDriver() {
		if (driver == null) {
			switch (PropertiesReader.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.get(PropertiesReader.getProperty("automationTestCaseURL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
				PageInitializer.initialize();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(PropertiesReader.getProperty("automationTestCaseURL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
				PageInitializer.initialize();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				driver.get(PropertiesReader.getProperty("automationTestCaseURL"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
				PageInitializer.initialize();
				break;
			case "headless":
				// code
				break;
			}
		}
		return driver;
	}
	
	//close / quit browser
	@AfterMethod
	public static void tearDown() {
		if(driver != null) {
			driver.close();
			//driver.quit();
			driver = null;
		}
	}
	

	
	
}
