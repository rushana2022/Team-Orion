@us8
Feature: search new users dialog

  Scenario: Verify user information
    Given I am on the login page
    And I login using following credentials:
      | email    | librarian21@library |
      | password | libraryUser         |
    And I click on "Users" link
    When I search for "6565"
    Then table should contain this data
      | User ID   | 6565                        |
      | Full Name | Perla Klocko                |
      | Email     | flavia.parisian@hotmail.com |