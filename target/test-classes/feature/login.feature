Feature: Validate Login Functionality 

Scenario: Verify successful login with valid credentials 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	When click on login button 
	Then validate user logged successfully 
	
Scenario: Verify Unsuccessful Login  using invlaid credentials 
	Given user launched site url 
	And user entered invalid username 
	And user entered invalid password 
	When click on login button 
	Then Validate error message 
	
Scenario: Verify errormsg when no Username is provided 
	Given user launched site url 
	When click on login button 
	Then Validate error message with no username 
	
Scenario: Verify errorme=sg when no passsword is provided 
	Given user launched site url 
	When click on login button 
	Then Validate error message with no password 
