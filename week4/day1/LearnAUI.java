package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		//driver.get("https://www.myntra.com/");
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		//WebElement men = driver.findElementByLinkText("Men");
		//WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
	//	WebElement source = driver.findElementById("draggable");
	//	WebElement target = driver.findElementById("droppable");
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		//Create object for Actions class
		Actions builder = new Actions(driver);
		//builder.moveToElement(men).perform(); //perform() is mandatory at the end
		
		//right click
		//builder.contextClick(men).perform();
		
		//builder.dragAndDrop(source, target).perform();
		
	//	builder.dragAndDropBy(source, 100, 200).perform();
		
	//	builder.clickAndHold(item1).moveToElement(item4).release().perform();
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item4).keyUp(Keys.CONTROL).perform();

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
