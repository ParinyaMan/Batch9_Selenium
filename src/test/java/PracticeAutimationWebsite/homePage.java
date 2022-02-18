package PracticeAutimationWebsite;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePage {
	WebDriver driver;
	By menuButton = By.xpath("//li[@id='menu-item-40']");
	By homeButton = By.xpath("//div[@id='content']/nav/a");

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

//		driver.findElement(By.xpath("//html")).click();
//        3) Click on Shop Menu
		driver.findElement(menuButton).click();
//        4) Now click on Home menu button
		driver.findElement(homeButton).click();
//        5) Test whether the Home page has Three Sliders only
		// coming back to this test case next week to complete steps
		List<WebElement> sliders = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div"));
		int numberOfSliders = sliders.size();

		if (numberOfSliders == 3) {
			System.out.println("Sliders count is 3");
		} else {
			System.out.println("failed");
		}

	}

	@Ignore
	@Test
	public void TestCase2() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		if (numberOfArrivals == 3) {
			System.out.println("Home page has Three Arrivals only");
		} else {
			System.out.println("failed");
			System.out.println(numberOfArrivals);
		}

	}

	@Ignore
	@Test
	public void TestCase3() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
	}

	@Ignore
	@Test
	public void TestCase4() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		driver.findElement(By.xpath("//a[normalize-space()='Description']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Product Description']")).getText(),
				"Product Description");
		System.out.println("It's show Product Description");
	}

	@Ignore
	@Test
	public void TestCase5() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		driver.findElement(By.xpath("//a[normalize-space()='Reviews (0)']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Reviews']")).getText(), "Reviews");
		System.out.println("It's show Reviews");

	}

	@Ignore
	@Test
	public void TestCase6() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
	}

	@Ignore
	@Test
	public void TestCase7() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("7933");
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		System.out.println("Error Prompt");
	}

	@Ignore
	@Test
	public void TestCase8() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
	}

	@Ignore
	@Test
	public void TestCase9() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// update book to 3 and add to basket for coupon usage purpose
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("3");
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// apply coupon
		driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("krishnasakinala");
		driver.findElement(By.xpath("//input[@name='apply_coupon']")).click();
		System.out.println("Coupon Applied :"
				+ driver.findElement(By.xpath("//td[@data-title='Coupon: krishnasakinala']")).getText());
	}

	@Ignore
	@Test
	public void TestCase10() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// apply coupon
		driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("krishnasakinala");
		driver.findElement(By.xpath("//input[@name='apply_coupon']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='body']//li[1]")).getText());
	}

	@Ignore
	@Test
	public void TestCase11() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// remove
		driver.findElement(By.xpath("//a[normalize-space()='×']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='cart-empty']")).getText());
	}

	@Ignore
	@Test
	public void TestCase12() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// update book quantity
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='update_cart']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText());
	}

	@Ignore
	@Test
	public void TestCase13() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Total is: " + driver
				.findElement(
						By.xpath("//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']"))
				.getText());
	}

	@Ignore
	@Test
	public void TestCase14() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// update book quantity
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='update_cart']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText());
	}

	@Ignore
	@Test
	public void TestCase15() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Subtotal: " + driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText());
		System.out.println("Total: "
				+ driver.findElement(By.xpath("//tr[@class='order-total']//td[@data-title='Total']")).getText());

	}

	@Ignore
	@Test
	public void TestCase16() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Subtotal: " + driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText());
		System.out.println("Total: "
				+ driver.findElement(By.xpath("//tr[@class='order-total']//td[@data-title='Total']")).getText());
		// click proceed to checkout
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
		System.out.println(driver.getTitle());

	}

	@Ignore
	@Test
	public void TestCase17() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Subtotal: " + driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText());
		System.out.println("Total: "
				+ driver.findElement(By.xpath("//tr[@class='order-total']//td[@data-title='Total']")).getText());
		// click proceed to checkout
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
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
		// add coupon
		driver.findElement(By.xpath("//a[normalize-space()='Click here to enter your code']")).click();
		driver.findElement(By.xpath("(//input[@id='payment_method_cod'])[1]")).click();

	}

	@Test
	public void TestCase18() throws InterruptedException {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		Assert.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Subtotal: " + driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText());
		System.out.println("Total: "
				+ driver.findElement(By.xpath("//tr[@class='order-total']//td[@data-title='Total']")).getText());
		// click proceed to checkout
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
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

		// click place order
		driver.findElement(By.xpath("//input[@id='place_order']")).click();
		// print order details
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]")).getText());
	}

}