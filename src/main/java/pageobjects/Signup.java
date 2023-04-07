package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	public WebDriver driver;

	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@data-lid='hdr_signin']")
	WebElement account;
	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createacnt;
	@FindBy(id = "firstName")
	WebElement firstname;
	@FindBy(id = "lastName")
	WebElement lastname;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(xpath = "(//input[contains(@type,'password')])[1]")
	WebElement password;
	@FindBy(xpath = "(//input[contains(@type,'password')])[2]")
	WebElement conformpasswrd;
	@FindBy(id = "phone")
	WebElement mobilenum;
	@FindBy(xpath = "//span[@class='c-checkbox-brand']")
	WebElement actrecovery;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbtn;
	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement googlebtn;

	public void account() {
		account.click();
	}

	public void createacnt() {
		createacnt.click();
	}

	public void firstname() {
		firstname.sendKeys("puviyarasan");
	}

	public void lastname() {
		lastname.sendKeys("velu");
	}

	public void email() {
		email.sendKeys("puviyarasan2096@gmail.com");

	}

	public void password() {
		password.sendKeys("Kdzxc@123");

	}

	public void conformpasswrd() {
		conformpasswrd.sendKeys("Kdzxc@123");

	}

	public void mobilenum() {
		mobilenum.sendKeys("7904069140");

	}

	public void acntrecovery() {
		actrecovery.click();

	}

	public void submit() {
		submitbtn.click();

	}

}
