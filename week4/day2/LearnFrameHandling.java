package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		/*
		 * driver.get("https://dev68594.service-now.com/");
		 * 
		 * //switch to frame using id / name driver.switchTo().frame("gsft_main123");
		 * 
		 * //switch to frame using index //driver.switchTo().frame(0);
		 * 
		 * driver.findElementById("user_name").sendKeys("admin");
		 */
		
		
		
		  driver.get("http://leafground.com/pages/frame.html");
		  
		  //switch to frame using index 
		  driver.switchTo().frame(0);
		  driver.findElementById("Click").click();
		  
		  // to switch back the control to the main window
		  driver.switchTo().defaultContent();
		  
		  //element in the main window
		  String text = driver.findElementByTagName("h1").getText();
		  System.out.println(text);
		  
		  driver.switchTo().parentFrame();
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
