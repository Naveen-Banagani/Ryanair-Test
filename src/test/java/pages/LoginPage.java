package pages;

import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

/***
 * This class describes Login Page PageFactory is used for Page Object It adds
 * lazy evaluation which means that Page Element is initialized only when it's
 * called by method instead of instant initialization when object of page is
 * created
 */
public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement loginButton;

	public void logIn(User user) {
		String username = user.getUsername();
		LogUtils.logInfo(String.format("Fill 'Email address' with '%s'", username));
		email.sendKeys(username);
		LogUtils.logInfo("Fill 'Password' with '***********'");
		password.sendKeys(user.getPassword());
		LogUtils.logInfo("Click 'Log in' button");
		loginButton.click();
		ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
	}
}
