package com.modyo.testing.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverManager {

	public static final String USERNAME = "matiasormazabal1";
	public static final String AUTOMATE_KEY = "JZEE93czqVHky8cTSrJY";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public WebDriverManager() {

	}

	public WebDriver getLocalWebDriver() { 

		ChromeDriverService service;
 
		service = new ChromeDriverService.Builder()
		 .usingDriverExecutable(new File("/Users/Eduardo/Documents/chromedriver"))
		 .usingAnyFreePort()
		 .build();
		
		try {
			service.start();
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ChromeDriver(service);
	}

	public WebDriver getRemoteWebDriver() {
		try {
			return new RemoteWebDriver(new URL(URL), getDesiredCapabilitiesBrowserStack());
		} catch (Exception er) {
			return null;
		}
	}

	public DesiredCapabilities getDesiredCapabilitiesBrowserStack() {

		DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("os", "Windows");
		//dc.setCapability("os_version", "10");
		//dc.setCapability("browser", "Chrome");
		//dc.setCapability("browser_version", "62.0");
		//dc.setCapability("browserstack.local", "false");
		//dc.setCapability("browserstack.video", "true");
		//dc.setCapability("browserstack.selenium_version", "3.14.0");
		//dc.setCapability("browserstack.chrome.driver", "2.35");
		//dc.setCapability("browserstack.debug", true); 
		
		
//		dc.setCapability("os", "OS X");
//		dc.setCapability("os_version", "Mojave");
//		dc.setCapability("browser", "Safari");
//		dc.setCapability("browser_version", "12.0");
//		dc.setCapability("resolution", "1920x1080");
//		dc.setCapability("browserstack.local", "false");
//		dc.setCapability("browserstack.selenium_version", "3.14.0"); 
//		dc.setCapability("browserstack.video", "true");
//		dc.setCapability("browserstack.debug", true); 
  
		 
		dc.setCapability("os", "OS X");
		dc.setCapability("os_version", "Mojave");
		dc.setCapability("browser", "Chrome");
		dc.setCapability("browser_version", "73.0");
		dc.setCapability("resolution", "1600x1200");
		dc.setCapability("browserstack.local", "false");
		dc.setCapability("browserstack.debug", "true");
		dc.setCapability("browserstack.selenium_version", "3.14.0");
		
		return dc;

	}

}