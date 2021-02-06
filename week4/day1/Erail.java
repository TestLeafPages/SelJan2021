package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://erail.in/");

		// Enter from station
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		Thread.sleep(1000);
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);

		// Enter to station
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);

		// to uncheck the sort on date checkbox
		driver.findElementById("chkSelectDateOnly").click();

		// wait for 2 secs to load the result
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		int rowCount = rows.size();
		
		
		List<String> listTrainNames = new ArrayList<String>();

		for (int i = 1; i <= rowCount; i++) {

			String trainNames = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")
					.getText();
			//System.out.println(trainNames);
			listTrainNames.add(trainNames);
		}
		
		//Copy the list train names into set
		Set<String> setTrainNames = new LinkedHashSet<String>(listTrainNames);
		
		//comparing total trains in the list and set
		if(listTrainNames.size()==setTrainNames.size()) {
			System.out.println("No duplicates");
		}
		else {
			System.out.println("Duplicate train names are there in the result");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
