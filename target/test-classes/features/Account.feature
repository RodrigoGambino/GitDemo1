Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User sing up with following details
| jenny | abcd | john@abcd.com | Australia | 321315 |
Then Home page is populated
And Cards displayed are "false"

@PortalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with username <Username> and password <Password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username	|Password	|
|user1   	|pass1   	|
|user2		|pass2		|
|user3		|pass3		|
|user4		|pass4		|
