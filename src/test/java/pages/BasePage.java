package pages;

import driver.FactoryDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;

/**
 * This class is used to initialize PageFactory elements 
 * 
 */
public class BasePage {

	protected BasePage() {
		PageFactory.initElements(FactoryDriver.getInstance(), this);
	}

	@FindBy(xpath = "//button[@class='cookie-popup-with-overlay__button']")
	private WebElement cookie;
	@FindBy(xpath = "//span[contains(text(),'Log in')]")
	private WebElement loginLink;

	public void clickLoginLinkFromMainPage() {
		LogUtils.logInfo("Click 'Log in' ");
		loginLink.click();
	}

	public void clickCookie() {
		LogUtils.logInfo("Click Allow");
		cookie.click();
	}

}
