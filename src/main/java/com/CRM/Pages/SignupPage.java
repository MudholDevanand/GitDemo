package com.CRM.Pages;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;

import com.CRM.TestBase.TestBaseClass;

public class SignupPage extends TestBaseClass{
	
	@FindBy(xpath = "//*[text()='Sign Up']")
	private String signupbutton;
	

	public SignupPage() throws IOException {
		super();
	}

}
