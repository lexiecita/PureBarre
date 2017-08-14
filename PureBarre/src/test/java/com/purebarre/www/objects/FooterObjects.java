package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class FooterObjects {

	public static WebElement element = null;

	public static WebElement link_OrderInformation() {
		element = Manager.getDriver()
				.findElement(By.xpath("//a[contains(text(), 'Order Information')]"));
		return element;
	}

	public static WebElement link_ReturnsandExchanges() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Returns & Exchanges')]"));
		return element;
	}

	public static WebElement link_ShippingInformation() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Shipping Information')]"));
		return element;
	}

	public static WebElement link_StreamingContentFAQ() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Streaming Content')]"));
		return element;
	}

	public static WebElement link_GiftCards() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Gift Cards')]"));
		return element;
	}

	public static WebElement link_StudioOwnersShop() {
		element = Manager.getDriver()
				.findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Studio Owners')]"));
		return element;
	}

	public static WebElement link_OwnerandTeachersPortal() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Owner and Teacher')]"));
		return element;
	}
	
	public static WebElement link_Team() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Team')]"));
		return element;
	}
	
	public static WebElement link_Careers() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Careers')]"));
		return element;
	}
	
	public static WebElement link_ContactUs() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='table-cell']//a[contains(text(), 'Contact Us')]"));
		return element;
	}
	
	public static WebElement link_Press() {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(), 'Press')]"));
		return element;
	}
	
	public static WebElement link_SubscribeNewsletter() {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(), 'Subscribe to Our Newsletter')]"));
		return element;
	}
	
	public static WebElement field_SubscribeNewsletter() {
		element = Manager.getDriver().findElement(By.xpath("//input[@id='newsletter']"));
		return element;
	}
	
	public static WebElement submit_SubscribeNewsletter() {
		element = Manager.getDriver().findElement(By.xpath("//button[@title='Submit']"));
		return element;
	}
	
	public static WebElement form_GetId_SubscribeNewsletter() {
		element = Manager.getDriver().findElement(By.xpath("//form[@id='newsletter-validate-detail']"));
		return element;
	}
	
	public static WebElement link_SubscribeBlog() {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(), 'Subscribe to Our Blog')]"));
		return element;
	}
	
	public static WebElement text_SubscribeBlog() {
		element = Manager.getDriver().findElement(By.xpath("//form[@id='form-wysija-html56f560f9aa4c3-2']/input[1]"));
		return element;
	}
	
	public static WebElement textBox_SubscribeBlog() {
		element = Manager.getDriver().findElement(By.xpath("//form[@id='newsletter-validate-detail']//input[@name][1]"));
		return element;
	}
	
	public static WebElement textBox_secondState_SubscribeBlog() {
		element = Manager.getDriver().findElement(By.xpath("//input[@name='wysija[user][email]']"));
		return element;
	}
	
	public static WebElement submit_SubscribeBlog() {
		element = Manager.getDriver().findElement(By.xpath("//input[@type='submit']"));
		return element;
	}
	
	public static WebElement text_FollowingSubmit_SubscribeBlog() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='updated']//li[contains(text(), 'Check your inbox')]"));
		return element;
	}
	
	public static WebElement icon_Facebook() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='social-links']//a[@class='site-home_facebook']"));
		return element;
	}

	public static WebElement icon_Twitter() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='social-links']//a[@class='site-home_twitter']"));
		return element;
	}
	
	public static WebElement icon_Instagram() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='social-links']//a[@class='site-home_instagram']"));
		return element;
	}
	
	public static WebElement icon_Pinterest() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='social-links']//a[@class='site-home_pinterest']"));
		return element;
	}
	
	public static WebElement icon_Linkedin() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='social-links']//a[@class='site-home_linkedin']"));
		return element;
	}
	
	public static WebElement icon_YouTube() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='social-links']//a[@class='site-home_youtube']"));
		return element;
	}
	
	public static WebElement button_DownloadApple() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='apps']//a[contains(text(), 'Download For Apple')]"));
		return element;
	}
	
	public static WebElement button_DownloadGoogle() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='apps']//a[contains(text(), 'Download For Google')]"));
		return element;
	}
	
	public static WebElement img_Press() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='as-seen-in table-cell']//a[@href='/story/press']"));
		return element;
	}
	
	public static WebElement link_PrivacyPolicy() {
		element = Manager.getDriver().findElement(By.xpath("//a[contains(text(), 'Privacy Policy')]"));
		return element;
	}
}
