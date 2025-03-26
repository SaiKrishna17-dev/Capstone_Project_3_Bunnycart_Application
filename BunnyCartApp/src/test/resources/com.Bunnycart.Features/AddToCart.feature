Feature: Login and Add to Cart

Scenario: To sign in and add a product to cart

Given User opens the Browser
And User navigates to the "https://www.bunnycart.com/" webpage
Then User clicks on Sign in
And User enters the "<Email>" as email
And User enters the "<Password>" as password
And User clicks on Sign in button
And User search for a product
Then User selects a product
And User adds the product to cart
And User close the browser

Examples:
|Email                      |Password|
|saikrishnabadisa4@gmail.com|Test#123|