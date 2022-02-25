package Day08.review;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class dropDownReview {
	WebDriver driver;
	private String firstName = PropertiesReader.getProperty("firstName");
	private String lastName = PropertiesReader.getProperty("lastName");
	private String phoneNumber = PropertiesReader.getProperty("phoneNumber");
	private String email = PropertiesReader.getProperty("email");
	private String address = PropertiesReader.getProperty("address");
	private String city = PropertiesReader.getProperty("city");
	private String state = PropertiesReader.getProperty("state");
	private String zipcode = PropertiesReader.getProperty("zipcode");
	private String password = PropertiesReader.getProperty("password");

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {

		driver.findElement(By.name("firstName")).sendKeys(firstName);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		driver.findElement(By.id("userName")).sendKeys(email);
		driver.findElement(By.name("address1")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(zipcode);
		
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByValue("THAILAND");

		//solution 2 with List
//		List<WebElement> countries = driver.findElements(By.xpath("//select[@name='country']/option"));
//		int size = countries.size();
//		for (int i = 0; i < size; i++) {
//			WebElement country = driver.findElement(By.xpath("//select[@name='country']/option[" + (i + 1) + "]"));
//
//			if (country.getText().contains("THAILAND"))
//				country.click();
//		}

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
//		driver.findElement(By.name("submit")).click();

	}

}
