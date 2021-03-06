package PracticeAutimationWebsite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccount {
	WebDriver driver;
	By myAccountButton = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By homeButton = By.xpath("//div[@id='content']/nav/a");
	By loginEmail = By.id("username");
	By loginPassword = By.id("password");
	String email = "123abc@gmail.com";
	String password = "TechCircle789!qe";

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterTest() {
		driver.close();
	}

	@Test
	public void MyAccountsDashboard() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) User must view Dashboard of the site
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText());
	}

	@Test
	public void MyAccountsOrdersLink() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) Click on Orders link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
//		10) User must view their orders on clicking orders link
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText());
	}

	@Test
	public void MyAccountsOrdersDetials() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) Click on Orders link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
//		10) Click view button
//		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
//		Faker faker = new Faker();
//		// input info
//		driver.findElement(By.id("billing_first_name")).sendKeys(faker.name().firstName());
//		driver.findElement(By.id("billing_last_name")).sendKeys(faker.name().firstName());
//		driver.findElement(By.id("billing_email")).sendKeys(faker.name().firstName() + "@gmail.com");
//		driver.findElement(By.id("billing_phone")).sendKeys(faker.phoneNumber().cellPhone());
//		driver.findElement(By.id("billing_address_1")).sendKeys(faker.address().streetAddress());
//		driver.findElement(By.id("billing_city")).sendKeys(faker.address().city());
//		driver.findElement(By.xpath("//a[@class='select2-choice select2-default']")).click();
//		driver.findElement(By.xpath("//*[@id=\"select2-results-2\"]/li[7]")).click();
//		driver.findElement(By.id("billing_postcode")).sendKeys(faker.address().zipCode());
//		driver.findElement(By.xpath("//input[@id='place_order']")).click();
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a")).click();
//		11) User must view his Order details,customer details and billing details on clicking view button
		AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
	}

	@Test
	public void MyAccountsOrderStatus() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) Click on Orders link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[2]/a")).click();
//		10) Click view button
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a")).click();
//		11) User must view Order Number Ordered date and Status of the order on clicking view button		
		AssertJUnit.assertTrue(driver.findElement(By.xpath("/html/body")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
	}

	@Test
	public void MyAccountsAddressFunctionalityBilling() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) Click on Address link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a")).click();
//		10) User must view billing address and ship address
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div")).getText());
	}

	@Test
	public void MyAccountsAddressFunctionalityShipping() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) Click on Address link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a")).click();
//		10) Click Edit on Shipping Address
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[2]/header/a")).click();
//		11) User can Edit Shipping address	
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form")).getText());

	}

	@Test
	public void MyAccountsAccountDetails() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on Myaccount link which leads to Dashboard	
		driver.findElement(myAccountButton).click();
//		9) Click on Address link
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[4]/a")).click();
//		10) Click Edit on Shipping Address
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[2]/header/a")).click();
//		11) User can Edit Shipping address		
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form")).getText());

	}

	@Test
	public void MyAccountsLogOut() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) User must successfully login to the web page
		System.out.println(driver.getTitle());
//		8) Click on My Account link
		driver.findElement(myAccountButton).click();
//		9) Click on Logout button
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a")).click();
//		10) On clicking logout,User successfully comes out from the site
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]")).getText());

	}

}
