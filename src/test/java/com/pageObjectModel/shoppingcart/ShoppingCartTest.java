package com.pageObjectModel.shoppingcart;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class ShoppingCartTest {
	    WebDriver driver;
	    ShoppingCartPage shoppingCartPage;

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://example.com/product-page"); // Adjust the URL as needed

	        // Initialize the ShoppingCartPage object
	        shoppingCartPage = new ShoppingCartPage(driver);
	    }

	    @Test
	    public void testAddProductToCart() {
	        // Add product to the cart
	        shoppingCartPage.clickAddToCart();

	        // Navigate to the cart page
	        shoppingCartPage.clickViewCart();

	        // Verify that the product is added to the cart
	        String expectedItem = "Product Name"; // Replace with the actual product name
	        String actualItem = shoppingCartPage.getCartItemText();
	        Assert.assertEquals(actualItem, expectedItem, "Product was not added to the cart successfully.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}


