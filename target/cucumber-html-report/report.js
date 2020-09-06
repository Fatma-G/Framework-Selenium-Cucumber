$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "ETQ user je souhaite m\u0027authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentification"
    }
  ]
});
formatter.before({
  "duration": 29195047000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@auth"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "open application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "set username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "set password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "show page Admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDef.openApplication()"
});
formatter.result({
  "duration": 4205260400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.setUsername()"
});
formatter.result({
  "duration": 315558500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.setPassword()"
});
formatter.result({
  "duration": 165259900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.clickLoginButton()"
});
formatter.result({
  "duration": 5788832100,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDef.showPageAdmin()"
});
formatter.result({
  "duration": 196392500,
  "status": "passed"
});
formatter.after({
  "duration": 2240900600,
  "status": "passed"
});
formatter.uri("patientMedicalForm/PatientMedicalForm.feature");
formatter.feature({
  "line": 2,
  "name": "patientName - PatientMedicalHistoryForm",
  "description": "I want to enter my name",
  "id": "patientname---patientmedicalhistoryform",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@patientName"
    }
  ]
});
formatter.before({
  "duration": 9660815000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "patientName - PatientMedicalHistoryForm",
  "description": "",
  "id": "patientname---patientmedicalhistoryform;patientname---patientmedicalhistoryform",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@patName"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "open Formular",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "set First name",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "set Last name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "MedicalFormStepDefs.openApplication()"
});
formatter.result({
  "duration": 3128766800,
  "status": "passed"
});
formatter.match({
  "location": "MedicalFormStepDefs.setFirstName()"
});
formatter.result({
  "duration": 220288300,
  "status": "passed"
});
formatter.match({
  "location": "MedicalFormStepDefs.setLastName()"
});
formatter.result({
  "duration": 191043000,
  "status": "passed"
});
formatter.match({
  "location": "MedicalFormStepDefs.clickSubmitButton()"
});
formatter.result({
  "duration": 1078887900,
  "status": "passed"
});
formatter.after({
  "duration": 2052483900,
  "status": "passed"
});
});