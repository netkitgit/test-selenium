package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement tableElement = driver.findElement(By.xpath("//table[@id='customers']"));
		
		Table table = new Table(tableElement, driver);
		
		System.out.println("Rows number is: " + table.getRows().size());
		
		System.out.println(table.getValueFromCell(1, 3));
		System.out.println(table.getValueFromCell(2, 2));
		
		System.out.println(table.getValueFromCell(2, "Country"));
		System.out.println(table.getValueFromCell(3, "Company"));
		
		//driver.quit();
	}	

}
