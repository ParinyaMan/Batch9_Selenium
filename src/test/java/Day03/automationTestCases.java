package Day03;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automationTestCases {
	
	WebDriver driver;

	@Before
	public void beforeMethod() {
//		1) Open the browser
//		2) Enter the URL “http://practice.automationtesting.in/”
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void TestCase1() {
//		5) Test whether the Home page has Three Sliders only

		
//		3) Click on Shop Menu
		driver.findElement(By.xpath("//li[@id=\"menu-item-40\"]/a")).click();
		//close ad
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/svg")).click();
//		4) Now click on Home menu button		
		driver.findElement(By.xpath("//div[@id=\"content\"]/nav/a")).click();
	}
	
	
	
	
	
	
}
