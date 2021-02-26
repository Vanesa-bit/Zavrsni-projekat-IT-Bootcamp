package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Settings {

	public static final String SETTINGS_URL = "https://letocompany1.humanity.com/app/admin/settings/";
	
	private static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span";
	private static final String LANGUAGE_NAME = "language";
	private static final String COUNTRY_XPATH = "//*[@id=\"country\"]";
	private static final String EMAILNOT_XPATH = "//*[@id=\"pref_pref_email\"]";
	private static final String SMSNOT_XPATH = "//*[@id=\"pref_pref_sms\"]";
	private static final String MOBILENOT_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	private static final String TIMEFORMAT_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[5]/td[2]/select";
	
	
	
		private static final String DROP_DOWN_LANGUAGE_SELECT_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
		
		
		private static final String NOTIFICATION_EMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";
		private static final String NOTIFICATION_SMS_XPATH = "//*[@id=\"pref_pref_sms\"]";
		private static final String NOTIFICATION_MOB_PUSH_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
		
		
		private static final String SAVE_SETTINGS_XPATH = "//*[@id=\"_save_settings_button\"]";
	
	
	public static void selectLanguage(WebDriver driver) {
		Select Language = new Select(driver.findElement(By.name("language")));
		Language.selectByVisibleText("Serbian (machine)");
		
		}
	
	
	
	public static void selectCountry(WebDriver driver) {
		Select Language = new Select(driver.findElement(By.xpath(COUNTRY_XPATH)));
		Language.selectByVisibleText("Portugal");
		
		}
	
	public static void clickSaveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS_XPATH)).click();
	}
	
	public static void notificationsEmail(WebDriver driver) {
		driver.findElement(By.xpath(NOTIFICATION_EMAIL_XPATH)).click();
	}
	
	public static void notificationsSMS(WebDriver driver) {
		driver.findElement(By.xpath(NOTIFICATION_SMS_XPATH)).click();
	}
	
	public static void notificationsMobPush(WebDriver driver) {
		driver.findElement(By.xpath(NOTIFICATION_MOB_PUSH_XPATH)).click();
	}
	
	public static void clickSaveSettings2(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS_XPATH)).click();
	}
	
	
	
}
