package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step1: Set up the file path to read
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		
		//Create object for Properties class
		Properties prop = new Properties();
		
		//load the properties file
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(prop.getProperty("username"));
		driver.findElementById("password").sendKeys(prop.getProperty("password"));
		driver.findElementByClassName("decorativeSubmit").click();
		

	}

}
