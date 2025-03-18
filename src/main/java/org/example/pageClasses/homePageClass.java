package org.example.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class homePageClass extends loginPageClass {

    public void clickOnNavigationLink(String title){
        WebElement navigationLink = waitForElementToBeClickable(By.xpath("//a[text()='"+title+"']"), 8);
        navigationLink.click();
    }

    public void clickOnShowAllDesktops(){
        WebElement navShowAllDeskTopsLink = waitForElementToBeClickable(xpathRepository.showAllDesktops, 8);
        navShowAllDeskTopsLink.click();
    }

    public void clickOnItemTitle(String title){
        WebElement itemTitle = scrollToElement(By.xpath("//a[contains(text(),'"+ title +"')]"), 8);
        itemTitle.click();
    }

    public void clickOnAddToCart(){
        WebElement addToCartButton = waitForElementToBeClickable(xpathRepository.addToCart, 8);
        addToCartButton.click();
    }

    public void clickOnCart(){
        WebElement cartButton = waitForElementToBeVisible(xpathRepository.cart, 8);
        cartButton.click();
    }

    public void clickOnCheckOutWithoutView(){
        WebElement checkOutLink = waitForElementToBeVisible(xpathRepository.checkoutWithoutView, 8);
        checkOutLink.click();
    }

    public void clickOnLogout(){
        WebElement logoutLink = waitForElementToBeClickable(xpathRepository.logout, 8);
        logoutLink.click();
    }
}
