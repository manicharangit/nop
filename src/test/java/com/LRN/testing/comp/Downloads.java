package com.LRN.testing.comp;

import org.apache.log4j.Logger; 
import org.apache.log4j.LogManager;
import org.testng.annotations.Test;
import static com.LRN.testing.util.LrnConstants.*;
import com.LRN.testing.LaunchApp;
import com.LRN.testing.service.PropertyService;




public class Downloads extends LaunchApp {
	private Logger logger = LogManager.getLogger(Downloads.class.getClass());
	
	@Test
	
	public void navigateTo() throws Exception{
		logger.info("Download navigation started");
		PropertyService service = new PropertyService();
		
		util.mouseOverAndClick(service.getValue(DOWNLOADS), service.getValue(DOWNLOAD_NOP));
		util.mouseOverAndClick(service.getValue(DOWNLOADS), service.getValue(MARKETPLACE));
		util.mouseOverAndClick(service.getValue(DOWNLOADS), service.getValue(TRANSLATIONS));
	
		logger.info("Download Navigation ended");
		
	}

	
	
}
