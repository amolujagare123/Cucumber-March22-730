Feature: All Login scenarios

  @realLogin
  Scenario: To test the functionality of login button for valid input
    Given I am on login page
    When I enter correct username and correct password
    And I click on login button
    Then I should be redirected to the home page

  @login
  Scenario: To test the functionality of login button for valid input on billing
    Given I am on login page of billing
    #When I enter correct username and correct password on billing page
    When I enter "admin" as username and "admin" as  password
    And I click on login
    Then I should be redirected to the dashboard

  @login
  Scenario: To test the functionality of login button for invalid input on billing
    Given I am on login page of billing
    #When I enter incorrect username and incorrect password on billing page
    When I enter "xyz" as username and "abc" as  password
    And I click on login
    Then I should get error message

  @login
  Scenario: To test the functionality of login button for blank input on billing
    Given I am on login page of billing
    #When I do not enter username and password on billing page
    When I enter "" as username and "" as  password
    And I click on login
    Then I should get another error message