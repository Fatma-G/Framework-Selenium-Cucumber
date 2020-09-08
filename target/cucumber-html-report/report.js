$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("patientMedicalForm/PatientMedicalForm.feature");
formatter.feature({
  "line": 2,
  "name": "patientName - PatientMedicalHistoryForm",
  "description": "I want to fill in the patient form",
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
  "duration": 17242598300,
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
  "name": "open application",
  "keyword": "Given "
});
formatter.match({
  "location": "AuthentificationStepDef.openApplication()"
});
formatter.result({
  "duration": 5730575100,
  "status": "passed"
});
formatter.after({
  "duration": 5812498800,
  "status": "passed"
});
});