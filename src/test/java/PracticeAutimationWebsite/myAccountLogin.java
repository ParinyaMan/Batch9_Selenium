package PracticeAutimationWebsite;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLogin {
	WebDriver driver;
	By myAccountButton = By.xpath("//*[@id=\"menu-item-50\"]/a");
	By homeButton = By.xpath("//div[@id='content']/nav/a");
	By loginEmail = By.id("username");
	By loginPassword = By.id("password");
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
	}
	
	@Ignore
	@Test
	public void TestCase2() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter incorrect username in username textbox
		driver.findElement(loginEmail).sendKeys("eqopop@gmaillll.com");
//		5) Enter incorrect password in password textbox.
		driver.findElement(loginPassword).sendKeys("1fewmvo7()2");
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul")).getText());
	}
	@Ignore
	@Test
	public void TestCase3() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter valid username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Now enter empty password in the password textbox
		driver.findElement(loginPassword).sendKeys("");
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul")).getText());
	}
	@Ignore
	@Test
	public void TestCase4() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter empty username in username textbox
		driver.findElement(loginEmail).sendKeys("");
//		5) Now enter valid password in the password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul")).getText());
	}
	@Ignore
	@Test
	public void TestCase5() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter empty username in username textbox
		driver.findElement(loginEmail).sendKeys("");
//		5) Now enter valid password in the password textbox
		driver.findElement(loginPassword).sendKeys("");
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) Proper error must be displayed(ie required username) and prompt to enter login again
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul")).getText());
	}
	@Ignore
	@Test
	public void TestCase6() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter the password field with some characters.
		driver.findElement(loginPassword).sendKeys("123456");
//		5) The password field should display the characters in asterisks or 
//		bullets such that the password is not visible on the screen, masked password
		boolean isEncryped = driver.findElement(loginPassword).getAttribute("type").equals("password");
		System.out.println(isEncryped);
	}
	@Ignore
	@Test
	public void TestCase7() {
//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter the case changed username in username textbox
		driver.findElement(loginEmail).sendKeys("123Abc@gmail.com");
//		5) Enter the case chenged password in the password tetxbox
		driver.findElement(loginPassword).sendKeys("techCircle789!qe");
//		6) Click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) Login must fail saying incorrect username/password.
		System.out.println(driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul")).getText());
	}
	
	@Test
	public void TestCase8() {

//	4) Enter the case changed username in username textbox
//	5) Enter the case chenged password in the password tetxbox
//	6) Now click on login button
//	7) Once your are logged in, sign out of the site
//	8) Now press back button
//	9) User shouldn’t be signed in to his account rather a general webpage must be visible
		
	//if user name and password are changed, it cannot login so I assumed this is the valid username and password

//		3) Click on My Account Menu
		driver.findElement(myAccountButton).click();
//		4) Enter registered username in username textbox
		driver.findElement(loginEmail).sendKeys(email);
//		5) Enter password in password textbox
		driver.findElement(loginPassword).sendKeys(password);
//		6) Now click on login button
		driver.findElement(By.id("body")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
//		7) Once your are logged in, sign out of the site
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")).click();
//		8) Now press back button
		driver.navigate().back();
//		9) User shouldn’t be signed in to his account rather a general webpage must be visible
		System.out.println(driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/h2")).getText()+" Page");
	}
	
}
