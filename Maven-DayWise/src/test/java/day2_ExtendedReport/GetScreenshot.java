package day2_ExtendedReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshot {

	public static String captureSceenshot(WebDriver driver, String Screenshotname) throws Exception
	{
		TakesScreenshot tc = (TakesScreenshot)driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"/screenshots/"+Screenshotname+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;
		
	}
}
