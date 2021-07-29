Feature: Search and place order for Vegs

  @SeleniumTest1
  Scenario: Search for items and validate results
    Given User is on the official website GreenCard landing page
    When User searched for Cucumber Vegetables
    Then "Cucumber" result is displayed

  @SeleniumTest2
  Scenario: Search for items and validate results
    Given User is on the official website GreenCard landing page
    When User searched for Brinjal Vegetables
    And added items to the Cart
    And user proceeded to checkout page
    Then verify selected "Brinjal" is displayed on Checkout page

  @SeleniumTest3
  Scenario Outline: Search for items and validate results
    Given User is on the official website GreenCard landing page
    When User searched for <Name> Vegetables
    And added items to the Cart
    Then user proceeded to checkout page
    Examples:
      | Name     |
      | Brinjal  |
      | Cucumber |
      | Beetroot |