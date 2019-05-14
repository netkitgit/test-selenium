package testgroup.test_selenium;


import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFileClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://images.google.com");
		
		driver.findElement(By.xpath("//div[@aria-label='Поиск по картинке']")).click();
		driver.findElement(By.xpath("//a[text()='Загрузить файл']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("c:\\Tools\\Screenshots\\scrn_01_43_10.png");
			

//		driver.quit();
	}

}
