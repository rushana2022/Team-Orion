@US10
Feature:Login with parameters
  Scenario: Login as librarian 11
    Given I am on the login page
    When I enter username "librarian11@library"
    And I enter password "libraryUser"
    And click the sign in button
    Then "Dashboard" should be displayed