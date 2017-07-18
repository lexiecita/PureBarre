package com.purebarre.www.extentreports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
	private static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports("../PureBarre/test-output/Reports/TestResults " + timeStamp + ".html", true);
		}
		return extent;
	}
}
