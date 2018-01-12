package com.uptake.codingexercise.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	private WebDriver driver;
		
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[1]/a[1]/span")
	private WebElement products; 
	
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[2]/a[1]/span")
	private WebElement industries; 
	
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[3]/a[1]/span")
	private WebElement about; 
	
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[4]/a[1]/span")
	private WebElement expertise;
	
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[5]/a[1]/span")
	private WebElement news_insights;
	
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[6]/a[1]/span")
	private WebElement careers;
	
	@FindBy(xpath = "/html/body/div[1]/header/section/div[2]/nav/ul/li[7]/a[1]/span")
	private WebElement contact;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickProducts(){
		products.click();
	}
	
	public void clickIndustries(){
		industries.click();
	}
	
	public void clickAbout(){
		about.click();
	}
	
	public void clickNewsInsights(){
		news_insights.click();
	}
	
	public void clickCareers(){
		careers.click();
	}
	
	public void clickContact(){
		contact.click();
	}
	

}
