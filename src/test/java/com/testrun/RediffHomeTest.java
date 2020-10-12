package com.testrun;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pom.RediffHome;
import com.pom.RediffLogin;

public class RediffHomeTest {
	
	WebDriver  driver;
	
	@Test
	public void test() throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","/home/nirupam/eclipse-workspace/RunGrid/src/resource/driver/geckodriver");
		
		driver= new FirefoxDriver();
		
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String expected = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		Assert.assertEquals(title,expected);
		
		RediffHome r = new RediffHome(driver);
		
		r.clicksign();
		Thread.sleep(1000);
		String title1 = driver.getTitle();
		System.out.println("2nd title is :: "+ title1);
		
		String expected1 ="Rediffmail";
		
		Assert.assertEquals(title1, expected1);
		RediffLogin rl = new RediffLogin(driver);
		
		rl.logvalue("nirupam83");
		
		rl.passvalue("anupam");
		
		rl.clickb();
		
		
		
	}
	

}
