package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class HomepageObjects {

	public static WebElement element = null;
	
	public static WebElement cta_TryAFreeWeek() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='content']//a[@class='button']"));
		return element;
	}
	
	public static WebElement cta_EmpowerLearnMore() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='content']//a[contains(text(), 'Learn more')]"));
		return element;
	}
	
	public static WebElement cta_CarouselNext() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='controls']//a[contains(text(), 'Next')]"));
		return element;
	}
		
	public static WebElement cta_CarouselNext_Testimonial() {
		element = Manager.getDriver().findElement(By.id("rslides1_s1"));
		return element;
	}
	
	public static WebElement cta_CarouselPrevious() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='controls']//a[contains(text(), 'Previous')]"));
		return element;
	}
	
	public static WebElement cta_CarouselPrevious_Testimonial() {
		element = Manager.getDriver().findElement(By.id("rslides1_s25"));
		return element;
	}
}
