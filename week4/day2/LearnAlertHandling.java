package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Alert.html");
		
		
		/*
		 * //click on Alert Box button
		 * driver.findElementByXPath("//button[text()='Alert Box']").click();
		 * 
		 * //switch the control from main window to alert Alert alert =
		 * driver.switchTo().alert();
		 * 
		 * String text = alert.getText(); System.out.println(text);
		 * 
		 * Thread.sleep(2000); //to click on Ok button in the alert alert.accept();
		 * 
		 * 
		 * 
		 * 
		 * //Click on Confirm Box button
		 * driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 * 
		 * //alert.dismiss();
		 * 
		 * Alert alert2 = driver.switchTo().alert();
		 * 
		 * alert2.dismiss();
		 */
		
		
		/*
		 * driver.findElementByXPath("//button[text()='Prompt Box']").click();
		 * 
		 * Alert alert3 = driver.switchTo().alert(); Thread.sleep(2000);
		 * alert3.sendKeys("HariPrasad"); Thread.sleep(2000); alert3.accept();
		 */
		
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		
		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
