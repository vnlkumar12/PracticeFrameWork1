Feature: Login page validation with multiple sets of data

  Background: This feature file consists of the login page tests
    Given Launch e-commerce application
  @tests
  Scenario Outline: Login validation with valid credentials
    Given click on My Account after application load
    When click on Login link under My Account
    Then validate the login screen is visible or not
    When enter credentials <username> <password>
    And click on Submit button

    Examples:
      | username             | password  |  |
      | vnlkumar12@gmail.com | Test@1234 |  |
      | vnlkumar12@gmail.com | Test@1    |  |
      | vnlkumar12           | Test@1234 |  |
