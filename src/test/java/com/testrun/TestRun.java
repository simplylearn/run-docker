package com.testrun;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRun {
	static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap =  new DesiredCapabilities();
		
		//cap.setBrowserName("chrome");
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		System.setProperty("webdriver.chrome.driver","/home/nirupam/eclipse-workspace/RunGrid/src/resource/driver/chromedriver");
		
		driver = new RemoteWebDriver(new URL("http://192.168.29.75:4444/wd/hub"),cap);
		
		
		
		
		driver.get("https://www.rediff.com/");

	}

}
