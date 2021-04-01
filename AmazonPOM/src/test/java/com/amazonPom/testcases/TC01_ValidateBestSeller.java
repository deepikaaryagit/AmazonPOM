package com.amazonPom.testcases;




import org.testng.annotations.Test;

import com.amazonPom.base.pages.AmazonPomPage;
import com.amazonPom.pages.BestSellerPage;
import com.amazonPom.session.AmazonPomTestSession;

public class TC01_ValidateBestSeller {

	@Test
	public void validateBestSeller() {
		
		//AmazonPomPage page = new HomePage();
		//page.openBrowser("chrome");
		//page.goToUrl();
		
	
		AmazonPomTestSession session = new AmazonPomTestSession();
		session
				.init()
				.openBrowser("chrome")
				.goToUrl("https://amazon.com")
				.clickOnBestSellers();
				//.quit();
				
	//	AmazonPomPage bp = new BestSellerPage();
//		bp.clickOnBestSellers();
				
	}
	
}
