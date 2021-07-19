Feature: User Creation

  @usercreation
  Scenario Outline:
    Given I have launched this web application
    When I create a "<user name>"
    Then I can start the journey with "<user name>"

    Examples:
      | user name |
      | nicoleliu |
     # | 0  |
     # |A1qwer_*+}0|

