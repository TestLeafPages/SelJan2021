package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToHandleNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
				
		driver.get("http://leafground.com/pages/frame.html");
		
		//switch to the outer frame
		driver.switchTo().frame(1);
		//switch to the inner frame
	//	driver.switchTo().frame("frame2");
		driver.switchTo().frame(0);
		
		driver.findElementById("Click1").click();
		 		
		
		

	}

}
