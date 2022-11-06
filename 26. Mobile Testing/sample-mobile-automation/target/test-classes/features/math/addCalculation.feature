Feature: Add calculation

  Scenario: Add two numbers
    Given I am on the calculator page
    And I input number
    And a is 3
    And b is 4
    When I add a and b
    Then the total should be 7
