package utilities;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getDriver() throws MalformedURLException {

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
			case "SauceDriver":
				ChromeOptions browserOptions = new ChromeOptions();
			    browserOptions.setCapability("platformName", PropertiesReader.getProperty("platformVersion"));
			    browserOptions.setCapability("browserVersion", PropertiesReader.getProperty("brownserVersion"));
			    Map<String, Object> sauceOptions = new HashMap<>();
			    browserOptions.setCapability("sauce:options", sauceOptions);        
			    driver = new RemoteWebDriver(new URL(Constants.saceLabURL), browserOptions);
				break;

			}

		}
		driver.get(PropertiesReader.getProperty("url"));
		// maximize
		driver.manage().window().maximize();

		return driver;
	}
	
	public static void startBrowser() {
		//driver get URL
		//wait
		//max.windows
		
	}

	// close/quit browser
	@AfterMethod
	public static void tearDown() {
		if (driver != null) {
			driver.close();
			// driver.quit();
			driver = null;
		}
	}
	
	
	
	
	private static Properties configFile;

	static {

		try {
			String filePath = "src/test/resources/dataFolder/config.properties";

			FileInputStream input = new FileInputStream(filePath);

			configFile = new Properties();
			configFile.load(input);

			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
	
	
	
	
	
	
	
	
	
	
}
