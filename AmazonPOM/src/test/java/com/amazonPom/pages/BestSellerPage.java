package com.amazonPom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazonPom.base.pages.AmazonPomBasePage;
import com.amazonPom.base.pages.AmazonPomPage;

public class BestSellerPage extends AmazonPomBasePage {
	
	
	@FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_bestsellers_22595f4f23134e4aa687cca616dd2701']")
	WebElement bestSellerLink;
	
	
	
	@Override
	public AmazonPomPage clickOnBestSellers() {
		System.out.println(" 1111111111 best sellor page -  click on best seller");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bestSellerLink.click();
		return this;

	}
}
