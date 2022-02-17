package Day05;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonListTask {
	
//	go to amazon.com
//	type in search "iphone"
//	click on the first iphone the price over $1400, if the first page not found, click go to the next page until it found
//	print the name of the product
//	then verify the price that actually over $1400
	
	
//	return sponsored logo
//			//div[@class='a-section']//span[@class='a-price-whole']/ancestor::div[@class='a-section']//span[@class='s-label-popover-default']
//			return price that has sponsored
//			//div[@class='a-section']//span[@class='a-price-whole'][./ancestor::div[@class='a-section']//span[@class='s-label-popover-default']]
//			return price that NOT has sponsored
//			//div[@class='a-section']//span[@class='a-price-whole'][not(./ancestor::div[@class='a-section']//span[@class='s-label-popover-default'])]
//	
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
    @Test
    public void TestCase1() throws InterruptedException {

    	
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
//		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		
        List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div"));
        							   
        	
        	for (int i = 8; i < items.size(); i++) {
            	WebElement price = driver
                        .findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[" + i
                                + "]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[1]/span[2]/span[2]"));
            	System.out.println(price.getText());
            	
            	if (Integer.parseInt(price.getText()) <= 150) {
            		price.click();
            		break;
            	}
            	
			}

        
        
        
    }
//	WebDriver driver;
//
//    @Before
//    public void beforeMethod() {
////        1) Open the browser
////        2) Enter the URL �http://practice.automationtesting.in/�
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");
//        driver.manage().window().maximize();
//
//    }
//
//    @Test
//    public void test() {
//
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone", Keys.ENTER);
//
//        List<WebElement> searchResults = driver
//                .findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div"));
//
//        for (int i = 8; i < searchResults.size(); i++) {
//
//            WebElement eachPrice = driver
//                    .findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[" + i
//                            + "]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[1]/span[2]/span[2]"));
//
//            System.out.println(eachPrice.getText());
//
//            if (Integer.parseInt(eachPrice.getText()) <= 150) {
//                eachPrice.click();
//                break;
//            }
//
//        }
//
//    }
}

