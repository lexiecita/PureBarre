package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.HomepageObjects;
import com.purebarre.www.utils.WaitTypes;

public class HomepageActions {
	
	public void clickCTA_TryAFreeWeek() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(HomepageObjects.cta_TryAFreeWeek(), 5);
		actions.moveToElement(HomepageObjects.cta_TryAFreeWeek()).click().perform();
	}
	
	public void clickCTA_EmpowerLearnMore() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(HomepageObjects.cta_EmpowerLearnMore(), 5);
		actions.moveToElement(HomepageObjects.cta_EmpowerLearnMore()).click().perform();
	}
	
	public void clickCTA_CarouselNext() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(HomepageObjects.cta_CarouselNext(), 5);
		actions.moveToElement(HomepageObjects.cta_CarouselNext()).click().perform();
	}
	
	public void clickCTA_CarouselPrevious() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement_Clickable(HomepageObjects.cta_CarouselPrevious(), 5);
		actions.moveToElement(HomepageObjects.cta_CarouselPrevious()).click().perform();
	}
}
