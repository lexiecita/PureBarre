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

	public static WebElement link_TheExperience() {
		element = Manager.getDriver()
				.findElement(By.xpath("//li[@id='menu-item-12592']/a"));
		return element;
	}
	
	public static WebElement link_Locations() {
		element = Manager.getDriver()
				.findElement(By.xpath("(//ul[@class='menu']//li[@id='menu-item-92']//a[text()='Locations'])[1]"));
		return element;
	}

	public static WebElement link_NewToPureBarre() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='sub-menu']//a[contains(text(), 'new to pure barre')]"));
		return element;
	}
	
	public static WebElement link_AboutOurTechnique() {
		element = Manager.getDriver().findElement(By.xpath("//li[@id='menu-item-12593']/a"));
		return element;
	}
	
	public static WebElement link_Classes() {
		element = Manager.getDriver().findElement(By.xpath("//li[@id='menu-item-14087']/a"));
		return element;
	}
	
	public static WebElement link_PureFoundations() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='sub-menu']//a[contains(text(), 'Pure Foundations')]"));
		return element;
	}
	
	public static WebElement link_SpecialtyClasses() {
		element = Manager.getDriver().findElement(By.xpath("//li[@id='menu-item-83']/a"));
		return element;
	}

	public static WebElement link_Story() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='Story']"));
		return element;
	}

	public static WebElement link_Blog() {
		element = Manager.getDriver().findElement(By.xpath("(//ul[@class='menu']//a[text()='Blog'])[1]"));
		return element;
	}

	public static WebElement link_Shop() {
		element = Manager.getDriver().findElement(By.xpath("(//ul[@class='menu']//a[text()='Shop'])[1]"));
		return element;
	}

	public static WebElement link_OnDemand() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@class='menu']//a[text()='On Demand']"));
		return element;
	}

	public static WebElement link_OwnAStudio() {
		element = Manager.getDriver().findElement(By.xpath("(//ul[@class='menu']//a[text()='Own a Studio'])[1]"));
		return element;
	}

}
