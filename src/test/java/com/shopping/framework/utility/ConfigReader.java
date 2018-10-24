package com.shopping.framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties propertyfile;
	
	public ConfigReader() {
		
		
		
		File path =new File("./src/main/resources/config.properties");
		try {
			FileInputStream fis = new FileInputStream(path);
			 propertyfile=new Properties();
			propertyfile.load(fis);
			
		 } catch (Exception e) {
			
			System.out.println("Exception is===" +e.getMessage());
		}
		
	}
	
	public String getKeyValue(String userkey) {
		
		String value=propertyfile.getProperty(userkey);
		
		return value;
		
	}

}
