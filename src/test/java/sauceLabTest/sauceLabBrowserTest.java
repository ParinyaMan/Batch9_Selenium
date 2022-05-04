package sauceLabTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sauceLabBrowserTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//the credentials from website
		String username = "oauth-maneesuk.gab-f6a09";
		String access_key = "bd4a2b0c-1792-4d71-b96a-ac2618d10712";
		String URL = "http://"+username+":"+access_key+"@ondemand.saucelabs.com:80/wd/hub";
		
		
		ChromeOptions browserOptions = new ChromeOptions();
        //if it not working use this
	    // DesiredCapabilities browserOptions = DesiredCapabilities.chrome();
	        browserOptions.setCapability("platformName", "Windows 11");
	        browserOptions.setCapability("browserVersion", "100");
	        Map<String, Object> sauceOptions = new HashMap<>();
	        browserOptions.setCapability("sauce:options", sauceOptions);
	        
	        WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
	        driver.get("https://www.techcircleschool.com");
	        driver.findElement(By.xpath("//*[@id=\"wix-events-widget\"]/div/ul/li/div/div[3]/div/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"events-details-page-root\"]/div/section/div[2]/div/div[2]/div[3]/button")).click();
	        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Shaffy");
	        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Alli");
	        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aprilsecond2013@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"events-details-page-root\"]/div/div/div/div[1]/div/div/div/div[2]/form/button")).click();
	        driver.quit();
		
		
		

	}

}
