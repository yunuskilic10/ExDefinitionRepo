Feature: New Item Add to Cart

  @RegressionTest
  Scenario: Add New Item

    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully
    And Enter item name to searchbox and click search button
    When Add to Cart and Check
    Then Should be added new item in Shop Cart