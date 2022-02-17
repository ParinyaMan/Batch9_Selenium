package Day01;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserTest {
//	++link: Features
//	1. //a[text()='Features']
//	2. //a[contains(text(),'Features')] --recommended
//
//	++button:
//	//button[@type='button' and @class='btn']
//	//button[contains(text(),'Sign Up')]
//	//div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']
//	//button[@id='dropdownMenuButton']
//
//	++preceding-sibling:
//	//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input
//
//	++parent & preceding-sibling:
//
//	//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
 	
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
//		driver.manage().window().maximize();
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
