package com.pageObjectModel.searchPage;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class SearchPageTest {
	    WebDriver driver;
	    SearchPage searchPage;

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://example.com/search"); // Adjust the URL as needed

	        // Initialize the SearchPage object
	        searchPage = new SearchPage(driver);
	    }

	    @Test
	    public void testSearchProduct() {
	        // Enter the search term
	        String searchTerm = "Product Name"; // Replace with the actual product name you are searching for
	        searchPage.enterSearchTerm(searchTerm);
	        searchPage.clickSearchButton();

	        // Verify that search results are displayed
	        Assert.assertTrue(searchPage.areSearchResultsDisplayed(), "Search results are not displayed.");

	        // Click on the first product link in the search results
	        searchPage.clickOnProduct(0); // Click on the first product (index 0)

	        // Here you can add assertions to verify that the product details page is displayed correctly
	        // For example:
	        // String expectedTitle = "Expected Product Title"; // Replace with expected title
	        // Assert.assertEquals(driver.getTitle(), expectedTitle, "Product details page title does not match.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}

