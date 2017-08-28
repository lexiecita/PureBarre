package com.purebarre.www.datatests;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.purebarre.www.dataaction.HomepageActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.HomepageObjects;

public class HomepageTests {
	WebElement Results;
	WebElement BlogText;
	WebElement ExpectedText;
	String ExpectedURL, ResultantURL;
	private HomepageActions ha;
	ExtentReports report;
	ExtentTest test;
	
	@Parameters({ "browser" })
	@Test
	public void click_TryAFreeWeek() throws IOException {
		report = new ExtentReports();
		ha = new HomepageActions();
		ha.clickCTA_TryAFreeWeek();
		ExpectedURL = "ltb/freeweek/";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
	@Test
	public void click_EmpowerLearnMore() throws IOException {
		report = new ExtentReports();
		ha = new HomepageActions();
		ha.clickCTA_EmpowerLearnMore();
		ExpectedURL = "empower";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
	@Test	
	//TODO add hardening for multiple clicks and verification 
	public void click_CarouselNext() throws IOException, InterruptedException {
		report = new ExtentReports();
		ha = new HomepageActions();
		ha.clickCTA_CarouselNext();
		Thread.sleep(2000);
		if (HomepageObjects.cta_CarouselNext_Testimonial().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({ "browser" })
	@Test(groups = { "prev" })	
	//TODO add hardening for multiple clicks and verification 
	public void click_CarouselPrevious() throws IOException, InterruptedException {
		report = new ExtentReports();
		ha = new HomepageActions();
		ha.clickCTA_CarouselPrevious();
		Thread.sleep(2000);
		if (HomepageObjects.cta_CarouselPrevious_Testimonial().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}
