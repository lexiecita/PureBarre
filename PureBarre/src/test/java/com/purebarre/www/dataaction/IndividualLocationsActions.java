package com.purebarre.www.dataaction;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.IndividualLocationsObjects;

public class IndividualLocationsActions extends ParameterManager {

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
	
	public void dropdown_Empower() throws IOException {
		IndividualLocationsObjects.dropdown_ScheduleWidget_Empower().click();
	}
	
	public void dropdown_PureBarre() throws IOException {
		IndividualLocationsObjects.dropdown_ScheduleWidget_PureBarre().click();
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
	
	public void button_ClickPreviousWeek() throws IOException, InterruptedException {
		Thread.sleep(2000);
		WebElement week = IndividualLocationsObjects.field_ScheduleWidget_Date();
		String currentWeek = week.getAttribute("value");
		IndividualLocationsObjects.calendar_ScheduleWidget_PreviousWeek().click();
		Thread.sleep(6000);
		String newCurrentWeek = week.getAttribute("value");
		int compare = currentWeek.compareTo(newCurrentWeek);
		if (compare == 0) {
			System.out.println("equal");
		} else if (compare < 0) {
			System.out.println("str 1 is less than str 3");
		} else {
			System.out.println("str 1 is greater than str 3");
		}
	}
	
}


