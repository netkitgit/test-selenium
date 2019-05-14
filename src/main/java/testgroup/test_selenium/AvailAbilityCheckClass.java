package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AvailAbilityCheckClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Tools\\WebDrivers\\chromedriver.exe");

		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		/*
		 * driver.get("https://basicweb.ru/html/primer/957.php");
		 * 
		 * WebElement activeButton =
		 * driver.findElement(By.xpath("//button[text()='Элемент активен']"));
		 * WebElement disabledButton =
		 * driver.findElement(By.xpath("//button[text()='Элемент отключен']"));
		 * 
		 * System.out.println(activeButton.isEnabled());
		 * System.out.println(disabledButton.isEnabled());
		 */

		/*
		 * driver.get(
		 * "https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html"
		 * );
		 * 
		 * WebElement acceptAgreementRadioButton = driver.findElement(By.xpath(
		 * "(//input[@name='agreementjdk-8u201-oth-JPR'])[1]")); WebElement
		 * declineAgreementRadioButton = driver.findElement(By.xpath(
		 * "(//input[@name='agreementjdk-8u201-oth-JPR'])[2]"));
		 * 
		 * System.out.println("acceptAgreementRadioButton is selected: " +
		 * acceptAgreementRadioButton.isSelected());
		 * 
		 * if(!acceptAgreementRadioButton.isSelected())
		 * acceptAgreementRadioButton.click();
		 * 
		 * System.out.println("acceptAgreementRadioButton is selected: " +
		 * acceptAgreementRadioButton.isSelected());
		 */

		driver.get("http://ebay.com");
		Actions actions = new Actions(driver);

		WebElement linkElectronic = driver
				.findElement(By.xpath("//div[@class='hl-cat-nav']/ul/li/a[text()='Электроника']"));
		WebElement linkSmartHome = driver.findElement(By.xpath("//a[contains(text(), 'Умный дом')]"));

		
		  if(!linkSmartHome.isDisplayed()) {
			  actions.moveToElement(linkElectronic).build().perform();
			  linkSmartHome.click(); 
		  }
		 

		// driver.quit();
	}

}
