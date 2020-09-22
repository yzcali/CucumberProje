@searchProduct02
Feature: search product on amazon
  Scenario: T04 user searches a product on amazon
    Given user goes to search page of amazon
    And user writes "drone" on search button
    Then user see at the results of searching and writes it on the console