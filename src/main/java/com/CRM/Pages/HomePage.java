package com.CRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.TestBase.TestBaseClass;

public class HomePage extends TestBaseClass {

	@FindBy(xpath = "//td[contains(text(),'User: Devanand')")
	private WebElement usernamelabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts']")
	private WebElement contactslink;

	@FindBy(xpath = "//a[contains(text(),'Deals']")
	private WebElement dealslink;

	@FindBy(xpath = "//a[contains(text(),'Task']")
	private WebElement task;

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomePageTitle() {
		 return driver.getTitle();
	}
	public void Verifyusernamelabel() throws IOException {
		  usernamelabel.click();	 
	}
	public ContactPage Verifycontactslink() throws IOException {
		contactslink.click();
		 return new ContactPage();
	}
	public DealsPage Verifydealslink() throws IOException {
		dealslink.click();
		return new DealsPage();
	}
	
}
