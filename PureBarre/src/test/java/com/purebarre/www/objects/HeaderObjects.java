package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class HeaderObjects {

	public static WebElement element = null;

	public static WebElement widget_FindAStudio() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='change-studio-option']"));
		return element;
	}

	public static WebElement widget_InputField_Zipcode() {
		element = Manager.getDriver()
				.findElement(By.xpath("//input[@class='input-field location-widget-dropdown-change-form-input']"));
		return element;
	}

	public static WebElement widget_Button_ZipcodeSubmit() {
		element = Manager.getDriver()
				.findElement(By.xpath("//button[@class='location-widget-dropdown-change-form-submit']"));
		return element;
	}

	public static WebElement widget_Button_FindMoreStudios() {
		element = Manager.getDriver().findElement(By.xpath("//a[@class='location-widget-dropdown-studio-button']"));
		return element;
	}

	public static WebElement link_Logo() {
		element = Manager.getDriver().findElement(By.xpath("//a[@id='logo']"));
		return element;
	}

	public static WebElement link_Locations() {
		element = Manager.getDriver()
				.findElement(By.xpath("//ul[@class='menu']//a[text()='Locations']"));
		return element;
	}

	public static WebElement link_TheExperience() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='The Experience']"));
		return element;
	}

	public static WebElement link_Story() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='Story']"));
		return element;
	}

	public static WebElement link_Blog() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='Blog']"));
		return element;
	}

	public static WebElement link_Shop() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='Shop']"));
		return element;
	}

	public static WebElement link_OnDemand() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='On Demand']"));
		return element;
	}

	public static WebElement link_OwnAStudio() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='Own a Studio']"));
		return element;
	}

}
