Feature: Check homepage functionality

  Background:user is logged in
    Given user is on loginpage
    When user enter username and password
    And user clicks on login btn
    Then user is navigated to homepage

  Scenario: check logout link
    When user clicks on welcome link
    Then logout link is displayed

  Scenario: verify quick launch toolbar is present
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
