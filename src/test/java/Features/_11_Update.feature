Feature: Update  Item

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully

   @SmokeTest
  Scenario Outline: Add new item with scenario outline
    When Click to DC elements with Data Table
      |editAccount|
    And Enter update name to edit name button
      |editName|<updateitem>|
    And Click to DC elements with Data Table
    |updateButton|
    Then Should be updated item



    Examples:
      | updateitem|
      | Akbay   |
      | Turan |
