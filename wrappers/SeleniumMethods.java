package wrappers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMethods {

	public RemoteWebDriver driver;

	public void launchApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("The Browser Chrome Lauched Successfully");
	}

	// for Find the element based on any locator
	public WebElement locateElement(String locator, String locVal) {
		switch (locator) {
		case "id": return driver.findElement(By.id(locVal));
		case "name": return driver.findElement(By.name(locVal));
		case "class": return driver.findElement(By.className(locVal));
		case "xpath": return driver.findElement(By.xpath(locVal));
		}
		return null;	
	}
	
	public void enterValue(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" entered successfully");
	}
	
	public void clickElement(WebElement ele) {
		ele.click();
		System.out.println("The Element is clicked successfully");
	}



}












