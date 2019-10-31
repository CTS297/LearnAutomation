package day1_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3_POM {

	static WebDriver driver;

	public static void main(String[] args) {


		startup();
		test();
		close();


	}

	public static void startup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void test()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}

	public static void close()
	{
		driver.close();
		System.out.println("Test Completed");
	}
}

