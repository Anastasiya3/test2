Feature: Registration and Login

  Scenario: Registration and Login
    Given Navigate to www.sharelane.com
    When You`ve been navigated to it click Sign-up
    And Enter ZIP code
    And Click Continue
    And Enter First Name
    And Enter email
    And Enter password
    And Enter confirm password
    Then Click Register
    When You`ve been registered, click here
    Then Enter email1
    And Enter password1
    And Click Login
    Then You`ve been signed in