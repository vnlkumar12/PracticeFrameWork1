package org.example.pageClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class loginPageClass extends utilityFunctions {

    public By myAccountLink = By.xpath("//span[text()='My Account']");
    public By loginLink = By.xpath("//a[text()='Login']");
    public By loginScreen = By.xpath("//h2[text()='Returning Customer']");
    public By emailField = By.xpath("//input[@name='email']");
    public By passwordField = By.xpath("//input[@name='password']");
    public By loginButton = By.xpath("//input[@type='submit']");
    public By postLoginHeader = By.xpath("//h2[text()='My Account']");

    public void clickMyAccountLink() {
        WebElement myAccLink = waitForElementToBeVisible(myAccountLink, 8);
        myAccLink.click();
    }

    public void clickLogin() {
        WebElement login = waitForElementToBeVisible(loginLink, 8);
        login.click();
    }

    public boolean checkLoginScreen() {
        WebElement loginScreenText = waitForElementToBeVisible(loginScreen, 8);
        return loginScreenText.isDisplayed();
    }

    public void enterEmailAndPwd(String email, String password) {
        WebElement emailTextBox = waitForElementToBeClickable(emailField, 8);
        WebElement passwordTextBox = waitForElementToBeClickable(passwordField, 8);
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
    }

    public void clickOnSubmit() {
        WebElement submitButton = waitForElementToBeClickable(loginButton, 8);
        submitButton.click();
    }

    public boolean checkSuccessfulLogin() {
        WebElement postLogin = waitForElementToBeVisible(postLoginHeader, 8);
        return postLogin.isDisplayed();
    }
}