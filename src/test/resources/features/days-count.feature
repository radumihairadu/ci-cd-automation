Feature: determine how many days have passed since a specified date in the past.

  Scenario: valid date
    Given I enter a calendar date "2024-07-01"
    When I test for days gone since entered calendar date
    Then I should get result 18

  Scenario: invalid date
    Given I enter a calendar date "2024-07-xx"
    When I test for days gone since entered calendar date
    Then I should get result -1

  Scenario: date in the future
    Given I enter a calendar date "2024-07-31"
    When I test for days gone since entered calendar date
    Then I should get result -1

