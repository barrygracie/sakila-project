Feature: When the user is assigned a random country, pick a city for the battle location

  Scenario: Successfully selecting a city
    Given a user is assigned a random country
    When the user selects a city
    Then the program selects the city as the battle location