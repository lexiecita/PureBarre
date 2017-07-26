package com.purebarre.www.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class FreeWeekObjects {

	public static WebElement element = null;

	public static WebElement button_FreeWeek() {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(),'Try a Free Week')]"));
		return element;
	}
	
	public static WebElement textfield_FreeWeek_FirstName() {
		element = Manager.getDriver().findElement(By.xpath("//input[@placeholder='First Name']"));
		return element;
	}
	
	public static WebElement textfield_FreeWeek_LastName() {
		element = Manager.getDriver().findElement(By.xpath("//input[@placeholder='Last Name']"));
		return element;
	}
	
	public static WebElement textfield_FreeWeek_Email() {
		element = Manager.getDriver().findElement(By.xpath("//input[@placeholder='Email']"));
		return element;
	}
	
	public static WebElement textfield_FreeWeek_Phone() {
		element = Manager.getDriver().findElement(By.xpath("//input[@placeholder='Phone']"));
		return element;
	}
	
	public static WebElement button_FreeWeek_Submit() {
		element = Manager.getDriver().findElement(By.xpath("//input[@value='Try A Free Week']"));
		return element;
	}
}