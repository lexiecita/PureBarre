package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.FooterObjects;
import com.purebarre.www.utils.WaitTypes;

public class FooterNavigationActions extends ParameterManager {

	private String ResultantURL;
	private String SubscribeNewsletterText;
	private String URLcheck;
	
	public FooterNavigationActions() {
		
	}
	
	public FooterNavigationActions(String browser) {
		setBrowser(browser);
	}
	
	public String clickFooterLink_OrderInformation() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_OrderInformation(), 5);
		FooterObjects.link_OrderInformation().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_ReturnsAndExchanges() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_ReturnsandExchanges(), 5);
		FooterObjects.link_ReturnsandExchanges().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_ShippingInformation() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_ShippingInformation(), 5);
		FooterObjects.link_ShippingInformation().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_StreamingContentFAQ() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_StreamingContentFAQ(), 5);
		FooterObjects.link_StreamingContentFAQ().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_GiftCards() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_GiftCards(), 5);
		FooterObjects.link_GiftCards().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_StudioOwnersShop() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_StudioOwnersShop(), 5);
		FooterObjects.link_StudioOwnersShop().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_OwnerAndTeachersPortal() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_OwnerandTeachersPortal(), 5);
		FooterObjects.link_OwnerandTeachersPortal().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_Team() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_Team(), 5);
		FooterObjects.link_Team().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_Careers() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_Careers(), 5);
		FooterObjects.link_Careers().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_ContactUs() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_Careers(), 5);
		FooterObjects.link_Careers().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_Press() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_Press(), 5);
		FooterObjects.link_Press().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public void clickGetText_SubscribeNewsletter() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_SubscribeNewsletter(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeNewsletter()).click().perform();
	}
	
	public String click_SubscribeNewsletter_Submit() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_SubscribeNewsletter(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeNewsletter()).click().perform();
		actions.moveToElement(FooterObjects.submit_SubscribeNewsletter()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public void clickGetText_SubscribeBlog() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_SubscribeBlog(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeBlog()).click().perform();;
	}
	
	public String click_SubscribeBlog_Submit() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_SubscribeBlog(), 5);
		actions.moveToElement(FooterObjects.link_SubscribeBlog()).click().perform();
		actions.moveToElement(FooterObjects.submit_SubscribeBlog()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_Facebook() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.icon_Facebook(), 5);
		URLcheck = FooterObjects.icon_Facebook().getAttribute("href");
		return URLcheck;
	}
	
	public String clickFooterLink_Twitter() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(FooterObjects.icon_Twitter(), 5);
		URLcheck = FooterObjects.icon_Twitter().getAttribute("href");
		return URLcheck;
	}
	
	public String clickFooterLink_Instagram() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(FooterObjects.icon_Instagram(), 5);
		actions.moveToElement(FooterObjects.icon_Instagram()).click().perform();
		FooterObjects.icon_Instagram().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_Pinterest() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.icon_Pinterest(), 5);
		FooterObjects.icon_Pinterest().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_Linkedin() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.icon_Linkedin(), 5);
		FooterObjects.icon_Linkedin().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_YouTube() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(FooterObjects.icon_YouTube(), 5);
		actions.moveToElement(FooterObjects.icon_YouTube()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_DownloadForApple() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.button_DownloadApple(), 5);
		URLcheck = FooterObjects.button_DownloadApple().getAttribute("href");
		return URLcheck;
	}
	
	public String clickFooterLink_DownloadForGoogle() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.button_DownloadGoogle(), 5);
		URLcheck = FooterObjects.button_DownloadGoogle().getAttribute("href");
		return URLcheck;
	}
	
	public String clickFooterLink_PressImage() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.img_Press(), 5);
		FooterObjects.img_Press().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickFooterLink_PrivacyPolicy() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(FooterObjects.link_PrivacyPolicy(), 5);
		FooterObjects.link_PrivacyPolicy().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
}
