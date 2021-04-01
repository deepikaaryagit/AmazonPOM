package com.amazonPom.web;

import org.openqa.selenium.WebDriver;

public interface WebConnector extends AmazonPomWebConnector {

	void openBrowser(String browser);
	void goToUrl(String browser);
	void login();
	void validate();
	void quit();
	WebDriver getCurrentDriver();

}
