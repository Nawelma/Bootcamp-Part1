package com.pageObjectModel.login;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	    WebDriver driver;

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // WebElements
	    @FindBy(id = "username") // Adjust the locator as needed
	    private WebElement usernameField;

	    @FindBy(id = "password") // Adjust the locator as needed
	    private WebElement passwordField;

	    @FindBy(id = "loginButton") // Adjust the locator as needed
	    private WebElement loginButton;

	    @FindBy(id = "loginMessage") // Adjust the locator for the success message
	    private WebElement loginMessage;

	    // Methods
	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }

	    public String getLoginMessage() {
	        return loginMessage.getText();
	    }
	}


