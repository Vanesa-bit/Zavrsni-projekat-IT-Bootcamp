package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.AboutUs;

public class AboutUsTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desk\\Desktop\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testAboutUsScreenshot() {
		driver.navigate().to(AboutUs.ABOUT_US_URL);
		driver.manage().window().fullscreen();
		
		AboutUs.takeScreenshot(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		String actual = driver.getCurrentUrl();
		String expected = AboutUs.ABOUT_US_URL;
		Assert.assertEquals(actual, expected);
		
	}

}