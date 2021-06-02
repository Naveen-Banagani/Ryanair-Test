package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FlightsBookingPaymentPage;

/***
 * This class contains Booking Payment steps
 */
public class FlightsBookingPaymentPageSteps {

	private FlightsBookingPaymentPage page;

	public FlightsBookingPaymentPageSteps() {
		page = new FlightsBookingPaymentPage();
	}

	@When("^I fill in contact details phone number '([^\"]*)'$")
	public void iFillInContactDetails(String phoneNumber) throws InterruptedException {
		page.fillMobileNumber(phoneNumber);
		page.InsuranceCheckBox();

	}

	@When("^I fill in card details '([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
	public void iFillInCardDetailsVisaAndJohnSmith(String cardNumber, String code, String holderName) {
		page.fillCardNumber(cardNumber);
		page.chooseExpiryMonth();
		page.chooseExpiryYear();
		page.fillSecurityCode(code);
		page.fillCardHolderName(holderName);
	}

	@When("^I fill in billing address details '([^\"]*)' and city '([^\"]*)'$")
	public void iFillInBillingAddressDetails(String address, String city) {
		page.fillAddress(address);
		page.fillCity(city);
		page.countryDropDown();
		page.zipCode();
	}

	@When("^I pay for booking$")
	public void iPayForBooking() {
		page.clickCurrencyDropDown();
		page.acceptTerms();
		page.payNowButton();
	}

	@Then("^I should get payment declined message$")
	public void iGetPaymentDeclinedMessage() {
		page.waitUntilPaymentErrorIsDisplayed();
	}
}
