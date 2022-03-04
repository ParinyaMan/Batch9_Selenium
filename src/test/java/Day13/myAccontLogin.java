package Day13;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.Driver;
import utilities.ListenersTestNG;
import utilities.PropertiesReader;
@Listeners(ListenersTestNG.class)
public class myAccontLogin extends CommonMethods {
	
	

	@BeforeMethod
	public void beforeTest() {
//		1) Open the browser
//		2) Enter the URL “http://practice.automationtesting.in/”
	Driver.getDriver();
	}

	@Test(enabled=false)
	public void LoginWithValidUsernamePassword() {

//	3) Click on My Account Menu
	cp.myAccountTab.click();
//	4) Enter registered username in username textbox	
//	5) Enter password in password textbox
	myAPage.usernameField.sendKeys(PropertiesReader.getProperty("automationUsername"));
	myAPage.passwordField.sendKeys(PropertiesReader.getProperty("automationPassword"));
//	6) Click on login button
	myAPage.loginButton.click();

//	7) User must successfully login to the web page	
	myAPage.signOutButton.click();

	}
	
	
	@Test(enabled=true)
	public void LoginWithInvalidUsernameInvalidPassword() {

//		3) Click on My Account Menu
	cp.myAccountTab.click();
//		4) Enter incorrect username in username textbox	
//		5) Enter incorrect password in password textbox.
	myAPage.usernameField.sendKeys(PropertiesReader.getProperty("invalidUserName"));
	myAPage.passwordField.sendKeys(PropertiesReader.getProperty("invalidPassword"));
//		6) Click on login button
	myAPage.loginButton.click();
//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	String actualErrorValue =	myAPage.errorMessage.getText();
	Assert.assertEquals(PropertiesReader.getProperty("errorUserCouldNotbeFound"), actualErrorValue);
		
		}
	
	
	@Test(enabled=false)
	public void LoginWithValidUsernameEmptyPassword() {

//		3) Click on My Account Menu
	cp.myAccountTab.click();
//		4) Enter registered username in username textbox	
//		5) Enter password in password textbox
	myAPage.usernameField.sendKeys(PropertiesReader.getProperty("automationUsername"));
	myAPage.passwordField.sendKeys("");
//		6) Click on login button
	myAPage.loginButton.click();
//			7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
	String errorPassword =	myAPage.errorMessage.getText();
	Assert.assertEquals(PropertiesReader.getProperty("errorInvalidPassword"), errorPassword);
	
		}
	
	
}
