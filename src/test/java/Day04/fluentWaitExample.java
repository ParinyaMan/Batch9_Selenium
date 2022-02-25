package Day04;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fluentWaitExample {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//wait frequently like for 5 seconds until condition meet until 30 seconds
		
		
	}
	
	@Test
    public void test1() {
		//set interval 5 seconds for 30 seconds
		Wait wait = new FluentWait(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
		//if exeption just ignore it
				.ignoring(Exception.class);
		
		
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
