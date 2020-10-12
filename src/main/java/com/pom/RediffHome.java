package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHome {
	
	WebDriver driver;
	public RediffHome(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);		
	}
	
	
	@FindBy(css="a[class='signin']")
	WebElement sigin;
	
	
	public void clicksign() {
		
		sigin.click();
	}
	
	
	
	
	
	
	

}
