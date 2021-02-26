package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
	
	public static final String LOGIN_URL = "https://www.humanity.com/app/";
	private static final String BTN_LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p"; 
	private static final String USERNAME_XPATH = "//*[@id=\"email\"]";
	private static final String PASSWORD_XPATH = "//*[@id=\"password\"]";
	private static final String BTN_LOGIN_CONFIRM_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";

	
	public static void login(WebDriver driver) {
		driver.navigate().to(LOGIN_URL);
		driver.findElement(By.xpath(BTN_LOGIN_XPATH)).click();
		
	}
	
	public static void loginName(WebDriver driver, String email) {
		driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys("srecko@itbootcamp.com");
	
}

	public static void loginPass(WebDriver driver, String pass) {
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("vanivanivani5");
		
	}
	
	
	public static void loginConf(WebDriver driver) {
		driver.findElement(By.xpath(BTN_LOGIN_CONFIRM_XPATH)).click();
	}
	
}
	

	

