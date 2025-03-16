package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class checkoutPageClass extends homePageClass {

    public By billingAddressContinue = By.xpath("//div[contains(@id,'payment-address')]//input[@value ='Continue']");
    public By deliveryAddressContinue = By.xpath("//div[contains(@id,'shipping-address')]//input[@value ='Continue']");
    public By deliveryMethodContinue = By.xpath("//div[contains(@id,'shipping-method')]//input[@value ='Continue']");
    public By agreeTandC = By.xpath("//input[@name='agree']");
    public By paymentMethodContinue = By.xpath("//div[contains(@id,'payment-method')]//input[@value ='Continue']");
    public By confirmOrder = By.xpath("//input[@value='Confirm Order']");
    public By orderSuccessfulText = By.xpath("//h1[text()='Your order has been placed!']");
    public By orderSuccessfulContinue =By.xpath("//div[contains(@id, 'success')]//a[text()='Continue']");

    public void clickContinueInBillingAddressDeliveryDetailsDeliveryMethod() throws InterruptedException {
        Thread.sleep(3000);
        WebElement bacontinueButton = scrollToElement(billingAddressContinue, 8);
        bacontinueButton.click();
        WebElement dacontinueButton = waitForElementToBeClickable(deliveryAddressContinue, 8);
        dacontinueButton.click();
        WebElement dmcontinueButton = waitForElementToBeClickable(deliveryMethodContinue, 8);
        dmcontinueButton.click();
    }

    public void clickOnAgreeTanCCheckBox(){
        WebElement agreeCheckBox = waitForElementToBeClickable(agreeTandC, 8);
        agreeCheckBox.click();
    }

    public void clickContinueInPaymentMethod(){
        WebElement continueBtn = waitForElementToBeClickable(paymentMethodContinue, 8);
        continueBtn.click();
    }

    public void clickOnConfirmOrder() {
        WebElement confirmOrderButton = waitForElementToBeClickable(confirmOrder, 8);
        confirmOrderButton.click();
    }

    public boolean validateOrderSuccessfulHeader() {
        WebElement orderSuccessfulHeader = waitForElementToBeVisible(orderSuccessfulText, 6);
        return orderSuccessfulHeader.isDisplayed();
    }
    public void clickOnOrderSuccessfulContinue(){
        WebElement orderSuccessfulContinueButton = waitForElementToBeClickable(orderSuccessfulContinue, 8);
        orderSuccessfulContinueButton.click();
    }
}
