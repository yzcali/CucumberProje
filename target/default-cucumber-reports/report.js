$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/mostpro.feature");
formatter.feature({
  "name": "Search on amazon",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazonExamples"
    }
  ]
});
formatter.scenarioOutline({
  "name": "FR02_user searches on amazon and uses dropDown",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user goes to search page of amazon",
  "keyword": "Given "
});
formatter.step({
  "name": "user selects \"\u003ccategory\u003e\" of dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "user writes \"\u003cword\u003e\" on search button",
  "keyword": "And "
});
formatter.step({
  "name": "user see at the results of searching and writes it on the console",
  "keyword": "Then "
});
formatter.examples({
  "name": "words and category",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "word"
      ]
    },
    {
      "cells": [
        "Automotive",
        "phone holder"
      ]
    },
    {
      "cells": [
        "Books",
        "les miserables"
      ]
    },
    {
      "cells": [
        "Baby",
        "stroller"
      ]
    }
  ]
});
formatter.scenario({
  "name": "FR02_user searches on amazon and uses dropDown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonExamples"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to search page of amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_amazon_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Automotive\" of dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_selects_of_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes \"phone holder\" on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_writes_on_search_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see at the results of searching and writes it on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "FR02_user searches on amazon and uses dropDown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonExamples"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to search page of amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_amazon_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Books\" of dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_selects_of_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes \"les miserables\" on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_writes_on_search_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see at the results of searching and writes it on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "FR02_user searches on amazon and uses dropDown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonExamples"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to search page of amazon",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_amazon_sayfasina_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects \"Baby\" of dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_selects_of_dropdown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user writes \"stroller\" on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_writes_on_search_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see at the results of searching and writes it on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.kullanici_sonuc_sayisini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});