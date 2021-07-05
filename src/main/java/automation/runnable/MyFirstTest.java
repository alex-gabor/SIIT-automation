package automation.runnable;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author alexgabor
 *
 */
public class MyFirstTest {

	@Test
	public void myFirstTest() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("koala", Keys.RETURN);

		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));

		System.out.println(myDynamicElement.getText());

		List<WebElement> resultTitleElements = driver.findElements(By.xpath("//h3/span"));

		System.out.println(resultTitleElements.size());

		for (WebElement we : resultTitleElements) {

			System.out.println(we.getText());

			WebElement resultTitle = we.findElement(By.xpath(".."));
			String title = resultTitle.getAttribute("href");

			System.out.println(title);
		}

		driver.quit();

	}

}
