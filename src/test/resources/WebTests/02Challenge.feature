Feature: Play challenge

  @playgame
  Scenario Outline:
    Given I start my journey with the "<user name>"
    When I select the challenge "<challenge name>"
    Then I can start the game
    When I select the correct answer before timer expires
    Then I get my points
    And I can check my final score with the "<user name>"

    Examples:
      | user name |challenge name |
      | nicoleliu |Take the bus |

  #Scenario Outline:
   # Given I start my journey with the "<user name>"
   # When I select the challenge "<challenge name>"
    #Then I can start the game
    #When I don't select anything before timer expires
   # Then I will get a Try again page
    #And I can continue my challenge after I click Try again button

   # Examples:
    #  | user name |challenge name |
     # | nicoleliu |Are you game? |