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


		util.click(service.getValue(INSTALLATION));
		util.click(service.getValue(TECH));
		util.click(service.getValue(INSTALNOP));
		util.click(service.getValue(HOSTING));
		util.click(service.getValue(INSTALL));
		util.click(service.getValue(INSTALWIN));
		util.click(service.getValue(INSTALLINUX));
		util.click(service.getValue(INSTALMICRO));
		util.click(service.getValue(LOAD));
		util.click(service.getValue(PREINSTAL));
		util.click(service.getValue(FULLYMANAGED));
		util.click(service.getValue(UPGRADE));
		
		util.click(service.getValue(RUNNINGSTORE));
		util.click(service.getValue(CATALOG));
		util.click(service.getValue(PRODUCTS));
		util.click(service.getValue(ADDPRODUCT));
		util.click(service.getValue(PRODUCTATTR));
		util.click(service.getValue(SPECIFICATION));
		util.click(service.getValue(DOWNLOADABLE));
		util.click(service.getValue(GROUPED));
		util.click(service.getValue(RECURRING));
		util.click(service.getValue(RENTAL));
		util.click(service.getValue(IMPORTE));
		util.click(service.getValue(PRODUCTTAGS));
		util.click(service.getValue(PRODUCTREVIEW));
		util.click(service.getValue(CATOGRIES));
		util.click(service.getValue(MANUFACTURE));
		util.click(service.getValue(CATALOGSETT));
		
		
		util.click(service.getValue(ORDERMAN));
		util.click(service.getValue(ORDERS));
		util.click(service.getValue(SHIPPING));
		util.click(service.getValue(RETURN));
		util.click(service.getValue(SHOPPING));
		util.click(service.getValue(INVENTORY));
		util.click(service.getValue(CHECKOUT));
		util.click(service.getValue(ORDERSETT));
		util.click(service.getValue(CUSTOMER_MANAGEMENT));
		util.click(service.getValue(MANAGING_CUSTOMER));
		util.click(service.getValue(CUST_ROLES));
		util.click(service.getValue(ACESS));
		util.click(service.getValue(ACTIVITY));
		util.click(service.getValue(ONLINE));
		util.click(service.getValue(CUSTOMER));
		util.click(service.getValue(VENDOR));
		util.click(service.getValue(PROMO_TOOLS));
		util.click(service.getValue(DISCOUNTS));
		util.click(service.getValue(GIFT_CARDS));
		util.click(service.getValue(REWARD_POINTS));
		util.click(service.getValue(AFFILIATES));
		util.click(service.getValue(TIER));
		util.click(service.getValue(CROSS_SELLS));
		util.click(service.getValue(EMAIL_CAMP));
		util.click(service.getValue(BREVO));
		util.click(service.getValue(BREVO_PLUG));
		util.click(service.getValue(RECOVER_ABAND));
		util.click(service.getValue(SEND_AN_ORDER));
		util.click(service.getValue(FACEBOOK));
		util.click(service.getValue(CONT_MANAGE));
		util.click(service.getValue(BLOG));
		util.click(service.getValue(NEWS));
		util.click(service.getValue(FORUMS));
		util.click(service.getValue(POLLS));
		util.click(service.getValue(TOPICS));
		util.click(service.getValue(MESSAGE));
		util.click(service.getValue(SEARCH_ENGINE));
		util.click(service.getValue(REPORTSS));
		util.click(service.getValue(SYS_ADMIN));
		util.click(service.getValue(SYS_INFO));
		util.click(service.getValue(LOG));
		util.click(service.getValue(WARNINGS));
		util.click(service.getValue(MAINTENANCE));
		util.click(service.getValue(MESSAGE_QUE));
		util.click(service.getValue(SCHEDULE_TASKS));
		util.click(service.getValue(TEMPLATES));
		
		
		




		logger.info("creating nop plugin navigation ended");
		logger.info("developer guide navigation ended");
		
		
		
	}
}
