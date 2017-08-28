package com.purebarre.www.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.purebarre.www.driver.Manager;

public class IndividualLocationsObjects {

	public static WebElement element = null;
	
	public static WebElement link_LocationAddress() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/a[@class='banner-information-address']"));
		return element;
	}
	
	public static WebElement link_LocationEmail(String location) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/div[1]/a[contains(text(), " + location + ")]"));
		return element;
	}
	
	public static WebElement icon_SocialIcons(String socialicon) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/div[2]/a[contains(text()," + socialicon + ")]"));
		return element;
	}
	
	public static WebElement button_ClassSchedule() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/a[2]"));
		return element;
	}
	
	public static WebElement text_ClassSchedule() {
		element = Manager.getDriver().findElement(By.xpath("//select[@id='mbo_class']/option[contains(text(), 'All Classes')]"));
		return element;
	}
	
	public static WebElement button_PurchaseClasses() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/a[3]"));
		return element;
	}
	
	public static WebElement button_MyAccount() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/healcode-widget/a[contains(text(), 'My Account')]"));
		return element;
	}
	
	public static WebElement text_SignIn() {
		element = Manager.getDriver().findElement(By.xpath("//form[@class='signin']//button"));
		return element;
	}
	
	public static WebElement link_BuyNow() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/section/div[3]/healcode-widget/a/b[contains(text(), 'buy now')]"));
		return element;
	}
	
	public static WebElement text_YourCart() {
		element = Manager.getDriver().findElement(By.xpath("html/body/div[1]/main/div/div[1]"));
		return element;
	}
	
	public static WebElement button_Scroll() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[2]/div/a[contains(text(), 'Continue Reading')]"));
		return element;
	}
	
	public static WebElement text_Scroll() {
		element = Manager.getDriver().findElement(By.xpath("//section[@id='main-section']/header[1]/h1/i"));
		return element;
	}
	
	public static WebElement link_ScheduleWidget_MyAccount() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='f515432a31d']/div[1]/a[3]/span[contains(text(), 'My account')]"));
		return element;
	}
	
	public static WebElement link_ScheduleWidget_Cart() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='f515432a31d']/div[1]/a[2]/img[@alt='Cart']"));
		return element;
	}
	
	public static WebElement text_ScheduleWidget_Cart() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='empty-cart']//h2[contains(text(), 'Your cart is empty')]"));
		return element;
	}
	
	public static WebElement link_ScheduleWidget_Print() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='f515432a31d']/div[1]/a[1]/img"));
		return element;
	}
	
	//TODO make contents of dropdown array
	public static WebElement dropdown_ScheduleWidget_AllClasses() {
		element = Manager.getDriver().findElement(By.xpath("//select[@id='mbo_class']//option[contains(text(), 'All Classes')]"));
		return element;
	}
	
	public static WebElement dropdown_ScheduleWidget_Empower() {
		element = Manager.getDriver().findElement(By.xpath("//select[@id='mbo_class']//option[contains(text(), 'Empower')]"));
		return element;
	}
	
	public static WebElement text_ScheduleWidget_Empower() {
		element = Manager.getDriver().findElement(By.xpath("//span[@id='item_39684_mbo_class']//a[contains(text(), 'Empower')]"));
		return element;
	}
	
	public static WebElement dropdown_ScheduleWidget_PureBarre() {
		element = Manager.getDriver().findElement(By.xpath("//select[@id='mbo_class']//option[contains(text(), 'Pure Barre')][1]"));
		return element;
	}
	
	public static WebElement text_ScheduleWidget_PureBarre() {
		element = Manager.getDriver().findElement(By.xpath("//span[@id='item_35621_mbo_class']//a[contains(text(), 'Pure Barre')]"));
		return element;
	}

	public static WebElement dropdown_ScheduleWidget_Instructor() {
		element = Manager.getDriver().findElement(By.xpath("//select[@id='trainer']"));
		return element;
	}
	
	public static WebElement text_ScheduleWidget_SelectedInstructor() {
		element = Manager.getDriver().findElement(By.xpath("//select[@id='trainer']//option[2]"));
		return element;
	}
	
	public static WebElement box_ScheduleWidget_DayOfWeek(String day) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='day']/input[@id='day_" + day + "']"));
		return element;
	}
	
/*	public static WebElement text_DayOfWeek(String[] daysOfWeekArray) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='day']//label[contains(text(), " + daysOfWeekArray + ")]"));
		return element;
	}*/
	
	public static WebElement box_ScheduleWidget_TimeofDay(String timeofday) {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='time_of_day']/label[contains(text(), '" + timeofday + "')]"));
		return element;
	}
	
	public static WebElement text_ScheduleWidget_TimeofDay(String timeofday) {
		element = Manager.getDriver().findElement(By.xpath("//span[@class='hc_time']//span[contains(text(), 'AM')][1]"));
		return element;
	}
		
	public static WebElement button_ScheduleWidget_PrevTodayNext(String prevtodaynext) {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='date_links']//a[contains(text(), " + prevtodaynext + ")]"));
		//TODO make an array for each button in actions?
		return element;
	}
	
	public static WebElement field_ScheduleWidget_Date() {
		element = Manager.getDriver().findElement(By.xpath("//input[@id='start_date']"));
		return element;
	}
	
	public static WebElement calendar_ScheduleWidget_PreviousWeek() {
		element = Manager.getDriver().findElement(By.xpath("//span[@class='week_links']//a[contains(text(), 'Previous')]"));
		return element;
	}
	
	public static WebElement calendar_ScheduleWidget_NextMonth() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-top']/a[@class='hc-pignose-calendar-top-nav hc-pignose-calendar-top-next']"));
		return element;
	}
	
	public static WebElement calendar_ScheduleWidget_NewDate(String date) {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-row']//div[@class='hc-pignose-calendar-unit hc-pignose-calendar-unit-date hc-pignose-calendar-unit-sun']//a[contains(text(), " + date + ")]"));
		return element;
	}
	
	public static WebElement calendar_ScheduleWidget_Cancel() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-button-group']/a[contains(text(), 'Cancel')]"));
		return element;
	}
	
	public static WebElement calendar_ScheduleWidget_OK() {
		element = Manager.getDriver().findElement(By.xpath("//div[@class='hc-pignose-calendar-button-group']/a[contains(text(), 'OK')]"));
		return element;
	}
	
	public static WebElement link_ScheduleWidget_Class(String barreclass) {
		element = Manager.getDriver().findElement(By.xpath("//td[@class='mbo_class']//a[contains(text(), " + barreclass + ")]"));
		return element;
	}
	
	public static WebElement link_ScheduleWidget_Instructor() {
		element = Manager.getDriver().findElement(By.xpath("//span[@id='item_39683_trainer']/a"));
		//TODO harden this xpath
		return element;
	}
	
	public static WebElement button_ScheduleWidget_SignUp() {
		element = Manager.getDriver().findElement(By.xpath("//tr[@id='70208783900840']//span[@class='hc_cart_button']"));
		//TODO harden this xpath
		return element;
	}
	
	public static WebElement button_NewToPureBarre() {
		element = Manager.getDriver().findElement(By.xpath("//section[@id='main-section']//a[@class='link']"));
		//TODO harden this xpath
		return element;
	}
	
	public static WebElement link_AboutOwnerOne() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[4]/aside/div/div[1]/article/a"));
		return element;
	}
	
	public static WebElement link_AboutOwnerTwo() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[4]/aside/div/div[3]/article/a"));
		return element;
	}
	
	public static WebElement button_IntroMonth() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[5]/div/a/h2[contains(text(), 'Intro Month')]"));
		return element;
	}
	
	public static WebElement button_LikeUsOnFacebook() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[6]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement button_LikeUsOnTwitter() {
		element = Manager.getDriver().findElement(By.xpath("//div[@id='mp-pusher']/div/div/div[6]/ul/li[2]/a"));
		return element;
	}
	
	

	

	
	
	
	
}
