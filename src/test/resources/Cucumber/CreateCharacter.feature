Feature: Before starting the game, user can create their own "character"

  Scenario: Successfully selecting a random actor
    Given a user wants to create their own character
    When the user inputs character info
    Then the program stores an actor in the database