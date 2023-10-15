Feature: Validate login function for Leaftab functionslity

Scenario: Login functionality positive validation
Given Enter username as 'Demosalesmanager'
Given Enter password as 'crmsfa'
Given Click on login button
Then Verify navigate to homepage

Scenario: Login functionality Negative validation
Given Enter username as 'Demosales'
Given Enter password as 'crmsfa'
Given Click on login button
Then Verify the error message

