package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;
import testcases.Searchproducttest;

public class bestbuy  extends Baseclass{
	@Test
	public void launch() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.bestbuy.com/");
		//driver.findElement(By.xpath("//img[@alt='United States']")).click();
		driver.findElement(By.xpath("//button[@data-lid='hdr_signin']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("puviyarasan2096@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Searchproducttest.searchbox();	
	}
}
