package com.org.codingexercise.uptake;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.uptake.codingexercise.pages.Careers;
import com.uptake.codingexercise.pages.Home;
import junit.framework.Assert;

public class PageTest {

	WebDriver driver;

	@Before
	public void setup() {
		// using chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.uptake.com/");

	}

	@Test
	public void clickCareer() {
		
		Home home = new Home(driver);
		
		home.clickCareers();

		Careers career = new Careers(driver);

		Assert.assertTrue(career.isPageOpened());

		career.clickJoinus();
		
	}

	@After
	public void close() {
		driver.close();
	}

}
