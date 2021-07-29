
Feature: Application login

#  Background:
#    Given Browser is open
#    When Browser is open
#    Then Verify that browser is open

  @RegTest
Scenario: Login on a home page1
    Given User is on the login page
  When user enters valid creds and clicks on the 'Login' button
#  Then Home page appears
  Then Home page appears "true"

    @SomeTest
  Scenario: Login on a home page - negative
    Given User is on the login page
    When user enters invalid creds (login "test" and pwd "test1") and clicks on the Login button
#    Then Home page doesn't appear
    Then Home page appears "false"

    @SomeTest @SmokeTest
 #   TableData
    Scenario: Login on a home page2
      Given User is on the login page
      When user signs in with following details:
      | jenny | pwd123 | Ukraine |
      Then Home page appears "true"

      @SmokeTest
      # Parametrization
  Scenario Outline: Login on a home page3
    Given User is on the login page
    When user logs in with login <Username> and password <password>
    Then Home page appears "true"
    Examples:
      | Username | password |
      | jenny    | pwd123   |
      | john     | pwd1234  |
      | jason    | pwd321   |
      | holub    | pwdd34   |



