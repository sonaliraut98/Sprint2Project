Feature: MyAccount

Scenario:successful open MyAccount Webpage
Given Initialize the browser with chrome
When Navigate to "http://uniformm1.upskills.in/" Site
And Click on Login link in home page to land on Secure in login Page
When User enters <Email> and <password> and logs in
Then Verify that user is succesfully open MyAccount Webpage
When Click on Edit your Account information link
Then Enter the Fax
And Click on Continue button
When Click on modify your wish list link
Then My wishlist page should be displayed
And Click on Continue button
    

#Examples:
#| Email                       | password   |
#|   sonaliraut0512@gmail.com  | Sonali@123 | 