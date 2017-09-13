package com.purebarre.www.driver;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Constants {

	public static String URL = "http://www.staging.purebarre.com";
	public static String File = "C://Users//alexisnauer//Documents//Automation//Book1.xlsx";
	public static String DriverPath = "C://Users//alexisnauer//Documents//Automation//chromedriver.exe";
	public static String ExtentReportPath = "C://Users//alexisnauer//Documents//Automation//navigationtest.html";
	public static String Driver = "webdriver.chrome.driver";
	public String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); 

}
