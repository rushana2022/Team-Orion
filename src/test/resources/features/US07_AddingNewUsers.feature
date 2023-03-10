@us7
Feature: Add new users dialog
  User Story: As a user, I want to add new users to the app.

  Scenario: Placeholder tests
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | libraryUser         |
    And I click on "Users" link
    When I click on the Add Users
    Then dialog fields must have matching placeholder
      | fullname | Full Name |
      | email    | Email     |
      | password | Password  |
      | address  | null      |
