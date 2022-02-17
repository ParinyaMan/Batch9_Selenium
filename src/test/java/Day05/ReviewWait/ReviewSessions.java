package Day05.ReviewWait;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReviewSessions {
		
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	
	@Test
	public void test1() {
		driver.findElement(By.name("q")).sendKeys("TechCircle School", Keys.ENTER);
		
		wait = new WebDriverWait(driver, 30);
		
		WebElement resultText = driver.findElement(By.id("result-stats"));
		
		wait.until(ExpectedConditions.visibilityOf(resultText));
		
		System.out.println(resultText.getText());
		
		
	}
	
    
    
    @Test
    public void test() {
        //handle alert
    	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        
        driver.switchTo().alert().accept();
        
        
    }
	
	
	
	
	
	
}
