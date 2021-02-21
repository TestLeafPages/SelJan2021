Feature: CreateLead functionality in LeafTaps
#Background:
#Given Open the chrome browser
#And Load the application URL as 'http://leaftaps.com/opentaps/control/main'

Scenario: Create Lead with only mandatory fields
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on Login button
Then HomePage should be displayed
When click on crmsfa link
And Click on Leads link
