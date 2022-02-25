package Day08.review;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsReview {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {
		wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.id("timerAlertButton")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());

		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Pete");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
