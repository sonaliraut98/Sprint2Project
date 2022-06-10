Feature: 	Edit Addressed book 
Scenario Outline: sucessfull update the information
Given initilize browser with chrome
And navigate to "http://uniformm1.upskills.in/"
And Click on Address Book link  in home page to land on Webpage
And  user enters<company>, <address2>
And Click on yes or no
And Click on continue
And close the browser
