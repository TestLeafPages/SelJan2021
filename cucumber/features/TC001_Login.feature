Feature: Login functionality of LeafTaps application

#Background:
#Given Open the chrome browser
#And Load the application URL as 'http://leaftaps.com/opentaps/control/main'

Scenario Outline: login with correct credentials
Given Enter username as <username>
And Enter password as <password>
When Click on Login button
Then HomePage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: login with incorrect credentials
Given Enter username as 'DemoCSR'
And Enter password as 'crmsfa123'
When Click on Login button
But Error message should be displayed
