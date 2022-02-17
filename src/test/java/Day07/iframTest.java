package Day07;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframTest {
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	
	@Test
	public void dragAndDropTest() {
		Actions action = new Actions(driver);
//	  List<WebElement> iframes = driver.findElements(By.xpath("//iframe"));
//	  // print your number of frames
//	  System.out.println(iframes.size());
		
		//switch to iframe that has element inside
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(draggable, droppable).build().perform();
		
		//switch back to default content or top page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Button'])[1]")).click();
		
		
	}
}
