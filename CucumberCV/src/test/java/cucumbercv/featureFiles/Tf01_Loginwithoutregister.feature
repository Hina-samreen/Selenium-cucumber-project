Feature: Login into account without registering
User should not be able to login into account without registering himself first.

Scenario: Login to account with unregistered details
 Given User navigates to CVcreation website
 And User enters an unregistered username "rizika"
 And User enters an unregistered password "rizika123" 
 When User clicks on LogIn button 
 Then An error message should be displayed to the User         
       