$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyAccount.feature");
formatter.feature({
  "line": 1,
  "name": "MyAccount",
  "description": "",
  "id": "myaccount",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "successful open MyAccount Webpage",
  "description": "",
  "id": "myaccount;successful-open-myaccount-webpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Initialize the browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to \"http://uniformm1.upskills.in/\" Site",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on Login link in home page to land on Secure in login Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters \u003cEmail\u003e and \u003cpassword\u003e and logs in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify that user is succesfully open MyAccount Webpage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Edit your Account information link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter the Fax",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on modify your wish list link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "My wishlist page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on Continue button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "StepDefination_Account.click_on_login_link_in_home_page_to_land_on_secure_in_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cEmail\u003e",
      "offset": 12
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 24
    }
  ],
  "location": "StepDefination_Account.user_enters_and_and_logs_in(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.verify_that_user_is_succesfully_open_myaccount_webpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.click_on_edit_your_account_information_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.enter_the_fax()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.click_on_modify_your_wish_list_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.my_wishlist_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination_Account.click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
});