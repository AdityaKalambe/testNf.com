package com.testNF.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pageElement.HomePage;
import com.qa.testNf.BaseTest.BaseTest;
import com.qa.utility.ReusableMethod;

public class HomePageTest extends BaseTest {
	HomePage hp;
	SoftAssert sa;
	

	@BeforeClass
	public void initObject() {
		hp = new HomePage(driver);
		sa = new SoftAssert();
		
	}
	/*Scenario:-2
	 * 2.Verify the availability of each tab-Home, Cricket, Football, 
	 * Basketball and Ciber Sports
	 */
	@Test(priority = 1)
	public void dispalytheTab() {
		boolean HomeTab = hp.Home.isDisplayed();
		boolean Football = hp.Football.isDisplayed();
		boolean Busketball = hp.Busketball.isDisplayed();
		boolean Kriket = hp.Kriket.isDisplayed();
		boolean Cibersport = hp.Cibersport.isDisplayed();
		sa.assertEquals(true, HomeTab);
		sa.assertEquals(true, Football);
		sa.assertEquals(true, Busketball);
		sa.assertEquals(true, Kriket);
		sa.assertEquals(true, Cibersport);
		System.out.println("all tabs are avilable");
		sa.assertAll();

	}

	/*Scenario :-3 and 4
	 *3. Verify URL of each tab contains the tab name.
	 * 4.Store all the current URL in excel sheet.
	 */
	  @Test(priority = 2) public void verifyURLcontainsTabName()
	  throws IOException {
	  
	String FootballTab = ReusableMethod.containsMethod(hp.Football, 2, 0, driver.getCurrentUrl()); 
	String BusketballTab = ReusableMethod.containsMethod(hp.Busketball, 3, 0, driver.getCurrentUrl());
	String KriketTab = ReusableMethod.containsMethod(hp.Kriket, 4, 0, driver.getCurrentUrl()); 
	String Cibersport = ReusableMethod.containsMethod(hp.Cibersport, 5, 0, driver.getCurrentUrl());
	  
	  sa.assertEquals(FootballTab.contains("football"), true);
	  sa.assertEquals(BusketballTab.contains("busketball"), true);
	  sa.assertEquals(KriketTab.contains("kriket"), true);
	  sa.assertEquals(Cibersport.contains("cibersport"), true); 
	  System.out.println("verifiaction done and all url stored in excel");
	  sa.assertAll();
	 
	 
	  }
	  
	  /*Scenario:-3 and 4 extends For Home Tab Only for capture the screenshot of failure TC
		 *3.Verify URL of each tab contains the tab name.
		 *4.Store all the current URL in excel sheet.
		 */
	@Test(priority = 3)
	public void verifyURLHomeTab() throws IOException {
    //This Test case is fail due to not contains tabName in URL
		String HomeTab = ReusableMethod.containsMethod(hp.Home, 6, 0, driver.getCurrentUrl());
		sa.assertEquals(HomeTab.contains("Home"), true);
		System.out.println("This test case fail");
		sa.assertAll();
		
	}

}
