package com.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
	
	WebDriver driver;
	public GoogleSearch(WebDriver driver){
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name ="q")
	WebElement searchbox;
	
	@FindBy(name="btnK")
	WebElement button;
	
	public void searchk(String key) {
		searchbox.sendKeys(key);
		
	}
	
	public void clickbtn() {
		
		button.click();
	}
	
	
}
