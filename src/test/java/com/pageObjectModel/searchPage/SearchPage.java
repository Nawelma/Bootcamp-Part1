package com.pageObjectModel.searchPage;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import java.util.List;

	public class SearchPage {
	    WebDriver driver;

	    // Constructor
	    public SearchPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // WebElements
	    @FindBy(id = "searchBox") // Adjust the locator as needed
	    private WebElement searchBox;

	    @FindBy(id = "searchButton") // Adjust the locator as needed
	    private WebElement searchButton;

	    @FindBy(css = ".searchResult") // Adjust the locator for search results
	    private List<WebElement> searchResults;

	    @FindBy(css = ".productLink") // Adjust the locator for product links
	    private List<WebElement> productLinks;

	    // Methods
	    public void enterSearchTerm(String searchTerm) {
	        searchBox.clear(); // Clear the search box before entering a new term
	        searchBox.sendKeys(searchTerm);
	    }

	    public void clickSearchButton() {
	        searchButton.click();
	    }

	    public boolean areSearchResultsDisplayed() {
	        return !searchResults.isEmpty();
	    }

	    public void clickOnProduct(int index) {
	        if (index >= 0 && index < productLinks.size()) {
	            productLinks.get(index).click();
	        } else {
	            throw new IndexOutOfBoundsException("Product index out of bounds.");
	        }
	    }
	}


