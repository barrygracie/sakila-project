Feature: When user starts game, six random film cards are allocated.
  As a user when I start the game, six random cards will be assigned to to play the game with.

  Scenario: Successfully selecting six random cards based on films.
    Given a user starting the game
    When the user clicks start
    Then the program assigns six cards to the user