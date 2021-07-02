package edu.framework.nagarro.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class PropertyReader {
	
	Properties prop;
	FileInputStream fis;
	
	String userDir = System.getProperty("user.dir");
	
	public PropertyReader() {
		prop = new Properties();
		File file = new File(userDir + "\\src\\test\\resources\\config\\config.properties");
		loadProperties(file);
	}
	
	public void loadProperties(File file) {
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}
	
	public HashMap<String, String> getProperties(){
		Set<Object> keys = prop.keySet();
		HashMap<String, String> kvPairs = new HashMap<String, String>();
		
		for(Object obj : keys) {
			String key = (String) obj;
			String value = getProperty(key);
			kvPairs.put(key, value);
		}
		
		return kvPairs;
	}
}


/*
 * Read the properties from the file
 * Load the properties into Properties Class
 * prop object read from Properties.
 * 
 * 
 */
