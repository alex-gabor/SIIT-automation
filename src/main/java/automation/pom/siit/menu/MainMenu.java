package automation.pom.siit.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.pom.AbstractPageObject;
import automation.pom.siit.BlogPage;
import automation.pom.siit.CommunityPage;
import automation.pom.siit.ContactPage;
import automation.pom.siit.PodcastPage;
import automation.pom.siit.ProgramsPage;
import automation.pom.siit.StudentGuidePage;
import automation.pom.siit.TestCenterPage;

/**
 * Page object class that describes the main menu
 * 
 * @author alexgabor
 *
 */
public class MainMenu extends AbstractPageObject {

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Programe']")
	private WebElement programs;

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Ghidul cursantului']")
	private WebElement guide;

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Comunitate']")
	private WebElement community;

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Centru de testare']")
	private WebElement testCenter;

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Podcast']")
	private WebElement podcast;

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Blog']")
	private WebElement blog;

	@FindBy(xpath = "//ul[@class='nav navbar-nav menu-main-menu']//a[@href and .='Contact']")
	private WebElement contact;

	public MainMenu(WebDriver driver) {
		super(driver);
	}

	/**
	 * Navigate to Programs page
	 * 
	 * @return
	 */
	public ProgramsPage goToProgramsPage() {

		programs.click();

		return new ProgramsPage(driver);
	}

	/**
	 * Navigate to Test Guide page
	 * 
	 * @return
	 */
	public StudentGuidePage goToStudentGuidePage() {

		guide.click();

		return new StudentGuidePage(driver);
	}

	/**
	 * Navigate to Community page
	 * 
	 * @return
	 */
	public CommunityPage goToCommunityPage() {

		community.click();

		return new CommunityPage(driver);
	}

	/**
	 * Navigate to Blog page
	 * 
	 * @return
	 */
	public BlogPage goToBlogPage() {

		blog.click();

		return new BlogPage(driver);
	}

	/**
	 * Navigate to Testing Center page
	 * 
	 * @return
	 */
	public TestCenterPage goToTestCenterPage() {

		testCenter.click();

		return new TestCenterPage(driver);
	}

	/**
	 * Navigate to Podcast page
	 * 
	 * @return
	 */
	public PodcastPage goToPodcastPage() {

		podcast.click();

		return new PodcastPage(driver);
	}

	/**
	 * Navigate to Contact page
	 * 
	 * @return
	 */
	public ContactPage goToContactPage() {

		contact.click();

		return new ContactPage(driver);
	}

}
