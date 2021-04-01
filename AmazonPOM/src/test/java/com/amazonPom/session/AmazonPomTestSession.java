package com.amazonPom.session;

import org.testng.Reporter;

import com.amazonPom.base.pages.AmazonPomPage;
import com.amazonPom.pages.HomePage;
import com.amazonPom.web.AmazonPomDriver;
import com.amazonPom.web.WebConnector;


public class AmazonPomTestSession {

	
	WebConnector con;
	AmazonPomPage currentPage;
	
	public AmazonPomTestSession() {
	  con = new AmazonPomDriver();
	}
	
	public AmazonPomPage init() {

		if (Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null) {
			Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
		}

		AmazonPomPage page = new HomePage();
		return page;

	}
	
	
	public WebConnector getCon()
	{
		return con;
		
	}

	public void setCurrentPage(AmazonPomPage currentPage) {
		this.currentPage = currentPage;
	}
	public AmazonPomPage getCurrentPage() {
		return currentPage;
	}

	
}
