@US01
Feature: Users table

  Agile Story : As a user, when I search users, each user should have a unique ID.

  ticket# US001


  Scenario: unique user ids
    Given I am on the login page
    And I login as a librarian
    When I click on "Users" link
    Then Each user id should be unique
