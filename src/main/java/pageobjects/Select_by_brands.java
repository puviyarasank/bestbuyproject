package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_by_brands {
	public WebDriver driver;

	public Select_by_brands(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	WebElement menu;
	@FindBy(xpath = "//button[text()='Brands']")
	WebElement brands;
	@FindBy(xpath = "//a[text()='Sony']")
	WebElement sony;
	@FindBy(xpath = "//a[text()='PlayStation']")
	WebElement playstation;
	@FindBy(xpath = "//a[text()='PlayStation 5']")
	WebElement playstation5;
	@FindBy(xpath = "//a[text()='PS5 consoles']")
	WebElement consoleps5;
	
	@FindBy(xpath = "(//button[@data-sku-id='6523167'])[3]")
	WebElement addtocard;
	@FindBy(xpath = "//div[@class='go-to-cart-button']")
	WebElement gotobutton;
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;

	public void all_in_one() throws InterruptedException {
		menu.click();
		brands.click();
		sony.click();
		// Thread.sleep(6000);
		playstation.click();
		playstation5.click();
		consoleps5.click();
		addtocard.click();
//		gotobutton.click();
		checkout.click();

	}

}
