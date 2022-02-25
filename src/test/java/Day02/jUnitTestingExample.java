package Day02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class jUnitTestingExample {
	
	@BeforeMethod
	public void setUp() {
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.techcircleschool.com");
		System.out.println("Opening Browser");
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Closing Browser");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

}
