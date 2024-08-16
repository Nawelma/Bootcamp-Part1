package com_3selenium_framework_questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyTitleOfThePage {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
	}

	@Test
	public void verifyPageTitle() {
		 String title = driver.getTitle();
		Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping", "Title does not match");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	}




	