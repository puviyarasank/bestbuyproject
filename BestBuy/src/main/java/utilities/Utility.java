package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NullPointerException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver;
	public static Properties pro;

	public WebDriver intitalizedriver() throws IOException {
		pro = new Properties();
		File f = new File( "C:\\Users\\PUVI\\eclipse-workspace\\BestBuy\\src\\main\\java\\resources\\data.properties");
		FileInputStream fi = new FileInputStream(f);
		pro.load(fi);
		String browsername = "chrome";
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}// method to take screen shot

	public static void screenshot(String testname, WebDriver driver) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File sour = sc.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\PUVI\\eclipse-workspace\\BestBuy\\Screenshot");		

		FileUtils.copyFile(sour,des );
		
	}

	public void switchwindow() {
		String parentwindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.size();
		for (String childwindow : windowHandles) {
			if (!childwindow.contentEquals(parentwindow)) {
				driver.switchTo().window(childwindow);
			}
		}

	}
	public static void action(String value, String method, WebElement element) {
		Actions ac = new Actions(driver);
		if (method.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick();
		} else if (method.equalsIgnoreCase("move")) {
			ac.moveToElement(element);
		} else if (method.equalsIgnoreCase("drag")) {
			ac.dragAndDrop(element, element);

		} else if (method.equalsIgnoreCase("hold")) {
			ac.dragAndDrop(element, element);
		}else if (method.equalsIgnoreCase("click")) {
			ac.click();
		}
	}
	public static void scrolldown() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("windows.scrollby(0,2000);");

	}
	public static void getpagetitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void select(WebElement element, String value, String method) {
		Select s = new Select(element);
		if (method.equalsIgnoreCase("val")) {
			s.selectByValue(value);
		} else if (method.equalsIgnoreCase("vis")) {
			s.selectByVisibleText(value);
		} else if (method.equalsIgnoreCase("index")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		}
	}
	public static void alert(String value, String method) {
		if (method.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (method.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		} else if (method.equalsIgnoreCase("sendkey")) {
			driver.switchTo().alert().sendKeys(value);
		} else if(method.equalsIgnoreCase("text")) {
			driver.switchTo().alert().getText();
			System.out.println(driver.switchTo().alert().getText());
		}

	}

}