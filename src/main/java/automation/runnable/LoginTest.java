package automation.runnable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;

import automation.core.SeleneseTest;

/**
 * @author alexgabor
 *
 */
public class LoginTest extends SeleneseTest {

	@Test
	public void loginTest() {

		// String username = "SomeUser";
		// String password = "somePassword";
		// String expectedGeneralError = "Warning: No match for E-Mail Address and/or Password.";
		//
		// LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
		//
		// // LoginPage loginPage = new LoginPage(getWebDriver());
		//
		// loginPage.login(username, password);
		//
		// String actualGeneralError = loginPage.getGeneralErrorText();
		//
		// Assert.assertEquals("Checking general error", expectedGeneralError, actualGeneralError);

		By loginLocator = By.xpath("//input[@value='Login']");

		WebElement btnLogin = getWebDriver().findElement(loginLocator);

		btnLogin.click();

		btnLogin = getWebDriver().findElement(loginLocator);

		btnLogin.click();
	}

	// @Test
	public void displayCookiesTest() {

		Cookie cookie = new Cookie("myCookie", "My cookie value");

		Options options = getWebDriver().manage();

		options.addCookie(cookie);

		Cookie c = options.getCookieNamed("myCookie");
		Cookie c2 = options.getCookieNamed("language");

		System.out.println("Cookie name: " + c.getName());
		System.out.println("Cookie value: " + c.getValue());

		System.out.println("Cookie name: " + c2.getName());
		System.out.println("Cookie value: " + c2.getValue());

		// Set<Cookie> setOfCookies = getWebDriver().manage().getCookies();
		//
		// System.out.println("Found " + setOfCookies.size() + " cookies");
		//
		// for (Cookie c : setOfCookies) {
		// System.out.println("Cookie name: " + c.getName());
		// System.out.println("Cookie value: " + c.getValue());
		// }


	}

}
