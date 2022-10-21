Feature: Users
  As a user
  I want view user
  So i can view detail user

  Scenario: Get All Users with valid url and id
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with id

  Scenario: Get All Users with valid url and email
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with email

  Scenario: Get All Users with valid url and username
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with username

  Scenario: Get All Users with valid url and phone
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with phone

  Scenario: Get All Users with valid url and password
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with password

  Scenario: Get All Users with valid url and city
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with city

  Scenario: Get All Users with valid url and street
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with street

  Scenario: Get All Users with valid url and lastname
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with lastname

  Scenario: Get All Users with valid url and firstname
    Given I set validd url
    When I request get all users
    Then I will get message 200
    And Get list of all my users with firstname
