Feature: Login page validation

  Background: This feature file consists of the login page tests
    Given Launch e-commerce application

  Scenario: Login validation with valid credentials
    Given click on My Account after application load
    When click on Login link under My Account
    Then validate the login screen is visible or not
    When enter valid email id and Password
    And click on Submit button
    Then validate if the user login is successful or not