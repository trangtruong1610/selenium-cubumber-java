
Feature: test login feature
  Scenario: Login successfully
    Given user is on login page
    When user input <username> and <password>
    And click on login btn
    Then user is navigated to home page