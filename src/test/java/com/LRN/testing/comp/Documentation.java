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


		util.click(service.getValueFromDoc(INSTALLATION));
		util.click(service.getValueFromDoc(TECH));
		util.click(service.getValueFromDoc(INSTALNOP));
		util.click(service.getValueFromDoc(HOSTING));
		util.click(service.getValueFromDoc(INSTALL));
		util.click(service.getValueFromDoc(INSTALWIN));
		util.click(service.getValueFromDoc(INSTALLINUX));
		util.click(service.getValueFromDoc(INSTALMICRO));
		util.click(service.getValueFromDoc(LOAD));
		util.click(service.getValueFromDoc(PREINSTAL));
		util.click(service.getValueFromDoc(FULLYMANAGED));
		util.click(service.getValueFromDoc(UPGRADE));
		
		util.click(service.getValueFromDoc(RUNNINGSTORE));
		util.click(service.getValueFromDoc(CATALOG));
		util.click(service.getValueFromDoc(PRODUCTS));
		util.click(service.getValueFromDoc(ADDPRODUCT));
		util.click(service.getValueFromDoc(PRODUCTATTR));
		util.click(service.getValueFromDoc(SPECIFICATION));
		util.click(service.getValueFromDoc(DOWNLOADABLE));
		util.click(service.getValueFromDoc(GROUPED));
		util.click(service.getValueFromDoc(RECURRING));
		util.click(service.getValueFromDoc(RENTAL));
		util.click(service.getValueFromDoc(IMPORTE));
		util.click(service.getValueFromDoc(PRODUCTTAGS));
		util.click(service.getValueFromDoc(PRODUCTREVIEW));
		util.click(service.getValueFromDoc(CATOGRIES));
		util.click(service.getValueFromDoc(MANUFACTURE));
		util.click(service.getValueFromDoc(CATALOGSETT));
		
		
		util.click(service.getValueFromDoc(ORDERMAN));
		util.click(service.getValueFromDoc(ORDERS));
		util.click(service.getValueFromDoc(SHIPPING));
		util.click(service.getValueFromDoc(RETURN));
		util.click(service.getValueFromDoc(SHOPPING));
		util.click(service.getValueFromDoc(INVENTORY));
		util.click(service.getValueFromDoc(CHECKOUT));
		util.click(service.getValueFromDoc(ORDERSETT));
		util.click(service.getValueFromDoc(CUSTOMER_MANAGEMENT));
		util.click(service.getValueFromDoc(MANAGING_CUSTOMER));
		util.click(service.getValueFromDoc(CUST_ROLES));
		util.click(service.getValueFromDoc(ACESS));
		util.click(service.getValueFromDoc(ACTIVITY));
		util.click(service.getValueFromDoc(ONLINE));
		util.click(service.getValueFromDoc(CUSTOMER));
		util.click(service.getValueFromDoc(VENDOR));
		util.click(service.getValueFromDoc(PROMO_TOOLS));
		util.click(service.getValueFromDoc(DISCOUNTS));
		util.click(service.getValueFromDoc(GIFT_CARDS));
		util.click(service.getValueFromDoc(REWARD_POINTS));
		util.click(service.getValueFromDoc(AFFILIATES));
		util.click(service.getValueFromDoc(TIER));
		util.click(service.getValueFromDoc(CROSS_SELLS));
		util.click(service.getValueFromDoc(EMAIL_CAMP));
		util.click(service.getValueFromDoc(BREVO));
		util.click(service.getValueFromDoc(BREVO_PLUG));
		util.click(service.getValueFromDoc(RECOVER_ABAND));
		util.click(service.getValueFromDoc(SEND_AN_ORDER));
		util.click(service.getValueFromDoc(FACEBOOK));
		util.click(service.getValueFromDoc(CONT_MANAGE));
		util.click(service.getValueFromDoc(BLOG));
		util.click(service.getValueFromDoc(NEWS));
		util.click(service.getValueFromDoc(FORUMS));
		util.click(service.getValueFromDoc(POLLS));
		util.click(service.getValueFromDoc(TOPICS));
		util.click(service.getValueFromDoc(MESSAGE));
		util.click(service.getValueFromDoc(SEARCH_ENGINE));
		util.click(service.getValueFromDoc(REPORTSS));
		util.click(service.getValueFromDoc(SYS_ADMIN));
		util.click(service.getValueFromDoc(SYS_INFO));
		util.click(service.getValueFromDoc(LOG));
		util.click(service.getValueFromDoc(WARNINGS));
		util.click(service.getValueFromDoc(MAINTENANCE));
		util.click(service.getValueFromDoc(MESSAGE_QUE));
		util.click(service.getValueFromDoc(SCHEDULE_TASKS));
		util.click(service.getValueFromDoc(TEMPLATES));
		
		
		




		logger.info("creating nop plugin navigation ended");
		logger.info("developer guide navigation ended");
		
		
		
	}
}
