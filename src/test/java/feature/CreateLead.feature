Feature: Verify the Create Lead functionality

@now
Scenario Outline: Create Lead


Given Enter username as 'Demosalesmanager'
Given Enter password as 'crmsfa'
Given Click on login button
Then Verify navigate to homepage
Then Click on crmsfa link
Then Click on Create Lead
Then Enter Company name as <companyname>
Then Enter First name as <firstname>
Then Enter Last name as <lastname>
Then Clic on CreateLead
Then Verify lead is created 

Examples:
|companyname|firstname|lastname|
|Petchi&Co|Petchimuthu|Kasimani|