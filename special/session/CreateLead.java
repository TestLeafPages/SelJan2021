package special.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		//Step1: Precondition - setup the driver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		//to know the driver location
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		
		//step2: to open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//Step3: load the application url
		driver.get("https://acme-test.uipath.com/login");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
