package com.qa.testNf.BaseTest;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.qa.config.properties.prop;
import com.qa.testdata.InputExcel;

import io.github.bonigarcia.wdm.WebDriverManager;
/*BaseTest class is designed for initialization of WebDriver and  different Browsers instance
 * Where We require browser then we simply extends the BaseTest class
 * Script is Written for Cross browser Testing
 * configuration for cross browser testing is done in testng.xml by using parameterization
 * DataProvider used to fetch the data from the excel
 */
public class BaseTest {

	public static WebDriver driver;
	/*Scenario:-1
	 * 1.Launch the application: https://test-nf.com/english.html
	 * URL is been Fetched from config.properties Files
	 */
	@Parameters("browser")
	@BeforeTest
	
	public void BrowserSetup(String browser) throws IOException {
		
		//Chrome Driver initialize
		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prop po=new prop();
		po.fetchurl("url");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		}
		
		//Edge Driver initialize
		else if(browser.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			prop po=new prop();
			po.fetchurl("url");
	
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
			
		}
		
		//Firefox Driver initialize
		else if(browser.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();;
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			prop po=new prop();
			po.fetchurl("url");
	
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
	}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	//Data provider are used to fetch the data from excel class is present in (com.qa.testdata)
	@DataProvider(name="testdata")
	public String [][]hrm() throws IOException{
	 String data[][]=InputExcel.getData();
	return data;
	 }
}
