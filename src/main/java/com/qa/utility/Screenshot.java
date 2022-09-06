package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	/*Screenshot code are implemented for capturing the screenshot
	 * implemented with listeners
	 */
	public static void captureScreen(WebDriver driver, String name) throws IOException {
		
		        //step-1 casting TakesScreenshot interface with driver
				TakesScreenshot tsc=(TakesScreenshot) driver;
				
				//step-2 output file type
				File source=tsc.getScreenshotAs(OutputType.FILE);
			
				//step-3 path of folder for collections of screenshot
				String path=System.getProperty("user.dir")+"\\Screenshot-testNF\\"+name+".png";
				
				//step-4 select destination of file
				File dest=new File(path);
				
				//step-5 Handle the file source and target
				FileHandler.copy(source, dest);
				
				System.out.println("Screenshot capture");
		
	}

}
