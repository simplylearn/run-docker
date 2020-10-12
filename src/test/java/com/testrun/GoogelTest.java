package com.testrun;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.pom.GoogleSearch;
import com.pom.RediffHome;
import com.pom.RediffLogin;

public class GoogelTest {
	
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException, MalformedURLException {
		
		// for loacl running
//		System.setProperty("webdriver.chrome.driver","/home/nirupam/eclipse-workspace/RunGrid/src/resource/driver/chromedriver");
//		
//		driver= new ChromeDriver();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome");
		//cap.setBrowserName("firefox");
		//cap.setPlatform(Platform.WINDOWS);
		
		cap.setPlatform(Platform.LINUX);
		
		//driver = new RemoteWebDriver(new URL("http://192.168.29.75:4444/wd/hub"),cap);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		
		
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String expected = "Google";
		
		Assert.assertEquals(expected, title);
		Thread.sleep(1000);
		GoogleSearch g = new GoogleSearch(driver);
		
		g.searchk("India");
		Thread.sleep(1000);
		g.clickbtn();
		Thread.sleep(1000);
		String title1 = driver.getTitle();
		System.out.println("2nd title is :: "+ title1);
		
		String a = "India - Google Search";
		
		//Assert.assertEquals(a, title);
		
		
	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}

}
