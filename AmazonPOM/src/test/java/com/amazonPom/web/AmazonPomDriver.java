package com.amazonPom.web;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.amazonPom.session.AmazonPomTestSession;
import com.amazonPom.utilities.DriverFactory;

public class AmazonPomDriver extends AmazonPomValidationDriver {

	@Override
	public void openBrowser(String browser) {
		driver = new DriverFactory().getDriver(browser);
		// driver = new ChromeDriver();
		
	}

	@Override
	public void goToUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		driver.close();

	}

	@Override
	public WebDriver getCurrentDriver() {
		return driver;
	}

	public AmazonPomTestSession getSession() {

		return (AmazonPomTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");

	}

}
