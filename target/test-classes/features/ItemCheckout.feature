Feature: Item checkout validation
  Background: This file consists of item check validation
    Given Launch the e-commerce application
  @tests
  Scenario: Select the item and go to cart and enter the valid details and checkout
    Given Login with valid credentials
    When Click on "Desktops" link
    And click on show all desktops
    And click on "Sony" in the list
    And click on Add to cart
    And click on cart
    And click on check with out view
    Then click on continue in Billing Details, Delivery details and Delivery method
    When click on T and C checkbox
    And click on continue button in payment method
    And click on confirm order
    And validate Order Successful message
    And click on logout