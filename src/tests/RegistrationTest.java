package tests;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.HomePage;
import objects.LoginObject;


public class RegistrationTest {

	public static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desk\\Desktop\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority = 1)
	public void resizeTest() {
	    driver.navigate().to(HomePage.HOMEPAGE_URL);
	    driver.manage().window().maximize();
	}
	 
	@Test (priority = 2)
	public void closePopUp() {
	    driver.navigate().to(HomePage.HOMEPAGE_URL);
	    driver.manage().window().maximize();
	    HomePage.acceptCookies(driver);
	    
	    
	}

	@Test (priority = 3)
	public void testRegForm() {

		File f = new File("Data.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);

			SoftAssert sa = new SoftAssert();

			for (int i = 0; i < 6; i++) {

				Row row = sheet.getRow(i);

				Cell cell1 = row.getCell(0);
				Cell cell2 = row.getCell(1);
				Cell cell3 = row.getCell(2);
				Cell cell4 = row.getCell(3);
				Cell cell5 = row.getCell(4);
				Cell cell6 = row.getCell(5);
				

				String fullname = cell1.toString();
				String email = cell2.toString();
				String companyname = cell3.toString();
				String phonenumber = cell4.toString();
				String password = cell5.toString();
				String repeatpassword = cell6.toString();
				

				driver.navigate().to(HomePage.HOMEPAGE_URL);
				
				HomePage.inputFullName(driver, fullname);
				HomePage.inputWorkEmail(driver, email);
				
				HomePage.startFreeTrial(driver);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				}
				
				HomePage.inputCompanyname(driver, companyname);
				HomePage.chooseIndustry(driver);
				HomePage.chooseRole(driver);
				HomePage.inputPhoneNumber(driver, phonenumber);
				HomePage.inputPassword(driver, password);
				HomePage.inputRepeatPassword(driver, repeatpassword);
				
				HomePage.startScheduling(driver);
				

				String actual = driver.getCurrentUrl();
				String expected = "https://letocompany1.humanity.com/app/schedule/employee/week/overview/overview/26%2c1%2c2021/";
				
				
				sa.assertEquals(actual, expected);

			}

			sa.assertAll();

			wb.close();

		} catch (IOException e) {
			System.out.println("Nije pronadjen!");
			e.printStackTrace();
		}

	}
	
	@Test (priority = 4)
	public void testRegFormII() {

		File f = new File("Data1.xlsx");
		try {
			InputStream inp = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(inp);
			Sheet sheet = wb.getSheetAt(0);

			SoftAssert sa = new SoftAssert();

			for (int i = 0; i < 6; i++) {

				Row row = sheet.getRow(i);

				Cell cell1 = row.getCell(0);
				Cell cell2 = row.getCell(1);
				Cell cell3 = row.getCell(2);
				Cell cell4 = row.getCell(3);
				Cell cell5 = row.getCell(4);
				Cell cell6 = row.getCell(5);
				

				String companyname = cell1.toString();
				String phonenumber = cell4.toString();
				String pass = cell5.toString();
				String repeatpass = cell6.toString();
				

				driver.navigate().to(HomePage.HOMEPAGE_URL);
				
				HomePage.inputCompanyname(driver, companyname);
				HomePage.chooseIndustry(driver);
				HomePage.chooseRole(driver);
				HomePage.inputPhoneNumber(driver, phonenumber);
				HomePage.inputPassword(driver, pass);
				HomePage.inputRepeatPassword(driver, repeatpass);
				
				HomePage.startFreeTrial(driver);
				
				

				String actual = driver.getCurrentUrl();
				String expected = "https://letocompany1.humanity.com/app/schedule/employee/week/overview/overview/26%2c1%2c2021/";
				
				
				sa.assertEquals(actual, expected);

			}

			sa.assertAll();

			wb.close();

		} catch (IOException e) {
			System.out.println("Nije pronadjen!");
			e.printStackTrace();
		}

	}
	

}
