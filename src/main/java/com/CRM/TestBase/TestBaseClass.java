package com.CRM.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public TestBaseClass() throws IOException {
		try {
			prop = new Properties();
	  FileInputStream ip = new FileInputStream("D:\\Eclipse2021-06\\InterViewWorkspace2021\\CRMS_Project\\"
	  		+ "src\\main\\java\\com\\CRM\\Configuration\\configue.properties");
	   prop.load(ip);
		}catch(FileNotFoundException e) {
        e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
   public static void initialization() {
	   String browsername = prop.getProperty("browser");
	   if(browsername.equals("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver94_SeleniumFile\\"
		   		+ "chromedriver_win32\\chromedriver.exe");
		   driver = new ChromeDriver();
	   }else if (browsername.equals("Firefox")){
		   System.setProperty("webdriver.gecko.driver", "D:\\GekoDriver_SetUp\\"
		   		+ "geckodriver-v0.30.0-win64\\geckodriver.exe");
		   driver = new FirefoxDriver();
		   }
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   driver.get(prop.getProperty("url"));
	   }
}
