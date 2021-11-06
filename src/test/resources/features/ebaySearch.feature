
Feature:List of Products
  Background:
  Given I am on the homepage
    Scenario: list of iphone
      When I enter "Iphone" in search box
      And  I choose "Mobile Phones & Communication" option from All Categories
      And I click to search button
      Then I should able to see all "Iphone" products
  @smoke
  Scenario: list of dyson
    When I enter "dyson" in search box
    And  I choose "Home, Furniture & DIY" option from All Categories
    And I click to search button
    Then I should able to see all "dyson" products

