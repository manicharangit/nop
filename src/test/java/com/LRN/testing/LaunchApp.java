package com.LRN.testing;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.LRN.testing.comp.Product;
import com.LRN.testing.service.PropertyService;
import com.LRN.testing.util.Util;

import static com.LRN.testing.util.LrnConstants.*;

public class LaunchApp {

	private PropertyService propertyService = null;
	private Logger logger = LogManager.getLogger(LaunchApp.class.getClass());
	public static Util util = null;
	@BeforeSuite
	
	public void launch() throws Exception{
		propertyService = new PropertyService();
		logger.info("App Lauching ...");
		RemoteWebDriver driver = propertyService.getMyDriver();
		driver.get(propertyService.getValue(URL));
		driver.manage().window().maximize();
		util=new Util(driver);
		logger.info("App Launch and maximized...");
		
	}
}
