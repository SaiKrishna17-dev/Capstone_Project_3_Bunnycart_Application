Feature: Create Account with Valid and Invalid Data

  Scenario: Creating Account
    Given User opens the browser
    And User navigates to "https://www.bunnycart.com/" webpage
    And User clicks on create an account button
    When User enters details using Excel file and clicks on create account button
    |RigisterData.xlsx|
    Then User verifies the message
    And User closes the browser
