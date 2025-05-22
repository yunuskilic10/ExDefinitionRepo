Feature: Add New Random Address

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Add New Address Randomly
    When Click address book button
    And Enter firstName "gokhan" and lastName "eren" randomly
    And full form and click continue button
    Then Should be added new address