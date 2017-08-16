package com.purebarre.www.dataaction;

import org.openqa.selenium.JavascriptExecutor;
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
	
	public void clicklink_MakeThisYourStudio() {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		UtilityObjects.button_Search().click();
/*		wait.waitForElementWithPolling(UtilityObjects.link_MakeThisYourStudio(), 5);
*/		JavascriptExecutor js = (JavascriptExecutor)Manager.getDriver();
		String readystate = (String) js.executeScript("return document.readyState");
		if (readystate.equalsIgnoreCase("complete")) {
			System.out.println("it is complete");
			wait.waitForElement_Clickable(UtilityObjects.link_MakeThisYourStudio(), 30);
			UtilityObjects.link_MakeThisYourStudio().click();
		}
			
		}
	
	public void clicklink_CurrentLocation(String zipcode, String location ) {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.textbox_Zipcode(), 5);
		UtilityObjects.text_MakeThisYourStudio_Result(location).click();
	}
	
	public void clicklink_FindAClass(String zipcode, String location) {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(UtilityObjects.textbox_Zipcode(), 5);
		UtilityObjects.textbox_Zipcode().sendKeys(zipcode);
		UtilityObjects.button_Search().click();
		UtilityObjects.link_MakeThisYourStudio().click();
		UtilityObjects.text_MakeThisYourStudio_Result(location).click();
		UtilityObjects.link_FindAClass().click();
		Manager.getDriver().switchTo().window("Pure Barre - Fort Lauderdale");
		}
	}

