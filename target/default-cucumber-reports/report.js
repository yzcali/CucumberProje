$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/googlearama.feature");
formatter.feature({
  "name": "Google Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01_User makes search on google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user goes to search page of google",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.GoogleAramaStepDefinitions.user_goes_to_search_page_of_google()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searches techproeducation",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.GoogleAramaStepDefinitions.searches_techproeducation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "controls page title",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.GoogleAramaStepDefinitions.controls_page_title()"
});
formatter.result({
  "status": "passed"
});
});