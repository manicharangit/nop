package com.LRN.testing.comp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.LRN.testing.LaunchApp;
import com.LRN.testing.service.PropertyService;
import static com.LRN.testing.util.LrnConstants.*;

public class Languages extends LaunchApp{
	private Logger logger = LogManager.getLogger(Languages.class.getClass());
	
	@Test
	
	public void navigateTo() throws Exception{
		logger.info("Languages navigation started");
		PropertyService service = new PropertyService();
		util.mouseOverAndClick(service.getValue(ENGLISH), service.getValue(ENGLISH));
		
	}

}
