@searchTechnoProduct @amazon
Feature: search most of the products on amazon
  Scenario Outline: T04 user searches products on amazon
    Given user goes to search page of amazon
    And user writes "<words>" on search button
    Then user see at the results of searching and writes it on the console

    Examples: names of the products
    |words|
    |headphones|
    |camera|
    |drone |
    |tv    |
    |pencil|