package week8.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium4Features {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		
		driver.findElement(By.id("usrname")).sendKeys("Demosalemanager");
		
		
		
		
		/*
		 * driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
		 * 
		 * Set<String> windowHandles = driver.getWindowHandles(); List<String>
		 * listHandles = new ArrayList<String>(windowHandles);
		 * driver.switchTo().window(listHandles.get(0));
		 */
		
		
		
	//	driver.navigate().to("https://www.facebook.com/");
		
		
		/*
		 * driver.findElement(RelativeLocator.withTagName("input")
		 * .toRightOf(By.xpath("//label[text()='Username']")))
		 * .sendKeys("Demosalesmanager");
		 * 
		 * 
		 * driver.findElement(RelativeLocator.withTagName("input")
		 * .below(By.id("username"))) .sendKeys("crmsfa");
		 * 
		 * 
		 * 
		 * //toLeftOf //below //above //near
		 */		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
