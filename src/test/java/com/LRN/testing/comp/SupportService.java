package com.LRN.testing.comp;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.LRN.testing.LaunchApp;
import com.LRN.testing.service.PropertyService;
import static com.LRN.testing.util.LrnConstants.*;

public class SupportService extends LaunchApp{
	private Logger logger = org.apache.log4j.LogManager.getLogger(SupportService.class.getClass());
	RemoteWebDriver driver = null; 
	@Test
	
	public void NavigateTo() throws Exception{
		logger.info("Suport service navigation started");
		PropertyService service = new PropertyService();
		util.mouseOverAndClick(service.getValue(SUPPORT_SERVICE), service.getValue(TRAINING));
		util.mouseOverAndClick(service.getValue(SUPPORT_SERVICE), service.getValue(COMMUNITY_FOR));
		util.mouseOverAndClick(service.getValue(SUPPORT_SERVICE), service.getValue(PREMIUM_SUPP));
		util.mouseOverAndClick(service.getValue(SUPPORT_SERVICE), service.getValue(REQUEST_NOTE));
		util.mouseOverAndClick(service.getValue(SUPPORT_SERVICE), service.getValue(CONTACT_US));
	}
	

}
