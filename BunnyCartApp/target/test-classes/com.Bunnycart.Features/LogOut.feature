Feature:
Scenario: To check sign out and verfy session ends
Given User opens to Browser
And User navigates to the "https://www.bunnycart.com/" webpage
And User click on sign in
And User enters valid '<Email>' email 
And User enters valid '<Password>' password 
And User click on sign in button
And User click on signOut button
And User verifies the seession ends
And User close browser

Examples:
|Email                      |Password|
|saikrishnabadisa4@gmail.com|Test#123|