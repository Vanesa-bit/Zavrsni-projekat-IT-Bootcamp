package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	public static final String DASHBOARD_URL = "https://letocompany1.humanity.com/app/dashboard/";
	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	public static final String SHIFTPLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span"; 
	public static final String TIMECLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	public static final String PAYROLL_ID = "sn_payroll";
	public static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
	
	public static void clickDashboard(WebDriver driver) {
		driver.findElement(By.xpath("DASHBOARD_XPATH")).click();
	
	}
	
	public static void clickShiftplanning(WebDriver driver) {
		driver.findElement(By.xpath("SHIFTPLANNING_XPATH")).click();
	
	}
	
	public static void clickTimeClock(WebDriver driver) {
		driver.findElement(By.xpath("TIMECLOCK_XPATH")).click();
	
	}
	
	
	
	public static void clickLeave(WebDriver driver) {
		driver.findElement(By.xpath("LEAVE_XPATH")).click();
	
	}
	public static void clickTraining(WebDriver driver) {
		driver.findElement(By.xpath("TRAINING_XPATH")).click();
	
	}
	
	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.xpath("STAFF_XPATH")).click();
	
	}
	
	public static void clickAvailability(WebDriver driver) {
		driver.findElement(By.xpath("AVAILABILITY_XPATH")).click();
	
	}
	
	public static void clickPayroll(WebDriver driver) {
		driver.findElement(By.id("PAYROLL_ID")).click();
	
	}
	
	public static void clickReports(WebDriver driver) {
		driver.findElement(By.xpath("REPORTS_XPATH")).click();
	
	}
	
	
	
	
}
