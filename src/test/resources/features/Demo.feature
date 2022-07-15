Feature: Add to cart

  Rule: add product from store

    @scenario1
    Scenario Outline: add 1 quantity to cart
      Given I am on product store page
      When I add a <productName> to the cart
      Then I see one <productName> added in the cart
      Examples:
        | productName |
        | Blue shoes  |

