package com.qa.utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testNf.BaseTest.BaseTest;



public class Listeners extends BaseTest implements ITestListener {

	/*
	 * Listeners are listening the test script
	 * after failure of test case capture the screenshot and store in the folder
	 * Screenshot code is implemented with listeners to capture SC
	 * Screenshot-testNf is screenshot collection folder
	 * listeners are configured in testng.xml
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.captureScreen(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	

}
