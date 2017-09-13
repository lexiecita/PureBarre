package com.purebarre.www.extentreports;

import com.purebarre.www.driver.Constants;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
            extent = new ExtentReports("../PureBarre/test-output/Reports/TestResults " + Constants.timeStamp + ".html", true);
		}
		return extent;
	}
}
