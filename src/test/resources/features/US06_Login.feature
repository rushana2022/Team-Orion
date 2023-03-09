@us6
Feature: User valid login

  Scenario Outline: Verify user information <email>
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"
    @students
    Examples:
      | email             | password    | name            |
     # | student11@library | libraryUser | Test Student 11 |
     # | student12@library | libraryUser | Test Student 12 |
     # | student13@library | libraryUser | Test Student 13 |
      | student14@library | libraryUser | Test Student 14 |
    @librarians
    Examples:
      | email               | password    | name              |
     # | librarian13@library | libraryUser | Test Librarian 13 |
     # | librarian14@library | libraryUser | Test Librarian 14 |
     # | librarian15@library | libraryUser | Test Librarian 15 |
      | librarian16@library | libraryUser | Test Librarian 16 |





