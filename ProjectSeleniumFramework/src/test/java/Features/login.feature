Feature: Login

Scenario: Successful login with valid credentials
			Given user Launch Chrome browser
			When user opens URL "https://admin-demo.nopcommerce.com/login"
			And enter Email as "admin@yourstore.com" and Password as "admin"
			And click on login
			Then page Title should be "Dashboard"
			When user click on the Log out link
			Then page Title should be "Your store.Login"
			And close browsers


