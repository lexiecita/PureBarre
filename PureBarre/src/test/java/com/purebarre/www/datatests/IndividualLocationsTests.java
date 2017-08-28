package com.purebarre.www.datatests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.purebarre.www.dataaction.HeaderNavigationActions;
import com.purebarre.www.dataaction.IndividualLocationsActions;
import com.purebarre.www.dataaction.LocationsActions;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.objects.IndividualLocationsObjects;

public class IndividualLocationsTests {

	private IndividualLocationsActions ila;
	private HeaderNavigationActions na;
	private LocationsActions la;
	private ExtentReports report;
	private String ExpectedURL, ResultantURL;
	
	@Parameters({"browser"})
	@Test
	public void clicklink_LocationAddress() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		ila.clickAddress();
		ExpectedURL = "www.google.com/";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clicklink_EmailAddress() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		String email = IndividualLocationsObjects.link_LocationEmail("'birmingham'").getAttribute("href");
		if (email.contains("@purebarre.com")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickSocialIcon_Facebook() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		ila.clickSocialIcon("'Facebook'");
		ExpectedURL = "facebook.com/Pure-Barre";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickSocialIcon_Twitter() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		ila.clickSocialIcon("'Twitter'");
		ExpectedURL = "twitter.com/LinLanPB";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickSocialIcon_Instagram() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		ila.clickSocialIcon("'Instagram'");
		ExpectedURL = "instagram.com/pbbirmingham/";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickButton_ClassSchedule() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		//TODO take out thread.sleeps
		ila.clickClassSchedule();
		Thread.sleep(4000);
		if (IndividualLocationsObjects.text_ClassSchedule().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickButton_PurchaseClasses() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		ila.clickPurchaseClasses();
		Thread.sleep(4000);
		ExpectedURL = "mindbodyonline.com/ASP/main_shop.asp";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickButton_MyAccount() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.clickMyAccount();
		Thread.sleep(4000);
		if (IndividualLocationsObjects.text_SignIn().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clickLink_BuyNow() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.clickMyAccount();
		Thread.sleep(4000);
		if (IndividualLocationsObjects.text_YourCart().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void click_ContinueReading() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.clickContinueReading();
		Thread.sleep(2000);
		if (IndividualLocationsObjects.text_Scroll().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void clicklink_MyAccount() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.clicklink_MyAccount();
		Thread.sleep(2000);
		if (IndividualLocationsObjects.text_SignIn().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void click_ShoppingCart() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.click_ShoppingCart();
		Thread.sleep(2000);
		if (IndividualLocationsObjects.text_ScheduleWidget_Cart().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void click_Printer() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.click_PrinterIcon();
		Thread.sleep(2000);
		ExpectedURL = "/print";
		ResultantURL = Manager.getDriver().getCurrentUrl();
		if (ResultantURL.contains(ExpectedURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void dropdown_Empower() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.dropdown_Empower();
		Thread.sleep(2000);
		if (IndividualLocationsObjects.text_ScheduleWidget_Empower().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void dropdown_PureBarre() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.dropdown_PureBarre();
		Thread.sleep(2000);
		if (IndividualLocationsObjects.text_ScheduleWidget_PureBarre().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void dropdown_Instructors() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		toIndividualLocationsPage();
		Thread.sleep(2000);
		ila.dropdown_Instructor();
		Thread.sleep(2000);
		if (IndividualLocationsObjects.text_ScheduleWidget_SelectedInstructor().isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void selectRadioButton_DaysOfWeek() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Florida");
		Thread.sleep(2000);
		la.clickButton_ViewStudio("'Ft Lauderdale'");
		Thread.sleep(2000);
		ila.radiobutton_DaysOfTheWeek();
	}
	
	@Parameters({"browser"})
	@Test
	public void selectRadioButton_TimeOfDday() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Florida");
		Thread.sleep(2000);
		la.clickButton_ViewStudio("'Ft Lauderdale'");
		Thread.sleep(2000);
		ila.radiobutton_TimeOfDay();
	}
	
	@Parameters({"browser"})
	@Test(groups={"test"})
	public void clickButton_PreviousWeek() throws IOException, InterruptedException {
		report = new ExtentReports();
		ila = new IndividualLocationsActions();
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Florida");
		Thread.sleep(2000);
		la.clickButton_ViewStudio("'Ft Lauderdale'");
		Thread.sleep(2000);
		ila.button_ClickPreviousWeek();
	}

	
	
	
	
	
	
	
	
	private void toIndividualLocationsPage() throws IOException, InterruptedException {
		na = new HeaderNavigationActions();
		la = new LocationsActions();
		na.clickLocations();
		la.clickDropdown_State("Alabama");
		Thread.sleep(2000);
		la.clickButton_ViewStudio("Homewood");
	}
}
