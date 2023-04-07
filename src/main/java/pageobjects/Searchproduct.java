package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Searchproduct extends Utility {
	public WebDriver driver;

	public Searchproduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "gh-search-input")
	WebElement searchbox;
	@FindBy(xpath = "//button[@title='submit search']")
	WebElement searchicon;
	@FindBy(xpath = "(//button[@data-button-state='ADD_TO_CART'])[1]")
	WebElement addtocard;
	@FindBy(xpath = "//div[@class='go-to-cart-button']")
	WebElement gotocard;
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	
	public void searchbox() {
		searchbox.sendKeys("applewatch7");
		searchicon.click();
	}

	public void card() {
		addtocard.click();
		gotocard.click();
		checkout.click();
		

	}

}
