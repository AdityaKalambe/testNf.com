package com.qa.pageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

