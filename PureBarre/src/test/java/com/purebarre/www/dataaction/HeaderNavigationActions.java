package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.HeaderObjects;
import com.purebarre.www.utils.WaitTypes;

public class HeaderNavigationActions extends ParameterManager {

	private String ResultantURL;
	ExtentReports report;
	ExtentTest test;

	public HeaderNavigationActions() {

	}

	public HeaderNavigationActions(final String browser) {
		setBrowser(browser);
	}

	public void clickLocations() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_Locations(), 5);
		HeaderObjects.link_Locations().click();
	}

	public void hoverclickNewToPureBarre() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		actions.moveToElement(HeaderObjects.link_NewToPureBarre()).click().perform();
	}

	public void hoverclickAboutOurTechnique() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		actions.moveToElement(HeaderObjects.link_AboutOurTechnique()).click().perform();
	}

	public void hoverclickPureFoundations() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		wait.waitForElement_Clickable(HeaderObjects.link_Classes(), 5);
		actions.moveToElement(HeaderObjects.link_Classes()).perform();
		actions.moveToElement(HeaderObjects.link_PureFoundations()).click().perform();
	}

	public void hoverclickSpecialityClasses() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		wait.waitForElement_Clickable(HeaderObjects.link_Classes(), 5);
		actions.moveToElement(HeaderObjects.link_Classes()).perform();
		actions.moveToElement(HeaderObjects.link_SpecialtyClasses()).click().perform();
	}

	public void clickStory() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_Story(), 5);
		HeaderObjects.link_Story().click();
	}

	public void clickShop() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		final Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_Shop(), 5);
		actions.moveToElement(HeaderObjects.link_Shop()).click().perform();
	}

	public void clickBlog() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		final Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_Blog(), 5);
		actions.moveToElement(HeaderObjects.link_Blog()).click().perform();
	}

	public void clickOwnAStudio() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(HeaderObjects.link_OwnAStudio(), 5);
		HeaderObjects.link_OwnAStudio().click();
	}

}
