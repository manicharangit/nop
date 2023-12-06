package com.LRN.testing.comp;

import org.apache.log4j.Logger; 
import org.apache.log4j.LogManager;
import org.testng.annotations.Test;
import static com.LRN.testing.util.LrnConstants.*;
import com.LRN.testing.LaunchApp;
import com.LRN.testing.service.PropertyService;
import com.LRN.testing.util.Util;





public class Documentation extends LaunchApp {
	private Logger logger = LogManager.getLogger(Documentation.class.getClass());

	@Test

	public void navigateTo() throws Exception{
		logger.info("Documentation navigation started");
		PropertyService service = new PropertyService();
		logger.info("developer guide navigation started");
		logger.info(" tab switched to tab 1");
		
		util.mouseOverAndClick(service.getValue(SUPPORT_SERVICE), service.getValueFromDoc(DOCUMENTATION));
		util.switchTab(T1);
		//developer guide_developer tutorials
		util.click(service.getValueFromDoc(DEVELOPER_GUIDE));
		logger.info("developer tutorials navigation started");
		util.click(service.getValueFromDoc(DEVELOPER_TUTORIALS));
		util.click(service.getValueFromDoc(SYSTEM_REQUIREMENTS));
    	util.click(service.getValueFromDoc(CONFIGURING_CODE));
		util.click(service.getValueFromDoc(CODING_STANDARDS));
		util.click(service.getValueFromDoc(SOURCE_CODE_ORG));
		util.click(service.getValueFromDoc(DEFAULT_DATABASE));
		util.click(service.getValueFromDoc(ARCHITECTURE_OF_NOP));
		util.click(service.getValueFromDoc(INSTRUCTION_OF_NOP));
		util.click(service.getValueFromDoc(UPDATING_ENTITY));
		util.click(service.getValueFromDoc(INVERSION_OF_CONTROL));
		util.click(service.getValueFromDoc(HOW_TO_REGISTER));
		util.click(service.getValueFromDoc(HOW_TO_MIGRATE));
		util.click(service.getValueFromDoc(A_GUIDE));
		util.click(service.getValueFromDoc(DATA_VALIDATION));
		util.click(service.getValueFromDoc(SCHEDULED_TASKS));
		util.click(service.getValueFromDoc(EXPOSING));
		util.click(service.getValueFromDoc(SETTINGS_API));
		util.click(service.getValueFromDoc(HOW_INTERFACE));
		util.click(service.getValueFromDoc(DESCRIPTION_OF_WEB));
		util.click(service.getValueFromDoc(STEP_BY_STEP));
		util.click(service.getValueFromDoc(DOCKER));
		util.click(service.getValueFromDoc(HOW_TO_DEPLOY));
		util.click(service.getValueFromDoc(GUIDE_TO_CREATE));
		util.click(service.getValueFromDoc(CSP));
		util.click(service.getValueFromDoc(THE_SETTINGS_FROM));
		util.click(service.getValueFromDoc(DESCRIPTION_PLUGIN));
		util.click(service.getValueFromDoc(DESCRIPTION_PERMISSION));
		util.click(service.getValueFromDoc(UNIT_TESTING));
		logger.info("developer tutorials navigation ended");
		//developer guide_creating nop plugin
		logger.info("creating nop plugin navigation started");
		util.click(service.getValueFromDoc(CREATE_NOP_PLUGIN));
		util.click(service.getValueFromDoc(NOP_4_60));
		util.click(service.getValueFromDoc(NOP_4_50));
		util.click(service.getValueFromDoc(NOP_4_40));
		util.click(service.getValueFromDoc(NOP_4_30));
		util.click(service.getValueFromDoc(NOP_4_20));
		util.click(service.getValueFromDoc(NOP_4_10));
		util.click(service.getValueFromDoc(NOP_4_00));
		util.click(service.getValueFromDoc(NOP_3_90));
		util.click(service.getValueFromDoc(HOW_CODE_PAYMENT));
		util.click(service.getValueFromDoc(HOW_CODE_COMP));
		util.click(service.getValueFromDoc(PLUGIN_DATA));
		util.click(service.getValueFromDoc(PLUGIN_DATA_4_20));
		util.click(service.getValueFromDoc(HOW_ADD_MENU));
		util.click(service.getValueFromDoc(ADDING_CSS_JS));
		util.click(service.getValueFromDoc(DES_OF_STRUCTURE));

		util.click(service.getValueFromDoc(GET_STARTED));
		util.click(service.getValueFromDoc(ADMIN_AREA));
		util.click(service.getValueFromDoc(CREATE_CATALOG));
		util.click(service.getValueFromDoc(DESIGN_STORE));
		util.click(service.getValueFromDoc(CHOOSE));
		util.click(service.getValueFromDoc(UPLOADING));
		util.click(service.getValueFromDoc(ADDING));
		util.click(service.getValueFromDoc(NIVO));
		util.click(service.getValueFromDoc(TOP_MENU));
		util.click(service.getValueFromDoc(MEDIA));
		util.click(service.getValueFromDoc(CONFIGURE_PAYMENTS));
		util.click(service.getValueFromDoc(PAYMENT_METHODS));
		util.click(service.getValueFromDoc(CHECK));
		util.click(service.getValueFromDoc(CREDIT));
		util.click(service.getValueFromDoc(PAYPAL_ST));
		util.click(service.getValueFromDoc(PAYPAL_SMART));
		util.click(service.getValueFromDoc(PAYPAL_C));
		util.click(service.getValueFromDoc(PAYPAL_Z));
		util.click(service.getValueFromDoc(CYBER));
		util.click(service.getValueFromDoc(ADVANCED_CONFIG));
		util.click(service.getValueFromDoc(PAYMENT));
		util.click(service.getValueFromDoc(CURRENCIES));
		util.click(service.getValueFromDoc(CONFIGURE_SHIPPING));
		util.click(service.getValueFromDoc(SHIPPING));
		util.click(service.getValueFromDoc(SHIPPING_PROVIDERS));
		util.click(service.getValueFromDoc(MANUAL));
		util.click(service.getValueFromDoc(UPS));
	//	util.wait(ADVANCED_CONFIGURATION);
		util.click(service.getValueFromDoc(ADVANCED_CONFIGURATION));
		//util.click(service.getValueFromDoc(COUNTRIES));
		util.click(service.getValueFromDoc(WAREHOUSES));
		util.click(service.getValueFromDoc(DATES));
		util.click(service.getValueFromDoc(MEASURES));
		util.click(service.getValueFromDoc(PICKUP));
		util.click(service.getValueFromDoc(COUNTRIES));
		logger.info("creating nop plugin navigation ended");
		logger.info("developer guide navigation ended");
		
		
		
	}
}
