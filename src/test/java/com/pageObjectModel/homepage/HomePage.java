package com.pageObjectModel.homepage;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
	    WebDriver driver;

	    // Constructor
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // WebElements
	    @FindBy(id = "logo") // Adjust the locator as needed for the logo
	    private WebElement logo;

	    @FindBy(id = "searchBox") // Adjust the locator as needed for the search box
	    private WebElement searchBox;

	    @FindBy(id = "searchButton") // Adjust the locator as needed for the search button
	    private WebElement searchButton;

	    @FindBy(linkText = "Products") // Adjust the locator as needed for the products link
	    private WebElement productsLink;

	    // Methods
	    public boolean isLogoDisplayed() {
	        return logo.isDisplayed();
	    }

	    public void enterSearchTerm(String searchTerm) {
	        searchBox.clear(); // Clear the search box before entering a new term
	        searchBox.sendKeys(searchTerm);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }

	    public void clickProductsLink() {
	        productsLink.click();
	    }
	}


