$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EditAddressentity.feature");
formatter.feature({
  "line": 1,
  "name": "Edit Addressed book",
  "description": "",
  "id": "edit-addressed-book",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "sucessfull update the information",
  "description": "",
  "id": "edit-addressed-book;sucessfull-update-the-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "initilize browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "navigate to \"http://uniformm1.upskills.in/\"",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Click on Address Book link  in home page to land on Webpage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters\u003ccompany\u003e, \u003caddress2\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on yes or no",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "And "
});
formatter.uri("Editinformation.feature");
formatter.feature({
  "line": 1,
  "name": "edit account information",
  "description": "",
  "id": "edit-account-information",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "sucessfull edit information",
  "description": "",
  "id": "edit-account-information;sucessfull-edit-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "initilize browser with chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "navigate to \"http://uniformm1.upskills.in\" site",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Click on profile",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on My Account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enter \u003cE-mail address\u003e,\u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Edit your information",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter \u003cTelephone\u003e and \u003cLast name\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify you get\u003cSuccess: Your account has been successfully updated.\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
});