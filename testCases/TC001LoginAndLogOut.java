package testCases;

import org.testng.annotations.Test;

import wrappers.SeleniumMethods;

public class TC001LoginAndLogOut extends SeleniumMethods{
	

	@Test
	public void login() {
		launchApp("chrome", "http://leaftaps.com/opentaps");
		enterValue(locateElement("id", "username"), "DemoSalesManager");
		enterValue(locateElement("id", "password"), "crmsfa");
		clickElement(locateElement("class", "decorativeSubmit"));
		clickElement(locateElement("class", "decorativeSubmit"));
	}
	
}
