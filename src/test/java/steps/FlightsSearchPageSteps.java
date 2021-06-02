package steps;

import cucumber.api.java.en.When;
import pages.FlightsSearchPage;

/***
 * This class contains FlightsSearchPage steps
 */
public class FlightsSearchPageSteps {

	private FlightsSearchPage page;

	public FlightsSearchPageSteps() {
		page = new FlightsSearchPage();
	}

	@When("^I choose flight type One Way$")
	public void iChooseFlightTypeOneWay() {
		page.clickOneWayTrip();
	}

	@When("^I enter Departure airport '([^\"]*)' and Destination airport '([^\"]*)'$ on 12/06/2021")
	public void iEnterAirportDetails(String fromAirport, String toAirport) {
		page.fillDepartureAirport(fromAirport);
		page.fillDestinationAirport(toAirport);
		page.manchester();
		page.fillFlyOutDay();
	}

	@When("^I add adult passenger$")
	public void iAddAdultPassenger() {
		page.addAdultPassenger();
		page.addChildPassenger();

	}

	@When("^I proceed by clicking ‘Let’s go’$")
	public void iProceedByClickingLetsGo() {
		page.clickSearchButton();
	}

	@When("^I make a search for booking from '([^\"]*)' to '([^\"]*)'  for 2 adults")
	public void iMakeFlightSearch(String fromAirport, String toAirport) {
		iChooseFlightTypeOneWay();
		iEnterAirportDetails(fromAirport, toAirport);
		iAddAdultPassenger();
		iProceedByClickingLetsGo();
	}

}
