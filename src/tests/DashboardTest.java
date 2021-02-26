package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Dashboard;
import objects.HomePage;
import objects.LoginObject;
import objects.LoginObject;

public class DashboardTest {

	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desk\\Desktop\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void clickDashboard() {

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		driver.manage().window().maximize();

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
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		SoftAssert sa = new SoftAssert();

		Dashboard.clickDashboard(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/dashboard/";

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 2)
	public void clickShiftPlanning() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Dashboard.clickShiftplanning(driver);
		
		driver.findElement(By.xpath(Dashboard.SHIFTPLANNING_XPATH)).click();

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/schedule/employee/week/overview/overview/25%2c1%2c2021/";

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 3)
	public void clickTimeclock() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Dashboard.clickTimeClock(driver);
		
		driver.findElement(By.xpath("TIMECLOCK_XPATH")).click();

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/timeclock/";

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 4)
	public void clickLeave() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Dashboard.clickLeave(driver);

		driver.findElement(By.xpath("LEAVE_XPATH")).click();
		
		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/requests/vacation/";

		sa.assertEquals(actual, expected);
		sa.assertAll();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void clickTraining() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Dashboard.clickTraining(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/training/";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 6)
	public void clickStaff() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Dashboard.clickStaff(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/staff/list/load/true/";

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 7)
	public void clickAvailability() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Dashboard.clickAvailability(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 8)
	public void clickPayroll() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Dashboard.clickPayroll(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/payroll/scheduled-hours/";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(priority = 9)
	public void clickReports() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Dashboard.DASHBOARD_URL);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Dashboard.clickReports(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://letocompany1.humanity.com/app/reports/dashboard/";
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

}
