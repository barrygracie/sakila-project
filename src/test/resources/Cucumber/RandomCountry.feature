Feature: When user is playing the game, randomly assign a country where the "battle" takes place

  Scenario: Successfully selecting a random country
    Given a user is ready to start a battle
    When the user begins the battle process
    Then the program returns a random country