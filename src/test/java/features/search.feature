Feature: Search and place order for Vegetables

@SmokeTest
Scenario: Search for items and validate results
Given User is on Greencart landing page
When User searched for Cucumber Vegetable
Then "Cucumber" result are displayed

@RegressionTest
Scenario Outline: Search for items and move to checkout page
Given User is on Greencart landing page
When User searched for <Name> Vegetable
And Added items to cart
And User proceed to Checkout page
Then Verify selected <Name> items are display in Checkout page

Examples:
|Name	   | 
|Brinjal |
|Beetroot|