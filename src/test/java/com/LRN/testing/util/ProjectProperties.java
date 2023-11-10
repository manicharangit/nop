package com.LRN.testing.util;

import java.io.FileReader;
import java.util.Properties;
import static com.LRN.testing.util.LrnConstants.*;

public class ProjectProperties {

	private Properties projectProperty = null;
	
	public ProjectProperties() throws Exception{
		FileReader reader = new FileReader(PROPERTY_LOCATION);
		projectProperty= new Properties();
		projectProperty.load(reader);
	}
	public String getValue(String key) {
		return projectProperty.getProperty(key);
	}
	
}
