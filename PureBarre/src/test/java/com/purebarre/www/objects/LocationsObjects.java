package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class LocationsObjects {

	public static WebElement element = null;

	public static WebElement dropdown_Country() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='countries']/select"));
		return element;
	}
		
	public static WebElement dropdown_State() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='states']/select[@name='state-filter']"));
		return element;
	}
	
	public static WebElement getText_location(String location) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='locations-container']/div[3]/a/article/header/h2[contains(text(), " + location + ")]"));
		return element;
	}
	
	public static WebElement getText_country() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='countries']//select[@name='country-filter']//option[contains(text(), 'united states of america')]"));
		return element;
	}
	
	public static WebElement button_ViewStudio(String studio) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='locations-container']/div[11]/a/article/p[contains(text(), " + studio + ")]"));
		return element;
	}

	public static WebElement link_MakeThisYourStudio() {
		//TODO Make better xpath
		element = Manager.getDriver().findElement(By.xpath("//div[@id='locations-container']/div[3]/a/form/input[1]"));
		return element;
	}
	
	public static WebElement link_MakeThisYourStudio(String studio) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='location-information']/a[contains(text(), " + studio + " )]"));
		return element;
	}
	
	public static WebElement link_MakeItHappen() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='locations-container']//a[contains(text(), 'Make it happen')]"));
		return element;
	}
		
}
