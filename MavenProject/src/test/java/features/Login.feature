Feature: Leaftaps login functionality

Background: 

Given Open the chrome browser
And Load the application Url 


Scenario Outline: Test login functionality with positive credential
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
And Quit

Examples: 
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


