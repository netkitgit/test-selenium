package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTabsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://signup.live.com/?lic=1");
		String mainWindowHandle = driver.getWindowHandle();		
		driver.findElement(By.xpath("//a[text()='Terms of Use']")).click();
		
		for(String tab:driver.getWindowHandles()) {
			driver.switchTo().window(tab);
		}
		
		driver.findElement(By.xpath("//a[text()='FAQ']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().window(mainWindowHandle);
		
		driver.findElement(By.xpath("//input[@id='MemberName']")).sendKeys("TES TEXT");
					
		//driver.quit();
	}

}
