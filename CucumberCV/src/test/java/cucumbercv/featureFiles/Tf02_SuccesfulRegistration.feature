Feature: Successful registration of a user
User should be able to register  successfully

Scenario: Successful registration

	Given User navigates to CVcreation website
	And User clicks on Resgister toggle button
	And User enters desired Username "badal@cool"
	And User enters a valid email Id "badalharsh@email.com"
	And User enters desired Password "badal123"
	When User clicks on Register button
	Then User should get sucessfully registered   
