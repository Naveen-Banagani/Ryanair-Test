package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import pages.FlightsBookingSeatsSelectionPage;

public class FlightsBookingSeatsSelectionPageSteps {
	
	@When("^I select seats for passengers$")
	
	public void iSelectSeatsForPassengers() throws InterruptedException {
		
		FlightsBookingSeatsSelectionPage page = new FlightsBookingSeatsSelectionPage();
		//page.clickrandomSeat();
		//page.clickConfirmrandomSeat();
		page.closeFamilySeatingPopup();
		page.chooseConsecutiveSeats();
		page.addSeats();

	}
}
