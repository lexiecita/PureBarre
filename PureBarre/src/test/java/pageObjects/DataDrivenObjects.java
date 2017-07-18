package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.DriverManager;

public class DataDrivenObjects {

	private static WebElement element = null;

	public static WebElement button_TryAFreeWeek() {
		element = DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Try a Free Week')]"));
		return element;
	}

	/*
	 * public static WebElement textfield_FreeWeek_FirstName() {
	 * element = DriverManager.getDriver().findElement(By.xpath("//input[@id='first_name']"));
	 * return element;
	 * }
	 * 
	 * public static WebElement textfield_FreeWeek_LastName() {
	 * element = DriverManager.getDriver().findElement(By.xpath("//input[@id='last_name']"));
	 * return element;
	 * }
	 * 
	 * public static WebElement textField_FreeWeek_Email() {
	 * element = DriverManager.getDriver().findElement(By.xpath("//input[@id='email']"));
	 * return element;
	 * }
	 * 
	 * public static WebElement textField_FreeWeek_Phone() {
	 * element = DriverManager.getDriver().findElement(By.xpath("//input[@id='phone']"));
	 * return element;
	 * }
	 * 
	 * public static WebElement button_FreeWeek_Submit() {
	 * element = DriverManager.getDriver()
	 * .findElement(By.xpath("//div[@class='emma-button-wrapper']//input[@class='button']"));
	 * return element;
	 * }
	 */
}
