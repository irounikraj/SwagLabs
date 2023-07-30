Feature: Verifying plp page 
Scenario: Veifiying add to cart button is functioning 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	And click on login button 
	And click on a product 
	And click on add to cart button 
	Then validate price of product 
	Then validate product added to cart 
	
Scenario: veriifying all product clickable 

	And click on all product one by one 
	
Scenario: Verifying leftsidebutton on PLPPage 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	And click on login button 
	Then click on leftsidebutton on PLPPage 
	Then validate options available
	
	
	
	
