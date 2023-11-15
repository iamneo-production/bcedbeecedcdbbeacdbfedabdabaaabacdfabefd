Feature: World Art Community Website Testing

  Scenario: Search for Watches
    Given I am on the World Art Community website to check Watches
    When I hover over the search icon and input "Watches" and press Enter
    Then I store the title of the first watch result
    And I click on "VIEW DETAILS"
    Then I verify the selected product title matches the displayed product title

  # Scenario: Navigate to Birdhouses
  #   Given I am on the World Art Community website
  #   When I hover over "HOME DECOR" and then "GARDEN" and click on "BIRDHOUSES"
  #   Then I scroll down and click on the "HAND PAINTED" tag
  #   And I click on the shop details
  #   Then I verify that the label "SHOP DETAIL" is displayed

  # Scenario: Explore Wildlife Photography
  #   Given I am on the World Art Community website
  #   When I hover over "PHOTOGRAPHY" and then "BLACK AND WHITE" and click "WILDLIFE"
  #   Then I check the "Canvas" checkbox under the PRINT MEDIUM section
  #   And I click on the first product title "The Great Migration"
  #   Then I click "ADD TO CART" and verify the shopping cart is displayed
  #   And I click "Remove item" and confirm "DELETE"
  #   Then I verify that the label "YOUR CART IS EMPTY" is displayed
