package testgroup.test_selenium;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HeadlessBrowserClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");	
		System.setProperty("webdriver.chrome.logfile", "c:\\Tools\\WebDrivers\\chromedriver.log");
		System.setProperty("webdriver.chrome.verboseLogging", "true");
		
		ChromeOptions options = new ChromeOptions();		
        options.addArguments("headless");     //For headlessness!
        options.addArguments("window-size=1200x600"); //For window size
        options.addArguments("disable-gpu"); //For justice! (There is a bug, this property is not intended to be required long term)
		
        WebDriver driver = new ChromeDriver(options);
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
		WebElement searchInput = driver.findElement(By.xpath("//input[@name='search']"));
		
		Date dateNow = new Date();
		SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss");
		String dateFileName = "scrn_" + format.format(dateNow) + ".png";
		  
		//Иммитируем набор большими буквами с зажатым SHIFT
		searchInput.sendKeys(Keys.chord(Keys.SHIFT, "test test"));
		searchInput.sendKeys(Keys.ENTER);		
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(screenshot, new File("c:\\Tools\\Screenshots\\" + dateFileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		driver.quit();
	}
	
}
