

Feature: EditAddressBook
 
Scenario: Edit the Address Book
Given Initialize the browser with chrome
When Navigate to "http://uniformm1.upskills.in/" Site
And Click on Login link in home page to land on Secure in login Page
When User enters <Email> and <password> and logs in
Then Verify that user is succesfully open MyAccount Webpage
When i click on Edit Address link
Then Address page is open
And click on Edit button
When User enters <company> and <Region> 
Then click on continue button
And close the brower
