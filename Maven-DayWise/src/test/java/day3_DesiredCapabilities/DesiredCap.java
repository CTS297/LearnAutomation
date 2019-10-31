package day3_DesiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap {
public static void main(String[] args) {
	//https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("ignoreProtectedModeSettings", true);
	InternetExplorerOptions opt = new InternetExplorerOptions();
	opt.merge(cap);
	
	WebDriver driver = new InternetExplorerDriver(opt);
	
	cap.setPlatform(null);
}
}
