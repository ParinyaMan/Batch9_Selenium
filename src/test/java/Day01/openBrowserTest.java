package Day01;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserTest {

	
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test1() {
		
	}
	
	
	@After
	public void afterTest() {
		driver.close();
	}	
	
	
//	public static void main(String[] args) {
//		
//		WebDriver driver;
//		
//		WebDriverManager.chromedriver().setup();  //from boni gracia
//		
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.techcircleschool.com");
//		
//		//use Maven to install the dependencies 
//
//	}

}
