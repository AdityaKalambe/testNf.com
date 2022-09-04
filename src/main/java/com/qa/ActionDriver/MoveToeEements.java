package com.qa.ActionDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.testNf.BaseTest.BaseTest;

/*
 *  code to perform the actions on list of WebElement or single Element
 * 
 */

public class MoveToeEements extends BaseTest {
     // action on single WebElement
	public static void MoveToSingleElement(WebElement SingleLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(SingleLocator).build().perform();
	}
	// action on Multiple WebElement
	public static void MoveToMultipleElement(List<WebElement>MultipleElement) {
		Actions act = new Actions(driver);
		for(WebElement ele:MultipleElement) {
			act.moveToElement(ele).build().perform();
		}
		
	}
}
