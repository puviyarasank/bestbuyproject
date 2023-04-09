package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Payments extends Utility {
	public WebDriver driver;
	public Payments(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement asguest;
	@FindBy(name="firstName")
	WebElement firstname;
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(id="address-input")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(id="state")
	WebElement state;
	@FindBy(id="postalCode")
	WebElement code;
	
	@FindBy(id="user.emailAddress")
	WebElement email;
	@FindBy(id="user.phone")
	WebElement  phone;
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement paymentinfo;
	@FindBy(id="number")
	WebElement cardno;
	@FindBy(id="expMonth")
	WebElement expmonth;
	@FindBy(id="expYear")
	WebElement expyear;
	@FindBy(name="cvv")
	WebElement cvvno;
	
	
	public void payment() {
		asguest.click();
//		firstname.sendKeys(pro.getProperty("firstname"));
//		lastname.sendKeys(pro.getProperty("lastname"));
//		address.sendKeys(pro.getProperty("address"));
//		city.sendKeys(pro.getProperty("city"));
//		select(state, "MD", "val");
//		code.sendKeys("zipcode");
		email.sendKeys(pro.getProperty("email"));
		phone.sendKeys("7904065170");
		paymentinfo.click();
		
		
//		cardno.sendKeys(pro.getProperty("cardno"));
//		expmonth.sendKeys("02");
//		expyear.sendKeys("2026");
//		cvvno.sendKeys("123");

	}

}
