Feature: Find an actor by their id

  Scenario: Successfully selecting an actor
    Given User wants to find an actor by id
    When the user searches for an actor by id
    Then the program returns the correct actor