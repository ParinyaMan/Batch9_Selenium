package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonMethods;
import utilities.Driver;

public class commonPageP extends CommonMethods {

	
	public commonPageP() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='menu-item-50']")
	public WebElement myAccountTab;
	
	
	
	

	
	
	
	
	
	
	
	
}
