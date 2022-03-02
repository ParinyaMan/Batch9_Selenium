package Day11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTesting {
	
	@Test(dataProvider = "objectList")
	public void myTest(String myName, String lastName, Integer age) {
		System.out.println("My name is "+ myName + " lastName is "+ lastName +" and age is "+ age);
	}
	@Test(dataProvider = "ageList", enabled = true)
	public void ageTest(Integer age) {
		System.out.println("My name is "+ age);
	}
	
	@DataProvider(name = "nameList")
	public String[][] nameMethod(){
		return new String[][] {{"Shafkat"}, {"Irfan"}, {"TechCircle"}};
	}
	
	@DataProvider(name = "ageList")
	public Integer[][] ageMethod(){
		return new Integer[][] {{33}, {44}};
	}
	
	@DataProvider(name = "objectList")
	public Object[][] objectMethod(){
		return new Object[][] {{"Shafkat", "Ali", 33}, {"Irfan", "Yuksel", 34}, {"TechCircle", "LLC", 3}};
	}
	
	
	
}
