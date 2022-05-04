package Day06;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassDragDrop {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() {
		
		Actions action = new Actions(driver);
		
		WebElement boxA = driver.findElement(By.xpath("(//div[@id='column-a'])[1]"));
		WebElement boxB = driver.findElement(By.xpath("(//div[@id='column-b'])[1]"));
		
		//action.dragAndDrop(boxA, boxB).release().build().perform();
		action.clickAndHold(boxA).moveToElement(boxB).release().build().perform();
		
		
	}
}
