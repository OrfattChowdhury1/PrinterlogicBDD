$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/orfat/IdeaProjects/PrinterlogicBDD/src/main/java/feature/InvalidLogIn.feature");
formatter.feature({
  "line": 2,
  "name": "Invalid LogIn Feature",
  "description": "",
  "id": "invalid-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@invalid"
    }
  ]
});
formatter.before({
  "duration": 8058610600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Invalid LogIn Scenario",
  "description": "",
  "id": "invalid-login-feature;invalid-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on printercloud page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input incorrect username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user input incorrect password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLogInSteps.user_is_on_printercloud_page()"
});
formatter.result({
  "duration": 261601900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogInSteps.user_input_incorrect_username()"
});
formatter.result({
  "duration": 263669200,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogInSteps.user_input_incorrect_password()"
});
formatter.result({
  "duration": 165642600,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLogInSteps.user_clicks_on_the_submit_button()"
});
formatter.result({
  "duration": 109304600,
  "status": "passed"
});
formatter.after({
  "duration": 1517914100,
  "status": "passed"
});
});