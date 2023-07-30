Feature: Verifying checkout functionality 
Scenario: Verifying checkout button 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	When click on login button 
	And click on a product 
	And click on add to cart button 
	And Click on cartbtn 
	And Click on Checkout Button 
	Then Validate Checkout Page 
	And user enters "rounik" "raj" "201102"