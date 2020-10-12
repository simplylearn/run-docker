package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLogin {

	WebDriver driver;
	public RediffLogin(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}
	
	
	@FindBy(id="login1")
	WebElement login;
	
	@FindBy(id="password")
	WebElement pass;
	
	
	@FindBy(className="signinbtn")
	WebElement signbtn;
	
	public void logvalue(String user) {
		login.sendKeys(user);
		
	}
	
	public void passvalue(String password) {
		pass.sendKeys(password);
	}
	
	public void clickb() {
		signbtn.click();
	}
	
	
}
