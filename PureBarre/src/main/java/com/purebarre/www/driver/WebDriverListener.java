package com.purebarre.www.driver;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class WebDriverListener extends ParameterManager implements IInvokedMethodListener {

	ExtentReports report;
	ExtentTest test;

	public void beforeInvocation(final IInvokedMethod method, final ITestResult testResult) {
		if (method.isTestMethod()) {
			final String browser = method.getTestMethod().getXmlTest().getLocalParameters().get("browser");
			final WebDriver driver = Factory.createInstance(browser);
			Manager.setWebDriver(driver);
			driver.get(Constants.URL);
		}
	}

	public void afterInvocation(final IInvokedMethod method, final ITestResult testResult) {
		final WebDriver driver = Manager.getDriver();
		if (driver != null) {
/*			driver.quit();*/
		}
	}
}