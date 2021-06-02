package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/***
 * This class describes Flights Booking Page PageFactory is used for Page Object
 * It adds lazy evaluation which means that Page Element is initialized only
 * when it's called by method instead of instant initialization when object of
 * page is created
 */
public class FlightsBookingPage extends BasePage {

	@FindBy(xpath = "//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-content[1]/flights-summary-container[1]/flights-summary[1]/div[1]/div[1]/journey-container[1]/journey[1]/flight-list[1]")
	private WebElement selectFlight;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement continueButton;

	@FindBy(xpath = "//fare-card")
	private WebElement valueFare;

	@FindBy(xpath = "//div[@class='dropdown b2']")
	private WebElement titledropdown1;

	@FindBy(xpath = "//ry-dropdown-item[@data-ref='title-item-0']")
	private WebElement clickTitle1;

	@FindBy(xpath = "//input[@id='formState.passengers.ADT-0.name']")
	private WebElement firstName1;

	@FindBy(xpath = "//input[@id='formState.passengers.ADT-0.surname']")
	private WebElement lastName1;

	@FindBy(xpath = "//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-content[1]/flights-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[2]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-dropdown[1]/div[2]/button[1]")
	private WebElement titledropdown2;

	@FindBy(xpath = "//body/flights-root[1]/div[1]/div[1]/div[1]/div[1]/flights-lazy-content[1]/flights-passengers[1]/pax-app-container[1]/pax-app[1]/ry-spinner[1]/div[1]/div[1]/div[2]/pax-app-form-container[1]/pax-app-form[1]/form[1]/pax-passenger-container[2]/pax-passenger[1]/div[1]/pax-passenger-details-container[1]/pax-passenger-details[1]/pax-passenger-details-form-container[1]/pax-details-form[1]/ry-dropdown[1]/div[2]/div[1]/div[1]/ry-dropdown-item[1]/button[1]")
	private WebElement clickTitle2;

	@FindBy(xpath = "//input[@id='formState.passengers.ADT-1.name']")
	private WebElement firstName2;

	@FindBy(xpath = "//input[@id='formState.passengers.ADT-1.surname']")
	private WebElement lastName2;

	@FindBy(id = "formState.passengers.CHD-0.name")
	private WebElement childfirstName;

	@FindBy(id = "formState.passengers.CHD-0.surname")
	private WebElement childlastName;

	public void clickselectFlight() {

		selectFlight.click();
	}

	public void clickvalueFare() {

		valueFare.click();
	}

	public void clicktitle1dropdown1() {

		titledropdown1.click();
	}

	public void clicktitle1dropdown2() {

		titledropdown2.click();
	}

	public void clickTitle1() {

		clickTitle1.click();
	}

	public void clickTitle2() {

		clickTitle2.click();
	}

	public void firstName1(String name) {

		firstName1.sendKeys(name);
	}

	public void firstName2(String name) {

		firstName2.sendKeys(name);
	}

	public void lastName1(String lastname) {

		lastName1.sendKeys(lastname);
	}

	public void lastName2(String lastname) {

		lastName2.sendKeys(lastname);
	}

	public void childfirstName(String firstname) {

		childfirstName.sendKeys(firstname);
	}

	public void childlastName(String lastname) {

		childlastName.sendKeys(lastname);
	}

	public void clickContinue() {

		continueButton.click();
	}
}
