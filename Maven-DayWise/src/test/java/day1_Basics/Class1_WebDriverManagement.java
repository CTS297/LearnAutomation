package day1_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_WebDriverManagement {
	
	public static void main(String[] args) {
		//gets the path of project
		String projectpath = System.getProperty("user.dir");
		//if the chromedriver path is set in environmental variables, the below step can be ignored (system.setproperty)
		System.setProperty("webdriver.chrome.driver", projectpath+"//Drivers//Chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		System.out.println("Test Completed");
	}

}
