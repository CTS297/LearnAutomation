package day10_recordKatalon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitDemo {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//250ms
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("abcd")));
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofMillis(1000))
			       .pollingEvery(Duration.ofMillis(600))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait1.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
			 
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Completed");
	}

}
