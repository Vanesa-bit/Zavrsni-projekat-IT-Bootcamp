package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;
import objects.LoginObject;
import objects.Settings;

public class TestSettings {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desk\\Desktop\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testSettingsTickerAndLanguage() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to(LoginObject.LOGIN_URL);
		LoginObject.login(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().to(Settings.SETTINGS_URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.notificationsEmail(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.notificationsSMS(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.notificationsMobPush(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.clickSaveSettings(driver);
		
		Thread.sleep(800);
		
		WebElement confirmation2 = driver.findElement(By.id("_status"));
		Assert.assertTrue(confirmation2.isDisplayed());
		
		Settings.selectLanguage(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Settings.clickSaveSettings(driver);
		
		Thread.sleep(800);
		
		WebElement confirmation = driver.findElement(By.id("_status"));
		Assert.assertTrue(confirmation.isDisplayed());
			
	}
	
}