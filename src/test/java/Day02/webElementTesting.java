package Day02;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webElementTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();  
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
	}
	
	@Test
	public void enterEmailAddress() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		//firstName
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Pete");
		//lastName
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("TechCircle");
		//address
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("123 Main St Fairfax VA 29000");
		//email
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("abc@gmail.com");
		//phone
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("7033333333");
		//gender
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		//hobbies
		driver.findElement(By.id("checkbox2")).click();
		//language
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/label")).click();
		//skills  
		driver.findElement(By.id("Skills")).click();
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/label")).click();
		//country***
		
		//select country
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[11]")).click();
		//dateOfBirth
		driver.findElement(By.id("yearbox")).click();
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[86]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[12]")).click();
		driver.findElement(By.id("daybox")).click();
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[11]")).click();
		//password
		driver.findElement(By.id("firstpassword")).sendKeys("123456");
		//confirmPassword
		driver.findElement(By.id("secondpassword")).sendKeys("123456");
		//submit
		driver.findElement(By.id("submitbtn")).click();
		
		System.out.println("Test End");
	}
	
}
