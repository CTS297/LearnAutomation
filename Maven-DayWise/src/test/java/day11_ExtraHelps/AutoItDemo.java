package day11_ExtraHelps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItDemo {

public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		
		  driver.get("http://www.tinyupload.com/");
		  driver.manage().window().maximize();
		  //driver clicks didnt work and so had to bring mouse clicks
		  Actions actions = new Actions(driver);
		  WebElement elementLocator = driver.findElement(By.name("uploaded_file"));
		  actions.click(elementLocator).perform();
		
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//the exe didnt run since there were no Sleep statements. Added it and exerything worked
		/*
		 * ControlFocus("Open","","Edit1") Sleep(1000)
		 * ControlSetText("Open","","Edit1","C:\A\Apple.txt") Sleep(1000)
		 * ControlClick("Open","","Button1") Sleep(1000)
		 */
		  
		Runtime.getRuntime().exec("C:\\Users\\shijooax\\Downloads\\FileUpload.exe");
		driver.close();
	}

}
