package com.modyo.testing;
 
import org.junit.AfterClass; 
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.modyo.testing.profile.LoginPage;
import com.modyo.testing.util.CucumberRunner;
import com.modyo.testing.util.WebDriverManager;

  

@RunWith(Suite.class)
@SuiteClasses({
	CucumberRunner.class
})
public class ModyoTestCucumber {


	public static WebDriver webDriver;
	public static LoginPage loginPage;
	
	
	@BeforeClass
	public static void setup() {
		webDriver = new WebDriverManager().getLocalWebDriver(); 
		
		webDriver.manage().window().maximize();
		loginPage = PageFactory.initElements(webDriver, LoginPage.class);
		
		
	}


	@AfterClass
	public static void finish() {
		webDriver.quit(); 
	}
	
	
}
