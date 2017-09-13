package com.purebarre.www.driver;

import com.purebarre.www.extentreports.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;

public class ParameterManager {
	private String browser, username, password, URL, testStep, template;
	public ExtentReports extent = ExtentManager.getInstance();

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(final String browser) {
		this.browser = browser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsrname(final String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(final String URL) {
		this.URL = URL;
	}

	public ExtentReports getExtentReports() {
		return extent;
	}
	
	public void setExtentReports(ExtentReports extent) {
		this.extent = extent;
	}

	public String getTestStep() {
		return testStep;
	}

	public void setTestStep(final String testStep) {
		this.testStep = testStep;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(final String template) {
		this.template = template;
	}

	public String getTemplateName(final String template) {
		return "<br>Template Name: <b>" + template + "</b>";
	}

	public String getDriverHash() {
		return "<br>Hash: " + Manager.getDriver().hashCode();
	}

}
