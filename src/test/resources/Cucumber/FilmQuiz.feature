Feature: When user is playing the country quiz, randomly select 4 Films to generate questions

  Scenario: Successfully selecting four random films
    Given User playing film quiz
    When the film quiz is being generated
    Then the program returns four random films