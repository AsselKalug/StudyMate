Feature: all login tests scenarios are in this file

  @loginPositive
  Scenario: user logs in with valid credentials
    When user navigates to login page
    When user enters email "admin@codewise.com" to the email field
    And user enters password "codewise123" to the password field
    Then user performs click action on the log in button
    Then user should be logged in to the application

