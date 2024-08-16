package com.pageObjectModel.homepage;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class HomePageTest {
	    WebDriver driver;
	    HomePage homePage;

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://example.com"); // Adjust the URL to the home page

	        // Initialize the HomePage object
	        homePage = new HomePage(driver);
	    }

	    @Test
	    public void testHomePageElements() {
	        // Verify that the logo is displayed
	        Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed on the home page.");

	        // Enter a search term and click the search button
	        String searchTerm = "Sample Product"; // Replace with an actual product name
	        homePage.enterSearchTerm(searchTerm);
	        homePage.clickSearchButton();

	        // Verify that the search results page is displayed (you can add specific assertions here)
	        // For example, you might check the title or presence of search results.
	        Assert.assertTrue(driver.getTitle().contains(searchTerm), "Search results page is not displayed.");
	    }

	    @Test(dependsOnMethods = "testHomePageElements")
	    public void testNavigateToProductsPage() {
	        // Click on the products link
	        homePage.clickProductsLink();

	        // Verify that the products page is displayed (you can add specific assertions here)
	        // For example, you might check the title or presence of product listings.
	        Assert.assertTrue(driver.getTitle().contains("Products"), "Products page is not displayed.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}


