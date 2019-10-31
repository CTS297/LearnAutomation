package day1_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class4_TestNG {
	static WebDriver driver;

	//pom + marketplace download

	@BeforeTest(alwaysRun = true)
	public static void startup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(groups = {"Regression", "Functional"}, priority = 2 )
	public static void test()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Test(groups = {"Regression", "Functional", "Smoke"}, priority = 1 )
	public static void test2()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest(alwaysRun = true)
	public static void close()
	{
		driver.close();
		System.out.println("Test Completed");
	}
}
