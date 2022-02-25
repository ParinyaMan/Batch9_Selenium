package Day02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class openAndVerifyTitle {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();  
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
	
	@Test(enabled = false)
	public void verifyTitle() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Youtube";
		
		if(expectedPageTitle.equalsIgnoreCase(actualPageTitle)) {
			System.out.println("Title matched and Passed");
		}else {
			System.out.println("Failed");
			System.out.println("Expected to see -->" + expectedPageTitle);
			System.out.println("The Driver got -->" + actualPageTitle);
		}
		
	}
	
	@Test(enabled = false)
	public void verifyURL() {
		String actualtUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.youtube.com/";
		
		if(expectedUrl.equalsIgnoreCase(actualtUrl)) {
			System.out.println("URL matched and Passed");
		}else {
			System.out.println("Failed");
			System.out.println("Expected to see -->" + expectedUrl);
			System.out.println("The Driver got -->" + actualtUrl);
		}
		
	}
	
	@Test
	public void pageSourcePrint() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.navigate().to("https://www.techcircleschool.com");
		driver.navigate().back(); //navigate back to youtube
	}
	
	
}
