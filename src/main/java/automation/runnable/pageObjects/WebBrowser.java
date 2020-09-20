package automation.runnable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import automation.core.browser.BrowserName;

/**
 * @author alexgabor
 *
 */
public class WebBrowser {

	public static WebDriver getDriver(BrowserName browserName) {

		WebDriver driver = null;

		switch (browserName) {
		case CHROME:

			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
			driver = new ChromeDriver();

			break;
		case FIREFOX:

			System.setProperty("webdriver.gecko.driver", "./lib/geckodriver");
			driver = new FirefoxDriver();

			break;
		default:
			break;
		}

		return driver;
	}

}
