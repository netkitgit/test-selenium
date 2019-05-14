package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindowsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
		
		String mainWindow = driver.getWindowHandle();
		
		WebElement agreementLink = driver.findElement(By.xpath("(//a[text()='Oracle Binary Code License Agreement for Java SE'])[1]"));
		agreementLink.click();
		
		//Переберем в цикле все имена открытых окон и в итоге останемся на последнем в последней иттерации
		for(String windowHandle:driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			driver.manage().window().maximize();
		}
		
		driver.findElement(By.xpath("//a[text()='Terms']")).click();
		driver.switchTo().window(mainWindow);
		driver.findElement(By.xpath("//span[text()='Overview']/parent::a")).click();
		
				
		//driver.quit();
	}

}
