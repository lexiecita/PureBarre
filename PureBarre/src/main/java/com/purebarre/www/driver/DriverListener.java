package com.purebarre.www.driver;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class DriverListener extends ParameterManager implements IInvokedMethodListener {

	public void beforeInvocation(final IInvokedMethod method, final ITestResult testResult) {
		if (method.isTestMethod()) {
			setBrowser(method.getTestMethod().getXmlTest().getLocalParameters().get("browser"));
			setURL(method.getTestMethod().getXmlTest().getLocalParameters().get("URL"));
			setUsrname(method.getTestMethod().getXmlTest().getLocalParameters().get("username"));
			setPassword(method.getTestMethod().getXmlTest().getLocalParameters().get("password"));
			final WebDriver driver = DriverFactory.createDriverInstance(getBrowser());
			DriverManager.setWebDriver(driver);
			DriverManager.getDriver().get(getURL());
			/*
			 * final Login lg = new Login(getURL(), getBrowser());
			 * lg.login(getUsername(), getPassword(), getBrowser());
			 */
		}
	}

	public void afterInvocation(final IInvokedMethod method, final ITestResult testResult) {
		if (method.isTestMethod()) {
			final WebDriver driver = DriverManager.getDriver();
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
