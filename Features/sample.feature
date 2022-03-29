Feature: All Login scenarios

  # this will run before every scenario
  Background: prerequisite for all scenarios
    Given  I open the browser
    And  I maximize it


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

    @userReg
    Scenario: to test the functionality of submit button for user registration
      Given I am on user registration page
      When I enter below data
      | Amol | Ujagare | 89989 | amol@gmail.com |
      And I click on submit button
      Then user should be registered

      @userReg2
      Scenario Outline: To test the functionality of submit button on subscribe page
        Given I am on subscribe page
        When I enter <name> , <contactNo> , <emailID>
        And I click on subscribe button
        Then user should be subscribe

        Examples:
          | name   | contactNo | emailID     |
          | Amol   | 878117844 | a@gmail.com |
          | Pravin | 878722844 | p@gmail.com |
          | Rahul  | 873787844 | r@gmail.com |
          | Sonali | 178787844 | s@gmail.com |

