Feature: Search Item with Data Table

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add new item with parameter
    When Enter item name as DataTable
      |ipod|
      |macbook|
      |samsung|

    Then Should be added new item with DataTable in Shop Cart
