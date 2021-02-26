package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static final String HOMEPAGE_URL = "https://www.humanity.com/";
	private static final String POPUP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String CLOSE_POPUP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String FULLNAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	public static final String WORKEMAIL_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";

	public static void killPopups(WebDriver driver) {
		driver.findElement(By.xpath(POPUP_XPATH)).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.findElement(By.xpath(POPUP_XPATH)).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void openPage(WebDriver driver) {
		driver.get(HOMEPAGE_URL);
	}

	public static void navigateToPage(WebDriver driver) {
		driver.navigate().to(HOMEPAGE_URL);
	}

	public static void inputFullName(WebDriver driver, String fullname) {
		driver.findElement(By.xpath(FULLNAME_XPATH)).sendKeys(fullname);
	}

	public static void inputWorkEmail(WebDriver driver, String workemail) {
		driver.findElement(By.xpath(WORKEMAIL_XPATH)).sendKeys(workemail);
	}

	public static void startFreeTrial(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"free-trial-link-01\"]")).click();
	}

	public static void inputCompanyname(WebDriver driver, String companyname) {
		driver.findElement(By.name("business")).sendKeys(companyname);

	}

	public static void chooseIndustry(WebDriver driver) {

		WebElement Industry = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div")); 
		Industry.click();
		Industry.sendKeys(Keys.ARROW_DOWN);
		Industry.sendKeys("Education");
		Industry.sendKeys(Keys.ENTER);

	}

	public static void chooseRole(WebDriver driver) {

		WebElement Role = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div"));
		Role.click();
		Role.sendKeys(Keys.ARROW_DOWN);
		Role.sendKeys("Finance");
		Role.sendKeys(Keys.ENTER);

	}

	public static void inputPhoneNumber(WebDriver driver, String phonenumber) {
		driver.findElement(By.name("phone")).sendKeys(phonenumber);

	}

	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input")).sendKeys(password);

	}

	public static void inputRepeatPassword(WebDriver driver, String repeatpassword) {
		driver.findElement(By.name("repeat_password")).sendKeys(repeatpassword);

	}

	public static void startScheduling(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/span/input")).click();
	}

	public static void startMyFreeTrialBTN2(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[3]")).click();
	}

	public static void startFreeTrial2accept(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"popup-free-trial-link\"]")).click();
	}

	public static void acceptCookies(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button/span")).click();
	}

}
