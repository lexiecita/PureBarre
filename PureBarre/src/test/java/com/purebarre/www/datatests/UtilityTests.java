package com.purebarre.www.datatests;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.purebarre.www.dataaction.UtilityHeaderActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.UtilityObjects;

public class UtilityTests {
	
	private String ResultantURL, ExpectedURL, URLcheck, ActionCheck, CityResult, MakeThisYourStudioResult;
	WebElement Results;
	WebElement BlogText;
	WebElement ExpectedText;
	private UtilityHeaderActions ua;
	ExtentReports report;
	ExtentTest test;
	
	@Parameters({ "browser" })
	@Test
	public void clickFindAStudio_Widget() throws IOException {
		report = new ExtentReports();
		ua = new UtilityHeaderActions();
		ua.clickFindAStudio_Widget();
		if (UtilityObjects.text_SearchByZipCode().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
	@Test/*(groups = { "CityResult"})*/
	public void sendKeys_Zipcode() throws IOException, InterruptedException {
		report = new ExtentReports();
		ua = new UtilityHeaderActions();
		ua.clickFindAStudio_Widget();
		ua.sendKeys_Zipcode("33301");
		Thread.sleep(2000);
		CityResult = "Fort Lauderdale";
		if (UtilityObjects.text_CityResult().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
	@Test(groups = {"retest"})
	public void clickLink_MakeThisYourStudio() throws IOException, InterruptedException {
		report = new ExtentReports();
		ua = new UtilityHeaderActions();
		ua.clickFindAStudio_Widget();
		ua.sendKeys_Zipcode("33301");
/*		Thread.sleep(2000);
*/		ua.clicklink_MakeThisYourStudio();
		MakeThisYourStudioResult = "Fort Lauderdale";
		if (UtilityObjects.text_MakeThisYourStudio_Result("Fort Lauderdale").isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
/*	@Test(groups = {"retest"})
*/	public void clicklink_CurrentLocation() throws IOException, InterruptedException {
		report = new ExtentReports();
		ua = new UtilityHeaderActions();
		ua.clickFindAStudio_Widget();
		ua.sendKeys_Zipcode("33301");
		Thread.sleep(2000);
		ua.clicklink_MakeThisYourStudio();
		Thread.sleep(2000);
		ua.clicklink_CurrentLocation("33301", "Fort Lauderdale");
		MakeThisYourStudioResult = "Fort Lauderdale";
		ExpectedURL = "fl-ftlauderdale";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
/*	@Test(groups = {"retest"})
*/	public void clicklink_FindAClass() throws IOException, InterruptedException {
		report = new ExtentReports();
		ua = new UtilityHeaderActions();
		ua.clickFindAStudio_Widget();
		ua.sendKeys_Zipcode("33301");
		Thread.sleep(2000);
		ua.clicklink_MakeThisYourStudio();
		MakeThisYourStudioResult = "Fort Lauderdale";
		ExpectedURL = "https://clients.mindbodyonline.com/classic/mainclass";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
}
