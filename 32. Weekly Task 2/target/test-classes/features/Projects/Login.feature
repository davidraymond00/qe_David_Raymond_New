Feature: Login
  As a user
  I want to login
  So i can view dashboard

  Scenario: Login with url and body
    Given I set url and body
    When I request login
    Then I will get 524

#  Scenario: Login with url and valid token
#    Given I set url and valid token
#    When I request login
#    Then I will get 200