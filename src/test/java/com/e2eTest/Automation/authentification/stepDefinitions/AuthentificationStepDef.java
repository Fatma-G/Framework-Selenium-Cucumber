package com.e2eTest.Automation.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.Automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.Automation.util.CommonMethods;
import com.e2eTest.Automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDef extends CommonMethods {

	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage(driver);

	public AuthentificationStepDef() {

		driver = Setup.driver;
	}

	@Given("^open application$")
	public void openApplication() throws Throwable {

		logger.info("Open Application Orange");
		CommonMethods.openBrowserWithConfigFile("url1");
	}

	@When("^set username$")
	public void setUsername() throws Throwable {

		PageFactory.initElements(driver, AuthentificationPage.class);
		logger.info("Send Username");
		authentificationPage.sendUserName();
	}

	@When("^set password$")
	public void setPassword() throws Throwable {

		logger.info("Send Password");
		authentificationPage.sendUserPassword();
	}

	@When("^click Login button$")
	public void clickLoginButton() throws Throwable {

		logger.info("Click on button Login");
		authentificationPage.clickLoginButton();
	}

	@Then("^show page Admin$")
	public void showPageAdmin() throws Throwable {

		logger.info("Show page Admin");
		String wlc = AuthentificationPage.welcome.getText();
		Assert.assertTrue(wlc.contains("Welcome"));
		// Assert.assertEquals("Welcome Linda", wlc);
	}

	@When("^click on Admin$")
	public void clickOnAdmin() throws Throwable {

		logger.info("Click on Admin");
		authentificationPage.clickLinkAdmin();
	}

	@When("^click on Buzz$")
	public void clickOnBuzz() throws Throwable {

		logger.info("Click on Buzz");
		authentificationPage.clickLinkBuzz();
	}

}
