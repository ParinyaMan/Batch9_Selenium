package sauceLabTest;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.BaseClass;

public class sauceLabFromBaseClass {
	 @BeforeMethod
		public void beforeMethod() throws MalformedURLException {

	       BaseClass.getDriver();
	    }

	    @Test
	    public void click() throws InterruptedException, MalformedURLException {
	        // this code we will learn next week

	        List<WebElement> iframes = BaseClass.getDriver().findElements(By.xpath("//iframe"));
	        // print your number of frames
	        System.out.println(iframes.size());
//	        
//	        
	        BaseClass.getDriver().findElement(By.xpath("//iframe")).getSize();

	        BaseClass.getDriver().switchTo().frame(0);

	        List<WebElement> checkboxradioSections = BaseClass.getDriver().findElements(By.xpath("/html/body/div/fieldset"));

	        for (WebElement eachSection : checkboxradioSections) {
	            String eachSec = eachSection.getText();
//	            System.out.println("-----------------\n"+eachSec+"\n-------------------");

	            if (eachSec.contains("Location")) {

	                List<WebElement> locationRadioButtons = BaseClass.getDriver()
	                        .findElements(By.xpath("/html/body/div/fieldset[1]/label"));

	                for (WebElement eachLocationRadioButton : locationRadioButtons) {

	                    if (eachLocationRadioButton.getText().contains("Paris")) {
	                        eachLocationRadioButton.click();
	                    }
	                }

	            }

	            if (eachSec.contains("Hotel")) {
	                List<WebElement> HotelRadiocheckbox = BaseClass.getDriver().findElements(By.xpath("/html/body/div/fieldset[2]/label"));

	                for (WebElement eachHotelRating : HotelRadiocheckbox) {

	                    if (eachHotelRating.getText().contains("2 Star")) {
	                        eachHotelRating.click();
	                    }
	                    if (eachHotelRating.getText().contains("3 Star")) {
	                        eachHotelRating.click();
	                    }

	                }

	            }

	            if (eachSec.contains("Bed")) {
	                List<WebElement> bedTypeCheckbox = BaseClass.getDriver().findElements(By.xpath("/html/body/div/fieldset[3]/label"));

	                for (WebElement eachBedType : bedTypeCheckbox) {

	                    if (eachBedType.getText().contains("2 Double")) {
	                        eachBedType.click();
	                    }

	                    if (eachBedType.getText().contains("1 Queen")) {
	                        eachBedType.click();
	                    }

	                    if (eachBedType.getText().contains("1 King")) {
	                        eachBedType.click();
	                    }
	                }

	            }

	        }

	        BaseClass.getDriver().switchTo().parentFrame();
	        // driver.switchTo().defaultContent();

	        BaseClass.getDriver().findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a")).click();
	        BaseClass.getDriver().quit();
	    }
}
