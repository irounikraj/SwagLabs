Feature: Verify LeftSideButton on PLPPage 
Scenario: Verifying leftsidebutton on PLPPage 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	And click on login button 
	Then click on leftsidebutton on PLPPage 
	Then validate options available 
Scenario: Verify All Items btn is working 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	And click on login button 
	Then click on leftsidebutton on PLPPage 
	And click on AllItems btn 
	Then validate product page 
	
Scenario: Verify About btn is working 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	And click on login button 
	Then click on leftsidebutton on PLPPage 
	And click on About btn 
	Then validate about page 
	
Scenario: Verify Logout btn is working 
	Given user launched site url 
	And user entered valid username 
	And user entered valid password 
	And click on login button 
	Then click on leftsidebutton on PLPPage 
	And click on Logout btn 
	Then validate logout 
	
	
	