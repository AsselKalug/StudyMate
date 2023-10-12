@firstTag
Feature: verify login functionality

  Scenario: user logs in with valid credentials
    Given valid username "Aika"
    And valid password "Abc123!"
    When user clicks login button
    Then user logs in

  Scenario: user logs in with valid credentials
    Given invalid username "Aika001"
    And invalid password "Abc123aaa!"
    When user clicks login button
    Then user does not logs in

