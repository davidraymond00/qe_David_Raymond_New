Feature: Product
  As a user
  I want view product
  So i can view list product

  Scenario: Get All Product with valid url and category
    Given I set valid url
    When I request get all product
    Then I will get 200
    And Get list of all my product with category

  Scenario: Get All Product with id
    Given I set valid url
    When I request get all product
    Then I will get 200
    And Get list of all my product with id

  Scenario: Get All Product with price
    Given I set valid url
    When I request get all product
    Then I will get 200
    And Get list of all my product with price

  Scenario: Get All Product with description
    Given I set valid url
    When I request get all product
    Then I will get 200
    And Get list of all my product with description