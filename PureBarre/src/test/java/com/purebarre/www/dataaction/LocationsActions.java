package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.LocationsObjects;

public class LocationsActions {
		

	public void clickDropdown_State(String state) throws IOException {
		Select selectState = new Select(LocationsObjects.dropdown_State());
		selectState.selectByVisibleText(state);
	}
	
	public void clickButton_ViewStudio(String studio) throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		actions.moveToElement(LocationsObjects.button_ViewStudio(studio)).perform();
		actions.moveToElement(LocationsObjects.button_ViewStudio(studio)).click().perform();
	}
	
	public void clickLink_MakeThisYourStudio() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		actions.moveToElement(LocationsObjects.link_MakeThisYourStudio()).perform();
		actions.moveToElement(LocationsObjects.link_MakeThisYourStudio()).click().perform();
	}
	
	public void clickLink_MakeItHappen() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		actions.moveToElement(LocationsObjects.link_MakeItHappen()).perform();
		actions.moveToElement(LocationsObjects.link_MakeItHappen()).click().perform();
	}
}
