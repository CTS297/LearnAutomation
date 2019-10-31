package day2_ExtendedReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendedReport {
	static WebDriver driver;
	static ExtentHtmlReporter reportHTML;
	static ExtentReports extent;
	static ExtentTest test;
    
@BeforeSuite
public static void setExtendReports()
{
	reportHTML = new ExtentHtmlReporter("extendReport.html");
	extent = new ExtentReports();
	extent.attachReporter(reportHTML);
	
}
	
	@BeforeTest
	public static void startup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(groups = {"Regression", "Functional"} )
	public static void test()
	{
		test = extent.createTest("Test1");
		driver.get("https://www.google.com/");
		test.pass("Launched google");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered SearchTerm");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Clicked Enter");
	}

	@Test(groups = {"Regression", "Functional", "Smoke"} )
	public static void test2() throws Exception
	{
		test = extent.createTest("Test2");
		driver.get("https://www.google.com/");
		test.pass("Launched google");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered SearchTerm");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Clicked Enter");
		test.log(Status.PASS, "What is this");
		test.assignAuthor("Anju");
		test.fail("Screenshot is available at").addScreencastFromPath(GetScreenshot.captureSceenshot(driver, "sdf"));
		
	}
	
	@AfterTest
	public static void close()
	{
		driver.close();
		test.pass("Closed Browser");
		System.out.println("Test Completed");
	}
	
	@AfterSuite
	public static void createreport()
	{
		extent.flush();
	}
}
