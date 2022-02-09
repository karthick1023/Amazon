$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Login functionality of amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open amazon website and validate invalid data for login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be on amzon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.user_should_be_on_amzon_home_page()"
});
formatter.result({
  "status": "passed"
});
});