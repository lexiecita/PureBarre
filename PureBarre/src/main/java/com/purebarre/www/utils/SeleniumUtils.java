
package com.purebarre.www.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.purebarre.www.driver.DriverManager;

public final class SeleniumUtils {

	// Private constructor to avoid instantiation of the class
	private SeleniumUtils() {
	}

	// Method will generate a screenshot in the form of a file and save to the Screenshots folder in test-output
	public static void takeScreenshot(final String browser, final String screenshotName) throws IOException {
		final File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,
				new File("../LSMNow/test-output/Reports/Screenshots/" + browser + " - "
						+ DriverManager.getDriver().hashCode() + " - " + screenshotName + ".png"));
	}

	// Method will generate and return the path of an existing screenshot to add to the HTML Report
	public static String addScreenShotPathToReport(final String browser, final String screenshotName) {
		final String imagePath = "./Screenshots/" + browser + " - " + DriverManager.getDriver().hashCode() + " - "
				+ screenshotName + ".png";
		return imagePath;
	}

	// Method will switch to a frame by extracting the name attribute from an iframe based on an xpath locator
	public static void switchToFrameByName(final String frameXPath) {
		final String frame = DriverManager.getDriver().findElement(By.xpath(frameXPath)).getAttribute("name");
		DriverManager.getDriver().switchTo().frame(frame);
	}

	// Method will switch to a frame by extracting the id attribute in the iframe based on an xpath locator
	public static void switchToFrameByIDContains(final String frameXPath) {
		final String frame = DriverManager.getDriver().findElement(By.xpath(frameXPath)).getAttribute("id");
		DriverManager.getDriver().switchTo().frame(frame);
	}

	// Method will switch to a frame by using the id attribute in the iframe
	public static void switchToFrameByID(final String id) {
		DriverManager.getDriver().switchTo().frame(id);
	}

	// Method will switch to an alert by using the Alert Interface and accept alert
	public static void alert() throws InterruptedException {
		final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 5);
		wait.until(ExpectedConditions.alertIsPresent());
		final Alert alert = DriverManager.getDriver().switchTo().alert();
		alert.accept();
	}

	// Method will get text from alert and accept the alert
	public static String getAlertText() throws InterruptedException {
		final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 5);
		wait.until(ExpectedConditions.alertIsPresent());
		final Alert alert = DriverManager.getDriver().switchTo().alert();
		final String alertText = alert.getText();
		alert.accept();
		return alertText;
	}

	// Method will return a date as a String based on current date +/- a certain number of days
	public static String dateGenerator(final int numberOfDays) {
		final SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		final String dateTime = date.format(cal.getTime());
		return dateTime;
	}

	// Method will execute javascript to scroll to a specific element on the page located by a xpath expression
	public static void scrollToElement(final String xpath) {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				DriverManager.getDriver().findElement(By.xpath(xpath)));
	}

	// Method will execute javascript to inject a geolocation in the browser
	public static void injectGeoLocation(final String latitude, final String longitude) {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"window.navigator.geolocation.getCurrentPosition = function(success){ var position = {\"coords\" : {\"latitude\": \""
						+ latitude + "\",\"longitude\": \"" + longitude + "\"}};success(position);}");
	}

	public static boolean invisibilityAssertByXpath(final String xpathExpression) {
		try {
			final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 3);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathExpression)));
		} catch (final Exception e) {
			return false;
		}
		return true;
	}

	public static boolean visibilityAssertBy(final By locator) {
		try {
			final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (final Exception e) {
			return false;
		}
		return true;
	}

	public static boolean visibilityAssertBy(final WebElement element) {
		try {
			final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 5);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (final Exception e) {
			return false;
		}
		return true;
	}

	public static boolean elementClickableAssert(final WebElement element) {
		try {
			final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 5);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (final Exception e) {
			return false;
		}
		return true;
	}

}
