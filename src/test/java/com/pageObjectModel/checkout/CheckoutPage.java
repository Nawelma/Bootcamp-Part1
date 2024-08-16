package com.pageObjectModel.checkout;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CheckoutPage {
	    WebDriver driver;

	    // Constructor
	    public CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // WebElements
	    @FindBy(css = ".cartProductName") // Adjust the locator as needed for the product name
	    private WebElement productName;

	    @FindBy(css = ".productPrice") // Adjust the locator as needed for the product price
	    private WebElement productPrice;

	    @FindBy(id = "checkoutButton") // Adjust the locator as needed for the checkout button
	    private WebElement checkoutButton;

	    // Methods
	    public String getProductName() {
	        return productName.getText();
	    }

	    public String getProductPrice() {
	        return productPrice.getText();
	    }

	    public void clickCheckoutButton() {
	        checkoutButton.click();
	    }
	}


