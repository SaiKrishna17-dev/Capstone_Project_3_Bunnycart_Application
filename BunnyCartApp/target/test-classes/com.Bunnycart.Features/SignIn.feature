Feature: Sign with Valid and Invalid Data

Scenario: SignIn with valid and invalid details

Given User open the Browser
And User navigate to the "https://www.bunnycart.com/" webpage
And User click on Sign in
Then User enter the "<Email>" as email
And User enter the "<Password>" as password
Then User click on Sign in button
And User verify the message
And User closes browser

Examples:
|Email                      |Password|
|saikrishnabadisa4@gmail.com|Test@123| # Wrong password to get  Error
|saikrishnabadisa4@gmail.com|Test#123| # Correct password