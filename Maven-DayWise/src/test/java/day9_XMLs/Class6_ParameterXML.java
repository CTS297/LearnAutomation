package day9_XMLs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class6_ParameterXML {
	static WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public static void startup(String browserName)
	{
		System.out.println("Browser is" + browserName);
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("Firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		if(browserName.equalsIgnoreCase("IE"))
		{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability("ignoreZoomSetting", true);
		InternetExplorerOptions opt = new InternetExplorerOptions();
		opt.merge(cap);
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver(opt);
		}
	}
	

	@Test
	public static void test()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Test
	public static void test2()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public static void close()
	{
		driver.close();
		System.out.println("Test Completed");
	}
}
