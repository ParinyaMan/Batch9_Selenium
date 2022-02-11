package Day04;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWaitExample {
	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	
	@Test
    public void test1() {
        
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        //initiating explicit wait object
        WebDriverWait wait = new WebDriverWait(driver, 30);
        
        //waiting for the element to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
        
        //after visibility is true, then store the element text for verification
        String actualWelcomeText = driver.findElement(By.id("welcome")).getText();
        String expected = "Welcome Paul";
    
        
        
        
        if(actualWelcomeText.equalsIgnoreCase(expected)) {
            System.out.println("PASSED");
        }else {
            System.out.println("GO LEARN JAVA");
        }
        
    }
}
