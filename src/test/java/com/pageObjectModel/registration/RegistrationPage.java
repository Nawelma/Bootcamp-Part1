package com.pageObjectModel.registration;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RegistrationPage {
	    WebDriver driver;

	    // Constructor
	    public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // WebElements
	    @FindBy(id = "username") // Adjust the locator as needed
	    private WebElement usernameField;

	    @FindBy(id = "email") // Adjust the locator as needed
	    private WebElement emailField;

	    @FindBy(id = "password") // Adjust the locator as needed
	    private WebElement passwordField;

	    @FindBy(id = "confirmPassword") // Adjust the locator as needed
	    private WebElement confirmPasswordField;

	    @FindBy(id = "registerButton") // Adjust the locator as needed
	    private WebElement registerButton;

	    @FindBy(id = "registrationMessage") // Adjust the locator for the success message
	    private WebElement registrationMessage;

	    // Methods
	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterEmail(String email) {
	        emailField.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void enterConfirmPassword(String confirmPassword) {
	        confirmPasswordField.sendKeys(confirmPassword);
	    }

	    public void clickRegisterButton() {
	        registerButton.click();
	    }

	    public String getRegistrationMessage() {
	        return registrationMessage.getText();
	    }
	}


