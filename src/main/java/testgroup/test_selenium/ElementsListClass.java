package testgroup.test_selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsListClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://market.yandex.ru");
		driver.findElement(By.xpath("//a/span[text()='Бытовая техника']")).click();
		driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click();
		
		List<WebElement> checkboxes =  driver.findElements(By.xpath("//div[@class='search-layout']//legend[text()='Производитель']/parent::fieldset//li//input[@type='checkbox']/parent::label//span"));
		//checkboxes.get(3).click();
		
		if(checkboxes.size() == 12) System.out.println("OK");
		else System.out.println("FAIL");
		
		for(WebElement checkbox : checkboxes) {
			checkbox.click();
		}
				
		//driver.quit();
	}
}
