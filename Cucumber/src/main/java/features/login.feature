Feature: Login to the application

Scenario: Login test scenario 
	Given user is on login page
	When user enters userID and password
	Then user clicks on login button
	
Scenario Outline: User using scenario outline
	Given user is on the login page
	When user enters "<username>" and "<password>"
	Then user clicks on the login button
	
Examples:
	|username| password|
	|testUser| testPassword|
	

Scenario: User is able to use data provider
	Given user is able to login
	When user enters username and password
			|testUser1|testPassword1|
	Then user clicks on login button
	
	