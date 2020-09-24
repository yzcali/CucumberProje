@ebay
Feature: ebay Search

  Scenario Outline: FR01_user searches on ebay
    Given F_user goes to search page of ebay
    And  user writes "<word>" on searchB
    Then user see at the results of searching and writes it

    Examples: words
    |word    |
    |mouse   |
    |t-shirt |
    |earrings|

