@searchProduct01
Feature: Amazon Search
  Background: works like Before Method
    Given user goes to search page of amazon
  @amazon01
  Scenario: TC02_user searches on amazon

    And  user writes headphones on search button
    Then user see at the results of searching and writes it on the console
   @amazon02
    Scenario: TC03_user searches on amazon

      And    user writes camera on search button
      Then user see at the results of searching and writes it on the console

