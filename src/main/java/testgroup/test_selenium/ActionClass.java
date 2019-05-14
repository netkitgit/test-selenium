package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://ebay.com");
		
		WebElement mouseOverLink = driver.findElement(By.xpath("(//div[@id='mainContent']//ul//a[text()='Электроника'])[1]"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(mouseOverLink).build().perform();
		
		//driver.quit();
	}

}
