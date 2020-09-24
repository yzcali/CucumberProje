@walmart
Feature: Search on Walmart

  Scenario Outline: search on products on Walmart
    Given TC_1 user goes to walmart page
    And  TC_1 user writes "<products>" on searchB
    Then TC_1 user see at the results of searching and writes it on the console
    Examples:
      | products |
      |calculator|
      |watch    |
      |flower|




