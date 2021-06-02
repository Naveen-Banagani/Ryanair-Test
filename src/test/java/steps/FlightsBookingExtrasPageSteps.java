package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingExtrasPage;

/***
 * This class contains Booking Extras steps
 */
public class FlightsBookingExtrasPageSteps {

	@When("^I checkout my booking$")
	public void iCheckoutMyBooking() {
		FlightsBookingExtrasPage page = new FlightsBookingExtrasPage();
		page.clickRadioButton();
		page.clickContinueButton();
		page.clickContinueButton();
		page.clickCart();
		page.clickCheckout();
	}
}
