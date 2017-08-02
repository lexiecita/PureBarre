package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.HeaderObjects;
import com.purebarre.www.utils.WaitTypes;

public class HeaderNavigationActions extends ParameterManager {
	
	private String ResultantURL;

	public HeaderNavigationActions() {
		
	}
	
	public HeaderNavigationActions(String browser) {
		setBrowser(browser);
	}

	public String clickLocations() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Locations(), 5);
		HeaderObjects.link_Locations().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	
	public String hoverclickNewToPureBarre() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		actions.moveToElement(HeaderObjects.link_NewToPureBarre()).click().perform();;
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
		
	public String hoverclickAboutOurTechnique() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		actions.moveToElement(HeaderObjects.link_AboutOurTechnique()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String hoverclickPureFoundations() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		wait.waitForElement(HeaderObjects.link_Classes(), 5);
		actions.moveToElement(HeaderObjects.link_Classes()).perform();
		actions.moveToElement(HeaderObjects.link_PureFoundations()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String hoverclickSpecialityClasses() throws IOException {
		Actions actions = new Actions(Manager.getDriver());
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		wait.waitForElement(HeaderObjects.link_Classes(), 5);
		actions.moveToElement(HeaderObjects.link_Classes()).perform();
		actions.moveToElement(HeaderObjects.link_SpecialtyClasses()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickStory() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Story(), 5);
		HeaderObjects.link_Story().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickShop() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Shop(), 5);
		actions.moveToElement(HeaderObjects.link_Shop()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickBlog() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Blog(), 5);
		actions.moveToElement(HeaderObjects.link_Blog()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
	public String clickOwnAStudio() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_OwnAStudio(), 5);
		HeaderObjects.link_OwnAStudio().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}
	
}

