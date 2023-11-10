package com.LRN.testing.comp;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static com.LRN.testing.util.LrnConstants.*;

import com.LRN.testing.LaunchApp;
import com.LRN.testing.service.PropertyService;
import com.LRN.testing.util.Util;

public class Product extends LaunchApp{
	private Logger logger = LogManager.getLogger(Product.class.getClass());
	RemoteWebDriver driver = null;

	@Test
	
	public void navigateTo() throws Exception {
		logger.info("Product Navigation started ...");
		PropertyService service = new PropertyService();
		util.mouseOver(service.getValue(PRODUCT));
		util.click(service.getValue(STORE_DEMO));
//		util.mouseOverAndClick(service.getValue(PRODUCT), service.getValue(SHOWCASE));
//	    util.mouseOverAndClick(service.getValue(PRODUCT), service.getValue(FEATURES));
//		util.mouseOverAndClick(service.getValue(PRODUCT), service.getValue(WHY_FOR_D));
//		util.mouseOverAndClick(service.getValue(PRODUCT), service.getValue(WHY_FOR_S));
//		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(FASHION));
//		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(HEALTHY_BEAUTY));
//		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(FOOD_BEVERAGE));
//	    util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(AUTOMOTIVE));
		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(INDUSTRIAL_SCI));
		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(FURNITURE));
		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(B2B_ECOM));
		util.mAmAc(service.getValue(PRODUCT), service.getValue(INDUSTRIES), service.getValue(INTERNATIONAL));

		logger.info("Product Navigation completed ...");
		
		
		
		
	}
}
