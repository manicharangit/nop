package com.LRN.testing.util;

import java.io.FileReader;
import java.util.Properties;
import static com.LRN.testing.util.LrnConstants.*;

public class ProjectProperties {

	private Properties projectProperty = null;
	private Properties documentProperty = null;
	
	public ProjectProperties() throws Exception{
		FileReader reader = new FileReader(PROPERTY_LOCATION);
		projectProperty= new Properties();
		projectProperty.load(reader);
		
		FileReader dodReader = new FileReader(DOC_PROPERTY_LOCATION);
		documentProperty= new Properties();
		documentProperty.load(dodReader);
	}
	
	public String getValue(String key) {
		return projectProperty.getProperty(key);
	}
	
	public String getValue(String key, boolean isDoc) {
		return documentProperty.getProperty(key);
	}
	
}
