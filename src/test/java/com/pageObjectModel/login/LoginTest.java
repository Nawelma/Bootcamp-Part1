package com.pageObjectModel.login;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class LoginTest {
	    WebDriver driver;
	    LoginPage loginPage;

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://example.com/login"); // Adjust the URL as needed

	        // Initialize the LoginPage object
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testSuccessfulLogin() {
	        // Enter valid credentials
	        loginPage.enterUsername("validUsername"); // Replace with actual username
	        loginPage.enterPassword("validPassword"); // Replace with actual password
	        loginPage.clickLoginButton();

	        // Verify successful login
	        String expectedMessage = "Login Successful"; // Adjust based on the actual success message
	        String actualMessage = loginPage.getLoginMessage();
	        Assert.assertEquals(actualMessage, expectedMessage, "Login was not successful.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}


