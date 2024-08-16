package com.pageObjectModel.shoppingcart;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class ShoppingCartPage {
	    WebDriver driver;

	    // Constructor
	    public ShoppingCartPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // WebElements
	    @FindBy(id = "addToCartButton") // Adjust the locator as needed
	    private WebElement addToCartButton;

	    @FindBy(id = "viewCartButton") // Adjust the locator as needed
	    private WebElement viewCartButton;

	    @FindBy(id = "cartItem") // Adjust the locator for the cart item
	    private WebElement cartItem;

	    // Methods
	    public void clickAddToCart() {
	        addToCartButton.click();
	    }

	    public void clickViewCart() {
	        viewCartButton.click();
	    }

	    public String getCartItemText() {
	        return cartItem.getText();
	    }
	}


