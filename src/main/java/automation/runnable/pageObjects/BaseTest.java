package automation.runnable.pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.core.browser.BrowserName;

/**
 * @author alexgabor
 *
 */
public class BaseTest {

	protected WebDriver driver;

	@Before
	public void setUp() {

		driver = WebBrowser.getDriver(BrowserName.CHROME);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://siit.epizy.com/shop/index.php?route=account/login");
	}

	@After
	public void quit() {

		System.out.println("Quitting the browser...");

		driver.quit();
	}

	protected String getTextFrom(String locator) {

		WebElement element = (new WebDriverWait(driver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

		return element.getText();
	}

}
