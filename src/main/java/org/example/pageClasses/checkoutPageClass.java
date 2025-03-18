package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class checkoutPageClass extends homePageClass {

    public void clickContinueInBillingAddressDeliveryDetailsDeliveryMethod(){
        WebElement billAddressContinueButton = scrollToElement(xpathRepository.billingAddressContinue, 8);
        billAddressContinueButton.click();
        WebElement deliveryAddressContinueButton = waitForElementToBeClickable(xpathRepository.deliveryAddressContinue, 8);
        deliveryAddressContinueButton.click();
        WebElement deliveryMethodContinueButton = waitForElementToBeClickable(xpathRepository.deliveryMethodContinue, 8);
        deliveryMethodContinueButton.click();
    }

    public void clickOnAgreeTanCCheckBox(){
        WebElement agreeCheckBox = waitForElementToBeClickable(xpathRepository.agreeTandC, 8);
        agreeCheckBox.click();
    }

    public void clickContinueInPaymentMethod(){
        WebElement continueBtn = waitForElementToBeClickable(xpathRepository.paymentMethodContinue, 8);
        continueBtn.click();
    }

    public void clickOnConfirmOrder() {
        WebElement confirmOrderButton = waitForElementToBeClickable(xpathRepository.confirmOrder, 8);
        confirmOrderButton.click();
    }

    public boolean validateOrderSuccessfulHeader() {
        WebElement orderSuccessfulHeader = waitForElementToBeVisible(xpathRepository.orderSuccessfulText, 6);
        return orderSuccessfulHeader.isDisplayed();
    }
    public void clickOnOrderSuccessfulContinue(){
        WebElement orderSuccessfulContinueButton = waitForElementToBeClickable(xpathRepository.orderSuccessfulContinue, 8);
        orderSuccessfulContinueButton.click();
    }
}
