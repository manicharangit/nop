package com.LRN.testing.service;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static com.LRN.testing.util.LrnConstants.*;
import com.LRN.testing.util.ProjectProperties;

public class PropertyService {
	ProjectProperties projectProperties= null;
	
	public PropertyService() throws Exception{
		projectProperties = new ProjectProperties();
	}
	
	public String getValue(String key) throws Exception{
		return projectProperties.getValue(key);
	}
	public RemoteWebDriver getMyDriver() throws Exception {
		int browser = Integer.parseInt(getValue(BROWSER));
		RemoteWebDriver driver = null;

		switch(browser) {
		case 1:System.setProperty(getValue(DRIVER_C),getValue(DRIVER_LOCATION_C));
		driver = new ChromeDriver();
		break;
		case 2:System.setProperty(getValue(DRIVER_E),getValue(DRIVER_LOCATION_E));
		driver = new EdgeDriver();  
		break;
		
		default:    System.err.println("something went wrong");


		}
		
		return driver;

	}
}
