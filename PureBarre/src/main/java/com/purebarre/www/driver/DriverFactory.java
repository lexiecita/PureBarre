package com.purebarre.www.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	protected static WebDriver createDriverInstance(final String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("Firefox")) {
			final FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("geo.enabled", true);
			profile.setPreference("geo.prompt.testing", true);
			profile.setPreference("geo.prompt.testing.allow", true);
			profile.setPreference("app.update.auto", true);
			profile.setPreference("app.update.enabled", true);
			profile.setPreference("app.update.silent", true);
			driver = new FirefoxDriver(profile);
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equalsIgnoreCase("Internet Explorer")) {
			System.setProperty("webdriver.ie.driver",
					"../PureBarre/src/main/resources/windowsServers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equalsIgnoreCase("Google Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"../PureBarre/src/main/resources/windowsServers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equalsIgnoreCase("Mac - Firefox")) {
			final FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("geo.enabled", true);
			profile.setPreference("geo.prompt.testing", true);
			profile.setPreference("geo.prompt.testing.allow", true);
			profile.setPreference("app.update.auto", true);
			profile.setPreference("app.update.enabled", true);
			profile.setPreference("app.update.silent", true);
		} else if (browser.equalsIgnoreCase("Mac - Google Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"../PureBarre/src/main/resources/windowsServers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		} else if (browser.equalsIgnoreCase("Mac - Safari")) {
			System.setProperty("webdriver.safari.noinstall", "true");
			driver = new SafariDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return driver;
	}
}
