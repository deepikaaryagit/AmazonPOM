package com.amazonPom.utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static Supplier<WebDriver> chromeSupplier = () -> 
	{
		WebDriverManager.chromedriver().setup();
		
		return (new ChromeDriver());
		
	};
	
	
	public static Supplier<WebDriver> firefoxSupplier = () -> 
	{
		WebDriverManager.firefoxdriver().setup();
		return (new FirefoxDriver());
		
	};
	
	public static Supplier<WebDriver> ieSupplier = () -> 
	{
		WebDriverManager.iedriver().setup();
		return (new InternetExplorerDriver());
		
	};
	public static  Map<String, Supplier<WebDriver>> MAP = new HashMap<>();
	
	static {
		
		MAP.put("chrome", chromeSupplier);
		MAP.put("firefox", firefoxSupplier);
		MAP.put("ie", ieSupplier);
	}
	
	public WebDriver getDriver(String browser) {
		
		return MAP.get(browser).get();
		
	}
	
	

}
