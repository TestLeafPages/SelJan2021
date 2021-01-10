package week1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		//Step1: Precondition - setup the driver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		//to know the driver location
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		
		//step2: to open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		
		// to apply implicitlywait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		
		  //Step3: load the application url
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  
		 // Thread.sleep(5000);
		  
		  //step4: locate the element //
		  WebElement username =  driver.findElementById("username");
		  
		  username.sendKeys("Demo");
		  
		
		
		
		
		
		
		
		
		
		
		

	}

}
