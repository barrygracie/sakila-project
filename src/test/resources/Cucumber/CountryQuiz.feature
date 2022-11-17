Feature: When user is playing the country quiz, randomly select 4 countries to generate questions

  Scenario: Successfully selecting a random country
    Given User playing country quiz
    When the quiz is being generated
    Then the program returns four random countries