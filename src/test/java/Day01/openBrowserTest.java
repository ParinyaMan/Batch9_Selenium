package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowserTest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();  //from boni gracia
		
		driver = new ChromeDriver();
		
		driver.get("https://www.techcircleschool.com");
		
		//use Maven to install the dependencies 

	}

}
