package com.e2eTest.Automation.medicalForm.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.Automation.medicalForm.pageObjects.MedicalFormPage;
import com.e2eTest.Automation.util.CommonMethods;
import com.e2eTest.Automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MedicalFormStepDefs {
	
	public WebDriver driver;
	private MedicalFormPage formPage= new MedicalFormPage(driver);
	
	public MedicalFormStepDefs () {
		
		driver= Setup.driver;
	}
	
	@Given("^open Formular$")
	public void openApplication() throws Throwable {

		String url= "https://form.jotform.com/81665408084158";
		driver.get(url);
	}

	@When("^set First name$")
	public void setFirstName() throws Throwable {

		PageFactory.initElements(driver, MedicalFormPage.class);
		formPage.sendFirstName();
	}

	@When("^set Last name$")
	public void setLastName() throws Throwable {

		formPage.sendLastName();;
	}

	@When("^click Submit button$")
	public void clickSubmitButton() throws Throwable {

		CommonMethods.scrollerBotton();
		formPage.clickSubmitButton();
	}

}
