Feature: Demo Hook

  @demohook
  Scenario Outline: Demo Hook
    Given user is on page login
    When input "<username>" and "<password>"
    And click on submit btn
    Then user is on home page
    Examples:
      | username | password             |
      | tomsmith | SuperSecretPassword! |

  @demohook1
  Scenario Outline: Demo Hook 1
    Given user is on page login
    When input "<username>" and "<password>"
    And click on submit btn
    Then user is on home page

    Examples:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
