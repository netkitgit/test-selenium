package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*
		 * driver.get("http://en.wikipedia.org"); 
		 * WebElement searchButton = driver.findElement(By.xpath("//input[@id='searchButton']"));
		 * searchButton.click();
		 */
		
		driver.get("http://github.com");		
		WebElement registrationFormSubmitButton = driver.findElement(By.xpath("//form[@class='home-hero-signup js-signup-form']/button"));
		if(registrationFormSubmitButton.getText().equals("Sign up for GitHub")) {
			System.out.println("Success!");
			registrationFormSubmitButton.submit();
		}else {
			System.out.println("Fail!");
		}
		
		//driver.quit();	
		
	}

}
