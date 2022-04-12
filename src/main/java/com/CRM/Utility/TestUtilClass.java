package com.CRM.Utility;

import java.io.IOException;

import com.CRM.TestBase.TestBaseClass;

public class TestUtilClass extends TestBaseClass {

	public TestUtilClass() throws IOException {
		super();
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10; 

	public void switchToFrame() {
		driver.switchTo().frame(1);
	}

	public void switchToWindow() {
		driver.switchTo().window(null);
		
	}
     
}
