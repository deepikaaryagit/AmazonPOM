package com.amazonPom.base.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.amazonPom.session.AmazonPomTestSession;
import com.amazonPom.web.WebConnector;

public class AmazonPomBasePage implements AmazonPomPage {

	public AmazonPomBasePage() {
		System.out.println("base page constructor");
		
		PageFactory.initElements(getCurrentDriver(), this);
		getSession().setCurrentPage(this);

	}

	
	public WebDriver getCurrentDriver() {

		return getDriver().getCurrentDriver();
	}

	public WebConnector getDriver() {

		return getSession().getCon();

	}

	public AmazonPomTestSession getSession() {

		return (AmazonPomTestSession) Reporter.getCurrentTestResult().getTestContext().getAttribute("session");

	}

	@Override
	public AmazonPomPage clickOnBestSellers() {
		System.out.println("base page -  click on best seller");
		return null;

	}

	@Override
	public void listofBestSellers(String Category) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnFresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickOnDeals() {
		// TODO Auto-generated method stub

	}

	@Override
	public void listOfDeals() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addtoCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public AmazonPomPage goToUrl(String url) {
		System.out.println("Base Page Go To URL");
		return null;
	}

	@Override
	public AmazonPomPage openBrowser(String browser) {
		System.out.println("Base Page - OPen Browser ");
		return null;
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void validator() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

}
