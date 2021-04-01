package com.amazonPom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazonPom.base.pages.AmazonPomBasePage;
import com.amazonPom.base.pages.AmazonPomPage;

public class HomePage extends AmazonPomBasePage {

	
	@Override
	public AmazonPomPage goToUrl(String url) {
		// TODO Auto-generated method stub
		getDriver().goToUrl(url);
		return  new BestSellerPage();
	}
	
	@Override
	public AmazonPomPage openBrowser(String browser) {
		System.out.println("Home Page - OPen Browser ");
		getDriver().openBrowser(browser);;
		return this;
	}
	
	
	@Override
	public void quit() {
		getDriver().quit();
		
	}
}
