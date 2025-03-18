package org.example.pageClasses;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class loginPageClass extends utilityFunctions {

    public void clickMyAccountLink() {
        WebElement myAccLink = waitForElementToBeVisible(xpathRepository.myAccountLink, 8);
        myAccLink.click();
    }

    public void clickLogin() {
        WebElement login = waitForElementToBeVisible(xpathRepository.loginLink, 8);
        login.click();
    }

    public boolean checkLoginScreen() {
        WebElement loginScreenText = waitForElementToBeVisible(xpathRepository.loginScreen, 8);
        return loginScreenText.isDisplayed();
    }

    public void enterEmailAndPwd(String email, String password) {
        WebElement emailTextBox = waitForElementToBeClickable(xpathRepository.emailField, 8);
        WebElement passwordTextBox = waitForElementToBeClickable(xpathRepository.passwordField, 8);
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
    }

    public void clickOnSubmit() {
        WebElement submitButton = waitForElementToBeClickable(xpathRepository.loginButton, 8);
        submitButton.click();
    }

    public boolean checkSuccessfulLogin() {
        WebElement postLogin = waitForElementToBeVisible(xpathRepository.postLoginHeader, 8);
        return postLogin.isDisplayed();
    }
}