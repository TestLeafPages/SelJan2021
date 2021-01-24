package week2.day2;

import java.util.concurrent.TimeUnit;

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
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//Step3: load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		//step4: locate the element
		//WebElement username = driver.findElementById("username");
		
		driver.findElementByXPath("//input[@class='inputLogin']").sendKeys("Demosalesmanager");
					
		//to enter a text in the text field
	//	username.sendKeys("Demosalesmanager");
					
		//to enter password
		//driver.findElementById("password").sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
			
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		//driver.findElementByPartialLinkText("SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		driver.findElementById("createLeadForm_lastName").sendKeys("R");
		
		driver.findElementByName("submitButton").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
