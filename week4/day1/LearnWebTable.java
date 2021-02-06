package week4.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html");
		
		//to identify all the rows
		List<WebElement> listOfRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		
		//to identify the number of rowws
		int rowCount = listOfRows.size();
				
		for (int i = 2; i <= rowCount; i++) {
			//to count the number of data
			List<WebElement> listOfData = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			int dataCount = listOfData.size();
					
			for (int j = 1; j <= dataCount; j++) {
				
				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				
				System.out.println(text);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
