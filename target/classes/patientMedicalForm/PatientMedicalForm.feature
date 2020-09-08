@patientName
Feature: patientName - PatientMedicalHistoryForm
  I want to fill in the patient form

  @patName
  Scenario: patientName - PatientMedicalHistoryForm
    Given open Formular
    When set First name
    And set Last name
    And click Submit button
