package CommonFunLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ProperticesFileUtil;

public class FunctionLibrary {
	static WebDriver driver;

	public static WebDriver startBrowser(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Amazon_TestNG\\CommonJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	public static void openApplication(WebDriver driver) throws Throwable {
		driver.navigate().to(ProperticesFileUtil.getProperty("url"));

	}

	public static void clickAction(WebDriver driver, String locator_type, String locator_value) throws Throwable {
		WebElement element = null;
		if (locator_type.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locator_value));
		}
		if (locator_type.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locator_value));
		}
		try {
			if (locator_type.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(locator_value));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			element = driver.findElement(By.xpath("//*[contains(text(),'" + locator_value + ")')]"));
		}
		try {
			element.click();
		} catch (Exception e) {
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			action.click(element).build().perform();
			// element.sendKeys(Keys.ENTER);
		}

	}

	public static void typeAction(WebDriver driver, String locator_type, String locator_value, String TestData) {
		WebElement element2 = null;
		if (locator_type.equalsIgnoreCase("id")) {
			element2 = driver.findElement(By.id(locator_value));
		}
		if (locator_type.equalsIgnoreCase("name")) {
			element2 = driver.findElement(By.name(locator_value));
		}
		try {
			if (locator_type.equalsIgnoreCase("xpath")) {
				element2 = driver.findElement(By.xpath(locator_value));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			element2 = driver.findElement(By.xpath("//*[contains(text(),'" + locator_value + ")')]"));
		}
		element2.sendKeys(TestData);
	}

	public static void waitforelement(WebDriver driver, String locator_type, String locator_value, String TestData) {
		int timeToWait = (int) Double.parseDouble(TestData);
		System.out.println(timeToWait);
		WebDriverWait wait = new WebDriverWait(driver, timeToWait);

		if (locator_type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator_value)));
		}
		if (locator_type.equalsIgnoreCase("name")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator_value)));
		}
		try {
			if (locator_type.equalsIgnoreCase("xpath")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator_value)));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//*[contains(text(),'" + locator_value + ")')]")));
			e.printStackTrace();
		}
	}
}
