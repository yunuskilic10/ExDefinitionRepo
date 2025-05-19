Feature: Add new Item

  Background:
    Given Navigate to Opencart
    When Enter username and password and click login button
    Then User should login successfully


  Scenario Outline: Add new item with scenario outline
    When Add new item with SO
      | searchInput | <newItem> |

    And Click to Header elements with Data Table
      | searchButton |

    And  Click to Header elements with Data Table
      | item1 |

    And Click to Header elements with Data Table
      | addCart  |
      | viewCart |

    Then Should be added new item in Shop Cart

    Examples:
      | newItem |
      | ipod    |
      | macbook |
      | samsung |