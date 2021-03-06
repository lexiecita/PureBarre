package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.FooterObjects;
import com.purebarre.www.utils.WaitTypes;

public class FooterNavigationActions extends ParameterManager {

	public FooterNavigationActions() {

	}

	public FooterNavigationActions( String browser) {
		setBrowser(browser);
	}

	public void clickFooterLink_OrderInformation() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_OrderInformation(), 5);
		FooterObjects.link_OrderInformation().click();
	}

	public void clickFooterLink_ReturnsAndExchanges() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_ReturnsandExchanges(), 5);
		FooterObjects.link_ReturnsandExchanges().click();
	}

	public void clickFooterLink_ShippingInformation() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_ShippingInformation(), 5);
		FooterObjects.link_ShippingInformation().click();
	}

	public void clickFooterLink_StreamingContentFAQ() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_StreamingContentFAQ(), 5);
		FooterObjects.link_StreamingContentFAQ().click();
	}

	public void clickFooterLink_GiftCards() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_GiftCards(), 5);
		FooterObjects.link_GiftCards().click();
	}

	public void clickFooterLink_StudioOwnersShop() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_StudioOwnersShop(), 5);
		FooterObjects.link_StudioOwnersShop().click();
	}

	public void clickFooterLink_OwnerAndTeachersPortal() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_OwnerandTeachersPortal(), 5);
		FooterObjects.link_OwnerandTeachersPortal().click();
	}

	public void clickFooterLink_Team() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_Team(), 5);
		FooterObjects.link_Team().click();
	}

	public void clickFooterLink_Careers() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_Careers(), 5);
		FooterObjects.link_Careers().click();
	}

	public void clickFooterLink_ContactUs() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_ContactUs(), 5);
		FooterObjects.link_ContactUs().click();
	}

	public void clickFooterLink_Press() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_Press(), 5);
		FooterObjects.link_Press().click();
	}

	public void clickGetText_SubscribeNewsletter() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_SubscribeNewsletter(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeNewsletter()).click().perform();
	}

	public void click_SubscribeNewsletter_Submit() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_SubscribeNewsletter(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeNewsletter()).click().perform();
	}

	public void clickGetText_SubscribeBlog() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_SubscribeBlog(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeBlog()).click().perform();
	}

	public void click_SubscribeBlog_Submit() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElementWithPolling(FooterObjects.link_SubscribeBlog(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeBlog()).click().perform();
		wait.waitForElementWithPolling(FooterObjects.textBox_secondState_SubscribeBlog(), 5);
		actions.moveToElement(FooterObjects.textBox_secondState_SubscribeBlog()).click().sendKeys("test@test.com").perform();
		actions.moveToElement(FooterObjects.submit_SubscribeBlog()).click().perform();	
	}

	public void clickFooterLink_Facebook() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.icon_Facebook(), 5);
		FooterObjects.icon_Facebook().click();
	}

	public void clickFooterLink_Twitter() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.icon_Twitter(), 5);
		FooterObjects.icon_Twitter().click();
	}

	public void clickFooterLink_Instagram() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.icon_Instagram(), 5);
		FooterObjects.icon_Instagram().click();
	}

	public void clickFooterLink_Pinterest() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.icon_Pinterest(), 5);
		FooterObjects.icon_Pinterest().click();
	}

	public void clickFooterLink_Linkedin() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.icon_Linkedin(), 5);
		FooterObjects.icon_Linkedin().click();
	}

	public void clickFooterLink_YouTube() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.icon_YouTube(), 5);
		FooterObjects.icon_YouTube().click();
	}

	public void clickFooterLink_DownloadForApple() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.button_DownloadApple(), 5);
		FooterObjects.button_DownloadApple().click();
	}

	public void clickFooterLink_DownloadForGoogle() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.button_DownloadGoogle(), 5);
		FooterObjects.button_DownloadGoogle().click();
	}

	public void clickFooterLink_PressImage() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.img_Press(), 5);
		FooterObjects.img_Press().click();
	}

	public void clickFooterLink_PrivacyPolicy() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FooterObjects.link_PrivacyPolicy(), 5);
		FooterObjects.link_PrivacyPolicy().click();
	}
}
