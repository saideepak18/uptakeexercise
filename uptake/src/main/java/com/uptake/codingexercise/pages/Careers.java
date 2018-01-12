package com.uptake.codingexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers {
	
	private WebDriver driver;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]/div[2]/div/h1")
	private WebElement heading;
	
	@FindBy(linkText = "JOIN US")
	private WebElement joinus;

	public Careers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isPageOpened(){
		return heading.getText().toString().contains("OUR TEAM");
	}
	
	public void clickJoinus(){
		joinus.click();
	}
	
	

}
