package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Login;
import pageobjects.Searchproduct;

public class Searchproducttest extends Baseclass{
//
	@Test
	public static void searchbox()  {
	
		
		
		Searchproduct  sear= new Searchproduct(driver);
		sear.searchbox();
		sear.card();
		Paymentstest.payment();
		System.out.println("Sorry, there was a problem. Please try that again.");
	

	}



}
