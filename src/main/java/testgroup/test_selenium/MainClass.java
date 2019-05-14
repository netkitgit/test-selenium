package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
	
	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			//driver.manage().window().setSize(new Dimension(900,500));
			
			driver.manage().window().maximize();
			
			//Устанавливаем ожидание для webdriver перед тем как он продолжит действие.
			//Если webdriver найдет элемент раньше, то он продолжит выполнение, если не найдет сразу, то
			//будет делать попытки искать элемент в течении установленного таймаута
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		/*
		 * driver.get("http://yandex.ru");
		 * driver.navigate().to("http://www.seleniumhq.org"); driver.navigate().back();
		 * driver.navigate().forward(); driver.navigate().refresh();
		 * 
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 */
			
			driver.get("http://en.wikipedia.org");
			
			WebElement link = driver.findElement(By.linkText("Log in"));
			WebElement link2 = driver.findElement(By.partialLinkText("Donate"));
			WebElement searchField = driver.findElement(By.name("search"));
			WebElement searchButton  = driver.findElement(By.className("searchButton"));
			
			driver.quit();
	}

}
