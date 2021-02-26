package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployees {

	public static final String STAFF_URL = "https://letocompany1.humanity.com/app/staff/list/load/true/";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	private static final String ADDEMPLOYEE_XPATH = "//*[@id=\"act_primary\"]";
	private static final String NAME_XPATH = "//*[@id=\"_asf1\"]";
	private static final String LASTNAME_XPATH = "//*[@id=\"_asl1\"]";
	private static final String EMAIL_XPATH = "//*[@id=\"_ase1\"]";
	
	private static final String SAVE_XPATH = "//*[@id=\"_as_save_multiple\"]";
	
	private static final String EDIT_DETAILS_EMPLOYEE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String CLEAR_NAME_FIELD_XPATH ="//*[@id=\"first_name\"]";
	private static final String INPUT_NAME_FIELD_XPATH = "//*[@id=\"first_name\"]";
	private static final String SAVE_EDIT_EMPLOYEE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	public static final String EMAIL_EMPLOYEE_PG_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div[1]/ul/li[5]/span[2]";
	private static final String UPLOAD_EMPL_PICTURE = "//*[@id=\"fileupload\"]";
	
	
	public static void openStaffPage(WebDriver driver) {
		driver.get(STAFF_URL);
	}
	
	public static void navigateToStaffPage(WebDriver driver) {
		driver.navigate().to(STAFF_URL);
	}
	
	public static void addEmployee(WebDriver driver) {
		driver.findElement(By.xpath(ADDEMPLOYEE_XPATH)).click();
		
	}
	
	public static WebElement getName(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(NAME_XPATH));
		return we;
	}
	
	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	
	public static void sendKeysName(WebDriver driver, String name) {
		getName(driver).sendKeys("Jovan");
	}
	
	public static WebElement getLastname(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(LASTNAME_XPATH));
		return we;
	}
	
	public static void clickLastname(WebDriver driver) {
		getName(driver).click();
	}

	
	public static void sendKeysLastname(WebDriver driver, String lastname) {
		getName(driver).sendKeys("Jovanic");
	}
	
	public static WebElement getEmail(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(EMAIL_XPATH));
		return we;
	}
	
	public static void clickEmail(WebDriver driver) {
		getName(driver).click();
	}

	
	public static void sendKeysEmail(WebDriver driver, String lastname) {
		getName(driver).sendKeys(lastname);
	}
	public static void addSaveEmployee(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_XPATH)).click();
	}
	
	public static void editEmployeeName(WebDriver driver) {
		driver.findElement(By.linkText("Jovan Jovanic")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(EDIT_DETAILS_EMPLOYEE_XPATH)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(CLEAR_NAME_FIELD_XPATH)).clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(INPUT_NAME_FIELD_XPATH)).sendKeys("Mica Micic");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_EDIT_EMPLOYEE_XPATH)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void addEmployeePicture(WebDriver driver) {
		driver.findElement(By.linkText("Mica Micic")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(EDIT_DETAILS_EMPLOYEE_XPATH)).click(); //edit details
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		WebElement UploadImg = driver.findElement(By.xpath(UPLOAD_EMPL_PICTURE));
		UploadImg.sendKeys("C:\\Users\\Desk\\eclipse-workspace\\ITBootcampZavrsniProjekat\\download.jpg");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath(SAVE_EDIT_EMPLOYEE_XPATH)).click(); //bttn save
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
