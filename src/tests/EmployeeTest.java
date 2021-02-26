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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;
import objects.LoginObject;
import objects.AddEmployees;

public class EmployeeTest {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Desk\\Desktop\\chromedriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testEmployees() {
		driver.manage().window().maximize();
		driver.navigate().to(Dashboard.DASHBOARD_URL);
		
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
		
		Dashboard.clickStaff(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Dashboard.clickStaff(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		AddEmployees.addEmployee(driver);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		File f = new File("Zaposleni.xlsx");
		try {
			InputStream inp = new FileInputStream(f); 
			XSSFWorkbook wb = new XSSFWorkbook(inp); 
			Sheet sheet = wb.getSheetAt(0); 
			Row row = sheet.getRow(1);
			Cell a = row.getCell(0);
			Cell b = row.getCell(1);
			Cell c = row.getCell(2);
			String name = a.toString();
			String lastname = b.toString();
			String emaill = c.toString();
			
			Row row2 = sheet.getRow(2);
			Cell a1 = row2.getCell(0);
			Cell b1 = row2.getCell(1);
			Cell c1 = row2.getCell(2);
			String name1 = a1.toString();
			String lastname1 = b1.toString();
			String email1 = c1.toString();
			
			Row row3 = sheet.getRow(3);
			Cell a2 = row3.getCell(0);
			Cell b2 = row3.getCell(1);
			Cell c2 = row3.getCell(2);
			String name2 = a2.toString();
			String lastname2 = b2.toString();
			String email2 = c2.toString();
			
			Row row4 = sheet.getRow(4);
			Cell a3 = row4.getCell(0);
			Cell b3 = row4.getCell(1);
			Cell c3 = row4.getCell(2);
			String name3 = a3.toString();
			String lastname3 = b3.toString();
			String email3 = c3.toString();
			
			Row row5 = sheet.getRow(5);
			Cell a4 = row5.getCell(0);
			Cell b4 = row5.getCell(1);
			Cell c4 = row5.getCell(2);
			String name4 = a4.toString();
			String lastname4 = b4.toString();
			String email4 = c4.toString();
			
			AddEmployees.sendKeysName(driver, name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysLastname(driver, lastname);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysEmail(driver, email);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			AddEmployees.sendKeysName(driver, name1);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysLastname(driver, lastname1);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysEmail(driver, email1);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysName(driver, name2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysLastname(driver, lastname2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysEmail(driver, email2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			AddEmployees.sendKeysName(driver, name3);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysLastname(driver, lastname3);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			AddEmployees.sendKeysEmail(driver, email3);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysName(driver, name4);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysLastname(driver, lastname4);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			AddEmployees.sendKeysEmail(driver, email4);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			AddEmployees.addSaveEmployee(driver);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			Dashboard.clickStaff(driver);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
				
			wb.close();

		} catch (

		IOException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
}

