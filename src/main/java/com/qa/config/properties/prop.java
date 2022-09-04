package com.qa.config.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.qa.testNf.BaseTest.BaseTest;



public class prop extends BaseTest  {
	public Properties prop;
	public FileInputStream fis;
public  void fetchurl(String uri) throws IOException {
	 prop=new Properties();
	 String path=System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\properties\\config.Properties";
	 fis=new FileInputStream(path);
	 prop.load(fis);
	 driver.get(prop.getProperty(uri));
}
}
