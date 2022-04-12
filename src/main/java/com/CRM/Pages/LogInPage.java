package com.CRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.TestBase.TestBaseClass;

public class LogInPage extends TestBaseClass {

	//POM With PageFactory
	@FindBy(xpath = "//*[@name='email']")
	private WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@class='ui fluid large blue submit button']")
	private WebElement loginbutton;

	@FindBy(xpath = "(//*[@title='free crm home'])[1]")
	private WebElement crmlogo;

	public LogInPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
   }
	public String validateloginpageTitle() {
		  return driver.getTitle();
		
	}
	public boolean Verifyloginpagelogo() {
		return crmlogo.isDisplayed();
	}
	public HomePage verifylogin() throws IOException {
		username.sendKeys("Devanand");
		password.sendKeys("test@123");
		loginbutton.click();
		return new HomePage();
	}
}
