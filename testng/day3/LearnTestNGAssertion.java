package testng.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion {

	@Test
	public void leafTapsLogin() {
		
		//Leaftaps - 
		String expTitle = "Leaftaps - TestLeaf Automation Platform";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		String actTitle = driver.getTitle();
		
		//Hard Assert - to compare 2 data
		//Assert.assertEquals(actTitle, expTitle);
		
		//SoftAssert
		SoftAssert softAssert = new SoftAssert();
		//Assertion 1
		softAssert.assertEquals(actTitle, expTitle);
		
		boolean displayed = driver.findElementByLinkText("CRM/SFA").isDisplayed();
		
		//Assertion 2
		softAssert.assertTrue(displayed);
		
		// there is no exception
		  driver.findElementByLinkText("CRM/SFA").click();
		  driver.findElementByLinkText("Leads").click();
		 
		  
		  //this will consolidate the result
		  softAssert.assertAll();
		  
		//boolean displayed = driver.findElementByLinkText("CRMSFA").isDisplayed();
		/*
		 * if (expTitle.equals(actTitle)) { System.out.println("Pass"); } else {
		 * System.out.println("Fail"); }
		 */
		
		
		
		
		/*
		 * driver.findElementByLinkText("CRM/SFA").click();
		 * driver.findElementByLinkText("Leads").click();
		 */

	}
	
}
