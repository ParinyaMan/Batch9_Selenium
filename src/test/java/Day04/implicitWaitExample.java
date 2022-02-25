package Day04;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWaitExample {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait for browser to load all the object
		
	}
	
	@Test
	public void test1() {
		
	}
	
	
}
