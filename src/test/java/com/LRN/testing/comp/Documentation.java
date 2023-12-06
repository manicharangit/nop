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
		util.switchTab(T1);

		
	  // util.mouseOverAndClick(service.getValue(INSTALL_UPGRADE), service.getValue(TECH_SYSTEM));
	//   util.mouseOverAndClick(service.getValue(GETTING_STARTED), service.getValue(TECH_SYSTEM));
		
	   util.click(service.getValueFromDoc((GETTING_STARTED));
	   util.click(service.getValueFromDoc((CONFIGURE_TAXES));
	   util.click(service.getValueFromDoc((TAX_SETTINGS));
	   util.click(service.getValueFromDoc((TAX_PROVIDERS));
	   util.click(service.getValueFromDoc((MANUAL_FIXED));
	   util.scroll(250);
	   util.click(service.getValueFromDoc((AVALARA));
	   util.click(service.getValueFromDoc((EMAIL_ACCOUNTS));
	  //util.wait(ADVANCED_CONFF);
	   util.click(service.getValueFromDoc((ADVANCED_CONFF));
	   util.click(service.getValueFromDoc((HOW_TO_INSTALL));
	   util.click(service.getValueFromDoc((YOUR_STORRE));
	   util.click(service.getValueFromDoc((GDPR_SETTINGS));
	   util.click(service.getValueFromDoc((LOCALIZATIION));
	   util.click(service.getValueFromDoc((CUSTUM_HTML));
	   util.click(service.getValueFromDoc((EXTERNAL_AUTH));
	   util.click(service.getValueFromDoc((MULTI_FACTOR));
	   
	   //util.click(service.getValue(AUTHENTICATION));
	   
	   util.click(service.getValueFromDoc((CONFIGURE_ANALY));
	   util.click(service.getValueFromDoc((PLUGINS_NOP));
	   util.click(service.getValueFromDoc((MULTI_STORE));
	   util.click(service.getValueFromDoc((SECURITY_SETTINGS));
	   util.click(service.getValueFromDoc((ROBOT_TXT));
	   util.click(service.getValueFromDoc((PDF_SETTINGS));
	   util.click(service.getValueFromDoc((ALL_SETTINGS));
		util.switchTab(T0);

		logger.info("creating nop plugin navigation ended");
		logger.info("developer guide navigation ended");
		
		
		
	}
}
