package Day07;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandlesTest {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {

		String email = "agent@phptravels.com";
		String password = "demoagent";
		// open up front end page(new tab)
		driver.findElement(By.xpath("(//small[contains(text(),'http://www.phptravels.net/login')])[2]")).click();

		// need switch selenium to new window
		System.out.println("Before switching -- title is --> " + driver.getTitle());

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentID = it.next(); // old tab or window
		String childID = it.next(); // new tab or window
		
		//print what the main windows handle looks like
		String MainWindow = driver.getWindowHandle();
	    System.out.println("Main window handle is " + MainWindow);
		
		
		driver.switchTo().window(childID);
		System.out.println("After switching to Child window >> " + driver.getTitle());

		// input email
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"))
				.sendKeys(email);
		// input password
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"))
				.sendKeys(password);
//		// click login
//		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();

		driver.switchTo().window(parentID);
		System.out.println("After switching to Parent window >> " + driver.getTitle());
	}
}
