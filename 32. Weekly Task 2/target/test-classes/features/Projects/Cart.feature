Feature: Cart
  As a user
  I want view cart
  So i can view list cart

  Scenario: Get my cart with valid url and id
    Given I sett valid url
    When I request get all my cart
    Then I will get 200 ok
    And Get list of all my cart with id

  Scenario: Get my cart with valid url and date
    Given I sett valid url
    When I request get all my cart
    Then I will get 200 ok
    And Get list of all my cart with date

