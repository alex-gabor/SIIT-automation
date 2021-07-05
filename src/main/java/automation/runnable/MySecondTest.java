package automation.runnable;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
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
public class MySecondTest {

	@Test
	public void mySecondTest() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://siit.epizy.com/shop/");

		WebElement element = driver.findElement(By.xpath("//a[text()='Your Store']"));

		element.click();

		WebElement searchBox = driver.findElement(By.name("search")); // By.xpath("//*[@name='search']")

		searchBox.sendKeys("phone");

		WebElement btnSearch = driver.findElement(By.xpath("//div[@id='search']//button"));

		btnSearch.click();

		WebDriverWait w = new WebDriverWait(driver, 10);

		WebElement result = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4/a[@href]")));

		result.click();

		driver.quit();

	}

}
