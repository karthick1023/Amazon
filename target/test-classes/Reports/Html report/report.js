$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Login functionality of amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Open amazon website and validate invalid data for login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should navigate to login page and fill \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User has to fill \"\u003cpassword\u003e\" and click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "karthi@gmail.com",
        "0987654"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Open amazon website and validate invalid data for login functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User should be on amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.user_should_be_on_amazon_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to login page and fill \"karthi@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.user_should_navigate_to_login_page_and_fill(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User has to fill \"0987654\" and click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_has_to_fill_and_click_login_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon.user_should_see_the_error_message()"
});
formatter.result({
  "status": "skipped"
});
});