package automation.core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.core.browser.BrowserSession;
import automation.core.logging.MessageLogger;

/**
 * Class used checking {@link WebElement} properties
 *
 * @author alexgabor
 *
 */
public class Verifier {

	private static final MessageLogger LOG = new MessageLogger(Verifier.class);

	/**
	 * Checks if a {@link WebElement} is present (visible) on the UI. This includes the verification whether the {@link WebElement} exists or not.
	 *
	 * @param locator
	 *        {@link By} locator of the element
	 *
	 * @return <code>true</code> if the {@link WebElement} is displayed on the interface; <code>false</code> otherwise
	 */
	public static boolean isVisible(By locator) {

		WebDriver driver = BrowserSession.getInstance().getWebDriver();
		List<WebElement> elementsList = driver.findElements(locator);

		if (elementsList.isEmpty()) {
			return false;
		}

		boolean isDisplayed = false;

		try {

			/*
			 * Need this iteration because sometimes there are multiple elements with the exact same debug id on the page.
			 * The 'visible' one must be picked.
			 */
			for (WebElement elt : elementsList) {

				isDisplayed = elt.isDisplayed();

				if (isDisplayed) {
					break;
				}
			}

		} catch (StaleElementReferenceException e) {

			LOG.warn("Got 'StaleElementReferenceException' (Element is no longer attached to the DOM), probably because the object seized to exist in the meanwhile.");
			LOG.warn("It is 100% safe as long as it's thrown from this particular function.");

			return isVisible(locator);
		}

		return isDisplayed;
	}

}