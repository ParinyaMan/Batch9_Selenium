package PracticeAutimationWebsite;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shop {
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

	@Ignore
	@Test
	public void TestCase1() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Adjust the filter by price between 150 to 450 rps
		WebElement slider = driver.findElement(By.xpath(
				"//div[@class='price_slider ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']//span[2]"));
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(slider, -27, 0).build();
		action.perform();
//		5) Now click on Filter button
		driver.findElement(filterButton).click();
//		6) User can view books only between 150 to 450 rps price
		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[\"i\"]"));
		for (WebElement book : books) {
			System.out.println(book.getText());
		}

	}

	@Ignore
	@Test
	public void TestCase2() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click any of the product links available in the product category
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[1]/h3")).click();
//		5) Now user can view only that particular product
		System.out.println(driver.getTitle());

	}

	@Ignore
	@Test
	public void TestCase3() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on Sort by Popularity item in Default sorting dropdown
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("popularity");
//		5) Now user can view the popular products only
		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[\"i\"]"));
		for (WebElement book : books) {
			System.out.println(book.getText());
		}

	}

	@Ignore
	@Test
	public void TestCase4() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on Sort by Average ratings in Default sorting dropdown
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("rating");
//		5) Now user can view the popular products only***Average
		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[\"i\"]"));
		for (WebElement book : books) {
			System.out.println(book.getText());
		}

	}

	@Ignore
	@Test
	public void TestCase5() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on Sort by Newness ratings in Default sorting dropdown
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("date");
//		5) Now user can view the popular products only***Newness
		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[\"i\"]"));
		for (WebElement book : books) {
			System.out.println(book.getText());
		}

	}

	@Ignore
	@Test
	public void TestCase6() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on Sort by Low to High Item in Default sorting dropdown
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("price");
//		5) Now user can view the popular products only***Low to High
		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[\"i\"]"));
		for (WebElement book : books) {
			System.out.println(book.getText());
		}

	}

	@Ignore
	@Test
	public void TestCase7() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on Sort by High to Low Item in Default sorting dropdown
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/form/select")));
		select.selectByValue("price-desc");
//		5) Now user can view the popular products only***High to Low
		List<WebElement> books = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[\"i\"]"));
		for (WebElement book : books) {
			System.out.println(book.getText());
		}

	}

	@Ignore
	@Test
	public void TestCase8() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on read more button in home page
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[2]")).click();
//		5) Read More option indicates the Out Of Stock.
//		6) User cannot add the product which has read more option as it was out of stock.	
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/p")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product-160\"]/div[2]/p")).getText());

	}

	@Ignore
	@Test
	public void TestCase9() {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on Sale written product in home page
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[1]/span[1]")).click();
//		5) User can clearly view the actual price with old price striken for the sale written products
		System.out.println(driver.findElement(By.xpath("//*[@id=\"product-169\"]/div[2]/div[1]/p")).getText());
	}

	@Ignore
	@Test
	public void TestCase10() throws InterruptedException {
//		3) Click on Shop Menu
		driver.findElement(shopButton).click();
//		4) Click on the Add To Basket button which adds that book to your basket
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
//		5) User can view that Book in the Menu item with price .
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).getText());
//		6) Now click on View Basket link which navigates to proceed to check out page.	
		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
//		7) Now user can find total and subtotal values just above the Proceed to Checkout button.
//		8) The total always < subtotal because taxes are added in the subtotal
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/table")).getText());
//		9) Now click on Proceed to Check out button which navigates to payment gateway page.
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
//		10) User can view Billing Details,Order Details,Additional details and Payment gateway details.
//		11) Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.		
		System.out.println(driver.getTitle());
		// fake info
		Faker faker = new Faker();
		// input info
		driver.findElement(By.id("billing_first_name")).sendKeys(faker.name().firstName());
		driver.findElement(By.id("billing_last_name")).sendKeys(faker.name().firstName());
		driver.findElement(By.id("billing_email")).sendKeys(faker.name().firstName() + "@gmail.com");
		driver.findElement(By.id("billing_phone")).sendKeys(faker.phoneNumber().cellPhone());
		driver.findElement(By.id("billing_address_1")).sendKeys(faker.address().streetAddress());
		driver.findElement(By.id("billing_city")).sendKeys(faker.address().city());
		driver.findElement(By.xpath("//a[@class='select2-choice select2-default']")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-results-2\"]/li[7]")).click();
		driver.findElement(By.id("billing_postcode")).sendKeys(faker.address().zipCode());
//		12) Now click on Place Order button to complete process
		driver.findElement(By.xpath("//input[@id='place_order']")).click();
//		13) On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]")).getText());

	}

	@Ignore
	@Test
	public void TestCase11() throws InterruptedException {
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
//		9) Now click on Proceed to Check out button which navigates to payment gateway page.
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
//		10) User can view Billing Details,Order Details,Additional details and Payment gateway details.
//		11) Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.		
		System.out.println(driver.getTitle());
		// fake info
		Faker faker = new Faker();
		// input info
		driver.findElement(By.id("billing_first_name")).sendKeys(faker.name().firstName());
		driver.findElement(By.id("billing_last_name")).sendKeys(faker.name().firstName());
		driver.findElement(By.id("billing_email")).sendKeys(faker.name().firstName() + "@gmail.com");
		driver.findElement(By.id("billing_phone")).sendKeys(faker.phoneNumber().cellPhone());
		driver.findElement(By.id("billing_address_1")).sendKeys(faker.address().streetAddress());
		driver.findElement(By.id("billing_city")).sendKeys(faker.address().city());
		driver.findElement(By.xpath("//a[@class='select2-choice select2-default']")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-results-2\"]/li[7]")).click();
		driver.findElement(By.id("billing_postcode")).sendKeys(faker.address().zipCode());
//		12) Now click on Place Order button to complete process
		driver.findElement(By.xpath("//input[@id='place_order']")).click();
//		13) On clicking place order button user completes his process where the page navigates to Order confirmation page with order details,bank details,customer details and billing details.
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]")).getText());

	}

	@Test
	public void TestCase12() throws InterruptedException {
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
		driver.findElement(By.xpath("//*[@id=\"s2id_billing_country\"]")).click();
		List<WebElement> countries = driver.findElements(By.xpath("//*[@id=\"select2-results-1\"]/li"));
	    Scanner scan = new Scanner(System.in); 
	    System.out.println("Enter your country");
	    String input = scan.nextLine();
		for (WebElement country : countries) {
			String c = country.getText();
			System.out.println(c);
			if (c.equalsIgnoreCase("India")) {
				country.click();
				Thread.sleep(3000);
				String subtotal = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span"))
						.getText().replace("₹", "");
				String tax = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[2]/td")).getText()
						.replace("₹", "");
				if ((Double.parseDouble(tax) / Double.parseDouble(subtotal)) * 100 == 2) {
					System.out.println(c+" tax is 2%");

				}
			
			}

			if (c.equalsIgnoreCase(input)) {
				country.click();
				String subtotal = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span"))
						.getText().replace("₹", "");
				String tax = driver.findElement(By.xpath("//*[@id=\"order_review\"]/table/tfoot/tr[2]/td")).getText()
						.replace("₹", "");
				if ((Double.parseDouble(tax) / Double.parseDouble(subtotal)) * 100 == 5) {
					System.out.println(c + " tax is 5%");

				}

			}
		}

	}
}
