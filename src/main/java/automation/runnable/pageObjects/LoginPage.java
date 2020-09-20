package automation.runnable.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.pom.AbstractPageObject;

/**
 * @author alexgabor
 *
 */
public class LoginPage extends AbstractPageObject {

	@FindBy(how = How.ID, using = "input-email")
	private WebElement userNameField;

	@FindBy(how = How.ID, using = "input-password")
	private WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(how = How.CSS, using = ".alert.alert-danger.alert-dismissible")
	private WebElement generalError;

	public LoginPage(WebDriver driver) {

		super(driver);
	}

	public void login(String user, String password) {

		userNameField.clear();
		userNameField.sendKeys(user);

		passwordField.clear();
		passwordField.sendKeys(password);
		
		loginButton.click();
		loginButton.click();
	}

	public String getGeneralErrorText() {

		return generalError.getText();
	}
}

