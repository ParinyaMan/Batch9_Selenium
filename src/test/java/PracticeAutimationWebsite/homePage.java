package PracticeAutimationWebsite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void afterTest() {
		driver.close();
	}	

	@Test
	public void HomePageWithThreeSlidersOnly() {

//      3) Click on Shop Menu
		driver.findElement(menuButton).click();
//      4) Now click on Home menu button
		driver.findElement(homeButton).click();
//      5) Test whether the Home page has Three Sliders only
		List<WebElement> sliders = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div"));
		int numberOfSliders = sliders.size();

		if (numberOfSliders == 3) {
			System.out.println("Sliders count is 3");
		} else {
			System.out.println("failed");
		}
//		6) The Home page must contains only three sliders
		AssertJUnit.assertTrue(numberOfSliders == 3);
	}

	@Test
	public void HomePageWithThreeArrivalsOnly() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//  	
		driver.findElement(homeButton).click();
//		4) Now click on Home menu button
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
//		5) Test whether the Home page has Three Arrivals only

		if (numberOfArrivals == 3) {
			System.out.println("Home page has Three Arrivals only");
		} else {
			System.out.println("failed");
			System.out.println(numberOfArrivals);
		}
//		6) The Home page must contains only three Arrivals		
		AssertJUnit.assertTrue(numberOfArrivals == 3);
	}

	@Test
	public void HomePageImagesInArrivalsShouldNavigate() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//		4) Now click on Home menu button
		driver.findElement(homeButton).click();
//		5) Test whether the Home page has Three Arrivals only
//		6) The Home page must contains only three Arrivals
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
//		7) Now click the image in the Arrivals
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
//		8) Test whether it is navigating to next page where the user can add that book into his basket.
//		9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
	}

	@Test
	public void HomePageArrivalsImagesDescription() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//		4) Now click on Home menu button
		driver.findElement(homeButton).click();
//		5) Test whether the Home page has Three Arrivals only
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
//		6) The Home page must contains only three Arrivals
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
//		7) Now click the image in the Arrivals
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
//		8) Test whether it is navigating to next page where the user can add that book into his basket.
//		9) Image should be clickable and shoul navigate to next page where user can add that book to his basket		
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
//		10) Click on Description tab for the book you clicked on.
//		11) There should be a description regarding that book the user clicked on
		driver.findElement(By.xpath("//a[normalize-space()='Description']")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Product Description']")).getText(),
				"Product Description");
		System.out.println("It's show Product Description");
	}

	@Test
	public void HomePageArrivalsImagesReviews() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//		4) Now click on Home menu button
		driver.findElement(homeButton).click();
//		5) Test whether the Home page has Three Arrivals only
//		6) The Home page must contains only three Arrivals
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
//		7) Now click the image in the Arrivals
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
//		8) Test whether it is navigating to next page where the user can add that book into his basket.
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
//		9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
//		10) Now clock on Reviews tab for the book you clicked on.
		driver.findElement(By.xpath("//a[normalize-space()='Reviews (0)']")).click();
//		11) There should be a Reviews regarding that book the user clicked on
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Reviews']")).getText(), "Reviews");
		System.out.println("It's show Reviews");

	}

	@Test
	public void HomePageArrivalsImagesAddBasket() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//		4) Now click on Home menu button
		driver.findElement(homeButton).click();
//		5) Test whether the Home page has Three Arrivals only
//		6) The Home page must contains only three Arrivals
//		7) Now click the image in the Arrivals
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
//		8) Test whether it is navigating to next page where the user can add that book into his basket.
//		9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
//		10) Click on the Add To Basket button which adds that book to your basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
//		11) User can view that Book in the Menu item with price.
//		12) User can add a book by clicking on Add To Basket button which adds that book in to his Basket
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
	}

	@Test
	public void HomePageArrivalsAddBasketWithMoreBooks() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//		4) Now click on Home menu button
		driver.findElement(homeButton).click();
//		5) Test whether the Home page has Three Arrivals only
//		6) The Home page must contains only three Arrivals
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
//		7) Now click the image in the Arrivals
//		8) Test whether it is navigating to next page where the user can add that book into his basket.
//		9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
//		10) Click on the Add To Basket button which adds that book to your basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
//		11) User can view that Book in the Menu item with price.		
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		String cartBefore = driver.findElement(By.id("wpmenucartli")).getText();
//		12) User can add a book by clicking on Add To Basket button which adds that book in to his Basket
//		13) Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.	
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("7933");
//		14) Click the add to basket button
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
//		15) Now it throws an error prompt like you must enter a value between 1 and 20
		String cartAfter = driver.findElement(By.id("wpmenucartli")).getText();
		AssertJUnit.assertTrue(cartBefore.equals(cartAfter));
		System.out.println("Error Prompt");
	}

	@Test
	public void HomeArrivalsAddBasketItems() {
//		3) Click on Shop Menu
		driver.findElement(menuButton).click();
//		4) Now click on Home menu button
		driver.findElement(homeButton).click();
//		5) Test whether the Home page has Three Arrivals only
//		6) The Home page must contains only three Arrivals
		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
//		7) Now click the image in the Arrivals
//		8) Test whether it is navigating to next page where the user can add that book into his basket.
//		9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
//		10) Click on the Add To Basket button which adds that book to your basket
//		11) User can view that Book in the Menu item with price.
//		12) Now click on Item link which navigates to proceed to check out page.
//		13) User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
	}

	@Test
	public void HomeArrivalsAddBasketItemsCoupon() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// update book to 3 and add to basket for coupon usage purpose
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("3");
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// apply coupon
		driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("krishnasakinala");
		driver.findElement(By.xpath("//input[@name='apply_coupon']")).click();
		System.out.println("Coupon Applied :"
				+ driver.findElement(By.xpath("//td[@data-title='Coupon: krishnasakinala']")).getText());
//		15) User can able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price	
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//td[@data-title='Coupon: krishnasakinala']")).isDisplayed());
	}

	@Test
	public void THomeArrivalsAddBasketItemsCouponValueLessThan450() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// apply coupon
		driver.findElement(By.xpath("//input[@id='coupon_code']")).sendKeys("krishnasakinala");
		driver.findElement(By.xpath("//input[@name='apply_coupon']")).click();
//		15) User can not able to apply coupon by entering ‘krishnasakinala’ in the coupon textbox which give 50rps off on the total price
//		because the coupon is applicable for the book price > 450 rps
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@id='body']//li[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='body']//li[1]")).getText());
	}

	@Test
	public void HomeArrivalsAddBasketItemsRemovebook() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='×']")).click();
		// 14) User has the feasibility to remove the book at the time of check out also
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//p[@class='cart-empty']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//p[@class='cart-empty']")).getText());

	}

	@Test
	public void HomeArrivalsAddBasketItemsAddBook() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// update book quantity
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='update_cart']")).click();
//		16) User has the feasibility to Update Basket at the time of check out.
		System.out.println(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText());
		AssertJUnit.assertFalse(driver.findElement(By.xpath("//input[@name='update_cart']")).isEnabled());
	}

	@Test
	public void HomeArrivalsAddBasketItemsCheckOutBookFinalPrice() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
//		14) User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out
		AssertJUnit.assertTrue(driver
				.findElement(
						By.xpath("//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']"))
				.isDisplayed());
		System.out.println("Total is: " + driver
				.findElement(
						By.xpath("//td[@class='product-subtotal']//span[@class='woocommerce-Price-amount amount']"))
				.getText());
	}

	@Test
	public void HomeArrivalsAddBasketItemsCheckOutUpdateBasket() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		// update book quantity
		driver.findElement(By.xpath("//input[@title='Qty']")).clear();
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='update_cart']")).click();
//		16) User has the feasibility to Update Basket at the time of check out
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText());
	}

	@Test
	public void HomeArrivalsAddBasketItemsCheckOutTotalSubtotalCondition() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
//		14) The total always < subtotal because taxes are added in the subtotal
		String subtotal = driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText();
		String total = driver.findElement(By.xpath("//tr[@class='order-total']//td[@data-title='Total']")).getText();
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Total: " + total);
		AssertJUnit.assertFalse(subtotal.equals(total));

	}

	@Test
	public void HomeArrivalsAddBasketItemsCheckOutFunctionality() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
		System.out.println("Book added to the basket");
		driver.findElement(By.xpath("//a[@title='View your shopping cart']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Subtotal: " + driver.findElement(By.xpath("//td[@data-title='Subtotal']")).getText());
		System.out.println("Total: "
				+ driver.findElement(By.xpath("//tr[@class='order-total']//td[@data-title='Total']")).getText());
		String currentUrl = driver.getCurrentUrl();
//		15) Now click on Proceed to Check out button which navigates to payment gateway page.
//		16) Clicking on Proceed to Checkout button leads to payment gateway page
//		17)Clicking on Proceed to Checkout button leads to payment gateway page
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String nextUrl = driver.getCurrentUrl();
		AssertJUnit.assertFalse(currentUrl.equals(nextUrl));
		System.out.println(driver.getTitle());

	}

	@Test
	public void HomeArrivalsAddBasketItemsCheckOutPaymentGateway() {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
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
//		18)User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"customer_details\"]/div[2]/div/h3")).isDisplayed());
		driver.findElement(By.xpath("//a[normalize-space()='Click here to enter your code']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/form[2]/p[2]/input")).isEnabled());
		driver.findElement(By.xpath("(//input[@id='payment_method_cod'])[1]")).click();

	}

	@Test
	public void HomeArrivalsAddBasketItemsCheckOutPaymentGatewayPlaceOrder() throws InterruptedException {
		driver.findElement(menuButton).click();
		driver.findElement(homeButton).click();

		List<WebElement> threeArrivals = driver.findElements(By.xpath(
				"//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[@class='page-content entry-content']/div[@id='themify_builder_content-22']/div[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']/div[@class='row_inner_wrapper']/div[@class='row_inner']/div[1]/div[1]/div[2]/div"));
		int numberOfArrivals = threeArrivals.size();
		int expetedThreeArrivals = 3;
		AssertJUnit.assertEquals(numberOfArrivals, expetedThreeArrivals);
		System.out.println("Home page has Three Arrivals only");
		driver.findElement(By.xpath("(//img[@title='Mastering JavaScript'])[1]")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("(//button[normalize-space()='Add to basket'])[1]")).getText(),
				"ADD TO BASKET");
		System.out.println("Image is clickable and navigate to next page where user can add that book to basket");
		// add to basket
		driver.findElement(By.xpath("//button[normalize-space()='Add to basket']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//div[@class='woocommerce-message']")).isDisplayed());
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]")).getText());
	}

}
