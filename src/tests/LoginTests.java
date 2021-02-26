package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.HomePage;
import objects.LoginObject;

public class LoginTests {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desk\\Desktop\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testLogin() {
		driver.manage().window().maximize();
		
		driver.navigate().to(LoginObject.LOGIN_URL);
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		String email = "srecko@itbootcamp.com";
		String pass = "vanivanivani5";
		
		
		LoginObject.loginName(driver, email);
		LoginObject.loginPass(driver, pass);
		
		LoginObject.loginConf(driver);
		
		
		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
		
	}

}