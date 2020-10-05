Feature: Orange hrm login feature
@keya
Scenario Outline: User should be able to login with valid credentials
Given User on home page
And Wait for "3" seconds
When User enters user name in user name filed"<username>"
And Wait for "2" seconds
And User enters password in password filed"<password>"
And Wait for "5" seconds
And User clicks on login button
Then User should sucessfully login and dashboard should display
And Wait for "10" seconds

Examples:
|username|password|
|admin|admin123|

