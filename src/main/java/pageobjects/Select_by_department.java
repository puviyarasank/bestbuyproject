package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Select_by_department {
	public WebDriver driver;

	public Select_by_department(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	WebElement menu;
	@FindBy(xpath = "//button[@data-id='node-393']")
	WebElement computer;
	@FindBy(xpath = "//button[@data-id='node-288']")
	WebElement laptops;
	@FindBy(xpath = "//a[text()='Gaming Laptops']")
	WebElement gaminglaptop;
	@FindBy(xpath = "(//a[text()='ASUS'])[2]")
	WebElement asus;
	@FindBy(xpath = "(//img[@alt='ASUS - TUF Gaming A15 15.6\" FHD 144Hz Gaming Laptop-AMD Ryzen 7-8GB DDR5 Memory-NVIDIA GeForce RTX 3050 Ti-512GB PCIe SSD - Front_Zoom'])[2]")
	WebElement asuslaptop;
	@FindBy(id = "warranty-sku-5802830-warranty-selector")
	WebElement waranty;
	@FindBy(xpath = "//button[@data-sku-id='6501561']")
	WebElement addtocard;
	@FindBy(xpath = "//div[@class='go-to-cart-button']")
	WebElement gotocard;
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	

	public void singlemethod() throws InterruptedException {
		menu.click();
		computer.click();
		laptops.click();
		gaminglaptop.click();
		asus.click();
		// asuslaptop.click();
		// waranty.click();
		addtocard.click();
		Thread.sleep(10000);
		gotocard.click();
		checkout.click();
		

	}
}
