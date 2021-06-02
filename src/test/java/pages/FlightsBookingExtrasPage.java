package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

public class FlightsBookingExtrasPage extends BasePage {

	@FindBy(xpath = "//body/bags-root[1]/bags-booking-container[1]/div[1]/main[1]/div[1]/section[1]/div[1]/bags-cabin-lazy-bag[1]/bags-cabin-bag-section[1]/bags-bag-layout[1]/div[1]/div[3]/div[2]/bags-pax-table-journey-container[1]/div[1]/div[1]/bags-cabin-bag-table-controls-container[1]/bags-cabin-bag-table-controls[1]/div[1]/bags-small-bag-pax-control[1]/div[1]/bags-product-selector[1]/div[1]/div[1]/div[1]/ry-radio-circle-button[1]/label[1]")
	private WebElement checkRadioButton;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement continueButton;

	@FindBy(xpath = "//ry-header/div[1]/div[3]/div[2]/div[1]/ng-component[1]/ry-basket-total-container[1]/ry-basket-total[1]/div[1]/div[1]/div[3]/icon[1]")
	private WebElement cart;

	@FindBy(xpath = "//button[contains(text(),'Check out')]")
	private WebElement checkout;

	public void clickRadioButton() {
		LogUtils.logInfo("Click radio button");
		ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
		checkRadioButton.click();
	}

	public void clickContinueButton() {
		LogUtils.logInfo("Click continue button");
		ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
		continueButton.click();
	}

	public void clickCart() {
		LogUtils.logInfo("Click on cart");
		ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
		cart.click();
	}

	public void clickCheckout() {
		LogUtils.logInfo("Click on cart");
		ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
		checkout.click();
	}

}
