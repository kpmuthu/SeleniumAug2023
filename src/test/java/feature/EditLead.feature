Feature: Verify the Create Lead functionality
@Edit
Scenario Outline: Edit Lead

Given Enter username as 'Demosalesmanager'
Given Enter password as 'crmsfa'
Given Click on login button
Then Verify navigate to homepage
Then Click on crmsfa link
Then Click on Lead
Then click on findLeads
Then Enter firstname as <firstname>
Then click on find leads button
Then click on first record from search result
Then click on Edit button
Then update the company name <companyname>
Then click on update
Then verify the company name is updated

Examples:
|firstname|companyname|
|'Petchimuthu'|Petchi&CO|
