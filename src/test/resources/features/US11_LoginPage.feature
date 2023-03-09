@us11
Feature: Login same line
  Agile story: As a user, I should be able to access to the correct page when I login.

  Scenario: Login as librarian same line
    Given I am on the login page
    When I login using "librarian12@library" and "libraryUser"
    Then "Dashboard" page should be displayed

  Scenario: Login as student same line
    Given I am on the login page
    When I login using "student12@library" and "libraryUser"
    Then "Books" page should be displayed