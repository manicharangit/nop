package com.LRN.testing.comp;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.RemoteWebDriver;
import static com.LRN.testing.util.LrnConstants.*;

import com.LRN.testing.LaunchApp;
import com.LRN.testing.service.PropertyService;

public class Partners extends LaunchApp {
	private Logger logger = LogManager.getLogger(Partners.class.getClass());
	RemoteWebDriver driver = null;
	
	public void navigateTo() throws Exception{
		logger.info("partners navigation started");
		PropertyService service = new PropertyService();
		util.click(service.getValue(PARTNERS));
	}
	
	

}
