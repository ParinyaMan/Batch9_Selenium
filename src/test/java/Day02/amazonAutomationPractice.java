package Day02;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonAutomationPractice {
/*1. Go to Amazon 
2. Send "any key" 
3. click search 
4. select one of the item 
5. add it to cart
6. validate the item in the cart
7. remove the item
8. validate the cart is empty
9. navigate to youtube 
10. validate the title is youtube 
11. search video 
12. play the video.*/
	
	WebDriver driver;

	@Before
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void searchBox() throws InterruptedException {
		String cart = "$0.00";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dove men shampoo");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div[1]/span/a/div/img"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"newAccordionRow\"]/div/div[1]/a")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		String subtotal = driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-buybox\"]/span")).getText();
		if (subtotal.equals(cart)) {
			System.out.println("Cart is empty");
		} else
			System.out.println("Your item in the cart");
		System.out.println(subtotal);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"quantity_0\"]")).click();
		Thread.sleep(2000);
		String empty = driver.findElement(By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1")).getText();
		System.out.println(empty);
		driver.get("https://www.youtube.com/");
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "Youtube";

		if (expectedPageTitle.equalsIgnoreCase(actualPageTitle)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Failed");
		}

		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("metaverse");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//img[@src='https://i.ytimg.com/vi/gElfIo6uw4g/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDr1xoj5FKb13JINMHvWLLVq0QT2Q']"))
				.click();

	}

}
