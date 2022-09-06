package com.qa.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * The class is defined for storing the webElements in that we are going 
 to declare the WebElement locators only 
 */
public class HomePage {
	@FindBy(xpath="//a[text()=\"Home\"]")
	public WebElement Home;
	
	@FindBy(xpath="//a[text()=\"Football\"]")
	public WebElement Football;
	
	@FindBy(xpath="//a[text()=\"Busketball\"]")
	public WebElement Busketball;
	
	@FindBy(xpath="//a[text()=\"Kriket\"]")
	public WebElement Kriket;
	
	@FindBy(xpath="//a[text()=\"Cibersport\"]")
	public WebElement Cibersport;

	//Constructor used which takes webDriver instance
	//static initElements method of pageFactory class for initializing WebElement
	public HomePage(WebDriver driver) {
		
	//this initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
}

