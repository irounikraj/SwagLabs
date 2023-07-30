Feature: Verifying cart functionality 
Scenario: Verify cart btn 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	When click on login button 
	And Click on cartbtn 
	Then Validate cart page
	