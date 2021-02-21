package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin extends BaseClass{
	
	
	
	/*
	 * @Given("Open the chrome browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); }
	 * 
	 * @Given("Load the application URL as {string}") public void
	 * loadApplicationUrl(String url) { driver.get(url);
	 * 
	 * }
	 */
	
	@Given("Enter username as {string}")
	public void enterUsername(String username) {
		driver.findElementById("username").sendKeys(username);

	}
	
	@Given("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);

	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();

	}
	
	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		System.out.println("HomePage is displayed");

	}
	
	@But("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    System.out.println("error displayed");
	}
	
	/*
	 * @But("Error message should be displayed") public void verifyErrorMessage() {
	 * System.out.println("error messgae is displayed"); }
	 */
	
	
	
	
	
	
	

}
