Feature: Example Scenario Outline

  @RegressionTest
  Scenario Outline: Example scenario outline with data table
    Given Navigate to Opencart
    And User sending username and password
      | email    | <email>    |
      | password | <password> |

    And Click to DC elements with Data Table
      |loginButton|

    Then User should login successfully

    Examples:
      | email                   | password |
      | carlosSantana@gmail.com | 1234     |
      | carlosSantana@gmail.com | 1234     |
      | carlosSantana@gmail.com | 1234     |
      | carlosSantana@gmail.com | 1234     |
      | carlosSantana@gmail.com | 1234     |