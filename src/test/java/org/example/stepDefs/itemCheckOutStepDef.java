package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageClasses.checkoutPageClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testng.Assert;

@Component
public class itemCheckOutStepDef {
@Autowired
    public checkoutPageClass checkoutPage;

    @Before
    public void setup() {
        checkoutPage = new checkoutPageClass();
        checkoutPage.browserInitiation();
    }

    @After
    public void tearDown() {
        checkoutPage.browserTearDown();
    }

    @Given("Launch the e-commerce application")
    public void launch_the_e_commerce_application() {
        checkoutPage.launchAndMaximize("https://naveenautomationlabs.com/opencart");
    }
    @Given("Login with valid credentials")
    public void login_with_valid_credentials() {
        checkoutPage.clickMyAccountLink();
        checkoutPage.clickLogin();
        checkoutPage.enterEmailAndPwd("vnlkumar12@gmail.com", "Test@1234");
        checkoutPage.clickOnSubmit();
    }
    @When("Click on {string} link")
    public void click_on_link(String string) {
        // Write code here that turns the phrase above into concrete actions
        checkoutPage.clickOnNavigationLink(string);
    }
    @When("click on show all desktops")
    public void click_on_show_all_desktops() {
        checkoutPage.clickOnShowAllDesktops();
    }
    @When("click on {string} in the list")
    public void click_on_in_the_list(String string) {
        checkoutPage.clickOnItemTitle(string);
    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        checkoutPage.clickOnAddToCart();
    }
    @When("click on cart")
    public void click_on_cart() {
        checkoutPage.clickOnCart();
    }
    @When("click on check with out view")
    public void click_on_check_with_out_view() {
        checkoutPage.clickOnCheckOutWithoutView();
    }
    @Then("click on continue in Billing Details, Delivery details and Delivery method")
    public void click_on_continue_in_billing_details_delivery_details_and_delivery_method() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        checkoutPage.clickContinueInBillingAddressDeliveryDetailsDeliveryMethod();
    }
    @When("click on T and C checkbox")
    public void click_on_t_and_c_checkbox() {
        checkoutPage.clickOnAgreeTanCCheckBox();
    }
    @When("click on continue button in payment method")
    public void click_on_continue_button_in_payment_method() {
        checkoutPage.clickContinueInPaymentMethod();
    }
    @When("click on confirm order")
    public void click_on_confirm_order() {
        checkoutPage.clickOnConfirmOrder();
    }
    @When("validate Order Successful message")
    public void validate_Order_Successful_message() {
        Assert.assertTrue(checkoutPage.validateOrderSuccessfulHeader());
        checkoutPage.clickOnOrderSuccessfulContinue();
    }
    @When("click on logout")
    public void click_on_logout() {
        checkoutPage.clickMyAccountLink();
        checkoutPage.clickOnLogout();
    }

}
