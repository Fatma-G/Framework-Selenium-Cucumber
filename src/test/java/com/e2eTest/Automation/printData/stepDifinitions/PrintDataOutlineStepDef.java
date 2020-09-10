package com.e2eTest.Automation.printData.stepDifinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.Automation.printData.pageObjects.PrintDataOutlinePage;
import com.e2eTest.Automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PrintDataOutlineStepDef {

	public WebDriver driver;
	private PrintDataOutlinePage printDataOutlinePage = new PrintDataOutlinePage(driver);

	public PrintDataOutlineStepDef() {
		driver = Setup.driver;
	}

	@Given("^Open application Text Box$")
	public void openApplicationTextBox() throws Throwable {
		String url = "https://demoqa.com/text-box";
		driver.get(url);
	}

	@When("^I want to print Full Name \"([^\"]*)\"$")
	public void iWantToPrintFullName(String fullName) throws Throwable {
		PageFactory.initElements(driver, PrintDataOutlineStepDef.class);
		printDataOutlinePage.sendFullName(fullName);
	}

	@When("^I want to print Email \"([^\"]*)\"$")
	public void iWantToPrintEmail(String email) throws Throwable {
		printDataOutlinePage.sendEmail(email);
	}
}
