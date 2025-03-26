Feature: Adding Multiple Products to cart

Scenario: Add Multiple Products to cart

Given User opens to the Browser
And User navigates to the "https://www.bunnycart.com/" webpage
And User clicks on signin
And User enters valid '<Email>' email
And User enters valid '<Password>' password
And User click on signin button
When User Search for product1 "Aquatic" in search textbox
And User select product1 from the search results
And User click on Add to cart for product1
When User Search for product2 "Money" in search textbox
And User select product2 from the search results
And User selects type of the product2
And User click on Add to cart for product2
And User closes the Browser

Examples:
|Email                      |Password|
|saikrishnabadisa4@gmail.com|Test#123|