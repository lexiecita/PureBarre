package com.purebarre.www.driver;

import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class WebDriverListener extends ParameterManager implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		if (method.isTestMethod()) {
			String browser = method.getTestMethod().getXmlTest().getLocalParameters().get("browser");
			WebDriver driver = Factory.createInstance(browser);
			Manager.setWebDriver(driver);
			driver.get(Constants.URL);
		}
	}
	
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		WebDriver driver = Manager.getDriver();
		if (driver != null) {
			driver.quit();
		}
	}
}

/*		System.setProperty(Constants.Driver, Constants.DriverPath);
WebDriver driver = new ChromeDriver();*/