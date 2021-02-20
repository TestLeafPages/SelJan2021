package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		//first window
		driver.get("http://leafground.com/pages/Window.html");
			
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the reference of current
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		System.out.println("************************************");
		
		driver.findElementById("home").click();
				 
		Set<String> windowHandles = driver.getWindowHandles();
		//Copy the reference from Set to List
		List<String> listHandles = new ArrayList<String>(windowHandles);
		
		//use get(index) to get the specific window reference
		String secondWinHandle = listHandles.get(1);
		
		//pass the window reference to switch the control to the specific window
		driver.switchTo().window(secondWinHandle);
		
				
		//close the current window (window2)
		driver.close();
		
		
		//to go to the first window
		driver.switchTo().window(listHandles.get(0));
		
		String title2 = driver.getTitle(); 
		System.out.println(title2);
		
		//To close all the windows opened by WebDriver
		driver.quit();
		
		
		
		//to go to the first window
		//driver.switchTo().window(listHandles.get(0));
		
		/*
		 * for (String eachHandle : windowHandles) { System.out.println(eachHandle); }
		 */
		  
		  
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
