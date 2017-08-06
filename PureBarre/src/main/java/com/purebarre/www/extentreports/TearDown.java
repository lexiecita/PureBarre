package com.purebarre.www.extentreports;

import org.testng.annotations.AfterSuite;

import com.aventstack.extentreports.ExtentReports;
import com.purebarre.www.driver.ParameterManager;

public class TearDown extends ParameterManager {

	@AfterSuite(alwaysRun = true)
	public void flush() throws InterruptedException {
		Thread.sleep(5000);
		ExtentReports extent = new ExtentReports();
		extent.flush();
	}

}
