package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://en.wikipedia.org");
		
		WebElement link = driver.findElement(By.xpath("//li[@id=\"n-aboutsite\"]/a"));
		System.out.println(link.getText());
		link.click();
			
		
		//driver.quit();
	}

}
