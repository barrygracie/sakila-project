Feature: When playing the game(after selecting "character"), the user will be assigned 8 random films (which act as moves in the game)

  Scenario: Successfully selecting 8 random films and assigning them to the users actor
    Given a user has created a character
    When the user proceeds
    Then the program selects eight random films and stores them in the database