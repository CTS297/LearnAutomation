package day1_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2_WebDriverManager {
	public static void main(String[] args) {
		//https://github.com/bonigarcia/webdrivermanager/
		//This eliminated the need to set property and copying drivers to folder
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().version("77").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//for xpath use eskry or chropath
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Completed");
	}
}
