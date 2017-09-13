 package com.purebarre.www.driver;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class WebDriverListener extends ParameterManager implements IInvokedMethodListener {

	ExtentReports report;
	ExtentTest logger;

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			String browser = method.getTestMethod().getXmlTest().getLocalParameters().get("browser");
			WebDriver driver = Factory.createInstance(browser);
			Manager.setWebDriver(driver);
			driver.get(Constants.URL);
		}
	}
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		WebDriver driver = Manager.getDriver();
		if (driver != null) {
/*			driver.quit();
*/		}
	}
	
}