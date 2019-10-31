package day7_excelDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import day7_excelDataProvider.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTestCase {

	WebDriver driver;

	@BeforeTest
	public void driversetup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(dataProvider="Orange")
	public void test1(String username, String password) throws Exception
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(100);
		driver.findElement(By.linkText("Logout")).click();
	}

	@DataProvider(name="Orange")
	public Object[][] GetData()
	{
		DaataProviders dataread = new DaataProviders();
		String ProjectPath = System.getProperty("user.dir");
		String Path = ProjectPath+"//src//main//resources//Excels//OrangeFRMData.xlsx";
		Object data[][] = dataread.ExcelData(Path, "Sheet1");
		return data;
	}

	@AfterTest
	public void teatdown()
	{
		driver.close();
		System.out.println("TestComplete");
	}

}
