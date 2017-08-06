package com.purebarre.www.extentreports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

	private static ExtentHtmlReporter extentReport;
	private static String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	public static ExtentHtmlReporter getInstance() {
		if (extentReport == null) {
			extentReport = new ExtentHtmlReporter("../PureBarre/test-output/Reports/TestResults " + timeStamp + ".html");
		}
		return extentReport;
	}
}
