Feature: The librarian should be able to update the number of user rows displayed on the page
  User Story: As a user, I want to change the number of raws to see the user info

  @wip
  Scenario Outline: Librarian should be able to update the number of rows on the user page
    Given I am on the login page
    And I login to the application as a librarian
    When I navigate to the Users page
    And I set the dropdown to "<index>"
    Then the actual "<number of student rows>" displayed on the page should match the number at index


    Examples:
      | number of student rows | index |
      | 5                      | 0     |
      | 10                     | 1     |
      | 15                     | 2     |
      | 50                     | 3     |
      | 100                    | 4     |
      | 200                    | 5     |
      | 500                    | 6     |