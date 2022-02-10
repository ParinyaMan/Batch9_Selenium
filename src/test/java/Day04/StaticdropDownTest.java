package Day04;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticdropDownTest {
	
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void staticDropDown() throws InterruptedException {
		
		
		WebElement staticDropDown = driver.findElement(By.id("dropdown"));
		Select s = new Select(staticDropDown);
		
		Thread.sleep(2000);	
		
		s.selectByIndex(1); //option 1
		Thread.sleep(3000);		
		s.selectByValue("2"); //option 2
		Thread.sleep(3000);	
		s.selectByVisibleText("Option 1"); //option 1
		Thread.sleep(3000);	
		driver.close();
		
		
		
	}
}
