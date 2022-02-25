package Day05;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsTesting {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void alert1() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		//handle the pop-up alert 
		String firstAleart = driver.switchTo().alert().getText();
		System.out.println(firstAleart);
		driver.switchTo().alert().accept();

	}
	
	@Test
	public void alert2() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		String secondAleart = driver.switchTo().alert().getText();
		System.out.println(secondAleart);
		driver.switchTo().alert().dismiss();

	}
	
	@Test
	public void alert3() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		String ThirdAleart = driver.switchTo().alert().getText();
		System.out.println(ThirdAleart);
		
		String input = "Pete TechCircle";
		
		driver.switchTo().alert().sendKeys(input);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		
		String actualText = "You entered: Pete TechCircle";
		
		if(actualText.contains(input)) {
			System.out.println(input+" Good Job!");
		}

	}
	
	
	
}
