package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://reg.2domains.ru/registration/");
		
		driver.findElement(By.xpath("//select[@id='secret_question']")).click();
		driver.findElement(By.xpath("//select[@id='secret_question']/option[text()='Любимый город']")).click();
		
		
		
				
		//driver.quit();
	}
}
