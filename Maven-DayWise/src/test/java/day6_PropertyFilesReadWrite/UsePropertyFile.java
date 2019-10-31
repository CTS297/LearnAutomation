package day6_PropertyFilesReadWrite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsePropertyFile {

	public static void main(String[] args) {
	    
		String ProjectPath = System.getProperty("user.dir");
		String Browser = ReadWriteProperties.ReadProperties(ProjectPath+"//src//main//resources//Config.properties", "Browser");
		
		if (Browser.equalsIgnoreCase("Firefox")	)	
		{
			WebDriverManager.firefoxdriver().setup();

			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Automation");
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			driver.close();
			System.out.println("Test Completed");
		}
		if (Browser.equalsIgnoreCase("Chrome"))		
		{
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Automation");
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
			driver.close();
			ReadWriteProperties.WriteProperties(ProjectPath+"//src//main//resources//Config.properties", "TestStatus", "Complete");
		}
	}

}
