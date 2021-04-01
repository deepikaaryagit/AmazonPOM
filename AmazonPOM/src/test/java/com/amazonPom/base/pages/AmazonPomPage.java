package com.amazonPom.base.pages;

public interface AmazonPomPage extends AmazonPomBestSellerPage, AmazonPomFreshPage, AmazonPomProductDetailPage {
	
	AmazonPomPage goToUrl(String url);
	AmazonPomPage openBrowser(String browser);
	void login();
	void quit();
	void validator();
	void logout();
	
	 AmazonPomPage clickOnBestSellers(); 

	
}
