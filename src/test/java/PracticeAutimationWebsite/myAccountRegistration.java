package PracticeAutimationWebsite;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountRegistration {
	WebDriver driver;
	By myAccountButton = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By registerEmail = By.id("reg_email");
	By registerPassword = By.id("reg_password");
	String email = "123abc@gmail.com";
	String password = "TechCircle789!qe";

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
// 		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered Email Address in Email-Address textbox
		driver.findElement(registerEmail).sendKeys(email);
//		5) Enter your own password in password textbox
		driver.findElement(registerPassword).sendKeys(password);
//		6) Click on Register button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		7) User will be registered successfully and will be navigated to the Home page
		System.out.println(driver.getTitle());

	}

	@Ignore
	@Test
	public void TestCase2() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter invalid Email Address in Email-Address textbox
		driver.findElement(registerEmail).sendKeys("ewfomewovv");
//		5) Enter your own password in password textbox
		driver.findElement(registerPassword).sendKeys(password);
//		6) Click on Register button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		7) Registration must fail with a warning message(ie You must enter a valid email address)
		System.out.println("Registration failed");

	}

	@Ignore
	@Test
	public void TestCase3() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter empty Email Address in Email-Address textbox
		driver.findElement(registerEmail).sendKeys("");
//		5) Enter your own password in password textbox
		driver.findElement(registerPassword).sendKeys(password);
//		6) Click on Register button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		7) Registration must fail with a warning message(ie You must enter a valid email address)
		System.out.println("Registration failed");

	}

	@Ignore
	@Test
	public void TestCase4() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter valid Email Address in Email-Address textbox
		driver.findElement(registerEmail).sendKeys("Techciecle123@gmail.com");
//		5) Enter empty password in password textbox
		driver.findElement(registerPassword).sendKeys("");
//		6) Click on Register button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		7) Registration must fail with a warning message(ie please enter an account password)
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li")).getText());

	}

	@Test
	public void TestCase5() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter empty Email Address in Email-Address textbox
		driver.findElement(registerEmail).sendKeys("");
//		5) Enter empty password in password textbox
		driver.findElement(registerPassword).sendKeys("");
//		6) Click on Register button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]")).click();
//		7) Registration must fail with a warning message(ie please enter an account password)
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li")).getText());

	}

}
