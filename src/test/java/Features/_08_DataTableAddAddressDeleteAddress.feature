Feature: Add new address and than delete

  Scenario: Add and delete scenario

    Given Navigate to Opencart
    When Enter username and password with Data Table
      | email    | hanofaj644@gianes.com |
      | password | 12345                 |

    And Click to DC elements with Data Table
      | loginButton |

    Then User should login successfully

    And Click to DC elements with Data Table
      | addressBookLink  |
      | newAddressButton |

    And Enter text to webelement with DataTabel
      | firstName | fazıl            |
      | lastName  | aslan            |
      | address1  | bahcelievler mah |
      | city      | Ankara           |
      | postCode  | 1234             |

    And Select country and zone
      | selectCountry     | 222 |
      | selectRegionState | 3518 |

    And Click to DC elements with Data Table
      | continueButton |

    Then Should be added new address

    And Click to DC elements with Data Table
      | deleteButton |

    Then Should be deleted new address