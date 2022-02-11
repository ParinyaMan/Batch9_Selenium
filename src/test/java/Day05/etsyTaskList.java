package Day05;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class etsyTaskList {
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.etsy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
    @Test
    public void TestCase1() {

    	
    	driver.findElement(By.id("global-enhancements-search-query")).click();
    	driver.findElement(By.id("global-enhancements-search-query")).sendKeys("light");
    	driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[1]/button")).click();
 

        List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[4]/div[5]/div[3]/div[9]/div/div/div[1]/ul/li"));
        
        for(WebElement i:items) {
        	String price = i.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div[4]/div[5]/div[3]/div[9]/div/div/div[1]/ul/li[7]/div/div/a[1]/div[2]/div/div[2]/p[1]/span[2]/span[2]")).getText();
        	Integer itemPrice = Integer.valueOf(price);
        	if(itemPrice>=30 && itemPrice<=50) {
        		
        		break;
        	}
        	System.out.println(itemPrice);
        
        }
        
    }
}
