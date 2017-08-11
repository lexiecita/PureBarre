package com.purebarre.www.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {

	WebDriver driver;

	public WaitTypes(final WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElement(final WebElement webElement, final int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max:: " + timeout + " second for element to be available");
			//this time unit is always seconds
			final WebDriverWait wait = new WebDriverWait(driver, 5);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
			System.out.println("Element appear on the web page");
		} catch (final Exception e) {
			System.out.println("Element did not appear on webpage");
		}
		return element;
	}
	
	public WebElement waitForElementWithPolling(final WebElement webElement, final int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for max:: " + timeout + " second for element to be available");
			//timeout after 3 seconds
			final WebDriverWait wait = new WebDriverWait(driver, 5);
			//wait for 3 seconds, and poll every 1 second within the 3 seconds
			element = wait.pollingEvery(1, TimeUnit.SECONDS).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
			System.out.println("Element appear on the web page");
		} catch (final Exception e) {
			System.out.println("Element did not appear on webpage");
		}
		return element;
	}
	
	

	/*
	 * // Private constructor to avoid instantiation of the class
	 * private SeleniumUtils() {
	 * }
	 * 
	 * // Method will generate a screenshot in the form of a file and save to the Screenshots folder in test-output
	 * public static void takeScreenshot(final String browser, final String screenshotName) throws IOException {
	 * final File screenshot = ((TakesScreenshot) Manager.getDriver()).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(screenshot,
	 * new File("../LSMNow/test-output/Reports/Screenshots/" + browser + " - "
	 * + Manager.getDriver().hashCode() + " - " + screenshotName + ".png"));
	 * }
	 * 
	 * // Method will generate and return the path of an existing screenshot to add to the HTML Report
	 * public static String addScreenShotPathToReport(final String browser, final String screenshotName) {
	 * final String imagePath = "./Screenshots/" + browser + " - " + Manager.getDriver().hashCode() + " - "
	 * + screenshotName + ".png";
	 * return imagePath;
	 * }
	 * 
	 * // Method will switch to a frame by extracting the name attribute from an iframe based on an xpath locator
	 * public static void switchToFrameByName(final String frameXPath) {
	 * final String frame = Manager.getDriver().findElement(By.xpath(frameXPath)).getAttribute("name");
	 * Manager.getDriver().switchTo().frame(frame);
	 * }
	 * 
	 * // Method will switch to a frame by extracting the id attribute in the iframe based on an xpath locator
	 * public static void switchToFrameByIDContains(final String frameXPath) {
	 * final String frame = Manager.getDriver().findElement(By.xpath(frameXPath)).getAttribute("id");
	 * Manager.getDriver().switchTo().frame(frame);
	 * }
	 * 
	 * // Method will switch to a frame by using the id attribute in the iframe
	 * public static void switchToFrameByID(final String id) {
	 * Manager.getDriver().switchTo().frame(id);
	 * }
	 * 
	 * // Method will switch to an alert by using the Alert Interface and accept alert
	 * public static void alert() throws InterruptedException {
	 * final WebDriverWait wait = new WebDriverWait(Manager.getDriver(), 5);
	 * wait.until(ExpectedConditions.alertIsPresent());
	 * final Alert alert = Manager.getDriver().switchTo().alert();
	 * alert.accept();
	 * }
	 * 
	 * // Method will get text from alert and accept the alert
	 * public static String getAlertText() throws InterruptedException {
	 * final WebDriverWait wait = new WebDriverWait(Manager.getDriver(), 5);
	 * wait.until(ExpectedConditions.alertIsPresent());
	 * final Alert alert = Manager.getDriver().switchTo().alert();
	 * final String alertText = alert.getText();
	 * alert.accept();
	 * return alertText;
	 * }
	 * 
	 * // Method will return a date as a String based on current date +/- a certain number of days
	 * public static String dateGenerator(final int numberOfDays) {
	 * final SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
	 * final Calendar cal = Calendar.getInstance();
	 * cal.add(Calendar.DATE, numberOfDays);
	 * final String dateTime = date.format(cal.getTime());
	 * return dateTime;
	 * }
	 * 
	 * // Method will execute javascript to scroll to a specific element on the page located by a xpath expression
	 * public static void scrollToElement(final String xpath) {
	 * ((JavascriptExecutor) Manager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
	 * Manager.getDriver().findElement(By.xpath(xpath)));
	 * }
	 * 
	 * // Method will execute javascript to inject a geolocation in the browser
	 * public static void injectGeoLocation(final String latitude, final String longitude) {
	 * ((JavascriptExecutor) Manager.getDriver()).executeScript(
	 * "window.navigator.geolocation.getCurrentPosition = function(success){ var position = {\"coords\" : {\"latitude\": \""
	 * + latitude + "\",\"longitude\": \"" + longitude + "\"}};success(position);}");
	 * }
	 * 
	 * public static boolean invisibilityAssertByXpath(final String xpathExpression) {
	 * try {
	 * final WebDriverWait wait = new WebDriverWait(Manager.getDriver(), 3);
	 * wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathExpression)));
	 * } catch (final Exception e) {
	 * return false;
	 * }
	 * return true;
	 * }
	 * 
	 * public static boolean visibilityAssertBy(final By locator) {
	 * try {
	 * final WebDriverWait wait = new WebDriverWait(Manager.getDriver(), 5);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	 * } catch (final Exception e) {
	 * return false;
	 * }
	 * return true;
	 * }
	 * 
	 * public static boolean visibilityAssertBy(final WebElement element) {
	 * try {
	 * final WebDriverWait wait = new WebDriverWait(Manager.getDriver(), 5);
	 * wait.until(ExpectedConditions.visibilityOf(element));
	 * } catch (final Exception e) {
	 * return false;
	 * }
	 * return true;
	 * }
	 * 
	 * public static boolean elementClickableAssert(final WebElement element) {
	 * try {
	 * final WebDriverWait wait = new WebDriverWait(Manager.getDriver(), 5);
	 * wait.until(ExpectedConditions.elementToBeClickable(element));
	 * } catch (final Exception e) {
	 * return false;
	 * }
	 * return true;
	 * }
	 */

}
