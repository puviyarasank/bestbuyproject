package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Login;

public class Logintest extends Baseclass {

	

	@Test()
	public static void login() throws InterruptedException {
		
		Login lo = new Login(driver);
		lo.account();
		lo.login();
		lo.email(pro.getProperty("email"));
		lo.passwrd(pro.getProperty("password"));
		lo.submitbtn();
		getpagetitle();
	
				
	

	}

}
