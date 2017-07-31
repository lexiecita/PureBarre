package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class FooterObjects {

	public static WebElement element = null;

	public static WebElement link_OrderInformation() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//h5[text()='ordering information']"));
		return element;
	}

	public static WebElement link_ReturnsandExchanges() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//h5[text()='Returns & Exchange']"));
		return element;
	}

	public static WebElement link_ShippingInformation() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//h5[text()='Shipping Information']"));
		return element;
	}

	public static WebElement link_StreamingContentFAQ() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//h5[text()='Streaming Content FAQ']"));
		return element;
	}

	public static WebElement link_GiftCards() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='table-cell']//h5[text()='Gift Cards']"));
		return element;
	}

	public static WebElement link_StudioOwnersShop() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//h5[text()='Streaming Content FAQ']"));
		return element;
	}

	public static WebElement link_OwnerandTeachersPortal() {
		element = Manager.getDriver()
	}

}
