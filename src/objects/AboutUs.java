package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AboutUs {
	
	public static final String ABOUT_US_URL = "https://www.humanity.com/about";
	
	public static void takeScreenshot(WebDriver driver) {
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(screenshotFile, new File(".\\screenshotFolder\\AboutUsScreenshot.png"));
		} catch (IOException e) {
			System.out.println("Screenshot is not made.");
			e.printStackTrace();
		}
	}
	

}