package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.pageClasses.loginPageClass;
import org.example.pageClasses.utilityFunctions;
import org.testng.Assert;

public class loginStepDef {

    public loginPageClass loginPage;
    public utilityFunctions utilities;

    @Before
    public void setup() {
        utilities.browserInitiation();
    }

    @After
    public void tearDown() {
        utilities.browserTearDown();
    }

    @Given("Launch e-commerce application")
    public void launch_e_commerce_application() {
        utilities.launchAndMaximize("https://naveenautomationlabs.com/opencart");
    }

    @Given("click on My Account after application load")
    public void click_on_my_account_after_application_load() throws InterruptedException {
        loginPage.clickMyAccountLink();
    }

    @When("click on Login link under My Account")
    public void click_on_login_link_under_my_account() {
        loginPage.clickLogin();
    }

    @Then("validate the login screen is visible or not")
    public void validate_the_login_screen_is_visible_or_not() {
        Assert.assertTrue(loginPage.checkLoginScreen());
    }

    @When("enter valid email id and Password")
    public void enter_valid_email_id_and_password() {
        loginPage.enterEmailAndPwd("vnlkumar12@gmail.com", "Test@1234");
    }

    @When("click on Submit button")
    public void click_on_submit_button() {
        loginPage.clickOnSubmit();
    }

    @Then("validate if the user login is successful or not")
    public void validate_if_the_user_login_is_successful_or_not() {
        Assert.assertTrue(loginPage.checkSuccessfulLogin());
    }


}
