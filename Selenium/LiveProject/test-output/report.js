$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/karrivi/git/SeleniumAssignment/LiveProject/src/test/java/project/features/orangehrp.feature");
formatter.feature({
  "line": 1,
  "name": "Validate OrangeHRP Page",
  "description": "",
  "id": "validate-orangehrp-page",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Testcase 16"
    }
  ],
  "line": 5,
  "name": "Validating OrangeHRP application Login",
  "description": "",
  "id": "validate-orangehrp-page;validating-orangehrp-application-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page is available",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Admin menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 20276767300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.login_to_Application()"
});
formatter.result({
  "duration": 12388959100,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.dashboard_page_is_available()"
});
formatter.result({
  "duration": 128915800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.click_on_Admin_menu()"
});
formatter.result({
  "duration": 4130084800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1075467700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "#Testcase 18"
    }
  ],
  "line": 24,
  "name": "Validating Vacancies",
  "description": "",
  "id": "validate-orangehrp-page;validating-vacancies",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@SmokeTest"
    },
    {
      "line": 23,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on Recruitment",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on Vacancies",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 15851181900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.login_to_Application()"
});
formatter.result({
  "duration": 11840721900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.i_click_on_Recruitment()"
});
formatter.result({
  "duration": 4861772200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.click_on_Vacancies()"
});
formatter.result({
  "duration": 2091221300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1073155100,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Validating OrangeHRP application Logout",
  "description": "",
  "id": "validate-orangehrp-page;validating-orangehrp-application-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "When I am in OrangeHRP Application",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Login to Application",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click on UserProfile",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.when_I_am_in_OrangeHRP_Application()"
});
formatter.result({
  "duration": 18266504800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.login_to_Application()"
});
formatter.result({
  "duration": 12632792300,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.i_click_on_UserProfile()"
});
formatter.result({
  "duration": 273412200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.click_on_Logout()"
});
formatter.result({
  "duration": 2647961500,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRP_StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1142500400,
  "status": "passed"
});
});