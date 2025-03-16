package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class homePageClass extends loginPageClass {

    public By showAllDesktops = By.xpath("//a[text()='Show All Desktops']");
    public By addToCart = By.xpath("//button[text()='Add to Cart']");
    public By cart = By.xpath("//div[@id='cart']");
    public By checkoutWithoutView = By.xpath("//div[@id='cart']//a[contains(@href,'checkout/checkout')]");
    public By logout = By.xpath("//div[@id='top-links']//a[text()='Logout']");


    public void clickOnNavigationLink(String title){
        WebElement navigationLink = waitForElementToBeClickable(By.xpath("//a[text()='"+title+"']"), 8);
        navigationLink.click();
    }

    public void clickOnShowAllDesktops(){
        WebElement navShowAllDeskTopsLink = waitForElementToBeClickable(showAllDesktops, 8);
        navShowAllDeskTopsLink.click();
    }

    public void clickOnItemTitle(String title){
        WebElement itemTitle = scrollToElement(By.xpath("//a[contains(text(),'"+ title +"')]"), 8);
        itemTitle.click();
    }

    public void clickOnAddToCart(){
        WebElement addToCartButton = waitForElementToBeClickable(addToCart, 8);
        addToCartButton.click();
    }

    public void clickOnCart(){
        WebElement cartButton = waitForElementToBeVisible(cart, 8);
        cartButton.click();
    }

    public void clickOnCheckOutWithoutView(){
        WebElement checkOutLink = waitForElementToBeVisible(checkoutWithoutView, 8);
        checkOutLink.click();
    }

    public void clickOnLogout(){
        WebElement logoutLink = waitForElementToBeClickable(logout, 8);
        logoutLink.click();
    }
}
