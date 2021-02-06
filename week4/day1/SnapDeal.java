package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com/");

		WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();
		
		driver.findElementByXPath("//span[text()='Jackets']").click();
		
		WebElement firstProductPrice = driver.findElementByXPath("//span[contains(@id,'display-price')]");
		
		builder.moveToElement(firstProductPrice).perform();
		
		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
