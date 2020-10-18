package automation.pom.siit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import automation.core.WaitElement;

/**
 * Page object class that describes the Programs page
 * 
 * @author alexgabor
 *
 */
public class ProgramsPage extends AbstractBaseWebsitePage {

	@FindBy(xpath = "//button[@class='mgbutton moove-gdpr-infobar-allow-all']")
	private WebElement acceptCookies;

	@FindBy(xpath = "//form[@name='course-external-link']/button")
	private WebElement apply;

	@FindBy(id = "selectCity")
	private WebElement city;

	public ProgramsPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * Apply to course
	 *
	 * @param city
	 *        the city where to apply for the course
	 */
	public void applyToCourse(String city) {
		
		apply.submit();
		
		WaitElement w = new WaitElement();

		w.waitUntil(ExpectedConditions.visibilityOf(this.city), 5);

		Select selectCity = new Select(this.city);
		
		selectCity.selectByVisibleText(city);
	}

	/**
	 * Accept all cookies
	 */
	public void acceptCookies() {
		acceptCookies.click();
	}

}
