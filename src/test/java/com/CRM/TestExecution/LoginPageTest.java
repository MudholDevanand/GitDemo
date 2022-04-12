package com.CRM.TestExecution;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.Pages.LogInPage;
import com.CRM.TestBase.TestBaseClass;


public class LoginPageTest extends TestBaseClass{
	LogInPage lp;
	public LoginPageTest() throws IOException {
		super();
		
	}
 
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		lp = new LogInPage();
		lp.verifylogin();
	}
	
	@Test(priority = 1)
	public void loginpagetitleTest() {
	  String title = lp.validateloginpageTitle();
	  Assert.assertEquals(title, "CRM Free for Any Business");
	}
	
	@Test(priority = 2)
	public void loginpagelogoTest() {
		boolean logo = lp.Verifyloginpagelogo();
		Assert.assertTrue(logo);
	}
	@Test(priority = 3)
	public void loginpageTest() throws IOException {
		  lp.verifylogin();
		
	}
	
	@AfterMethod
	public void browserclose() {
		driver.quit();
	}
	
	
}
