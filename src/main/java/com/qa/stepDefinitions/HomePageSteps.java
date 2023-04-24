package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase {

	String title;
	LoginPage loginPage;
	HomePage homePage = new HomePage();

	@Given("User opens browser")
	public void user_opens_browser() {
		TestBase.initilization();
	}

	@Then("User is on login Page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
		title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM App for every business customer relationship management cloud");

	}

	@Then("User logs into app")
	public void user_enter_username_and_password() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {

	}

	@Then("Validate home page title")
	public void validate_home_page_title() {
		title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "Cogmento CRM");

	}

	@Then("Validate logged in user name")
	public void validate_logged_in_user_name() {
		Assert.assertTrue(homePage.verifyCorrectUserName());

	}

}
