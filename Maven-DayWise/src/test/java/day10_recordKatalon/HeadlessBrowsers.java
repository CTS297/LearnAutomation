package day10_recordKatalon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsers {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless");
		//option.addArguments("window-size=1280,800");
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
	}
}
