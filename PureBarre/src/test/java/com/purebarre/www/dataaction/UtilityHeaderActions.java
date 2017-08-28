package com.purebarre.www.dataaction;

import org.openqa.selenium.interactions.Actions;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.UtilityObjects;
import com.purebarre.www.utils.WaitTypes;

public class UtilityHeaderActions extends ParameterManager {
	
	public UtilityHeaderActions() {

	}

	public UtilityHeaderActions( String browser) {
		setBrowser(browser);
	}
	
	public void clickFindAStudio_Widget() {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.widgetButton_FindAStudio(), 5);
		UtilityObjects.widgetButton_FindAStudio().click();
	}
	
	public void sendKeys_Zipcode(String zipcode) {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.textbox_Zipcode(), 5);
		UtilityObjects.textbox_Zipcode().sendKeys(zipcode);
		wait.waitForElement_Clickable(UtilityObjects.button_Search(), 5);
		UtilityObjects.button_Search().click();
	}
	
	public void clicklink_FindMoreStudios() {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElementWithPolling(UtilityObjects.link_FindMoreStudios(), 5);
		actions.moveToElement(UtilityObjects.link_FindMoreStudios()).click().perform();
	}
	
	public void clicklink_LocationResult(String location) {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElementWithPolling(UtilityObjects.link_MakeThisYourStudio(), 5);
		actions.moveToElement(UtilityObjects.link_ResultLocation(location)).click().perform();
	}
	
	public void clicklink_MakeThisYourStudio() {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		UtilityObjects.button_Search().click();
		wait.waitForElementWithPolling(UtilityObjects.link_MakeThisYourStudio(), 5);
		actions.moveToElement(UtilityObjects.link_MakeThisYourStudio()).click().perform();
	}
	    
	public void clicklink_CurrentLocation(String zipcode, String location ) {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.textbox_Zipcode(), 5);
		UtilityObjects.text_MakeThisYourStudio_Result(location).click();
	}
	
	public void clicklink_FindAClass() throws InterruptedException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.link_FindAClass(), 5);
		UtilityObjects.link_FindAClass().click();
		Thread.sleep(2000);
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void clicklink_StudioInfo() throws InterruptedException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.link_StudioInfo(), 5);
		actions.moveToElement(UtilityObjects.link_StudioInfo()).click().perform();
	}
	
	public void clicklink_StudioInfo_Address(String location) throws InterruptedException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.link_StudioInfo_Address(location), 5);
		actions.moveToElement(UtilityObjects.link_StudioInfo_Address(location)).click().perform();
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void clicklink_StudioInfo_Email(String email) throws InterruptedException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.link_StudioInfo_Email(email), 5);
		actions.moveToElement(UtilityObjects.link_StudioInfo_Email(email)).click().perform();
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void clicklink_StudioInfo_ViewProfile(String location) throws InterruptedException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.link_StudioInfo_ViewProfile(location), 5);
		actions.moveToElement(UtilityObjects.link_StudioInfo_ViewProfile(location)).click().perform();
	}
}
