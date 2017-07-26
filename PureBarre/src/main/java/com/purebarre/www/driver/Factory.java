package com.purebarre.www.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Factory implements Constants {

	protected static WebDriver createInstance(String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("Google Chrome")) {
			System.setProperty(Constants.Driver, Constants.DriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}		
}
