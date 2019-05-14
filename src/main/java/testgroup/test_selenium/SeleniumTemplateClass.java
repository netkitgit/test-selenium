package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTemplateClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		driver.quit();
		
	}

}
