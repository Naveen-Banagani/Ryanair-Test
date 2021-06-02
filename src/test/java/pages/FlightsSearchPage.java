package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

/***
 * This class describes Flights Search Page PageFactory is used for Page Object
 * It adds lazy evaluation which means that Page Element is initialized only
 * when it's called by method instead of instant initialization when object of
 * page is created
 */
public class FlightsSearchPage extends BasePage {

	@FindBy(xpath = "//label[contains(text(),'One way')]")
	private WebElement oneWayTrip;

	@FindBy(xpath = "//input[@id='input-button__departure']")
	private WebElement departureAirport;

	@FindBy(xpath = "//input[@id='input-button__destination']")
	private WebElement destinationAirport;

	@FindBy(xpath = "//button[contains(text(),'Clear selection')]")
	private WebElement clear;

	@FindBy(xpath = "//span[contains(text(),'Manchester')]")
	private WebElement manchester;

	@FindBy(xpath = "//button[@data-ref='flight-search-widget__cta']")
	private WebElement searchButton;

	@FindBy(xpath = "//div[@data-id='2021-06-12']")
	private WebElement flyOutDay;

	@FindBy(xpath = "//div[contains(text(),'1 Adult')]")
	private WebElement passengersDropDown;

	@FindBy(xpath = "//div[@data-ref='counter.counter__increment']")
	private WebElement addAdultPassengerButton;

	@FindBy(xpath = "//ry-counter[3]/div[2]/div[3]")
	private WebElement addChildPassengerButton;

	public void clickOneWayTrip() {
		LogUtils.logInfo("Click 'One Way' trip");
		oneWayTrip.click();
	}

	public void fillDepartureAirport(String fromAirport) {
		LogUtils.logInfo(String.format("Fill departure airport '%s'", fromAirport));
		departureAirport.click();
		clear.click();
		departureAirport.sendKeys(fromAirport);
	}

	public void fillDestinationAirport(String toAirport) {
		LogUtils.logInfo(String.format("Fill destination airport '%s'", toAirport));
		destinationAirport.clear();
		destinationAirport.sendKeys(toAirport);
	}

	public void fillFlyOutDay() {

		flyOutDay.click();
	}

	public void manchester() {

		manchester.click();
	}

	public void addAdultPassenger() {
		LogUtils.logInfo("Add adult passenger");
		// ExplicitWait.visibilityOfElement(addAdultPassengerButton);
		addAdultPassengerButton.click();

	}

	public void addChildPassenger() {
		LogUtils.logInfo("Add adult passenger");
		// ExplicitWait.visibilityOfElement(addAdultPassengerButton);
		addChildPassengerButton.click();

	}

	public void clickSearchButton() {
		LogUtils.logInfo("Click 'Search' button");
		searchButton.click();
	}
}
