package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
				
		driver.get("http://leafground.com/pages/TextChange.html");
		
		//create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
	   wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
	   
	   driver.findElementById("btn").click();
		
		//String text = wait.until(ExpectedConditions.visibilityOf(driver.findElementByXPath("//b[contains(text(),'Voila')]"))).getText();
		
		//System.out.println(text);
		
		

	}

}
