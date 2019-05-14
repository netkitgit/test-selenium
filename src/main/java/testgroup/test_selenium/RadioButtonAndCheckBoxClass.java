package testgroup.test_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonAndCheckBoxClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "c:\\Tools\\WebDrivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://market.yandex.ru");
		driver.findElement(By.xpath("//a/span[text()='Бытовая техника']")).click();
		driver.findElement(By.xpath("//a[text()='Стиральные машины']")).click();
		
		//selectCheckBox("Ardo");
		selectCheckBox("BEKO");
		selectCheckBox("Bosch");
		selectCheckBox("Candy");
		
		
		
		/*
		 * System.out.println(driver.findElement(By.xpath(
		 * "//label//span[text()='Ardo']/parent::div/preceding-sibling::input")).
		 * isSelected());
		 * driver.findElement(By.xpath("//label//span[text()='Ardo']")).click();
		 * //Выделили чекбокс System.out.println(driver.findElement(By.xpath(
		 * "//label//span[text()='Ardo']/parent::div/preceding-sibling::input")).
		 * isSelected());
		 * //driver.findElement(By.xpath("//label//span[text()='Ardo']")).click();
		 * //Сняли выделение с чекбокса
		 * driver.findElement(By.xpath("//label//span[text()='Bosch']")).click();
		 * driver.findElement(By.xpath("//label//span[text()='Candy']")).click();
		 * 
		 * System.out.println();
		 * 
		 * System.out.println(driver.findElement(By.xpath(
		 * "//label//span[text()='Самовывоз']/parent::div/preceding-sibling::input")).
		 * isSelected());
		 * driver.findElement(By.xpath("//label//span[text()='Самовывоз']")).click();
		 * System.out.println(driver.findElement(By.xpath(
		 * "//label//span[text()='Самовывоз']/parent::div/preceding-sibling::input")).
		 * isSelected());
		 * driver.findElement(By.xpath("//label//span[text()='С доставкой']")).click();
		 */
				
		//driver.quit();
	}
	
	public static void selectCheckBox(String radioButtonName) {
		String radioButtonSpanXpath = String.format("//label//span[text()='%s']", radioButtonName);
		String radioButtonInputXpath = String.format("//label//span[text()='%s']/parent::div/preceding-sibling::input", radioButtonName);
		
		if(!driver.findElement(By.xpath(radioButtonInputXpath)).isSelected()) {
				driver.findElement(By.xpath(radioButtonSpanXpath)).click();
		}	
		
	}
	
	protected static boolean isElementPresent(String elementXpath){
        try{
            driver.findElement(By.xpath(elementXpath));
            return true;
        }
        catch(NoSuchElementException e){
        	System.out.println("Element not found");
        	return false;            
        }
    }

}
