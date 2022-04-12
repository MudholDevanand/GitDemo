package com.CRM.TestExecution;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LogInPage;
import com.CRM.TestBase.TestBaseClass;
import com.CRM.Utility.TestUtilClass;



public class HomePageTest extends TestBaseClass {
    LogInPage loginpage;
    HomePage homepage;
    TestUtilClass testutil;
	public HomePageTest() throws IOException {
		super();
	}
	//Test case should be separated -- independent with each other
	//Before each test cases launch browser and login
	//@test---execute the test cases
	//after each test case -- close the browser
	
    @BeforeMethod
	public void setup() throws IOException {
		initialization();
		testutil = new TestUtilClass();
		LogInPage lp = new LogInPage();
		homepage = lp.verifylogin();
	}
    @Test(priority = 1)
    public void verifyHomePageTitleTest() {
    	
    	String hptitle = homepage.VerifyHomePageTitle();
    	Assert.assertEquals(hptitle, "CRMPRO","Home page title not matched");
    	testutil.switchToFrame();
    	
    }
	@AfterMethod
	public void browserclose() {
		
		driver.quit();
	}
	
}
