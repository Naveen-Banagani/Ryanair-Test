package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import junit.framework.Assert;
import utils.ExplicitWait;
import utils.LogUtils;
import utils.ScrollUtils;
import java.util.List;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

/***
 * This class describes Flights Booking Payment Page PageFactory is used for
 * Page Object It adds lazy evaluation which means that Page Element is
 * initialized only when it's called by method instead of instant initialization
 * when object of page is created
 */
public class FlightsBookingPaymentPage extends BasePage {

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement mobileNumber;

	@FindBy(xpath = "(//input[@name='undefined'])[2]")
	private WebElement cardNumber;

	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/div[1]/add-method-modal[1]/form[1]/div[1]/div[1]/div[1]/div[2]/card-details[1]/form[1]/expiry-date[1]/div[1]/span[2]/div[1]/ry-dropdown[1]/div[1]/button[1]")
	private WebElement expiryMonthDropdown;

	@FindBy(xpath = "//div[contains(text(),'June')]")
	private WebElement expiryMonthDropDownList;

	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/div[1]/add-method-modal[1]/form[1]/div[1]/div[1]/div[1]/div[2]/card-details[1]/form[1]/expiry-date[1]/div[1]/span[2]/div[2]/ry-dropdown[1]/div[1]/button[1]")
	private WebElement expiryYearDropdown;

	@FindBy(xpath = "//div[contains(text(),'2024')]")
	private WebElement expiryYearDropDownList;

	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/div[1]/add-method-modal[1]/form[1]/div[1]/div[1]/div[1]/div[2]/card-details[1]/form[1]/verification-code[1]/div[1]/span[1]/ry-input-d[1]/div[1]/input[1]")
	private WebElement securityCode;

	@FindBy(xpath = "(//input[@name='undefined'])[4]")
	private WebElement cardHolderName;

	@FindBy(xpath = "(//input[@name='undefined'])[5]")
	private WebElement addressLine1;

	@FindBy(xpath = "(//input[@name='undefined'])[7]")
	private WebElement city;

	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/div[1]/add-method-modal[1]/form[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-autocomplete[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement countryDropDown;

	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/div[1]/add-method-modal[1]/form[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-autocomplete[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement countrylist;

	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/ry-spinner[1]/div[1]/payment-form[1]/form[1]/div[5]/payment-methods[1]/div[1]/div[1]/ry-tabs[1]/div[2]/div[1]/add-method-modal[1]/form[1]/div[1]/div[1]/div[2]/billing-address[1]/address-form[1]/form[1]/ry-input-d[4]/div[1]/input[1]")
	private WebElement zipCode;

	@FindBy(xpath = "//terms-and-conditions/div/div/ry-checkbox/label/div/div")
	private WebElement termsCheckBox;

	@FindBy(xpath = "//button[contains(text(),'Pay now')]")
	private WebElement payNowButton;

	@FindBy(xpath = "//div[3]/div/ry-checkbox/label/div/div")
	private WebElement insuranceCheckBox;

	@FindBy(xpath = "//span[contains(text(),'Select a currency')]")
	private WebElement currencyDropDown;

	@FindBy(xpath = "(//ry-dropdown-item[@class='ng-star-inserted'])[1]")
	private WebElement selectCurrency;

	@FindBy(xpath = "//div[contains(text(),'Transaction could not be processed.')]")
	private WebElement paymentErrorMessage;

	public void fillMobileNumber(String phoneNumber) {
		LogUtils.logInfo(String.format("Fill 'Phone number' with '%s'", phoneNumber));
		this.mobileNumber.sendKeys(phoneNumber);
	}

	public void fillCardNumber(String cardNumber) {
		LogUtils.logInfo(String.format("Fill 'Card number' with '%s'", cardNumber));
		this.cardNumber.sendKeys(cardNumber);
	}

	public void chooseExpiryMonth() {
		LogUtils.logInfo("Open 'Expiry Month' dropdown");
		expiryMonthDropdown.click();
		expiryMonthDropDownList.click();
	}

	public void chooseExpiryYear() {
		LogUtils.logInfo("Open 'Expiry Year' dropdown");
		expiryYearDropdown.click();
		expiryYearDropDownList.click();

	}

	public void fillSecurityCode(String code) {
		LogUtils.logInfo(String.format("Fill 'Security code' with '%s'", code));
		securityCode.sendKeys(code);
	}

	public void fillCardHolderName(String holderName) {
		LogUtils.logInfo(String.format("Fill 'Card Holder Name' with '%s'", holderName));
		cardHolderName.sendKeys(holderName);
	}

	public void fillAddress(String address) {
		LogUtils.logInfo(String.format("Fill 'Address Line 1' with '%s'", address));
		addressLine1.sendKeys(address);
	}

	public void fillCity(String city) {
		LogUtils.logInfo(String.format("Fill 'City' with '%s'", city));
		this.city.sendKeys(city);
	}

	public void acceptTerms() {

		LogUtils.logInfo("Accept General terms");
		termsCheckBox.click();
	}

	public void clickCurrencyDropDown() {

		LogUtils.logInfo("Select Currency");
		currencyDropDown.click();
		selectCurrency.click();
	}

	public void clickPayNowButton() {
		LogUtils.logInfo("Click 'Pay Now' button");
		payNowButton.click();
	}

	public void countryDropDown() {
		LogUtils.logInfo("click on country dropdown");
		countrylist.sendKeys("Ireland");
		countrylist.sendKeys(Keys.ENTER);

	}

	public void zipCode() {
		LogUtils.logInfo("Enter Zip Code");
		zipCode.clear();
		zipCode.sendKeys("H91ET22");

	}

	public void InsuranceCheckBox() throws InterruptedException {
		LogUtils.logInfo("Insurance CheckBox");
		Thread.sleep(3000);
		insuranceCheckBox.click();

	}

	public void payNowButton() {
		LogUtils.logInfo("Click on PayNow Button");
		payNowButton.click();

	}

	public void waitUntilPaymentErrorIsDisplayed() {
		ExplicitWait.visibilityOfElement(paymentErrorMessage);
		String message = paymentErrorMessage.getText();
		System.out.println(message);
		Assert.assertEquals(
				"Transaction could not be processed. Your payment was not authorised therefore we could not complete your booking. Please ensure that the information was correct and try again or use a new payment card.",
				message);
	}

}
