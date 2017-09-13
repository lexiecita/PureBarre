package com.purebarre.www.dataaction;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.IndividualLocationsObjects;
import com.purebarre.www.utils.WaitTypes;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class IndividualLocationsActions extends ParameterManager {

	private ExtentReports report;
	private ExtentTest test;
	String thisMonthFormatted, stringMonth, elementMonth, stringPrevMonth, stringNextMonth;

	public IndividualLocationsActions() {

	}

	public IndividualLocationsActions(String browser) {
		setBrowser(browser);
	}
	
	public void clickAddress() throws IOException {
		IndividualLocationsObjects.link_LocationAddress().click();
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void clickSocialIcon(String socialicon) throws IOException {
		IndividualLocationsObjects.icon_SocialIcons(socialicon).click();
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void clickClassSchedule() throws IOException {
		IndividualLocationsObjects.button_ClassSchedule().click();
	}
	
	public void clickPurchaseClasses() throws IOException {
		IndividualLocationsObjects.button_PurchaseClasses().click();
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void clickMyAccount() throws IOException {
		IndividualLocationsObjects.button_MyAccount().click();
		Manager.getDriver().switchTo().frame(Manager.getDriver().findElement(By.id("mindbody_branded_web_cart_modal")));
	}
	
	public void clickBuyNow() throws IOException {
		IndividualLocationsObjects.link_BuyNow().click();
		Manager.getDriver().switchTo().frame(Manager.getDriver().findElement(By.id("mindbody_branded_web_cart_modal")));
	}
	
	public void clickContinueReading() throws IOException {
		IndividualLocationsObjects.button_Scroll().click();
	}
	
	public void clicklink_MyAccount() throws IOException {
		IndividualLocationsObjects.link_ScheduleWidget_MyAccount().click();
		Manager.getDriver().switchTo().frame(Manager.getDriver().findElement(By.id("mindbody_branded_web_cart_modal")));
	}
	
	public void click_ShoppingCart() throws IOException {
		IndividualLocationsObjects.link_ScheduleWidget_Cart().click();
		Manager.getDriver().switchTo().frame(Manager.getDriver().findElement(By.id("mindbody_branded_web_cart_modal")));
	}
	
	public void click_PrinterIcon() throws IOException {
		IndividualLocationsObjects.link_ScheduleWidget_Print().click();
		for (String winHandle : Manager.getDriver().getWindowHandles()) {
			Manager.getDriver().switchTo().window(winHandle);
		}
	}
	
	public void dropdown_AllClasses() throws IOException {
		//TODO harden for pulling in dynamic contents in dropdown, currently it is static for dropdown elements
		//TODO put assert in test, with extent reports, logging here?
		String[] allClasses = {"'Pure Barre'", "'All Classes'", "'Pure Empower'", "'Pure Foundations'", "'Pure Barre'"};
		for (int i = 0; i < allClasses.length; i++) {
			IndividualLocationsObjects.dropdown_ScheduleWidget_AllClasses(allClasses[i]).click();
			if (IndividualLocationsObjects.dropdown_ScheduleWidget_AllClasses(allClasses[i]).isDisplayed()) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		
	}
		
	public void dropdown_Instructor() throws IOException {
		Select selectInstructor = new Select(IndividualLocationsObjects.dropdown_ScheduleWidget_Instructor());
		selectInstructor.selectByIndex(1);
	}
	
	public void radiobutton_DaysOfTheWeek() throws IOException {
		//TODO put this assert into the test?
		String[] daysOfWeekArray = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		for (int i = 0; i < daysOfWeekArray.length; i++) {
			IndividualLocationsObjects.box_ScheduleWidget_DayOfWeek(daysOfWeekArray[i]).click();
			if (Manager.getDriver().findElement(By.xpath("//div[@id='day']//label[contains(text(), " + daysOfWeekArray[i] + ")]")).isDisplayed()) {
				Assert.assertTrue(true);
			} else {
			Assert.assertTrue(false);
			}
		}
	}
		
	public void radiobutton_TimeOfDay() throws IOException {
		String[] timeOfDayArray = {"Morning", "Afternoon", "Evening"};
		String[] timeOfDayCheck = {"AM", "PM", "PM"};
		//TODO is this loop correct?
		//TODO put assert into the test
		for (int i=0; i < timeOfDayArray.length; i++) {
			IndividualLocationsObjects.box_ScheduleWidget_TimeofDay(timeOfDayArray[i]).click();
			for (int j=0; j < timeOfDayCheck.length; j++) {
				if (Manager.getDriver().findElement(By.xpath("//span[@class='hc_time']//span[contains(text(), " + timeOfDayCheck[j] + ")][1]")).isDisplayed()) {
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			}
		}
	}
		
	public String button_ClickPreviousWeek(ITestResult testResult) throws IOException, InterruptedException, ParseException {
		extent_StartTest("On schedule widget, click Previous CTA - ");
		boolean oneTime = false;
		while (!oneTime) {
			try {
				WaitTypes wait = new WaitTypes(Manager.getDriver());
				SimpleDateFormat week = new SimpleDateFormat("yyyy-MM-dd");

				Date week1 = week.parse(IndividualLocationsObjects.field_ScheduleWidget_Date().getAttribute("value"));
				setTestStep("The date value for Today is: " + week1);
				test.log(LogStatus.PASS, getTestStep());

				setTestStep("On schedule widget, click Previous CTA");
				wait.waitForElement_Clickable(IndividualLocationsObjects.calendar_ScheduleWidget_PreviousWeek(), 5);
				IndividualLocationsObjects.calendar_ScheduleWidget_PreviousWeek().click();	
				test.log(LogStatus.PASS, getTestStep());
				
				Thread.sleep(6000);
				Date week2 = week.parse(IndividualLocationsObjects.field_ScheduleWidget_Date().getAttribute("value"));
				setTestStep("The date value for Today is: " + week2);
				test.log(LogStatus.PASS, getTestStep());

				setTestStep("Ensure that when comparing Previous Week to Today's Week, Previous Week is a date in the past");
				if (week1.compareTo(week2) > 0) {
					test.log(LogStatus.PASS, getTestStep());
				} else {
					test.log(LogStatus.FAIL, getTestStep());
				}
				break;
			} catch (StaleElementReferenceException e) {
			} finally {
				
				getExtentReports().endTest(test);
			}
		}
		return null; 
	}
	
	public String button_ClickNextWeek(ITestResult testResult) throws IOException, InterruptedException, ParseException {
		extent_StartTest("On schedule widget, click Next CTA - ");
		boolean oneTime = false;
		while (!oneTime) {
			try {
				WaitTypes wait = new WaitTypes(Manager.getDriver());
				SimpleDateFormat week = new SimpleDateFormat("yyyy-MM-dd");
		
				Date week1 = week.parse(IndividualLocationsObjects.field_ScheduleWidget_Date().getAttribute("value"));
				setTestStep("The date value for Today is: " + week1);
				test.log(LogStatus.PASS, getTestStep());

				setTestStep("On schedule widget, click Next CTA");
				wait.waitForElement_Clickable(IndividualLocationsObjects.calendar_ScheduleWidget_NextWeek(), 5);
				IndividualLocationsObjects.calendar_ScheduleWidget_NextWeek().click();
				test.log(LogStatus.PASS, getTestStep());

				Thread.sleep(6000);
				Date week2 = week.parse(IndividualLocationsObjects.field_ScheduleWidget_Date().getAttribute("value"));
				setTestStep("The date value for Today is: " + week2);
				test.log(LogStatus.PASS, getTestStep());

				setTestStep("Ensure that when comparing Next Week to Today's Week, Next Week is a date in the future");
				if (week1.compareTo(week2) < 0) {
					test.log(LogStatus.PASS, getTestStep());
				} else {
					test.log(LogStatus.FAIL, getTestStep());
				}
				break;
			
			} catch (StaleElementReferenceException e) {
			
			} finally {
				
				getExtentReports().endTest(test);
			}
		}
		return null; 
	}
	
	public String button_ClickToday(ITestResult testResult) throws IOException, InterruptedException, ParseException {
		extent_StartTest("On schedule widget, click Today CTA - ");
		boolean oneTime = false;
		while (!oneTime) {
			try {
				WaitTypes wait = new WaitTypes(Manager.getDriver());
				SimpleDateFormat week = new SimpleDateFormat("yyyy-MM-dd");
				
				setTestStep("On schedule widget, click Previous Week CTA");
				wait.waitForElement_Clickable(IndividualLocationsObjects.calendar_ScheduleWidget_PreviousWeek(), 5);
				IndividualLocationsObjects.calendar_ScheduleWidget_PreviousWeek().click();	
				test.log(LogStatus.PASS, getTestStep());
				
				Thread.sleep(6000);
				Date week1 = week.parse(IndividualLocationsObjects.field_ScheduleWidget_Date().getAttribute("value"));
				setTestStep("The date value for Previous Week is: " + week1);
				test.log(LogStatus.PASS, getTestStep());
				
				setTestStep("On schedule widget, click Today CTA");
				wait.waitForElement_Clickable(IndividualLocationsObjects.button_ScheduleWidget_Today(), 5);
				IndividualLocationsObjects.button_ScheduleWidget_Today().click();
				test.log(LogStatus.PASS, getTestStep());
				
				Thread.sleep(6000);
				Date today = week.parse(IndividualLocationsObjects.field_ScheduleWidget_Date().getAttribute("value"));
				setTestStep("The date value for Today is: " + today);
				test.log(LogStatus.PASS, getTestStep());

				setTestStep("Ensure that when comparing Previous Week to Today's Week, Today is a date in the future");
				if (week1.compareTo(today) < 0) {
					test.log(LogStatus.PASS, getTestStep());
				} else {
					test.log(LogStatus.FAIL, getTestStep());
				}
				
				break;
			
			} catch (StaleElementReferenceException e) {
			
			} finally {
			
				getExtentReports().endTest(test);
			}
		}
		
		return null; 
	}
	
	public void clickCalendar_VerifyThisMonth() throws IOException {
		extent_StartTest("On schedule widget, click Calendar, Navigate to Next Month - ");
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		try {
			   
			setTestStep("On schedule widget, click Calendar");
			wait.waitForElement_Clickable(IndividualLocationsObjects.field_ScheduleWidget_Date(), 5);
			IndividualLocationsObjects.field_ScheduleWidget_Date().click();
			Thread.sleep(6000);
			test.log(LogStatus.PASS, getTestStep());

			setTestStep("Verify that Month displayed is current Month");
			YearMonth thisMonth = YearMonth.now();
			Month getMonth = thisMonth.getMonth();
			stringMonth = getMonth.toString();
			//TODO figure how to use objects class on next line
			String getCurrentMonth = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-top-date']/p")).getText();
			if (stringMonth.equalsIgnoreCase(getCurrentMonth)) {
				test.log(LogStatus.PASS, getTestStep());
			} else {
				test.log(LogStatus.FAIL, getTestStep());
			}
		
		} catch (Exception e) {
			
			test.log(LogStatus.FAIL, getTestStep());
		
		} finally {
			
			getExtentReports().endTest(test);
		}
		
	}
	
	public void clickCalendar_VerifyPreviousMonth() throws IOException {
		extent_StartTest("On schedule widget, click Calendar, Navigate to Next Month - ");
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		try {
			   
			setTestStep("On schedule widget, click Calendar");
			wait.waitForElement_Clickable(IndividualLocationsObjects.field_ScheduleWidget_Date(), 5);
			IndividualLocationsObjects.field_ScheduleWidget_Date().click();
			Thread.sleep(6000);
			test.log(LogStatus.PASS, getTestStep());

			setTestStep("Click Previous Month");
			wait.waitForElement_Clickable(IndividualLocationsObjects.link_PreviousMonth(), 5);
			IndividualLocationsObjects.link_PreviousMonth().click();
			test.log(LogStatus.PASS, getTestStep());

			setTestStep("Verify that month displayed is previous month");
			YearMonth thisMonth = YearMonth.now();
			Month prevMonth = thisMonth.getMonth().minus(1);
			stringPrevMonth = prevMonth.toString();
			//TODO figure how to use objects class on next line
			String getPreviousMonth = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-top-date']/p")).getText();
			if (stringPrevMonth.equalsIgnoreCase(getPreviousMonth)) {
				test.log(LogStatus.PASS, getTestStep());
			} else {
				test.log(LogStatus.FAIL, getTestStep());
			}
		
		} catch (Exception e) {
			
			test.log(LogStatus.FAIL, getTestStep());
		
		} finally {
			
			getExtentReports().endTest(test);
		}
		
	}
	
	public void clickCalendar_VerifyNextMonth() throws IOException {
		extent_StartTest("On schedule widget, click Calendar, Navigate to Next Month - ");
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		try {
			   
			setTestStep("On schedule widget, click Calendar");
			wait.waitForElement_Clickable(IndividualLocationsObjects.field_ScheduleWidget_Date(), 5);
			IndividualLocationsObjects.field_ScheduleWidget_Date().click();
			Thread.sleep(6000);
			test.log(LogStatus.PASS, getTestStep());

			setTestStep("Click Next Month");
			wait.waitForElement_Clickable(IndividualLocationsObjects.link_PreviousMonth(), 5);
			IndividualLocationsObjects.link_NextMonth().click();
			test.log(LogStatus.PASS, getTestStep());

			setTestStep("Verify that month displayed is next month");
			YearMonth thisMonth = YearMonth.now();
			Month nextMonth = thisMonth.getMonth().plus(1);
			stringNextMonth = nextMonth.toString();
			System.out.println(stringNextMonth);
			//TODO figure how to use objects class on next line
			String getNextMonth = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-top-date']/p")).getText();
			System.out.println(getNextMonth);
			if (stringNextMonth.equalsIgnoreCase(getNextMonth)) {
				test.log(LogStatus.PASS, getTestStep());
				System.out.println("pass");
			} else {
				test.log(LogStatus.FAIL, getTestStep());
				System.out.println("fail");
			}
		
		} catch (Exception e) {
			test.log(LogStatus.FAIL, getTestStep());
		} finally {
			getExtentReports().endTest(test);
		}
		
	}
	
	public void clickCalendar_VerifyToday() throws IOException {
		extent_StartTest("On schedule widget, click Calendar, Navigate to Next Month - ");
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		try {
			   
			setTestStep("On schedule widget, click Calendar");
			wait.waitForElement_Clickable(IndividualLocationsObjects.field_ScheduleWidget_Date(), 5);
			IndividualLocationsObjects.field_ScheduleWidget_Date().click();
			Thread.sleep(6000);
			test.log(LogStatus.PASS, getTestStep());

			setTestStep("Verify that active cell displayed is Today's date");
			Date today = Calendar.getInstance().getTime();
			LocalDateTime datetime = LocalDateTime.parse((CharSequence) today, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
			System.out.println(datetime);

/*			System.out.println(stringNextMonth);
			//TODO figure how to use objects class on next line
			String getNextMonth = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-top-date']/p")).getText();
			System.out.println(getNextMonth);
			if (stringNextMonth.equalsIgnoreCase(getNextMonth)) {
				test.log(LogStatus.PASS, getTestStep());
				System.out.println("pass");
			} else {
				test.log(LogStatus.FAIL, getTestStep());
				System.out.println("fail");
			}*/
		
		} catch (Exception e) {
			test.log(LogStatus.FAIL, getTestStep());
		} finally {
			getExtentReports().endTest(test);
		}
		
	}

	
	//Extracted Methods
	private void extent_StartTest(String testcase) {
		test = getExtentReports().startTest(testcase + getBrowser());
	}
}


