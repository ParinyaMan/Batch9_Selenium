package utilities;

import Pages.commonPageP;
import Pages.myAccountPageP;

public class PageInitializer extends Driver {

	public static commonPageP cp;
	public static myAccountPageP myAPage;
	
	
	public static void initialize() {
		cp = new commonPageP();
		myAPage = new myAccountPageP();
	}
	
	
	
	
	
	
	
	
}
