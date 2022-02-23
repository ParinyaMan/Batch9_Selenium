package Day01;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCaseTest {
	WebDriver driver;
	By shopButton = By.xpath("//a[normalize-space()='Shop']");
	By filterButton = By.xpath("//button[normalize-space()='Filter']");
//	By registerPassword = By.id("reg_password");
//	String email = "123abc@gmail.com";
//	String password = "TechCircle789!qe";

	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void ShopAddBasketViewBasketTaxFunctionality() throws InterruptedException {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on the Add To Basket button which adds that book to your basket
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
//		5) User can view that Book in the Menu item with price .
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).getText());
//		6) Now click on Item link which navigates to proceed to check out page.	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[3]")))).click();
//		7) Now user can find total and subtotal values just above the Proceed to Checkout button.
//		8) The total always < subtotal because taxes are added in the subtotal
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table")).getText());
//		9) The tax rate variers for India compared to other countries
//		10) Tax rate for indian should be 2% and for abroad it should be 5%
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"s2id_billing_country\"]")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"s2id_billing_country\"]")).click();
		List<WebElement> countries = driver.findElements(By.xpath("//*[@id=\"select2-results-1\"]/li"));
	    Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter your country");
	    String input = scan.nextLine();
		for (WebElement country : countries) {
			String c = country.getText();
			System.out.println(c);
			if (c.equalsIgnoreCase(input)) {			
				if (c.equalsIgnoreCase("India")) {
				country.click();
				Thread.sleep(3000);
				String subtotal = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span"))
						.getText().replace("₹", "");
				String tax = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[2]/td")).getText()
						.replace("₹", "");
				if ((Double.parseDouble(tax) / Double.parseDouble(subtotal)) * 100 == 2) {
					System.out.println(c+" tax is 2%");
					break;
				}
				
			}
				country.click();
				String subtotal = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span"))
						.getText().replace("₹", "");
				String tax = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[2]/td")).getText()
						.replace("₹", "");
				if ((Double.parseDouble(tax) / Double.parseDouble(subtotal)) * 100 == 5) {
					System.out.println(c + " tax is 5%");
					break;
				}
				
			}
		}

	}
}
