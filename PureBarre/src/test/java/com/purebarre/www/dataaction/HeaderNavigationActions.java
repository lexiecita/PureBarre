package com.purebarre.www.dataaction;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

import com.purebarre.www.driver.Constants;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.HeaderObjects;
import com.purebarre.www.utils.WaitTypes;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HeaderNavigationActions extends ParameterManager {

	private String ResultantURL;
	ExtentReports report;
	ExtentTest test;

	public HeaderNavigationActions() {

	}

	public HeaderNavigationActions(final String browser) {
		setBrowser(browser);
	}

	public String clickLocations() throws IOException {
		test = report.startTest("Click locations link in header");
		final WaitTypes wait = new WaitTypes(Manager.getDriver());

		wait.waitForElement(HeaderObjects.link_Locations(), 5);
		test.log(LogStatus.INFO, "Waited 5 seconds for element");
		report = new ExtentReports(Constants.ExtentReportPath);

		HeaderObjects.link_Locations().click();
		test.log(LogStatus.INFO, "Clicked locations link in header");

		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String hoverclickNewToPureBarre() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		actions.moveToElement(HeaderObjects.link_NewToPureBarre()).click().perform();
		;
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String hoverclickAboutOurTechnique() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		actions.moveToElement(HeaderObjects.link_AboutOurTechnique()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String hoverclickPureFoundations() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		wait.waitForElement(HeaderObjects.link_Classes(), 5);
		actions.moveToElement(HeaderObjects.link_Classes()).perform();
		actions.moveToElement(HeaderObjects.link_PureFoundations()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String hoverclickSpecialityClasses() throws IOException {
		final Actions actions = new Actions(Manager.getDriver());
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_TheExperience(), 5);
		actions.moveToElement(HeaderObjects.link_TheExperience()).perform();
		wait.waitForElement(HeaderObjects.link_Classes(), 5);
		actions.moveToElement(HeaderObjects.link_Classes()).perform();
		actions.moveToElement(HeaderObjects.link_SpecialtyClasses()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String clickStory() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Story(), 5);
		HeaderObjects.link_Story().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String clickShop() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		final Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Shop(), 5);
		actions.moveToElement(HeaderObjects.link_Shop()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String clickBlog() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		final Actions actions = new Actions(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_Blog(), 5);
		actions.moveToElement(HeaderObjects.link_Blog()).click().perform();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

	public String clickOwnAStudio() throws IOException {
		final WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement(HeaderObjects.link_OwnAStudio(), 5);
		HeaderObjects.link_OwnAStudio().click();
		ResultantURL = Manager.getDriver().getCurrentUrl();
		return ResultantURL;
	}

}
