package org.example.pageClasses;

import org.openqa.selenium.By;

public class xpathRepository {

    public static final String url = "https://naveenautomationlabs.com/opencart";
    public static final String userName = "Vnlkumar12@gmail.com";
    public static final String password = "Test@1234";
    public static final By myAccountLink = By.xpath("//span[text()='My Account']");
    public static final By loginLink = By.xpath("//a[text()='Login']");
    public static final By loginScreen = By.xpath("//h2[text()='Returning Customer']");
    public static final By emailField = By.xpath("//input[@name='email']");
    public static final By passwordField = By.xpath("//input[@name='password']");
    public static final By loginButton = By.xpath("//input[@type='submit']");
    public static final By postLoginHeader = By.xpath("//h2[text()='My Account']");
    public static final By showAllDesktops = By.xpath("//a[text()='Show All Desktops']");
    public static final By addToCart = By.xpath("//button[text()='Add to Cart']");
    public static final By cart = By.xpath("//div[@id='cart']");
    public static final By checkoutWithoutView = By.xpath("//div[@id='cart']//a[contains(@href,'checkout/checkout')]");
    public static final By logout = By.xpath("//div[@id='top-links']//a[text()='Logout']");
    public static final By billingAddressContinue = By.xpath("//div[contains(@id,'payment-address')]//input[@value ='Continue']");
    public static final By deliveryAddressContinue = By.xpath("//div[contains(@id,'shipping-address')]//input[@value ='Continue']");
    public static final By deliveryMethodContinue = By.xpath("//div[contains(@id,'shipping-method')]//input[@value ='Continue']");
    public static final By agreeTandC = By.xpath("//input[@name='agree']");
    public static final By paymentMethodContinue = By.xpath("//div[contains(@id,'payment-method')]//input[@value ='Continue']");
    public static final By confirmOrder = By.xpath("//input[@value='Confirm Order']");
    public static final By orderSuccessfulText = By.xpath("//h1[text()='Your order has been placed!']");
    public static final By orderSuccessfulContinue =By.xpath("//div[contains(@id, 'success')]//a[text()='Continue']");
}
