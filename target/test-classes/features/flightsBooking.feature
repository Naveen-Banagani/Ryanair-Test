@flights_booking
Feature: Booking a flight on www.ryanair.com
	As a user
	I want to be able to book a flight
	On www.ryanair.com

  Scenario: Booking up to a declined payment on
		Given I am on main page
        And I log in to personal account
		When I make a search for booking from 'Dublin' to 'Manchester'  for 2 adults 
		And I book available flight
		And I fill in adult passenger details Mr 'Naveen' and 'Banagani'
		And I fill in second adult passenger details Mr 'Rya' and 'Nair'
		And I fill in child passenger details 'Mark' and 'Smith'
		And I select seats for passengers
		And I checkout my booking
		And I fill in contact details phone number '678678678'
		And I fill in card details '5555555555555557', '267' and 'Naveen Banagani'
		And I fill in billing address details '24 Newtons street' and city 'Galway'
		And I pay for booking
		Then I should get payment declined message