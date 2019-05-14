package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFieldClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://en.wikipedia.org");
		WebElement searchField = driver.findElement(By.xpath("//input[@id='searchInput']"));
		WebElement searchButton  = driver.findElement(By.xpath("//input[@id='searchButton']"));		
		
		searchField.sendKeys("Selenium WebDriver");
		searchButton.click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='searchText']/input")).getAttribute("value"));
		driver.findElement(By.xpath("//div[@id='searchText']/input")).clear();		
		
		driver.quit();
	}

}
