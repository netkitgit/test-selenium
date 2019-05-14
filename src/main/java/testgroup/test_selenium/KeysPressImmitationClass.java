package testgroup.test_selenium;


import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysPressImmitationClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
		WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
		
		/*
		 * //После ввода текста иммитируем нажатие ENTER
		 * searchInput.sendKeys("test text"); searchInput.sendKeys(Keys.ENTER);
		 */
		
		/*
		 * //Иммитируем набор большими буквами с зажатым SHIFT
		 * searchInput.sendKeys(Keys.chord(Keys.SHIFT, "test test"));
		 * searchInput.sendKeys(Keys.ENTER);
		 */
		
		//Создаем сочетания клавиш
		String select = Keys.chord(Keys.CONTROL, "a");
		String cut = Keys.chord(Keys.CONTROL, "x");
		String paste = Keys.chord(Keys.CONTROL, "v");
		
		searchInput.sendKeys("Text Test");
		searchInput.sendKeys(select);
		searchInput.sendKeys(cut);
		searchInput.sendKeys(paste);
		searchInput.sendKeys(Keys.ENTER);
		
		
				 

		// driver.quit();
	}

}
