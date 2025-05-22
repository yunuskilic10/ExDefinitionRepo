Feature: DataTable Functionality

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully

  @SmokeTest
  Scenario: Should be click with Data Table
    When Enter item name "ipod"
    And Click to elements with Data Table
      |searchButton|
      |item1|
      |addCart|
      |viewCart|
    Then Should be added new item in Shop Cart