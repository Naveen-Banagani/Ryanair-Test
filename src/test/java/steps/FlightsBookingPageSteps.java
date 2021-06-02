package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.FlightsBookingPage;

/***
 * This class contains Flights Booking steps
 */
public class FlightsBookingPageSteps {

	private FlightsBookingPage page;

	public FlightsBookingPageSteps() {
		page = new FlightsBookingPage();
	}

	@When("^I choose a flight$")
	public void iChooseFlight() {
		page.clickselectFlight();
	}

	@When("^I choose fare package 'Standard Fare'$")
	public void iChooseStandardFare() throws InterruptedException {
		Thread.sleep(5000);
		page.clickvalueFare();

	}

	@When("^I book available flight$")
	public void iBookFlight() throws InterruptedException {
		iChooseFlight();
		iChooseStandardFare();
	}

	@When("^I fill in adult passenger details Mr '([^\"]*)' and '([^\"]*)'$")
	public void iFillInAdultPassengerDetails(String name, String lastName) {
		page.clicktitle1dropdown1();
		page.clickTitle1();
		page.firstName1(name);
		page.lastName1(lastName);
	}

	@When("^I fill in second adult passenger details Mr '([^\"]*)' and '([^\"]*)'$")
	public void iFillInSecondAdultPassengerDetails(String name, String lastName) {
		page.clicktitle1dropdown2();
		page.clickTitle2();
		page.firstName2(name);
		page.lastName2(lastName);
		
	}

	@When("^I fill in child passenger details '([^\"]*)' and '([^\"]*)'$")
	public void iFillInChildPassengerDetails(String firstname, String lastname) {
		page.childfirstName(firstname);
		page.childlastName(lastname);
		page.clickContinue();
	}
}
