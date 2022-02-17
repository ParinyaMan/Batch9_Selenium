package Day06;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassHoverOver {
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Ignore
	@Test
	public void test1() {
		
		Actions action = new Actions(driver);
		
		WebElement accountListButton = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		action.moveToElement(accountListButton).build().perform();
		
		
		
	}
	
	@Test
	public void test2() {
		
		driver.get("http://automationpractice.com/index.php");
		//click on dress tap
		driver.findElement(By.xpath("(//a[@title='Dresses'][normalize-space()='Dresses'])[2]")).click();
		Actions action = new Actions(driver);
		
		WebElement firstProduct = driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]"));
		//hover over on first product
		action.moveToElement(firstProduct).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		
	}
	
}
