package com.purebarre.www.datatests;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.purebarre.www.dataaction.HeaderNavigationActions;
import com.purebarre.www.dataaction.LocationsActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.LocationsObjects;

public class LocationsTests {
	
	private LocationsActions la;
	private HeaderNavigationActions na;
	private WebElement location, country;
	private String ResultantURL, ExpectedURL;
	ExtentReports report;
	
	@Parameters({"browser"})
	@Test 
	public void clickDropdown_State() throws IOException, InterruptedException {
		report = new ExtentReports();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Alabama");
		Thread.sleep(2000);
		location = LocationsObjects.getText_location("'Homewood'");
		if (location.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test 
	public void clickViewStudio() throws IOException, InterruptedException {
		report = new ExtentReports();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Alabama");
		Thread.sleep(2000);
		la.clickButton_ViewStudio("Homewood");
		//TODO better way to select specific button
		//TODO put all locations in array and click each one
		ExpectedURL = "AL-birmingham-homewood/";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test 
	public void click_MakeThisYourStudio() throws IOException, InterruptedException {
		report = new ExtentReports();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Alabama");
		Thread.sleep(2000);
		location = LocationsObjects.getText_location("'Homewood'");
		la.clickLink_MakeThisYourStudio();
		if (LocationsObjects.getText_location("Homewood").isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test 
	public void click_MakeItHappen() throws IOException, InterruptedException {
		report = new ExtentReports();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Alabama");
		Thread.sleep(2000);
		location = LocationsObjects.getText_location("'Homewood'");
		la.clickLink_MakeItHappen();
		ExpectedURL = "franchise.purebarre.com/";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
}
