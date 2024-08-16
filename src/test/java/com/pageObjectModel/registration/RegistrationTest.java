package com.pageObjectModel.registration;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class RegistrationTest {
	    WebDriver driver;
	    RegistrationPage registrationPage;

	    @BeforeClass
	    public void setUp() {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the WebDriver
	        driver = new ChromeDriver();
	        driver.get("https://example.com/registration"); // Adjust the URL as needed

	        // Initialize the RegistrationPage object
	        registrationPage = new RegistrationPage(driver);
	    }

	    @Test
	    public void testSuccessfulRegistration() {
	        // Enter valid registration details
	        registrationPage.enterUsername("validUsername"); // Replace with actual username
	        registrationPage.enterEmail("valid@example.com"); // Replace with actual email
	        registrationPage.enterPassword("validPassword123"); // Replace with actual password
	        registrationPage.enterConfirmPassword("validPassword123"); // Confirm password
	        registrationPage.clickRegisterButton();

	        // Verify successful registration message
	        String expectedMessage = "Registration Successful"; // Adjust based on the actual success message
	        String actualMessage = registrationPage.getRegistrationMessage();
	        Assert.assertEquals(actualMessage, expectedMessage, "Registration was not successful.");
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}


