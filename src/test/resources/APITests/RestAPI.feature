Feature: Get users

  Scenario: Get a list of users
    Given I set API endpoint
    When I send GET HTTP request
    Then I receive valida HTTP response code 200
