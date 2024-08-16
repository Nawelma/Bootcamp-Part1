package com.pageObjectModel.checkout;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class CheckoutTest {
	    WebDriver driver;
	    CheckoutPage checkoutPage;

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://example.com/product-page"); // Adjust the URL to the product page

	        // Add product to cart (Assuming there is a method to do this)
	        // For example, you can create a ProductPage class and method to add the product to the cart.

	        // Navigate to the cart page (Assuming there is a method to do this and it initializes CheckoutPage)
	        driver.get("https://example.com/cart"); // Adjust the URL to the cart page

	        // Initialize the CheckoutPage object
	        checkoutPage = new CheckoutPage(driver);
	    }

	    @Test
	    public void testCheckoutProduct() {
	        // Navigate to the checkout page
	        checkoutPage.clickCheckoutButton();

	        // Verify that the correct product is being purchased
	        String expectedProductName = "Expected Product Name"; // Replace with the actual product name
	        String expectedProductPrice = "$100.00"; // Replace with the actual product price

	        String actualProductName = checkoutPage.getProductName();
	        String actualProductPrice = checkoutPage.getProductPrice();

	        Assert.assertEquals(actualProductName, expectedProductName, "Product name does not match.");
	        Assert.assertEquals(actualProductPrice, expectedProductPrice, "Product price does not match.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}


