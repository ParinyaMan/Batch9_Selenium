package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	//we don't want to create Driver from anywhere again
	private Driver() {}
	//declare WebDriver at class level
	public static WebDriver driver;
	//static you can access without create an object of this method
	public static WebDriver getDriver() {
		if (driver == null) {
			switch (PropertiesReader.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case "headless":
				// code
				break;
			}
		}
		driver.get(PropertiesReader.getProperty("shortCodeURL"));
		//maximize
//		driver.manage().window().maximize();
		return driver;
	}
	
	//close / quit browser
	public static void tearDown() {
		if(driver != null) {
			driver.close();
			//driver.quit();
			driver = null;
		}
	}
	
	public static void login() {
		driver.findElement(By.id("userIdLabel")).sendKeys(PropertiesReader.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(PropertiesReader.getProperty("passwordShrtCode"));
		driver.findElement(By.xpath("/html/body/app-root/div[2]/scr-login/div[3]/form/div[3]/button")).click();
	}
	
	
}
