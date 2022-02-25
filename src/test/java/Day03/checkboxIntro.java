package Day03;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxIntro {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
	}
	
	@AfterMethod
	public void afterTest() {
		driver.close();
	}
	
	@Test
	public void checkBox() {
		//navigate to checkbox page
		driver.findElement(By.xpath("//div[@id=\"content\"]/ul/li[6]/a")).click();
		
		WebElement firstCheckboxElement = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement secondCheckboxElement = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		//check the checkboxes are selected or not
		Boolean firstCheckbox = firstCheckboxElement.isSelected();//false
		Boolean secondCheckbox = secondCheckboxElement.isSelected();//true
		//if selected do nothing, if not select it
		if(firstCheckbox) {
			System.out.println("Checkbox 1 is already selected");
		}else {
			firstCheckboxElement.click();
			System.out.println("Check box 1 for you");
		}
			
		if(secondCheckbox) {
			System.out.println("Checkbox 2 is already selected");
		}else {
			secondCheckboxElement.click();
		}
		
	}
}
