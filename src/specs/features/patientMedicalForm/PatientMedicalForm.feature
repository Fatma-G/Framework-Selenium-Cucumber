@patientName
Feature: patientName - PatientMedicalHistoryForm
  I want to enter my name

  @patName
  Scenario: patientName - PatientMedicalHistoryForm
    Given open Formular
    When set First name
    And set Last name
    And click Submit button
    
  
