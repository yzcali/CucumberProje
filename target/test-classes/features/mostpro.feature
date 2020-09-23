@amazonExamples
Feature: Search on amazon

  Scenario Outline: FR02_user searches on amazon and uses dropDown
    Given user goes to search page of amazon
    And user selects "<category>" of dropdown
    And  user writes "<word>" on search button
    Then user see at the results of searching and writes it on the console

    Examples: words and category
   |category   | word         |
   |Automotive |phone holder  |
   |Books      |les miserables|
   |Baby       |stroller      |

