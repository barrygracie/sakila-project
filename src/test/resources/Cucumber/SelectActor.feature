Feature: When user is playing the game, select an actor to battle against

  Scenario: Successfully selecting a random actor
    Given a user is playing the game
    When the user is starting the game
    Then the program returns a random actor