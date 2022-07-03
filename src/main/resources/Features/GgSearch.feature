Feature: test gg search function

  Scenario: Verify gg search feature is working
    Given user is on gg_home page
    When user input search_key
    And user click on login btn
    Then user see result
