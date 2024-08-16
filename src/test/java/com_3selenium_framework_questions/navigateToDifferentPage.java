package com_3selenium_framework_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class navigateToDifferentPage {

public WebDriver driver;
	
	@Test
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Market News")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Latest")).isDisplayed());
		
		
		
		
	}










}
