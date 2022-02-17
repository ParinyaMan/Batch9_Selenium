package Day06;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertionsTest {

	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Ignore
	@Test
	public void assertFalseTest() {

		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

		Assert.assertFalse(checkbox1.isSelected()); // expected to be false so passed
		System.out.println("Hello");

		Assert.assertFalse(checkbox2.isSelected()); // expected to be false but it true so failed
		System.out.println("Hello");

	}
	
	@Ignore
	@Test
	public void assertTrueTest() {

		Assert.assertTrue(driver.findElement(By.xpath("(//h3[normalize-space()='Checkboxes'])[1]")).isDisplayed());
		System.out.println("Code didn't throw an exception on assertTrueTest");

	}
	
	@Test
	public void assertEqualsTest() {

		String actualTitle = driver.findElement(By.xpath("(//h3[normalize-space()='Checkboxes'])[1]")).getText();
		String expectedTitle = "Checkboxes";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Passed");
		
	}
	
	
	

}
