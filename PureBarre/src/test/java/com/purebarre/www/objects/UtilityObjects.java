package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class UtilityObjects {
	
	public static WebElement element = null;

	public static WebElement widgetButton_FindAStudio() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='change-studio-option']"));
		return element;
	}
	
	public static WebElement text_SearchByZipCode() {
		element = Manager.getDriver().findElement(By.xpath("//label[@class='location-widget-dropdown-change-form-label']"));
		return element;
	}
	
	public static WebElement textbox_Zipcode() {
		element = Manager.getDriver().findElement(By.xpath("//input[@class='input-field location-widget-dropdown-change-form-input']"));
		return element;
	}
	
	public static WebElement button_Search() {
		element = Manager.getDriver().findElement(By.xpath("//button[@class='location-widget-dropdown-change-form-submit']"));
		return element;
	}
	
	public static WebElement link_FindMoreStudios() {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(), 'Find More Studios')]"));
		return element;
	}
	
	public static WebElement text_CityResult() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@id='location-widget-studio-list']/li[1]/div[1]/a"));
		return element;
	}
	
	public static WebElement link_ResultLocation(String location) {
		element = Manager.getDriver().findElement(By.xpath("//ul[@id='location-widget-studio-list']/li[1]/div[1]/a[contains(text(), " + location + ")]"));
		return element;
	}
	
	public static WebElement link_MakeThisYourStudio() {
		element = Manager.getDriver().findElement(By.xpath("//ul[@id='location-widget-studio-list']//li[1]/form/input[1]"));
		return element;
	}
	
	public static WebElement text_MakeThisYourStudio_Result(String location) {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(), 'Fort Lauderdale')]"));
		return element;
	}
	
	public static WebElement link_FindAClass() {
		element = Manager.getDriver().findElement(By.xpath("//a[@id='find-a-class-option']"));
		return element;
	}
	
	public static WebElement link_StudioInfo_Address(String location) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='studio-info']//div[contains(text(), " + location + ")]/following-sibling::a[1]"));
		return element;
	}
}
