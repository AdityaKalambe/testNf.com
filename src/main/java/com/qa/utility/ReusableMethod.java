package com.qa.utility;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.qa.testNf.BaseTest.BaseTest;
import com.qa.testdata.*;

public class ReusableMethod extends BaseTest  {

	/*Reusable method 
	 * this method is directly used in test class for validation
	 * with the help of this method we can execute multiple testcases or 
	 * scenario according to requirement
	 * */
	public static <WriteData> String containsMethod(WebElement Element,int c,int r,String val) throws IOException {
		Element.click();

		String url=driver.getCurrentUrl();
	
		OutPutExcel. WriteData(c,r,val);
		return url;
	
		
	}
	
}
