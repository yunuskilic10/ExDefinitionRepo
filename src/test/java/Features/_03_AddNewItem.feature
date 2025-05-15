Feature: Add new item with parameters

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully
  Scenario: Add new item with parameter

    When Enter itemname "ipod"
    And Add to Cart and Check
    Then Should be added new item in Shop Cart
