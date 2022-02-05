package Day02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class jUnitTestingExample {
	
	@Before
	public void setUp() {
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.techcircleschool.com");
		System.out.println("Opening Browser");
	}
	
	@After
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
